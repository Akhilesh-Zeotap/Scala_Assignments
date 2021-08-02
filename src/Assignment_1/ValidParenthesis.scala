package Assignment_1

import scala.annotation.tailrec

object ValidParenthesis extends App {

  def isValid(arr: List[Char]): Boolean = {
    @tailrec
    def helper(arr: List[Char], count_of_open_parenthesis: Int): Boolean = {
      arr match {
        case Nil => count_of_open_parenthesis == 0
        case x :: arr =>

          if (x == '(') helper(arr, count_of_open_parenthesis + 1)
          else if (x == ')') {
            if (count_of_open_parenthesis <= 0) false
            else helper(arr, count_of_open_parenthesis - 1)
          }
          else{
            helper(arr, count_of_open_parenthesis)
          }
      }
    }

    helper(arr, 0)
  }



  val test_1 = List('(','(',')',')','(',')','(',')')
  val test_2 = List(')',')','(','(')
  val test_3 = List()
  println(isValid(test_1),isValid(test_2),isValid(test_3))

}
