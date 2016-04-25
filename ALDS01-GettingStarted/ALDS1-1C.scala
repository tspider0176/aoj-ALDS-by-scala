import scala.io.Source

object Main{
  def main(args: Array[String]){
    val lines = for{
      in <- Source.stdin.getLines.toList.map(_.toInt)
    }yield in

    println(lines.filter(prime(_)).length)
  }

  def prime(n: Int): Boolean = (2 to n - 1).filter(m => n % m == 0).length == 0
}
