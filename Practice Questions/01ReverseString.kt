//Program to reverse the characters of a string

fun reverseString(){
    println("Enter the string")
    var str:String=readln()
    var reverse:String = ""
    for (i in str.length-1 downTo 0){
        reverse +=str[i]
    }
    println(reverse)

}

fun main(){
  reverseString()
}

