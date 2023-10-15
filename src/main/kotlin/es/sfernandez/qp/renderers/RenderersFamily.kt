package es.sfernandez.qp.renderers

import es.sfernandez.qp.renderers.contents.ContentRenderer
import es.sfernandez.qp.renderers.contents.GroupOfContentRenderer
import es.sfernandez.qp.renderers.question.QuestionRenderer

interface RenderersFamily {

    fun contentRenderer(): ContentRenderer
    fun groupOfContentRenderer(): GroupOfContentRenderer

    fun questionRenderer(): QuestionRenderer

}