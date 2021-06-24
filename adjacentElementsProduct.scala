def adjacentElementsProduct(a: Array[Int]): Int = {
    var maxProduct, finalMaxProduct = a(0)*a(1)
    
    for ( i <- 1 to a.length-2){             
        maxProduct = Integer.max(a(i) * a(i+1), maxProduct)
        finalMaxProduct = Integer.max(maxProduct, finalMaxProduct)
    }
    finalMaxProduct
}
