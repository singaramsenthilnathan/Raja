public class Vicky
{
	public static void main(String[]args)
	{	
	Vicky v = new Vicky();
	v.additionOf100Numbers();
	
	}
private void additionOf100Numbers() 
{
    // TODO Auto-generated method stub
    int total = 0; 
    int no = 1; 
    while(no<=5){
    total = total + no; 
	//=0+1=1
	//=1+2=3
	//=3+3=6
	//=6+4=10
	//=10+5=15
    no++; 
     }
    System.out.println(total);
      }
	 }
