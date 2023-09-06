package StructuralPattern.AdapterPattern

fun main() {
    val list = mutableListOf<Employee>()
    val employeeFromDB = EmployeeFromDB(1, "Smit", "Chandankhede")
    list.add(employeeFromDB)
    val employeeFromLDB = EmployeeFromLDB("ppu", 2, "Pa", "Chandankhede")
    list.add(EmployeeAdapter(employeeFromLDB))
    for (emp in list) {
        println(emp.firstName())
    }
}