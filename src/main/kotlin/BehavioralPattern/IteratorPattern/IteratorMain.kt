package BehavioralPattern.IteratorPattern

fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5, 6)
    val iterator = MyIterator(list)
    while (iterator.hasNext()) {
        print(iterator.next())
    }
}