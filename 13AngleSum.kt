/*
Kotlin program to check whether the three angles are of a perfect triangle or not
*/

fun main(){
  var angle1:Double = 60.0
  var angle2:Double = 45.0
  var angle3:Double = 75.0
  var sum:Double = 0.0

  sum = angle1+angle2+angle3
  if(sum==180.0){
    println("These are the angles of a perfect triangle")
  }
  else{
    println("These angles does not belong to a perfect triangle")
  }
}
