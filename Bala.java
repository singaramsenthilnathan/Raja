public class Bala
{
public static void main(String[]args)
{
Bala b =new Bala();
b.multiplication_of_first_5_numbers();
}
//Factorial or Multiplication of first 5 numbers
public void multiplication_of_first_5_numbers()
   {
    int total = 1; 
    int no = 1; 
    while(no<=10)
	{
    total = total * no; 
	System.out.println(total);
	// = 1*1=1
	//= 1*2=2
	//=2*3=6
	//=6*4=24
	//=24*5=120
	//=120*6=720
	//=720*7=5040
	//=5040*8=40320
	//=40320*9=362880
	//=362880*10=3628800
	no++;	
    }
    System.out.println(total);
	}
	}