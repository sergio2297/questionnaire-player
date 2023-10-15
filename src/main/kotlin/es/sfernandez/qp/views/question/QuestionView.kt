package es.sfernandez.qp.views.question

import es.sfernandez.qp.views.question.answer.AnswerInputView

interface QuestionView {

    var title: String
    var problem: ProblemView
    var answerInput: AnswerInputView
    var explanation: ExplanationView

}