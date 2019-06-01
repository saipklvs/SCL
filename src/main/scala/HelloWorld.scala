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
  def main(args: Array[String]): Unit ={

    var i = 0

    while(i <= 10){
      println(i)
      i = i+ 1
    }

    // For loops
    for (i <- 10 to 20){
      print(i)
    }
   var myvariable = "Pavan"
    // Random letters
    for(i <- 0 until myvariable.length){
      println(myvariable(i))
    }
    // Scala list
    val alist = List(1,2,3,4,5)
    for (i <- alist){
      println(i)
    }

    for (i <- 1 to 5; j <- 6 to 10){
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

  }
}









