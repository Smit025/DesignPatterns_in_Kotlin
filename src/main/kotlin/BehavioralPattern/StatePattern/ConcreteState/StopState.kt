package BehavioralPattern.StatePattern.ConcreteState

import BehavioralPattern.StatePattern.Context.MediaPlayer
import BehavioralPattern.StatePattern.State

class StopState(val mediaPlayer: MediaPlayer): State {
    override fun play() {
        println("Starts Playing")
        mediaPlayer.changeState(PlayingState(mediaPlayer))
    }

    override fun pause() {

    }

    override fun stop() {

    }
}