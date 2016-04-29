import scala.io.StdIn
import scala.annotation.tailrec

object Main{
  def main(args: Array[String]){
    StdIn.readLine()
    val line = StdIn.readLine().split(" ").toList.map(_.toInt)

    val res = bSort(line)
    println(res._2.mkString(" ") + "\n" + res._1)
  }

  def bSort(list: List[Int]):Int= bSortRec(List(), list, 0)

  @tailrec
  def bSortRec(sorted: List[Int], unsorted: List[Int], n: Int): Tuple2[Int, List[Int]] ={
    if(unsorted.length == 0) (n, sorted)
    else{
      //unsortedの配列をbubbleソートする
      val bubble = unsorted.foldRight(Int.MaxValue){(a, b) => if(a < b) List(a, b) else b}

      //unsortedのheadをsorted、tailをunsortedとして再帰

    }
  }
}
