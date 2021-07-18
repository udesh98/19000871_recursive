import scala.io.StdIn._

object Q6_Fibonacci extends App{

    def fibo(n:Int):Any = {
        if(n>0) fibo(n-1)
        print(cal(n))
	print(" ")
    }

    def cal(n:Int):Int =n match{
        case n if(n==0) => 0
        case n if(n==1) => 1
        case n => cal(n-1)+cal(n-2)
    }
    print("Enter a Number: ");
    var z=readInt();

    fibo(z)

}