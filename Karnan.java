import java.util.Scanner;
public class Karnan
{
public static void main(String[]args)
{
Karnan k = new Karnan();
k.findDivisors();

}
private void findDivisors() 
{
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter any number ");
    int no = sc.nextInt(); //25
    int i = 2; 
    int count = 0; 
    
	while(i<no)
	{
    if(no%i==0) // 25%2==0
    {
    System.out.println(" divisible by " + i);
    count++; 
    }
    i++;
    }
    System.out.println("No. of divisors are "+ count);
  
  }
  }