package blatt_02

object aufgabe_3 {

def main (args: Array[String]): Unit = {
  
 	val x = 1
 	val y = 3
 	
 	
 	//Teilaufgabe a
 	def istGerade (x : Int) : Boolean =
 	  if (x == 0) true else
 	  if (x%2 == 0) true
 	  else false
 	  
 	def istUngerade (x : Int) : Boolean =
 	  if (x == 0) false else
 	  if (x%2 == 1) true
 	  else false
 	  
 	  
 	//Teilaufgabe b
 	def pred (x : Int) : Int = x - 1
 	
 	def succ (x : Int) : Int = x + 1
 	
 	def isZero (x : Int) : Boolean = x == 0 }
 	
}
 	
 	/*
	def add (x : Int,y : Int) : Int =
	  if (isZero(x)) y else
	  if (x == y) succ(x + pred(y)) else
	  if (x < y) 
	  if (x > y)
	    
	  

 	
 	
 	
 	println("istGerade	= " + istGerade(x))
 	println("istUngerade	= " + istUngerade(x)) }
 //	println("add		= " + add(x,y))  }

} 
*/