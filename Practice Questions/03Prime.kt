//Program to check whether a number is a prime number or not


fun main(){
      println("Enter the number")
    var num:Int= readln()?.toInt()?:0
  PrimeNumber(num)
}


fun PrimeNumber(num:Int){
    var isPrime:Boolean = true
    var n =2
    while (n<num){
        if(num%n == 0){
            isPrime = false
            break
        }
        n++
    }
    if(isPrime==true){
        println("The number is prime")
    }
    else{
        println("The number is not a prime number")
    }

}
