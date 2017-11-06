package blatt_04

object aufgabe_1 {

def main (args: Array[String]): Unit = {
		
  
	//Teilaufgabe a (nur für sortierte Listen mit Elementen, die nur einmal vorkommen --> ist so gewollt)
	val L1 = List(5,1,5,17)
	val L2 = List(3,5,18)
	
	
	def union(L1:List[Int],L2:List[Int]) : List[Int] = (L1,L2) match {
		
	case(List(),_) => L2
	case(_,List()) => L1
	case (x::xRest, y::yRest) =>
		if (x < y) x::union(xRest, L2)
		else if (y < x) y::union(L1, yRest)
		else x::union(yRest, xRest)
	
	case (_,_) => L1 ::: L2 	
	
	

	
}
	
	
	println(union(L1,L2)) 
	
/*
	
	println(()
	
	
	/*Teilaufgabe b --> gucken wann a und b gleich sind und dann in eine Liste packen
	def intersect (L1:List[Int],List2[Int]):List[Int] = (L1,L2) match {
	  
	 case (x::xRest, y::yRest) =>
		if (x != y) union(xRest, yRest)
		else if (y < x) y::union(yRest, x::xRest)
		else x::union(yRest, xRest)
	}
	*/
	
}
}
		
