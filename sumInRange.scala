def sumInRange(nums: Array[Int], queries: Array[Array[Int]]) = {
  var solu = 0L
  val mod = 1000000007L
  val test = scala.collection.mutable.ArrayBuffer[Long]()
  var k = 0L
  for (i <- nums.indices) {
    k += nums(i)
    test += k
  }
  for (i <- queries.indices) {
    if (queries(i)(0) == 0) solu += test(queries(i)(1))
    else solu += test(queries(i)(1)) - test(queries(i)(0) - 1)
  }
  Math.floorMod(solu, mod).toInt
}
