package StructuralPattern.CompositePattern

interface ITDepartment {
    fun task()
}

class Employee(val name: String, val profile: String) : ITDepartment {
    override fun task() {
        println("$name ($profile) is working on a task.")
    }
}

class Department(val name: String) : ITDepartment {
    private val employeeList = mutableListOf<ITDepartment>()

    fun addEmployee(employee: ITDepartment) {
        employeeList.add(employee)
    }

    override fun task() {
        println("Department : $name")
        for (emp in employeeList) {
            emp.task()
        }
    }
}

fun main() {
    val manager: ITDepartment = Employee("Dudu", "Manager")
    val employee1 = Employee("Smit", "Mobile Tech Lead")
    val employee2 = Employee("Pappu", "Android Developer")
    val mobileDepartment = Department("Mobile")
    mobileDepartment.addEmployee(manager)
    mobileDepartment.addEmployee(employee1)
    mobileDepartment.addEmployee(employee2)
    mobileDepartment.task()
}