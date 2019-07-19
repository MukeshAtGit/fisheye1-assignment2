class SumOfElement() {

  def sumFun(list: List[Int], sum: Int = 0): Unit = {

    list match {
      case _ if (list.isEmpty) => println(sum)
      case _ => sumFun(list.tail, list.head+list.head)

  }
}
}




