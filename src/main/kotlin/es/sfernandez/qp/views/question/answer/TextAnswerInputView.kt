package es.sfernandez.qp.views.question.answer

import es.sfernandez.sqg.beans.question.answers.input.TextAnswerInput

interface TextAnswerInputView : AnswerInputView {

    fun setInput(input: TextAnswerInput)

}