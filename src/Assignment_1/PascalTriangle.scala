package Assignment_1

object PascalTriangle extends App {

  def getValueAtRowCol(row:Int,col:Int):Int = {
    if(col > row) return 0
    if (col == 0 || (col == row)) return 1
    getValueAtRowCol(row-1, col-1) + getValueAtRowCol(row-1, col)
  }

  val row = scala.io.StdIn.readInt()
  val col = scala.io.StdIn.readInt()

  println(getValueAtRowCol(row, col)) // 0 based Indexing

}
