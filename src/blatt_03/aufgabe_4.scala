package blatt_03

object aufgabe_4 {

def main (args: Array[String]): Unit = {
		
  
  
	//Teilaufgabe a ((Vorname, Nachname), Email, Tel)
	type Kontaktliste = ((String,String),String,Int)
		
	val Torben : Kontaktliste = (("Torben", "Zimmermann"), "Torben.Z@gmx.de", 115)
	val Mama : Kontaktliste = (("Birgit", "Lausen"), "B.Zimmermann4@gmx.de", 335)
	
	
	
	//Teilaufgabe b
	val eMailAdressen = List[String](Torben._2, Mama._2)
		
	println(eMailAdressen) 



  //Teilaufgabe c

}

	
}