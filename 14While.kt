/*
Kotlin Program to practice some loops on while statement
*/

fun main(){
Pattern()
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
