import scala.io.StdIn._

object Q4_EvenOdd extends App{

    def Even(n:Int):Boolean = n match{
        case 0 => true
        case _ => Odd(n-1)
    }

    def Odd(n:Int):Boolean = !Even(n)

    print("Enter a Number: ");
    var z=readInt();

    val p = Even(z)

    def disply(x:Boolean) = {
        if(x==true)
        {
            println("Even");
        }
        else{
             println("Odd");
        }
    }

    disply(p)
    
}