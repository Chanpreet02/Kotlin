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
  Table()
  Fibonacci()
  Divisibility()
  EvenNumber()
}

fun basic(){
   for (i in 1..5) {
      println(i)
   }
}

fun decrementByTwo(){//This is a function to decrement the numbers present with the gap of 2
        for (i in 5 downTo 1 step 2) {
        println(i) 
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


fun Table(){//Function to print the multiples of 5 from 1 to 50
    val number = 5
    for (i in 1..10) {
        println("$number x $i = ${number * i}")
    }
}


fun Fibonacci(){ //Function to print the fibonacci series
    var a = 0
    var b = 1
    while (a <= 100) {
        println(a)
        var next = a + b
        a = b
        b = next
    }
}

fun Divisibility(){//Function to check the divisibility of a number by 3
    for (i in 1..30) {
        if (i % 3 == 0) {
            println(i)
        }
    }
}


fun EvenNumber(){ // Function to print the first 10 even Numbers
    var count = 0
    for (i in 2..20 step 2) {
        println(i)
        count++
        if (count == 10) break
    }
}




