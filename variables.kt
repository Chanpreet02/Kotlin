fun main(){
  var a = 10
  val b = 20
  /*The main Difference between var and val in Kotlin programming language is that the value of var can be changed but talking about val data type, the val data type once assigned
  or initialized, it cannot be changed. The value of val will remain the same throughout the program.
  */
  println(a) // It will print the value of the variable a
  a = a+20  //It will update the value of variable a
  println(a) // It will print the updated value of the variable a
  println(b) // It will print the value of the variable b
  // If we try to update the value of the variable b, it will throw an error because b is of val data type and the value of variable b will not change

  // To define the type of variable we use a colon to demonstrate what type of the variable it is
  // Numerical Data Type
  var num1: Int = 45 // This will set the variable to be of Integer data type
  var num2: Double = 25.63 // This will set the variable to be of Double(decimal) data type
  var num3: Long = 456585794612 // This will set the variable to be of a Long data type
  var num4: Float = 10.25 // This will set the variable to be of floating(decimal) data type
  var num5: Short = 5 // This will set the variable to be of a short data type which will store small number
  var num6: byte = 8 // This will set the variable to be of a byte data type which will store small number

  // Text Data Type
  var text1: Char = 'H'  // This type of variable data type is used to store a single character. It is enclosed in single quotes 
  var text2: String = "Hello this is the type of text variable where we can store a collection of characters" // This type of variable data type is used to store a collection of characters. It is enclosed in double quotes.

  //Boolean Data type
  var bool: Boolean = true // This type of data type is a is used to store teh boolean values(True or false)
  
