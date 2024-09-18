//program to check whether a number is a palindrome or not


fun Palindrome(){
    var num:Int = readln()?.toInt()?:0
    var n = num
    var rev = 0
    while(n>0){
        var ld=n%10
        rev = rev*10 + ld
        n=n/10
    }
    if(rev == num){
        println("The number is a palindrome number")
    }
    else{
        println("The number is not a palindrome")
    }
    println("Check for another number? Yes or no")
    var str:String = readln().lowercase()
    if(str == "yes" || str=="y" ){
        Palindrome() //Recursion
    }
    
}




fun main(){
  Palindrome()
}
