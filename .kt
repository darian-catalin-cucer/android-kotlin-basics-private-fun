class Person(private val name: String, private var age: Int) {
    fun introduction() {
        println("Hi, my name is $name and I am $age years old.")
        celebrateBirthday()
    }

    private fun celebrateBirthday() {
        age++
        println("It's my ${age}th birthday!")
    }
}

fun main() {
    val person = Person("Alice", 30)
    person.introduction()
}
