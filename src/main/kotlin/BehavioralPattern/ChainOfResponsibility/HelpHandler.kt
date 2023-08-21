package BehavioralPattern.ChainOfResponsibility

import kotlin.math.exp

interface HelpHandler {
    fun handleHelp(subject: String)
    fun setNextHandler(handler: HelpHandler)
}

class Student(val name: String, val expertice: String) : HelpHandler {
    private var helpHandler: HelpHandler? = null
    override fun handleHelp(subject: String) {
        if (subject == expertice) {
            // If the Student is expert in this it will be handled here
            print("I will handle")
        } else {
            //We pass and check if the next Person Student is expert in this
            helpHandler?.handleHelp(subject)
        }
    }

    override fun setNextHandler(handler: HelpHandler) {
        this.helpHandler = handler
    }

}

fun main() {
    //Chain Of Responsibility
    /*Imagine you're a teacher, and you have a class of students.
    Each student has their own expertise in a particular subject.
    Sometimes, students have questions about different subjects,
    and you want to make sure their questions get answered by the right student.*/

    //Consider this 3 Object as Student
    val mathExpert = Student("Elon", "Math")
    val scienceExpert = Student("Smit", "Science")
    val historyExpert = Student("Andrew", "History")

    //Here we have created chain of objects
    mathExpert.setNextHandler(scienceExpert)
    scienceExpert.setNextHandler(historyExpert)


    mathExpert.handleHelp("History")
}