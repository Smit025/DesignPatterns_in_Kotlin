package BehavioralPattern.IteratorPattern

class MyIterator(private val list: List<Int>) : ListIterator {
    private var index = 0
    override fun next(): Int {
        return list[index++]
    }

    override fun hasNext(): Boolean {
        return index < list.size-1
    }
}