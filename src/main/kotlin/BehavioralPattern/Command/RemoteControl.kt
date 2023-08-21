package BehavioralPattern.Command

//Invoker
class RemoteControl {
    private var lightCommand: LightCommand? = null
    fun setCommand(command: LightCommand) {
        lightCommand = command
    }

    fun press() {
        lightCommand?.execute()
    }
}