object main extends App {
  val list=List[Int](2,34,3,55)

val sum1=new SumOfElement()
  sum1.sumFun(list)


  val find=new Find
  find.findkth(list,3)

  val rev=new Reverse
  println(rev.reverseFun(list))

  val insert1=new Insert
  insert1.insert(list,23,3)
  val last=new Last
  last.lastFun(list)
}
