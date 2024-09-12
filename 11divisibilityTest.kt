/*Kotlin Program to check whether a number is divisible by both 11 and 5
took the number from the user and then calculated using if else statements
*/

fun main(){
  divisibility()
}

fun divisibility(){
    println("Enter the number you want to check for: ")
    val num = readLine()?.toInt()?:0
    if(num>0){
        if (num %5 == 0 && num%11 == 0){
            println("The number $num is divisible by both 11 and 5")
        }
        else if(num%5 != 0 && num%11 ==0){
            println("The number is divisible by 11 but not divisible by 5")
        }
        else if(num%11!=0 && num%5 == 0){
            println("The number is divisible by 5 but not by 11")
        }
        else{
            println("The number is not divisible by both 11 and 5")
        }
    }
    println("Do you want to run the function again for a different number??")
    var res = readLine()?.uppercase()
    if(res == "YES" || res == "Y"){
        divisibility()
    }
    else{
        println("Thank you")
    }

}
