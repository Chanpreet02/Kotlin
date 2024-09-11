import java.util.Scanner

fun main() {
    
    BMICalculator()
}


    //BMI Calculator
    fun BMICalculator(){
    println("Enter your weight(in Kg)")
    val weight = readLine()?.toDoubleOrNull() ?: 0.0
    println("Enter the Unit: Meter or Centimeter")
    val unit = readLine()
    println("Enter your Height")
    var height = readLine()?.toDoubleOrNull() ?: 0.0
    if (unit == "cm" || unit == "CM" || unit == "Cm" || unit == "Centimeter") {
        height /= 100
    }
    val BMI: Double = weight / (height * height)
    println("Your BMI is: $BMI")
    
}
