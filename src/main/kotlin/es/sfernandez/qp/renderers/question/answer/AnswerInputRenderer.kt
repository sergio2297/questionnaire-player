package es.sfernandez.qp.renderers.question.answer

import es.sfernandez.qp.renderers.RendererException
import es.sfernandez.qp.views.question.answer.*
import es.sfernandez.sqg.beans.question.answers.input.*

interface AnswerInputRenderer {

    fun render(input: AnswerInput): AnswerInputView {
        return when(input) {
            is TextAnswerInput -> textInputRenderer().render(input)
            is SingleSelectionAnswerInput -> singleSelectionInputRenderer().render(input)
            is MultipleSelectionAnswerInput -> multipleSelectionInputRenderer().render(input)
            else -> throw RendererException("Error. It's not possible to render the given input: $input")
        }
    }

    fun textInputRenderer(): TextAnswerInputRenderer
    fun singleSelectionInputRenderer(): SingleSelectionAnswerInputRenderer
    fun multipleSelectionInputRenderer(): MultipleSelectionAnswerInputRenderer

}