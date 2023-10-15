package es.sfernandez.qp.views.contents

import es.sfernandez.sqg.beans.contents.Text

interface TextView : ContentView {

    fun setText(text: Text)

}