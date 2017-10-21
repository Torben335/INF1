package blatt_02

object aufgabe_1 {

def main (args: Array[String]): Unit = {
  
 	val a : Boolean = false
	val b : Boolean = false

	
	
	//Teilaufgabe b
	def NAND (a : Boolean,b : Boolean) : Boolean = !(a&&b)
	
	//Teilaufgabe c
	def NOT (a : Boolean) : Boolean = NAND(a,a)
	
	//Teilaufgabe d
	def AND (a : Boolean,b : Boolean) : Boolean = NOT(NAND(a,b))
	
	//Teilaufgabe e
	def OR (a : Boolean,b : Boolean) : Boolean = NOT(AND(NOT(a),NOT(b)))
	def NOR (a : Boolean,b : Boolean) : Boolean = NOT(OR(a,b))
	
	//Teilaufgabe f
	def XOR (a : Boolean,b : Boolean) : Boolean = OR(AND(a,b),NOR(a,b))
	
	
	println ("NAND 	= " + NAND(a,b)) 
	println ("NOT 	= " + NOT(a))
  println ("AND 	= " + AND(a,b))
  println ("OR 	= " + OR(a,b))
  println ("NOR 	= " + NOR(a,b)) 
  println ("XOR	= " + XOR(a,b))  }
	
}