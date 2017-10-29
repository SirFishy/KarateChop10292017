class BinarySearchTree {

    fun chop(searchInt: Int, list: List<Int>): Int {
        println("Searching for: $searchInt in [${printListContents(list)}]")
        println()

        if (list.isEmpty()) {
            println("Didn't find $searchInt")
            return -1
        }

        if (this.searchIntIsFound(searchInt, list)) {
            return 0
        }

        return this.getSearchIntIndexRecursively(searchInt, list)
    }

    private fun printListContents(list: List<Int>):String {
        val printString = StringBuffer()
        list.indices
                .forEach {
                    printString.append(list[it])
                    printString.append(" ")
                }
        return printString.toString()
    }

    private fun searchIntIsFound(searchInt: Int, list: List<Int>):Boolean {
        if (list.size == 1) {
            if (list[0] == searchInt) {
                println("Found $searchInt!")
                return true
            } else {
                println("Didn't find $searchInt")
            }
        }
        return false
    }

    private fun getSearchIntIndexRecursively(searchInt: Int, list: List<Int>):Int {
        if (list.size > 1) {
            val listMidPoint = list.size / 2
            if (searchInt < list[listMidPoint]) {
                return chop(searchInt, list.subList(0,listMidPoint))
            } else {
                val retVal = chop(searchInt, list.subList(listMidPoint, list.size))
                if (retVal != -1) {
                    return retVal + listMidPoint
                }
            }
        }
        return -1
    }
}