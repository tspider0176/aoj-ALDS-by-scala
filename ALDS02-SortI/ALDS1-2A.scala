import scala.io.StdIn
import scala.annotation.tailrec

object Main{
  def main(args: Array[String]){
    StdIn.readLine()
    val line = StdIn.readLine().split(" ").toList.map(_.toInt)

    val res = bSort(List(), list, 0)
    println(res._2.mkString(" ") + "\n" + res._1)
  }

  @tailrec
  def bSort(sorted: List[Int], unsorted: List[Int], n: Int): Tuple2[Int, List[Int]] ={
    if(unsorted.sorted == unsorted) ((sorted ::: unsorted), n)
    else if(unsorted.indexWhere(_ == unsorted.min) == 0) bSort(sorted :+ unsorted.head, unsorted.tail, n)
    else{
      val swapnum = sortRec(unsorted, 0)

      unsorted.foldRight(List(Int.MaxValue)){ (a, b) =>
        if(a < b.head) a :: b
        else b.head :: a :: b.tail
      }

      bSort(sorted :+ sort1th.head, sort1th.tail, n + swapnum)
    }
  }

  @tailrec
  def sortRec(list: List[Int], n: Int): Int ={
    if() n
    else {
      list.foldRight(List(Int.MaxValue)){ (a, b) =>
        if(a < b.head) a :: b
        else b.head :: a :: b.tail
      }
    }
  }
}
