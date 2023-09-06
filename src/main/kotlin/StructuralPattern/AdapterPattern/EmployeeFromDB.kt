package StructuralPattern.AdapterPattern

class EmployeeFromDB(val myId: Int, val firstName: String, val lastName: String):Employee{
    override fun getId(): Int {
        return myId
    }

    override fun firstName(): String {
        return firstName
    }

    override fun LastName(): String {
        return lastName
    }

}