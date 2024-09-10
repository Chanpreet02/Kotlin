fun main() {
   val escapedString : String  = "I am escaped String!\n"
   var rawString :String  = """This is going to be a
   multi-line string and will
   not have any escape sequence""";

   print(escapedString)
   println(rawString)
  println(=============================)
   val name : String = "Zara Ali"
   
   println("Name  - $name")  // Using template with variable name
   
   println("Name length - ${name.length}")  // Using template with expression.
   
   println(name[3])
   println(name[5])

   println("The length of name :" + name.length)
   println("The length of name :" + name.count())

   println("Upper case of name :" + name.toUpperCase())
   println("Lower case of name :" + name.toLowerCase())

   var firstName : String = "Chanpreet "
   var lastName : String = "Singh"

   println("Full Name :" + firstName + lastName)
   
   println("Full Name :" + firstName.plus(lastName) )

   println("Remove first two characters from name : " + name.drop(2))
   
   println("Remove last two characters from name : " + name.dropLast(2))

   var str1 : String = "That's it"
   var str2 : String = "It's OK"

   println("str1 : " + str1)
   println("str2 : " + str2)

   var str : String = "Meditation and Yoga are synonymous with India"

   println("Index of Yoga in the string - " + str.indexOf("Yoga"))
   var str1 : String = "Apple"
   var str2 : String = "Apple"

   println(str1.compareTo(str2))

   var age = 40

   println(age.toString()) //This will convert the data present into String type
   println(age::class.simpleName)//This will print the data type of age variable

      
   /*The output of the following code would be:
  
     I am escaped String!
     This is going to be a
     multi-line string and will
     not have any escape sequence
    =============================
    Name - Zara Ali
    Name length - 8
   a
   A  
   The length of name :8
   The length of name :8
   Upper case of name :ZARA ALI
   Lower case of name :zara ali
   Full Name :Chanpreet Singh
   Full Name :Chanpreet Singh
   Remove first two characters from name : ra Ali
   Remove last two characters from name : Zara A
   str1 : That's it
   str2 : It's OK
   Index of Yoga in the string - 15
   0
   40
   String
     */
     
