class Insert {
  def insert(list: List[Int], element: Int, index: Int):Unit = {
    val lst=List[Int]()
    def insertFun(list1: List[Int], list2: List[Int], k: Int):Unit= {
      k match {
        case _ if (list1.isEmpty) => println("index out of bound")
        case _ if (k == 0) => println(s"${list2.reverse ::: (element::list1)}")
        case _ => insertFun(list1.tail, list1.head :: list2, k - 1)
      }
    }
    insertFun(list,lst,index)

  }
}