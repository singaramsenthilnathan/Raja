import java.util.Scanner;
public class Subu
{
public static void main(String[]args)
{
Subu s = new Subu();
s.findDivisors();

}


private void findDivisors() 
{
    Scanner sc = new Scanner(System.in); 
	
    System.out.println("Enter any number ");
	
    int no = sc.nextInt(); //25
	
    int i = 2; 
	int Count = 0;
	
    while(i<no)
	// (2<87)
	//(87>2)
	{
    if(no%i==0) // 87%2==1
	            //87%3==0
    {
		//System.out.println(i);
    System.out.println(" divisible by " + i);
	}
	else
	{
	 //if(no%i!=0)
	 Count++;
	{
		System.out.println( "Cycle No:"+Count );
		System.out.println("Value:"+ i );
		
	}
	
    }
    i++;
	
    }
    
  }
  }