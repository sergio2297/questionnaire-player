package es.sfernandez.qp.views.contents

import es.sfernandez.sqg.beans.contents.Sound

interface SoundView : ContentView {

    fun setSound(sound: Sound)

}