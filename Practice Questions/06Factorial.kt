//Program to find the factorial of a given number


fun Factorial(){
    var num:Int = readLine()?.toInt()?:0
    var n=num
    var fact =1
    while(n>0){
        fact=fact*n
        n--
    }
    println("Factorial of $num is: $fact")
}


fun main(){
  Factorial()
}
