package blatt_03

object aufgabe_2 {

def main (args: Array[String]): Unit = {
  
	val n : Int = 5
	
	
	//Teilaufgabe a

	 def dreiecke(n : Int) : Int =
    if (n == 1) 1
    else dreiecke(n - 1) + oben(n) + unten(n)

    def oben(n : Int) : Int = (n * (n + 1)) / 2

    def unten(n : Int) : Int = {
      def h(n : Int, i : Int) : Int =
        if (i > n / 2) 0                            //Wenn Startwert größer als Endwert --> 0
        else n + 1 - 2 * i + h(n, i + 1)
       h(n, 1)  }
       
       
  //Teilaufgabe c

	def dreieckeE(n : Int) : Int =
    if (n == 1) 1
    else dreieckeE(n - 1) + oben(n) + unten(n)
   

	
    println("dreiecke = " + dreiecke(n)) 
    println("dreieckeE = " + dreieckeE(n))  }
 	
}