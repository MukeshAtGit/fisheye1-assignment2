class Reverse {
  val list2=List[Int]()
  def reverseFun(list1:List[Int],list2:List[Int]=Nil):List[Int]=
  {
    list1 match {
      case _ if(list1.isEmpty)=>list2
      case _ =>reverseFun(list1.tail,list1.head::list2)
    }
  }

}
