//Program to merge two sorted arrays

fun main(){
  val arr1 = intArrayOf(45, 60, 75, 90, 105)
  val arr2 = intArrayOf(40, 60, 80, 100)
  merge(arr1, arr2)
}

fun merge(arr1: IntArray, arr2: IntArray){
    val merged = IntArray(arr1.size + arr2.size)
    var i = 0
    var j = 0
    var k = 0

    while (i < arr1.size && j < arr2.size) {
        merged[k++] = if (arr1[i] < arr2[j]) arr1[i++] else arr2[j++]
    }
    while (i < arr1.size) merged[k++] = arr1[i++]
    while (j < arr2.size) merged[k++] = arr2[j++]

    for(value in merged){
        print(" "+value)
    }

}
