package blatt_02

object aufgabe_2 {

def main (args: Array[String]): Unit = {
  
 	val n : Int = 3
 	val a : Int = 0
 	val b : Int = 3
 	
 	
 	//Teilaufgabe a
 	def sumN (n : Int) : Int =   
 	  if (n == 0) 0
 	  else n + sumN(n-1)
 	
 	
 	//Teilaufgabe b
 	def sumFromTo (a : Int,b : Int) : Int = 
 	  if (b < a) 0
 	  else if (a == 0) sumN(b)
 	  else sumN (b) - sumN (a-1)
 	  
 	  
 	//Teilaufgabe c
 	def sumOddN (n : Int) : Int = 2 * sumN(n) - n
 	  
 	  
 	  
 	 
 	  println("sumN		= " + sumN(n))
 	  println("sumFromTo	= " + sumFromTo(a,b))
 	  println("sumOddN 	= " + sumOddN(n))}
}
