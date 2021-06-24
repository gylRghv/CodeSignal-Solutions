def makeArrayConsecutive(statues: Array[Int]): Int = {
    val sortedArray = statues.sorted
    var required = 0

    if(sortedArray.size == 1)
        0
    else {        
        for (i <- 0 to sortedArray.length-2){
            val diff = math.abs(sortedArray(i+1)) - math.abs(sortedArray(i))
            if(diff != 1)
                required += diff-1
                
        }
    }
    required
}
