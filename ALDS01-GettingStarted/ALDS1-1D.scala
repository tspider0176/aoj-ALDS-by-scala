import scala.io.Source
import scala.annotation.tailrec

object Main{
  def main(args: Array[String]){
    val lines = for{
      in <- Source.stdin.getLines.toList
    }yield in.toInt

    println(rec(lines.tail, Int.MinValue))
  }

  @tailrec
  def rec(list: List[Int], max: Int): Int ={
    if(list.length == 1) max
    else rec(list.init, Math.max(list.last - list.init.min, max))
  }
}
