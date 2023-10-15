package es.sfernandez.qp.renderers.question.answer

import es.sfernandez.qp.views.question.answer.SingleSelectionAnswerInputView
import es.sfernandez.sqg.beans.question.answers.input.SingleSelectionAnswerInput

interface SingleSelectionAnswerInputRenderer : SelectionAnswerInputRenderer<SingleSelectionAnswerInput> {

    override fun render(): SingleSelectionAnswerInputView

    override fun render(input: SingleSelectionAnswerInput): SingleSelectionAnswerInputView {
        return super.render(input) as SingleSelectionAnswerInputView
    }

}