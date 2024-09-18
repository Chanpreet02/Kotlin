//Kotlin program to find the sum of te digits of the number


fun main(){
    var num:Int = readln()?.toInt()?:0
    var sum = 0
    while(num>0){
        var ld=num%10
        sum +=ld
        num=num/10
    }
    println("The sum of digits of the number entered is: $sum")
}
