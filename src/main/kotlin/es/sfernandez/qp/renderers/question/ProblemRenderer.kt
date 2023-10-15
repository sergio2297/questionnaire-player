package es.sfernandez.qp.renderers.question

import es.sfernandez.qp.renderers.contents.HasContentsRenderer
import es.sfernandez.qp.views.question.ProblemView
import es.sfernandez.sqg.beans.question.problems.Problem

interface ProblemRenderer : HasContentsRenderer<Problem> {

    override fun render(): ProblemView
    override fun render(hasContents: Problem): ProblemView {
        return super.render(hasContents) as ProblemView
    }

}