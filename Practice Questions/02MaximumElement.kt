//Program to find the maximum element

fun main(){
      var arr= arrayOf(1, 3, 5, 2, 9, 7)
    var i =0
    var max=arr[0]
    while(i<arr.size){
        if(arr[i]>max){
            max = arr[i]
        }
        i++
    }
    println("The maximum element present inside the array is: $max")
}
