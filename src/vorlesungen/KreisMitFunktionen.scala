package vorlesungen

object KreisMitFunktionen {

  def main(args: Array[String]): Unit = {
    println("Flaeche = " + flaeche(r))
    println("Umfang = " + umfang(r))
    println("Oberflaeche = " + oberflaeche(r))
    println("Volumen = " + volumen(r))
  }

  import math._

  // Kreisradius r als Konstante definieren:
  val r: Double = 12.66

  // Kreisdurchmesser auf r zurueckfuehren:
  val d: Double = 2 * r

  // Formeln fuer Kreisflaeche und -umfang:
  def flaeche(r: Double): Double = Pi * r * r
  def umfang(r: Double): Double = Pi * 2 * r

  // Kugeloberflaeche und -volumen:
  def oberflaeche(r: Double): Double = 4 * flaeche(r)
  def volumen(r: Double): Double = oberflaeche(r) * r / 3

  // Minimum von zwei bzw. drei Zahlen
  def min(a: Int, b: Int): Int = if (a < b) a else b
  def minOf3(a: Int, b: Int, c: Int): Int =
    { val minAB: Int = min(a, b); min(minAB, c) }

}