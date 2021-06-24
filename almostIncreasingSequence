def almostIncreasingSequence(arr: Array[Int]): Boolean = {

    def findBadPair(a: Array[Int]): Int = {
      for (i <- 0 to a.length - 2) {
        if (a(i) >= a(i + 1)) {
          return i
        }
      }
      -1
    }

    val j = findBadPair(arr)
    if(j == -1) return true

    if(j != 0) {
      //remove 1st element
      if(findBadPair(arr(j-1) +: arr.drop(j+1)) == -1) return true
      //remove 2nd element
      if(findBadPair(arr(j) +: arr.drop(j+2)) == -1) return true
    } else {
      //remove 1st element
      if(findBadPair(arr.drop(1)) == -1) return true
      //remove 2nd element
      if(findBadPair(arr(0) +: arr.drop(j+1)) == -1) return true
    }
    false
  }
