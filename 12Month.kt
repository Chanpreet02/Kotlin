/*
This is a Kotlin program in which I have entered a number and displaying the corresponding Month of the year.
Updated and enabled to re run the program if the person want
*/

fun main(){
  monthNum()
}

fun monthNum(){
    println("Enter the month number and I'll tell which month it is")
    var num:Int = readLine()?.toInt()?:0
    when(num){
        1 ->println("January")
        2 -> println("February")
        3 -> println("March")
        4 ->println("April")
        5 ->println("May")
        6 ->println("June")
        7 ->println("July")
        8 ->println("August")
        9 ->println("September")
        10->println("October")
        11->println("November")
        12->println("December")
        else ->println("Enter number in the range 1-12")
    }

    println("Do you want to re run the program")
    val result = readLine()?.lowercase()
    if(result=="yes" || result =="y"){
        monthNum()
    }
}

