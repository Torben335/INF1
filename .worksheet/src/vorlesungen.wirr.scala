package vorlesungen

object wirr {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(307); 

def main (args: Array[String]): Unit = {
  def wirr(x:Int,y:Int,z:Int):Int=  {
    def g(a:Int,b:Int):Int = {
      if (b == 0)  a
      else { val y = 47+b; val z = y+a; g(y+z,0)  }
}
val a = 17; val b = 4
val z = 42;
if (x<y) {val y = 11; g(x,y-b)  }  else g(b,z)	}

};System.out.println("""main: (args: Array[String])Unit""")}
}
