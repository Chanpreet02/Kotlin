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
  
