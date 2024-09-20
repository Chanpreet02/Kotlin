//Program to check whether the two strings are an anagram or not


fun main(){
  val str1="bored"
  val str2="robed"
  Anagram(str1, str2)
}

fun Anagram(str1: String, str2: String){
    if(str1.length == str2.length){
        var arr1 = str1.toCharArray().sortedArray()
        var arr2 = str2.toCharArray().sortedArray()
        if(arr1.contentEquals(arr2)){
            println("The string is an anagram")
        }
        else{
            println("Not an anagram")
        }
    }
    else{
        println("Not an anagram")
    }
}
