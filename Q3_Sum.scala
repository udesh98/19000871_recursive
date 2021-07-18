import scala.io.StdIn._

object Q3_Sum extends App{

    def add(n:Int):Int = {
        if(n==1) {
            1
        }
        else{
            n+add(n-1)
        }

    }
    print("Enter a Number: ");
    var z=readInt();

    print(add(z))

}