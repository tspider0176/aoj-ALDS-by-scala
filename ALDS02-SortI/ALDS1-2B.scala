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
      // unsortedのうち一番小さい値と0番目を交換、0番目をsortedへ追加、unsortedから0番目を削除
      val swapped = unsorted.updated(0, unsorted(pos)).updated(pos, unsorted(0))

      if(pos == 0) sSort(sorted :+ unsorted.min, deleteOne(swapped, 0), n)
      else sSort(sorted :+ unsorted.min, deleteOne(swapped, 0), n+1)
    }
  }

  def deleteOne(list: List[Int], index: Int): List[Int] = {
    val buf = ListBuffer(list: _*)
    buf.remove(index)
    buf.toList
  }
}
