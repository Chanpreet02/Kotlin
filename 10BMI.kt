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

    if (BMI <= 18.5) {
        println("You are underweight please focus on eating more")
    } else if (BMI > 18.5 && BMI < 24.9) {
        println("You are doing just fine")
    } else if (BMI >= 24.9 && BMI < 29.9) {
        println("You are just a bit overweight. Eat Less")
    } else if (BMI >= 29.9 && BMI < 34.9) {
        println("You are on obese level 1 Bro Focus more on your body please")
    } else if (BMI >= 34.9 && BMI < 39.9) {
        println("You are on obese level 2. Please workout more and eat very less")
    } else if (BMI >= 39.9) {
        println("You are gonna die soon go and have some operation")
    }
    println("Do you want to re run the calculator??")
    println("If yes please press 1 or type YES(Only in capitals)")
    var reoccur = readLine()
    if(reoccur == "1" || reoccur =="YES"){
        BMICalculator()
    }
}
