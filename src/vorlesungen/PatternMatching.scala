package vorlesungen

object PatternMatching {

  def main(args: Array[String]): Unit = {
  
  val n : Int = 4
  
  def fibP (n:Int):Int = n match {
  	case 0 => 1;
  	case 1 => 1;
  	case x => fibP(x-1) + fibP(x-2)	}
  	
  
  println("fibP = " + fibP(n)) }
 }
 