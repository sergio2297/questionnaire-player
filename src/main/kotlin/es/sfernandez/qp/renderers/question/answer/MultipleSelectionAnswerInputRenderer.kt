package es.sfernandez.qp.renderers.question.answer

import es.sfernandez.qp.views.question.answer.MultipleSelectionAnswerInputView
import es.sfernandez.sqg.beans.question.answers.input.MultipleSelectionAnswerInput

interface MultipleSelectionAnswerInputRenderer : SelectionAnswerInputRenderer<MultipleSelectionAnswerInput> {

    override fun render(): MultipleSelectionAnswerInputView

    override fun render(input: MultipleSelectionAnswerInput): MultipleSelectionAnswerInputView {
        return super.render(input) as MultipleSelectionAnswerInputView
    }

}