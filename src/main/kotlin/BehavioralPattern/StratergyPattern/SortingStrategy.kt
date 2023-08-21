package BehavioralPattern.StratergyPattern

class SortingStrategy {
    private var sorting: Sorting? = null
    fun setStrategy(sorting: Sorting) {
        this.sorting = sorting
    }

    fun performSort() {
        sorting?.execute()
    }
}