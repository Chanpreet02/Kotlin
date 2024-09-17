/*
Kotlin program to understand the concepts of for loop
Syntax:

    for (item in collection) {
        // body of loop
    }
*/

fun main(){
  basic()
  decrementByTwo()
  Even()
}

fun basic(){
   for (item in 1..5) {
      println(item)
   }
}

fun decrementByTwo(){//This is a function to decrement the numbers present with the gap of 2
        for (item in 5 downTo 1 step 2) {
        println(item) 
        /* Output: 5
                   3
                   1
        */
    }
}

fun Even(){ //Function to print even numbers from 2 till 20
    for (i in 2..20 step 2) {
        println(i)
    }
}
