// first class for learning scala
import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

class Upper{
  def upper(strings:String*): Seq[String] = {
    strings.map((s:String) => s.toUpperCase)
  }
}


val up = new Upper
Console.print(up.upper("A", "First", "Scala"))