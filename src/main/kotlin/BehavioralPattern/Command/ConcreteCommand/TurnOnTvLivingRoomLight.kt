package BehavioralPattern.Command.ConcreteCommand

import BehavioralPattern.Command.Light
import BehavioralPattern.Command.LightCommand

class TurnOnTvLivingRoomLight(val light:Light):LightCommand {
    override fun execute() {
        light.turnOn()
    }
}