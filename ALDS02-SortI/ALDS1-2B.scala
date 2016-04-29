import scala.io.StdIn
import scala.annotation.tailrec

object Main{
  def main(args: Array[String]){
    StdIn.readLine()
    val line = StdIn.readLine().split(" ").toList.map(_.toInt)

    val res = sSort(List(), line, 0)
    println(res._1.mkString(" ") + "\n" + res._2)
  }

  @tailrec
  def sSort(sorted: List[Int], unsorted: List[Int], n: Int):(List[Int], Int)={
    if(unsorted.sorted == unsorted) ((sorted ::: unsorted), n)
    else if(unsorted.indexWhere(_ == unsorted.min) == 0) sSort(sorted :+ unsorted.head, unsorted.tail, n)
    else {
      val pos = unsorted.indexWhere(_ == unsorted.min)
      val swapped = unsorted.updated(0, unsorted(pos)).updated(pos, unsorted.head)

      sSort(sorted :+ unsorted.min, swapped.tail, n+1)
    }
  }
}
