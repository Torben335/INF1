package vorlesungen

object RekursiveFunktionen {

  def main(args: Array[String]): Unit = {

    println("fakultaet(0) = " + fakultaet(0))
    println("fakultaet(5) = " + fakultaet(5) + "\n")

    println("fakultaet2(0) = " + fakultaet2(0))
    println("fakultaet2(5) = " + fakultaet2(5) + "\n")

    println("sum(0) = " + sum(0))
    println("sum(5) = " + sum(5) + "\n")

    println("power(2,5) = " + power(2, 5))
    println("power(5,2) = " + power(5, 2) + "\n")

    println("power2(2,5) = " + power2(2, 5))
    println("power2(5,2) = " + power2(5, 2) + "\n")

    println("fib(3) = " + fib(3))
    println("fib(5) = " + fib(5))
    println("fib(8) = " + fib(8))
    println("fib(10) = " + fib(10) + "\n")

    println("fib2(3) = " + fib2(3))
    println("fib2(5) = " + fib2(5))
    println("fib2(8) = " + fib2(8))
    println("fib2(10) = " + fib2(10) + "\n")

    println("iSqrtL(0) = " + iSqrtL(0))
    println("iSqrtL(1) = " + iSqrtL(1))
    println("iSqrtL(2) = " + iSqrtL(2))
    println("iSqrtL(3) = " + iSqrtL(3))
    println("iSqrtL(4) = " + iSqrtL(4))
    println("iSqrtL(8) = " + iSqrtL(8))
    println("iSqrtL(9) = " + iSqrtL(9))
    println("iSqrtL(17) = " + iSqrtL(17))
    println("iSqrtL(170) = " + iSqrtL(170) + "\n")

    println("iSqrtB(0) = " + iSqrtB(0))
    println("iSqrtB(1) = " + iSqrtB(1))
    println("iSqrtB(2) = " + iSqrtB(2))
    println("iSqrtB(3) = " + iSqrtB(3))
    println("iSqrtB(4) = " + iSqrtB(4))
    println("iSqrtB(8) = " + iSqrtB(8))
    println("iSqrtB(9) = " + iSqrtB(9))
    println("iSqrtB(17) = " + iSqrtB(17))
    println("iSqrtB(170) = " + iSqrtB(170) + "\n")
  }

  import math._

  def fakultaet(n: Int): Int =
    if (n == 0) 1
    else n * fakultaet(n - 1)

  // Pattern Matching geht auch:
  def fakultaet2(n: Int): Int = n match {
    case 0 => 1
    case _ => n * fakultaet2(n - 1)
  }

  def sum(n: Int): Int =
    if (n == 0) 0
    else n + sum(n - 1)

  def power(a: Int, k: Int): Int =
    if (k == 0) 1
    else a * power(a, k - 1)

  def power2(a: Int, k: Int): Int =
    if (k == 0) 1 else if (k % 2 == 1) a * power2(a, k - 1) // für ungerade k
    else {
      val p2k2: Int = power2(a, k / 2); // für gerade k
      p2k2 * p2k2
    }

  def power3(a: Int, k: Int): Int =
    // Identisch zu power2
    if (k == 0) 1 else if (k % 2 == 1) a * power3(a, k - 1)
    else power3(a, k / 2) * power3(a, k / 2)

  def fib(n: Int): Int =
    if (n < 2) 1
    else fib(n - 1) + fib(n - 2)

  def fibIt(n: Int, akt: Int, vor: Int): Int =
    if (n == 0) vor
    else fibIt(n - 1, akt + vor, akt) // einer der beiden rekursiven Aufrufe entfällt

  def fib2(n: Int): Int = fibIt(n, 1, 1)

  def lSqrt(i: Int, n: Int): Int =
    if ((i + 1) * (i + 1) > n) i
    else lSqrt(i + 1, n)

  def iSqrtL(n: Int): Int = {
    lSqrt(0, n)
  }

  def bSqrt(l: Int, r: Int, n: Int): Int =
    if (l + 1 == r) l
    else {
      val m = (l + r) / 2
      if (m * m <= n) bSqrt(m, r, n)
      else bSqrt(l, m, n)
    }

  def iSqrtB(n: Int): Int = {
    if (n <= 1) n else bSqrt(0, n, n)
  }
}