package BehavioralPattern.Command

// Receiver in Command
// Light is the Receiver class that knows
// How to perform the actions associated with turning on and off.
class Light {
    fun turnOn() {
        println("Light is On")
    }

    fun turnOff() {
        println("Light is Off")
    }
}