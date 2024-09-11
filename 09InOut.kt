fun main(){

    println("Enter the name, This is through the Kotlin Method")
    val nameKotlin = readLine()
    println("Haan vai kya haal chaal $nameKotlin")
    println("Enter your age please $nameKotlin")
    val age:Int = readLine()?.toIntOrNull() ?:0
    println("Hello $nameKotlin vai tu $age saal ka hai")


    println("Please Enter any String value: ")
    var sTRing=readLine()
    println("Please Enter any Integer value: ")
    var INt= readLine()?.toIntOrNull()?:0
    println("Please Enter any Character value: ")
    var ch = readLine()?.firstOrNull()?: ' '
    println("Please Enter any Decimal value: ")
    var num = readLine()?.toDoubleOrNull()?:0.0
    println("Thank You for entering, here is the result: ")
    println("String Value: $sTRing")
    println("Integer Value: $INt")
    println("Character Value: $ch")
    println("Decimal Value: $num")

}

