import scala.io.Source
import scala.annotation.tailrec

object Main{
  def main(args: Array[String]){
    val lines = for{
      in <- Source.stdin.getLines.toVector
    }yield in.toInt

    println(rec(lines.tail, Int.MinValue, Int.MaxValue))
  }

  @tailrec
  def rec(vec: Vector[Int], preMax: Int, preMin: Int): Int ={
    if(vec.length == 1) preMax
    else rec(vec.tail, Math.max(vec.tail.head - Math.min(preMin, vec.head), preMax), Math.min(preMin, Math.min(preMin, vec.head)))
  }
}
