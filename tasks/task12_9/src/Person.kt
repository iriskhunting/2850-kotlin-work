// Task 12.9: class implementing the Static Factory Method pattern

import kotlinx.datetime.LocalDate

class Person private constructor(val name: String, val birth: LocalDate) {
    companion object Factory {
        private val names = mutableSetOf<String>()

        //Use create() to impose restrictions on object creation (to be able to keep track of names)
        fun create(name: String, birth: LocalDate): Person {
            require(name !in names) { "Name must be unique!" }
            names.add(name)
            return Person(name, birth)
        }

    }
}
