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



  }
}









