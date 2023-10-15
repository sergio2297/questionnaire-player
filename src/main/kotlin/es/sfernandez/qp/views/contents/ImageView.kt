package es.sfernandez.qp.views.contents

import es.sfernandez.sqg.beans.contents.Image

interface ImageView : ContentView {

    fun setImage(image: Image)

}