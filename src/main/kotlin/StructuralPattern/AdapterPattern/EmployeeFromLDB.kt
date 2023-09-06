package StructuralPattern.AdapterPattern

class EmployeeFromLDB(var s: String, var myId: Int, var first: String, var last: String):Employee{
    override fun getId(): Int {
        return myId
    }

    override fun firstName(): String {
        return first
    }

    override fun LastName(): String {
        return last
    }

}
