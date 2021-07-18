import scala.io.StdIn._

object Q5_SumEven extends App{
    
    def Even(n:Int):Boolean = {
        if(n%2==0) true 
	else false
    }

    def add(n:Int):Int = n match {
        case 2 => n
        case x if(Even(n)) =>  n+add(n-1)
        case _ => add(n-1)
    }
    print("Enter a Number: ");
    var z=readInt();

    print(add(z))

}