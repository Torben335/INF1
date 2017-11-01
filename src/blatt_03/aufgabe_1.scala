package blatt_03

object aufgabe_1 {

def main (args: Array[String]): Unit = {
  
 	val m : Int = 3
	val n : Int = 2
	
	
	//Teilaufgabe a
	  
	def binKoeff (m : Int, n : Int) : Int = fak(m) / (fak(n) * fak(m-n))
	
		def fak (x : Int) : Int = 
	  if (x == 0) 1
	  else x * fak(x-1)
	 
	  
	//Teilaufgabe d
	  
	def binKoeffRek (m : Int, n : Int) : Int =
	  if (n == 0 || m == n) 1
	  else binKoeffRek (m-1,n) + binKoeffRek(m-1,n-1)
	 
	

	 
	 
	 
	 
	 println("binKoeff = " + binKoeff(m,n))  
	 println("binKoeffRek = " + binKoeffRek(m,n))  }
}