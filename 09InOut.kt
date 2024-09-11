fun main(){

    println("Enter the name, This is through the Kotlin Method")
    val nameKotlin = readLine()
    println("Haan vai kya haal chaal $nameKotlin")
    println("Enter your age please $nameKotlin")
    val age:Int = readLine()?.toIntOrNull() ?:0
    println("Hello $nameKotlin vai tu $age saal ka hai")

}

