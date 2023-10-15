package es.sfernandez.qp.renderers.contents

import es.sfernandez.qp.renderers.RendererException
import es.sfernandez.qp.views.contents.*
import es.sfernandez.sqg.beans.contents.*

interface ContentRenderer {

    //---- Constants and Definitions ----
    interface TextRenderer {
        fun render(): TextView
        fun render(text: Text): TextView {
            val textView = render()
            textView.setText(text)
            return textView
        }
    }

    interface ImageRenderer {
        fun render(): ImageView
        fun render(image: Image): ImageView {
            val imageView = render()
            imageView.setImage(image)
            return imageView
        }
    }

    interface VideoRenderer {
        fun render(): VideoView
        fun render(video: Video): VideoView {
            val videoView = render()
            videoView.setVideo(video)
            return videoView
        }
    }

    interface SoundRenderer {
        fun render(): SoundView
        fun render(sound: Sound): SoundView {
            val soundView = render()
            soundView.setSound(sound)
            return soundView
        }
    }

    //---- Methods ----
    fun render(content: Content): ContentView {
        return when(content) {
            is Text -> textRenderer().render(content)
            is Image -> imageRenderer().render(content)
            is Video -> videoRenderer().render(content)
            is Sound -> soundRenderer().render(content)
            else -> throw RendererException("Error. It's not possible to render the given content: $content")
        }
    }

    fun textRenderer(): TextRenderer
    fun imageRenderer(): ImageRenderer
    fun videoRenderer(): VideoRenderer
    fun soundRenderer(): SoundRenderer

}