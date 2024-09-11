fun main(){
  // Write a Kotlin program to check whether a number is positive or negative
  val number = 45
  if(number>0){
    println("Positive")
  }
  else{
    println("Negative")
  }
  //Write a program to check the greatoest of three numbers
  val num1 = 30
  val num2 = 20
  val num3 = 10

  if(num1>num2 && num1>num3){
    println("The greatest number is: $num1")
  }
  else if(num2>num1 && num2>num3){
    println("The greatest number is: $num2")
  }
  else if(num3>num1 && num3>num2){
    println("The greatest number is: $num3")
  }
  else if(num1==num2 && num1==num3){
    println("The numbers are equal")
  }
  else{
    println("The numbers are not correct")
  }
}
//Wrie a program to check whether the year is a leap year or not
val year:Int = 2016
if(year % 4 == 0){
  println("The year $year is a leap year")
}
else{
  println("Not a leap year")
}

/*
Output
Positive
The greatest number is: 30
The year 2016 is a leap year
*/
