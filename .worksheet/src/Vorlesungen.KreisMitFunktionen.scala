package Vorlesungen

object KreisMitFunktionen {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(257); 

  def main(args: Array[String]): Unit = {
    println("Fläche = " + flaeche(r))
    println("Umfang = " + umfang(r))
    println("Oberfläche = " + oberflaeche(r))
    println("Volumen = " + volumen(r))
  }

  import math._;System.out.println("""main: (args: Array[String])Unit""");$skip(87); 

  // Kreisradius r als Konstante definieren:
  val r: Double = 12.66;System.out.println("""r  : Double = """ + $show(r ));$skip(69); 

  // Kreisdurchmesser auf r zurueckfuehren:
  val d: Double = 2 * r;System.out.println("""d  : Double = """ + $show(d ));$skip(91); 

  // Formeln fuer Kreisflaeche und -umfang:
  def flaeche(r: Double): Double = Pi * r * r;System.out.println("""flaeche: (r: Double)Double""");$skip(45); 
  def umfang(r: Double): Double = Pi * 2 * r;System.out.println("""umfang: (r: Double)Double""");$skip(91); 

  // Kugeloberflaeche und -volumen:
  def oberflaeche(r: Double): Double = 4 * flaeche(r);System.out.println("""oberflaeche: (r: Double)Double""");$skip(58); 
  def volumen(r: Double): Double = oberflaeche(r) * r / 3;System.out.println("""volumen: (r: Double)Double""");$skip(93); 

  // Minimum von zwei bzw. drei Zahlen
  def min(a: Int, b: Int): Int = if (a < b) a else b;System.out.println("""min: (a: Int, b: Int)Int""");$skip(94); 
  def minOf3(a: Int, b: Int, c: Int): Int =
    { val minAB: Int = min(a, b); min(minAB, c) };System.out.println("""minOf3: (a: Int, b: Int, c: Int)Int""")}

}
