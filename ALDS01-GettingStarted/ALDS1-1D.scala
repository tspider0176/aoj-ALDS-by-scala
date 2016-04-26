import scala.io.Source

object Main{
  def main(args: Array[String]){
    val lines = for{
      in <- Source.stdin.getLines.toList
    }yield in.toInt

    println(rec(lines.tail, Int.MinValue))
  }

  def rec(list: List[Int], max: Int): Int ={
    if(list.length == 1) max
    else rec(list.init, Math.max(list.last - list.init.min, max))
  }
}
