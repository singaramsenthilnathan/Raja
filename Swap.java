public class Swap
{
int a = 10;
int b = 20;

public static void main(String[]args)
{
Swap s = new Swap();
s.swaping();
}
public void swaping()
{
int t;
t=a;
a=b;
b=t;
System.out.println("A  = " + this.a);
System.out.println("B  = " + this.b);

}

}


/*Output:
c:\java>javac Swap.java

c:\java>java Swap
A  = 20
B  = 10*/
