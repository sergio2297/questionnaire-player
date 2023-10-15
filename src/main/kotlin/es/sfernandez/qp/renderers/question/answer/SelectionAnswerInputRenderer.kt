package es.sfernandez.qp.renderers.question.answer

import es.sfernandez.qp.views.question.answer.ChoiceView
import es.sfernandez.qp.views.question.answer.SelectionAnswerInputView
import es.sfernandez.sqg.beans.question.answers.input.SelectionAnswerInput

interface SelectionAnswerInputRenderer<in INPUT : SelectionAnswerInput> {

    val choiceRenderer: ChoiceRenderer

    fun render(): SelectionAnswerInputView

    fun render(input: INPUT): SelectionAnswerInputView {
        val view = render()
        view.possibleChoices = renderChoicesOf(input)
        return view
    }

    private fun renderChoicesOf(input: INPUT): Array<ChoiceView> {
        return sequenceOf(*input.possibleChoices)
            .map(choiceRenderer::render)
            .toList().toTypedArray()
    }

}