import scala.io.Source
import Math.sqrt

object Main{
  def main(args: Array[String]){
    val lines = for{
      in <- Source.stdin.getLines
    }yield if(prime(in.toInt)) in else Nil

    println(lines.filter(_ != Nil).length)
  }

  def prime(n: Int): Boolean = (2 to sqrt(n).toInt).forall(n % _ != 0)
}
