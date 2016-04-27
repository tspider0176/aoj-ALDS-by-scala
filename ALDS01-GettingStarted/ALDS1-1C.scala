import scala.io.Source

object Main{
  def main(args: Array[String]){
    val lines = for{
      in <- Source.stdin.getLines if isPrime(in.toInt)
    }yield in

    println(lines.toList.tail.length)
  }

  def isPrime(n: Int): Boolean = (2 to Math.sqrt(n).toInt).forall(n % _ != 0)
}
