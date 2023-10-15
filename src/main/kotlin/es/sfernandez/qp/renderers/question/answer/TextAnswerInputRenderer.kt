package es.sfernandez.qp.renderers.question.answer

import es.sfernandez.qp.views.question.answer.TextAnswerInputView
import es.sfernandez.sqg.beans.question.answers.input.TextAnswerInput

interface TextAnswerInputRenderer {

    fun render(): TextAnswerInputView

    fun render(input: TextAnswerInput): TextAnswerInputView {
        val view = render()
        view.setInput(input)
        return view
    }

}