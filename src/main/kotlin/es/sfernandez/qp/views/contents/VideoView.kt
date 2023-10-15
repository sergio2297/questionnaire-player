package es.sfernandez.qp.views.contents

import es.sfernandez.sqg.beans.contents.Video

interface VideoView : ContentView {

    fun setVideo(video: Video)

}