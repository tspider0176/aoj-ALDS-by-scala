import scala.io.StdIn
import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer

object Main{
  def main(args: Array[String]){
    StdIn.readLine()
    val line = StdIn.readLine().split(" ").toList.map(_.toInt)

    println(line.sorted.mkString(" "))
    println(sSort(List(), line, 0))
  }

  @tailrec
  def sSort(sorted: List[Int], unsorted: List[Int], n: Int): Int={
    if(unsorted.length == 0) n
    else if(unsorted.sorted == unsorted) n
    else {
      val pos = unsorted.indexWhere(_ == unsorted.min)
      val swapped = unsorted.updated(0, unsorted(pos)).updated(pos, unsorted(0))

      if(pos == 0) sSort(sorted :+ unsorted.min, swapped.tail, n)
      else sSort(sorted :+ unsorted.min, swapped.tail, n+1)
    }
  }
}
