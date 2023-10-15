package es.sfernandez.qp.renderers.contents

import es.sfernandez.qp.views.contents.ContentView
import es.sfernandez.qp.views.contents.GroupOfContentsView
import es.sfernandez.sqg.beans.contents.Content
import es.sfernandez.sqg.beans.contents.GroupOfContents

interface GroupOfContentRenderer {

    val contentRenderer: ContentRenderer

    fun render() : GroupOfContentsView
    fun render(groupOfContents: GroupOfContents) : GroupOfContentsView {
        val view = render()
        for(content in groupOfContents.contents()) {
            view.add(render(content))
        }
        return view
    }

    private fun render(content: Content): ContentView {
        return contentRenderer.render(content)
    }
}