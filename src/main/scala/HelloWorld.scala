/*Importing the packeafes*/

import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source



object HelloWorld extends App{
  println("Hello World!")
  println(2+3)

  // A variable able to change
  var MyName = "Sai\n"
  print(MyName)

  // constant can never change
  val language = "Scala"
  print(language)

  var randint = 500
  print(randint+1)
  print(randint-1)

}

object conditionalStatments extends App{
  var age = 23
  val canVote = if(age >= 18) "yes" else "no"

if(age <= 15){
    print("Teens")
  }
  else if (age >= 20 && age <= 21){
    print("Concentarte on the college")
  }
  else{
    print("print you area an adult")
  }
}


object ScalaTut {
  def main(args: Array[String]): Unit = {

    var i = 0

    while (i <= 10) {
      println(i)
      i = i + 1
    }

    // For loops
    for (i <- 10 to 20) {
      print(i)
    }
    var myvariable = "Pavan"
    // Random letters
    for (i <- 0 until myvariable.length) {
      println(myvariable(i))
    }
    // Scala list
    val alist = List(1, 2, 3, 4, 5)
    for (i <- alist) {
      println(i)
    }

    for (i <- 1 to 5; j <- 6 to 10) {
      print(i)
      println(j)
    }

    // defining your own functions

    // No break or continuous in Scala
    def primeNumbers(): Unit = {
      val primenumbes = List(1, 2, 3, 4, 5, 8, 10)
      for (i <- primenumbes) {

        print(i)
        if (i == 10) {
          return
        }
      }
    }

    var name = "SCALA"
    /*
    do{
      println("Guess the Letter")
      name = readLine
    }while (name == "SCALA")
*/
    println("You guessed the correct letter", name)

    val namen = "Pavan"
    val age = 39
    val weight = 175.5
    println(s"Hello $name")
    println(f"I am ${age + 1} and weigh $weight%.2f")

    var randSent = "I saw a dragon fly by"

    // Get the 3rd Index value
    println("3rd Index: " + randSent(3))

    // Get String length
    println("String length " + randSent.length())

    // Concatenate strings
    println(randSent.concat("and explore"))

    println("Are strings equal " + "I saw a dragon".equals(randSent))

    println("dragon starts at index ", randSent.indexOf("dragon"))

    // Convert an String into a array
    val randArray = randSent.toArray

    for (v <- randArray) {
      println(v)
    }


    //Functions:
    /*
    def funcName(param1:dataType, param2:dataType) : returnType = {
    function body
    return ?? the value to return
    }
     */

    def getSum(num1: Int = 1, num2: Int = 1): Int = {
    return (num1+num2)
    }

    println("5 + 4 = " + getSum(5,4))

    def sayHi(): Unit = {
      println("Hi how are you")
    }

    def getSum2(args: Int*) : Int = {
      var sum : Int = 0
      for(num <- args){
        sum += num
      }
      sum
    }

    println("getSum2: " + getSum2(1,2,3,4,5))

    def recursion(num: BigInt) : BigInt =  {
    if (num <= 1) {
      1
    }
    else
      num * recursion(num - 1)
    }

    print(recursion(5))

  // Arrays
    // creating the array of ints with a max size of 20
    val favNums = new Array[Int](20)

    // Creating an array of size 2
    val friends = Array("sai", "pavan")

    //
    friends(1) = "Hello"

    // Array Buffer
    val new_friends = ArrayBuffer[String]()
    new_friends.insert(0, "Phil")
    new_friends.insert(1,"MArk")
    print(new_friends)

    // Add items to the next available slot
    new_friends += "Sai"
    new_friends ++= Array("Susy","Paul")

    print(new_friends)
    for (i <- new_friends){
      println("\\\\\\\\\\\\")
      print(i)
      print("///////////////////////////")
    }

    for (j <-  0 to (favNums.length-1)){
      favNums(j) = j
      print(favNums(j))
    }

  }
}

object new_arrays extends  App{
  val favNums = new Array[Int](20)

  for (j <-0 to (favNums.length-1)){
    favNums(j) = j
    println(favNums(j))
  }

