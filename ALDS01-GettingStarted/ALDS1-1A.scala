import scala.io.StdIn

object Main{
  def main(args: Array[String]){
    StdIn.readLine()
    val line = StdIn.readLine().split(" ").toList.map(_.toInt)
    println(insertSort(List(line.head), line.tail).mkString(" "))
  }

  def insertSort(list1: List[Int], list2: List[Int]): List[Int] ={
    if(list2.length == 0) return list1
    else{
      println((list1 ::: list2).mkString(" "))
      insertSort((list2.head :: list1).sorted, list2.tail)
    }
  }
}
