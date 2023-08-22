package BehavioralPattern.StatePattern.Context

import BehavioralPattern.StatePattern.ConcreteState.StopState
import BehavioralPattern.StatePattern.State

class MediaPlayer {
    private var mediaPlayer: State = StopState(this)

    fun changeState(mediaPlayer: State) {
        this.mediaPlayer = mediaPlayer
    }

    fun play() {
        mediaPlayer.play()
    }

    fun pause() {
        mediaPlayer.pause()
    }

    fun stop() {
        mediaPlayer.stop()
    }
}