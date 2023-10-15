package es.sfernandez.qp.views.question.answer

import es.sfernandez.sqg.model.correcting.replies.Reply
import java.util.*

interface AnswerInputView {

    fun getReply(): Optional<Reply<*>>

}