  val favNumsTimes3 = for(num <- favNums) yield  3 * num
  /*
  for (j <- favNumsTimes3){
    println(j)
  }
  */
  favNumsTimes3.foreach(println)
  // Multi dimensional arrays
  var multTable  = Array.ofDim[Int](10,10)

  for (i <- 0 to 9){
    for (j <- 0 to 9){
      multTable(i)(j) = i * j
    }
  }

  for (i <- 0 to 9){
    for (j <- 0 to 9){
      println("%d : %d = %d\n",i, j, multTable(i)(j))
    }
  }

  println("Sum : " + favNumsTimes3.sum)
  println("Min : " + favNumsTimes3.min)
  println("Max : " + favNumsTimes3.max)

  val sortedNum  = favNums.sortWith(_>_)
  val new_number = favNums.sortWith(_<_)
  sortedNum.foreach(println)

  println(sortedNum.deep.mkString((",")))
}

object NewMaps extends  App{
  // Making a new Collection of key value pairs

  // Immutable Maps
  val employees = Map("Manager" -> "Bob Smith", "Secretary" -> "Sue Brown")

  if(employees.contains("Manager")){
    println(employees("Manager"))
  }

  // Create a Mutable
  val customers = collection.mutable.Map(100 -> "Paul Smith", 101 -> "Hello")
  printf("Cust 1: %s\n", customers(100))

  // Before a Map
  for ((k,v) <- customers){
    printf("%d : %s\n" , k,v)
  }

  // Change a value using the key
  customers(100) = "Tom Marks"
  customers(102) = "Megan Shift"

  // Output a Map
  for((k,v) <- customers){
    printf("%d : %s\n", k,v)
  }

}

//object new_Tuples extends  App{
//  // Tuples can hold values of many types but they are immutable
//  var tupleMarage = (103, "Marge Simpson", 10.25)
//  printf("%s owes us $%.2f\n", tupleMarage._2, tupleMarage._3)
//
//  // Iterate through a tuple
//  tupleMarage.productIterator.foreach({i => println(i)})
//
//  // Convert the Tuple to a string
//  println(tupleMarage.toString())

  // ==================== Classes ===================
  // Creating a Classes

//  class Animal(var name: String, var sound: String){
//    this.SetName(name)
//
//    // Animal Companion object
//    val id = Animal.newIdNum
//
//    // You must initialize all fields
//    // protected means the field can only be accessed directly
//    // by methods defined in the class of by subclass
//    // private fields can't be accessed by subclasses of Animal
//    // public fields can be accessed directly by anything
//
//    // protected var name = "No Name"
//    // protected var sound = "No sound"
//
//
//    // Getters and setters are used to protect the data
//    def getName() : String = name
//    def getSound() : String = sound
//    def setName(name : String): Unit ={
//      // Check if the string contains the numnbers and if so don;t allow
//      if(!(name.matches(".*\\d+.*"))){
//        this.name = name
//      }
//      else
//        this.name = "No Name"
//    }
//
//    def setSound(sound : String): Unit ={
//      this.sound = sound
//    }
//
//    // Sub classes can't call this constructor unlike with Java
//    def this(name:String){
//      this("No Name", "No Sound")
//      this.setName(name)
//    }
//
//    def this(){
//      // This calls the primary constructor defined on the class line
//      this("No Name", "No Sound")
//    }
//
//    // Override other method
//
//    override def toString: String = {
//      // How to format the strings
//      return "%s with the id %d says %s".format(this.name, this.id, this.sound)
//    }
//  }
//
//  // ------------------------- Inhertitance --------------------
//  // A class that inherits another gains all its fields and methods
//  // variables and functions in Java
//
//  object Animal{
//    private var idNumber = 0
//    private def newIdNum = {idNumber += 1; idNumber}
//  }
//
//  class Dog(name: String, sound : String, growl: String) extends Animal{
//
//  }
//
//
//
//
//  val rover = new Animal
//  rover.setName("Rover")
//  rover.setSound("Woof")
//
//  printf("%s says %s\n", rover.getName, rover.getSound)
//
//
//
//}
//
//
//
//

