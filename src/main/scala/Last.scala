class Last {
  def lastFun(list:List[Int]): Unit ={
    def last(list1: List[Int],pos:Int): Unit ={
      pos match{
        case _ if(list1.isEmpty)=>println("enter vaild list")
        case _ if(list1.tail==Nil)=>println(s"position is $pos and element is ${list1.head}")
        case _ =>last(list1.tail,pos+1)
      }
    }
    last(list,0)
  }


}
