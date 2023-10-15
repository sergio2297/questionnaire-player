package es.sfernandez.qp.renderers.question

import es.sfernandez.qp.renderers.contents.HasContentsRenderer
import es.sfernandez.qp.views.question.ExplanationView
import es.sfernandez.sqg.beans.question.explanations.Explanation

interface ExplanationRenderer : HasContentsRenderer<Explanation> {

    override fun render(): ExplanationView
    override fun render(hasContents: Explanation): ExplanationView {
        return super.render(hasContents) as ExplanationView
    }

}