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

//Recursive program for finding the factorial
fun Fact(num:Int):Int{
    if(num>0){
    return num*Fact(num-1)
    }
    else{
        return 1
    }
}


fun main(){
  Factorial()
  println(Fact(5))//Output = 120
}
