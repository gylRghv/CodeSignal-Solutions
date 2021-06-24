def shapeArea(n: Int): Int = {   
    if (n < 1) {
        0
    }
    else if (n == 1)
        1
    else {
        n*n + (n-1)*(n-1)
    }        
} 
