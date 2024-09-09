/*
(+)  ||	unary plus  ||	+x
(-)  ||	unary minus  ||	-x
(++)  ||	increment by 1  ||	++x
(--)  ||	decrement by 1  ||	--x
(!)  ||	inverts the value of a boolean  ||	!x
*/
fun main(){
   var x: Int = 40
   var b:Boolean = true

   println("+x = " +  (+x))
   println("-x = " +  (-x))
   println("++x = " +  (++x))
   println("--x = " +  (--x))
   println("!b = " +  (!b))
}

/*
Output:
+x = 40
-x = -40
++x = 41
--x = 40
!b = false
*/
