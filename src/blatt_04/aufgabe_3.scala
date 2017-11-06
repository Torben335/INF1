//Teilaufgabe a
def MoL(l:List[Int]):Int = l match {
  case l.length == 1 => l.head      //Wenn eine Liste die Länge 1 hat, also ein Element
  case x1::x2::xs =>  if (x1>x2) MoL(x1::xs)
                      else MoL(x2::xs)
}

//Teilaufgabe b 
def streiche (y:Int,l:List[Int]):List[Int]  = l match {
  case List() => List()
  case x::xs => if(x==y) xs
                else x::streiche(y,xs)


//Teilaufgabe c (4,1,2,7,3) --> (4,1,2,3)7) --> (1,2,3)4)7)
def MaxSort(l:List[Int]):List[Int] = l match {
  case List() => List()
  case _ => val m = MoL(l)      //Ich speicher mir das max in einer Variablen m
            val ys = streiche(m,l)
            MaxSort(ys)::m
