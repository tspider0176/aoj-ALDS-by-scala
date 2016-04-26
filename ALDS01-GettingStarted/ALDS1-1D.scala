import scala.io.Source
import Math.sqrt

object Main{
  def main(args: Array[String]){
    val lines = for{
      in <- Source.stdin.getLines
    }yield in.toInt

    println(lines.filter(prime(_)).length)
  }

  def prime(n: Int): Boolean = (2 to sqrt(n).toInt).forall(n % _ != 0)
}
