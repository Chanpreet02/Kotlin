fun main(){
/*
  //Syntax:
  if(condition){
    Code to be executed if the condition inside the if block is true
  }
  else{
    Code to be executed if the condition present inside the if statement is not true
  }
  */

  val age:Int = 10

    if (age > 18) {
        println("Adult")
    } else {
        println("Minor")
    }
//The above line can also be written in a single line as:
    if (age > 18) println("Adult") else  println("Minor")

    // Syntax for if else ladder
    /*
    if (condition1) {
    // code block A to be executed if condition1 is true
    } else if (condition2) {
    // code block B to be executed if condition2 is true
    } else {
    // code block C to be executed if condition1 and condition2 are false
    }
    */
  if (age > 19) {
        println("Adult")
    } else if ( age > 12 && age  < 20 ){
        println("Teen")
    } else {
        println("Minor")
    }

  
}


/*
The output of the following program would be
Minor
Minor
Minor
*/
