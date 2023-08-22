package BehavioralPattern.StatePattern.ConcreteState

import BehavioralPattern.StatePattern.Context.MediaPlayer
import BehavioralPattern.StatePattern.State

class PauseState(val mediaPlayer: MediaPlayer) : State {
    override fun play() {
        println("Playing...")
    }

    override fun pause() {
        println("Already Paused")
    }

    override fun stop() {
        println("Stop State")
        mediaPlayer.changeState(StopState(mediaPlayer))
    }
}