class BinarySearchTree {

    fun chop(searchInt: Int, list: List<Int>): Int {
        println("Searching for: $searchInt in [${printListContents(list)}]")
        println()

        if (list.size == 0) {
            println("Didn't find $searchInt")
            return -1
        }

        if (list.size == 1) {
            if (list.get(0) == searchInt) {
                println("Found $searchInt!")
                return 0
            } else {
                println("Didn't find $searchInt")
            }
        }

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



    fun printListContents(list: List<Int>):String {
        val printString = StringBuffer();
        list.indices
                .forEach {
                    printString.append(list[it])
                    printString.append(" ")
                }
        return printString.toString()
    }
}