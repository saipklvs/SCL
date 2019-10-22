// first class for learning scala

class Upper{
  def upper(strings:String*): Seq[String] = {
    strings.map((s:String) => s.toUpperCase)
  }
}


val up = new Upper
Console.print(up.upper("A", "First", "Scala"))