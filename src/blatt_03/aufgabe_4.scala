package blatt_03

object aufgabe_4 {

def main (args: Array[String]): Unit = {
		
  
  
	//Teilaufgabe a ((Vorname, Nachname), Email, Tel)
	type Kontakt = ((String,String),String,String)
		
	val Torben : Kontakt = (("Torben", "Zimmermann"), "Torben.Z@gmx.de", "015161246525")
	val Mama : Kontakt = (("Birgit", "Lausen"), "B.Zimmermann4@gmx.de", "01744564945")
	
	val Kontaktliste = List(Torben,Mama)
	
		println(Kontaktliste) 
	
	//Teilaufgabe b
  val eMailAdressen = List[String](Torben._2, Mama._2)
		
	println(eMailAdressen)



  //Teilaufgabe c
	val a : Kontakt = Torben
	
	def name(a:Kontakt):(String,String) = a._1
	def eMail(a:Kontakt):String = a._2
	def tel(a:Kontakt):String = a._3
  def telNrForName(a:Kontakt):String= a match {
	  case ((_,_),_,tel) => tel  }
	
	
	println("telNrForName = " + telNrForName(a))
	
}

	
}