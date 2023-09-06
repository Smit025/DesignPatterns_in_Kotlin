package StructuralPattern.AdapterPattern

class EmployeeAdapter(val employeeFromLDB: EmployeeFromLDB) : Employee {
    override fun getId(): Int {
       return employeeFromLDB.myId
    }

    override fun firstName(): String {
        return employeeFromLDB.first + employeeFromLDB.s
    }

    override fun LastName(): String {
        return employeeFromLDB.last
    }

}
