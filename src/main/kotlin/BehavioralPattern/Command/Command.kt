package BehavioralPattern.Command

import BehavioralPattern.Command.ConcreteCommand.TurnOffLivingRoomLight
import BehavioralPattern.Command.ConcreteCommand.TurnOnTvLivingRoomLight

//Client
fun main() {
    /*Light is the Receiver class that knows how
     to perform the actions associated with turning on and off.
     */
    val light = Light()

    /*RemoteControl is the Invoker class
     that sets and triggers commands.
     */

    val remoteControl = RemoteControl()

    /* TurnOnLightCmd and TurnOffLightCmd are ConcreteCommand
    classes that implement the LightCommand interface and are
     associated with specific actions (turnOn and turnOff).
     */

    remoteControl.setCommand(TurnOnTvLivingRoomLight(light))
    remoteControl.press()
    remoteControl.setCommand(TurnOffLivingRoomLight(light))
    remoteControl.press()

    /*The associations represent how the classes are related:
     RemoteControl has a command of type Command,
    and TurnOnLightCmd and TurnOffLightCmd have a reference to Light.
     */

}