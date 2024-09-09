/*
(=)  	||  x = 10  ||	x = 10
(+=)	||  x += 10  ||	x = x - 10
(-=)	||  x -= 10  ||	x = x - 10
(*=)	||  x *= 10  ||	x = x * 10
(/=)	||  x /= 10  ||	x = x / 10
(%=)	||  x %= 10  ||	x = x % 10
*/

fun main(){
  val x: Int = 40
   val y: Int = 20

   println("x = " +  x)
   println("y = " +  y)

   x += 10
  println("===================")
  println("x= "+ x)
}

/*
Output
x = 40
y = 20
===================
x= 50
*/
