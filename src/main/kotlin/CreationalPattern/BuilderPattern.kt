package CreationalPattern

class Person private constructor(
    private val name: String?,
    private val age: Int?,
    private val address: String?,
    private val mobileNo: String?
) {
    class Builder {
        private var name: String? = null
        private var age: Int? = null
        private var address: String? = null
        private var mobileNo: String? = null

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setAge(age: Int): Builder {
            this.age = age
            return this
        }

        fun setAddress(address: String): Builder {
            this.address = address
            return this
        }

        fun setMobileNo(mobileNo: String): Builder {
            this.mobileNo = mobileNo
            return this
        }

        fun build(): Person {
            return Person(name, age, address, mobileNo)
        }
    }
}

fun main() {
    val person = Person.Builder().setName("Smit").setAge(28).setAddress("India").build()
    println(person)
}