//Program to find the second maximum element of an array


fun main(){
  val arr1 = intArrayOf(40, 60, 80, 100)
  SecondMax(arr2)

}

fun SecondMax(arr1: IntArray){
    arr1.sortedArray()
    val secMax = arr1.size-2
    println(arr1[secMax])

}
