package Assignment_1

object CountChange extends App {

  def countWays(coins:List[Int],money:Int):Int = {

    def helper(coins:List[Int],money:Int,curMoney:Int):Int = {
      if(coins.isEmpty) {if (curMoney == money) return 1 else return 0}
      if(curMoney > money)  return 0
      if(curMoney == money) 1
      helper(coins,money,curMoney+coins.head) + helper(coins.tail,money,curMoney)
    }

    helper(coins,money,0)
  }


  val coins = List(1,2,3,6,8)
  val money = 20
  println(countWays(coins,money))

}
