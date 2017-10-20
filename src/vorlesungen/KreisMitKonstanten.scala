package vorlesungen

object KreisMitKonstanten {
  def main(args: Array[String]): Unit = {
    println("Radius = " + r)
    println("Durchmesser = " + d)
    println("Flaeche = " + flaeche)
    println("Umfang = " + umfang)
    println("Oberflaeche = " + oberflaeche)
    println("Volumen = " + volumen)
  }

  import math._

  // Kreisradius r als Konstante definieren:
  val r: Double = 12.66

  // Kreisdurchmesser auf r zurueckfuehren:
  val d: Double = 2 * r

  // Kreisflaeche und -umfang:
  val flaeche = Pi * r * r
  val umfang = Pi * d

  // Kugeloberflaeche und -volumen:
  val oberflaeche = 4 * flaeche
  val volumen = oberflaeche * r / 3
}