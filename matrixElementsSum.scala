def matrixElementsSum(a: Array[Array[Int]]) = {
    
    val rowLength = a.length
    val colLength = a(0).length
    val cols = ArrayBuffer[Array[Int]]()
    for( c <- 0 until colLength) {
      val col = ArrayBuffer[Int]()
      for ( r <- 0 until rowLength) {
        col.append(a(r)(c))
      }
      cols.append(col.toArray)
    }
    var sum = 0
    for( i <- 0 until cols.length) {
      for(j <- 0 until cols(0).length-2){
        if (cols(i)(j) == 0 || cols(i)(j+1) == 0) {
          sum += cols(i)(j)
        } else {
          sum += cols(i)(j) + cols(i)(j+1) + cols(i)(j+2)
        }
      }
    }
    sum
  }
