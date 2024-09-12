/*
Kotlin program to check whether the three angles are of a perfect triangle or not
*/

fun main(){
  sumAngle()
}

fun sumAngle(){
    println("Enter the three angles of a triangle and check whether the angles are of a valid triangle or not")
    var angle1:Double = readLine()?.toDouble()?:0.0
    var angle2:Double = readLine()?.toDouble()?:0.0
    var angle3:Double = readLine()?.toDouble()?:0.0

    var sum:Double = 0.0
    sum = angle1+angle2+angle3
    if(sum==180.0){
        println("These are the angles of a proper triangle")
    }
    else {
        println("These are not the angles of a perfect triangle")
    }

    println("Do you want to rerun the program and enter some different angles?")
    val result = readLine()?.lowercase()
    if(result == "yes" || result=="y"){
        sumAngle()
    }
    else{
        println("Thank You")
    }
}
