import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    val line = StdIn.readLine().split(" ").toList.map(_.toInt)
    println(gcd(line.head, line.last))
  }

  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}
