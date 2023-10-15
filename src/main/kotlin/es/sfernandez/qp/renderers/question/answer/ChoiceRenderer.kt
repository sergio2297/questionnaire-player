package es.sfernandez.qp.renderers.question.answer

import es.sfernandez.qp.renderers.contents.ContentRenderer
import es.sfernandez.qp.views.contents.ContentView
import es.sfernandez.qp.views.question.answer.ChoiceView
import es.sfernandez.sqg.beans.question.answers.Choice

interface ChoiceRenderer {

    val contentRenderer: ContentRenderer

    fun render(): ChoiceView
    fun render(choice: Choice): ChoiceView {
        val view = render()
        view.id = choice.id
        view.content = renderContentOf(choice)
        return view
    }

    private fun renderContentOf(choice: Choice): ContentView {
        return contentRenderer.render(choice.content)
    }

}