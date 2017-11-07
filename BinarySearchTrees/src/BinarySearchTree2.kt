class BinarySearchTree2 {

    fun chop(key: Int, list: List<Int>): Int {
        if (list.isEmpty()) {
            return -1
        }

        if (list.size == 1) {
            if (list[0] == key) {
                return 0
            }
        }

        print("Searching for key($key) in list: ")
        printList(list)
        var minIndex = 0
        var maxIndex = list.size - 1
        while (minIndex <= maxIndex) {
            println("Checking index $minIndex" )
            if (list[minIndex] == key) {
                println("Found key($key) at list[$minIndex]!")
                return minIndex
            }
            minIndex++

            if (list[maxIndex] == key) {
                println("Found key($key) at list[$maxIndex]!")
                return maxIndex
            }
            maxIndex--
        }

        println("Exited binary search loop")

        return -1
    }

    private fun printList(list: List<Int>) {
        list.indices.forEach{
            print(list[it])
            print(" ")
        }
        println()
    }
}