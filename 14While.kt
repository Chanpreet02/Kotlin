/*
Kotlin Program to practice some loops on while statement
*/

fun main(){
Pattern()
SumEvenNumbers()
SumEvenNumbersN()
Factorial()
}


//Kotlin Function to enter a number and print the pattern corresponding to the number entered
fun Pattern(){
    var lines = readLine()?.toInt()?:0
    while (lines > 0) {
        var stars = lines
        while (stars > 0) {
            print('*')
            stars--
        }
        println("")
        lines--
    }
}

//Function to print the sum of even numbers present until the given number
fun SumEvenNumbers(){
    var num:Int=readLine()?.toInt()?:0
    if(num%2 != 0){
        num--
    }
    var sum=0
//    println(num)
while(num>0){
    sum = num+sum
    num=num-2
}
    println("The sum of even numbers tll the given number is: $sum")
}


//Function to print the sum of n number of even numbers
fun SumEvenNumbersN(){
    var num:Int=readLine()?.toInt()?:0
    var n=0
    var sum =0
    while(n<=num){
        sum = (n*2)+sum
        n++
    }
    println("The sum of first n even numbers is: $sum")
}



//Function to print the factorial of a given number
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
