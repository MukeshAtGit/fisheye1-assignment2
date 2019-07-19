class Find {
  def findkth(list: List[Int],k:Int): Unit =
    k match {
      case _ if(list.isEmpty)=>println("index out of bound")
      case _ if(k==0)=>println(s"element is = ${list.head}")
      case _ =>findkth(list.tail,k-1)


    }
}
