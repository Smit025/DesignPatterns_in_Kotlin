package BehavioralPattern.StatePattern.ConcreteState

import BehavioralPattern.StatePattern.Context.MediaPlayer
import BehavioralPattern.StatePattern.State

class PlayingState(private val mediaPlayer: MediaPlayer): State {
    override fun play() {

    }

    override fun pause() {
        println("Paused")
        mediaPlayer.changeState(PauseState(mediaPlayer))
    }

    override fun stop() {

    }
}