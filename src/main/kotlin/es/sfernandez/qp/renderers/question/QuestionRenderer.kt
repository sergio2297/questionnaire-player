package es.sfernandez.qp.renderers.question

import es.sfernandez.qp.renderers.question.answer.AnswerInputRenderer
import es.sfernandez.qp.views.question.answer.AnswerInputView
import es.sfernandez.qp.views.question.ExplanationView
import es.sfernandez.qp.views.question.ProblemView
import es.sfernandez.qp.views.question.QuestionView
import es.sfernandez.sqg.beans.question.Question

interface QuestionRenderer {

    //---- Methods ----
    fun render(): QuestionView

    fun render(question: Question): QuestionView {
        val view = render()
        view.title = question.title
        view.problem = renderProblemOf(question)
        view.answerInput = renderAnswerInputOf(question)
        view.explanation = renderExplanationOf(question)
        return view
    }

    private fun renderProblemOf(question: Question): ProblemView {
        return problemRenderer().render(question.problem)
    }

    private fun renderAnswerInputOf(question: Question): AnswerInputView {
        val input = question.answer.input
        return answerInputRenderer().render(input)
    }

    private fun renderExplanationOf(question: Question): ExplanationView {
        return explanationRenderer().render(question.explanation)
    }

    fun problemRenderer(): ProblemRenderer
    fun answerInputRenderer(): AnswerInputRenderer
    fun explanationRenderer(): ExplanationRenderer

}
