package es.sfernandez.qp.renderers.contents

import es.sfernandez.qp.views.contents.GroupOfContentsView
import es.sfernandez.qp.views.contents.HasContentsView
import es.sfernandez.sqg.beans.contents.HasContents

interface HasContentsRenderer<in TYPE: HasContents> {

    val groupOfContentRenderer: GroupOfContentRenderer

    fun render(): HasContentsView
    fun render(hasContents: TYPE): HasContentsView {
        val view = render()
        view.contentsView = renderContentsOf(hasContents)
        return view
    }

    private fun renderContentsOf(hasContents: HasContents): GroupOfContentsView {
        return groupOfContentRenderer.render(hasContents.groupOfContents)
    }

}