package StratergyPattern

fun main(){

    val quickSort = QuickSort()
    val bubbleSort = BubbleSort()
    SortingStrategy().apply {
        //Setting Strategy for Quick Sort
        setStrategy(quickSort)
        performSort()

        //Setting Strategy for Bubble Sort
        setStrategy(bubbleSort)
        performSort()
    }
}
