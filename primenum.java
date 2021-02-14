import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc= new Scanner(System.in);
	    	System.out.println("enter your number");
	    	int no=sc.nextInt();
	    	int flag=0;
		if(no==0 || no==1)
		{
		    System.out.println( no + ": is not a prime number");
		}
		else 
		{
		    for(int i=2; i <=no;i++)
		    {
		        if(no%i==0)
		        {
		            System.out.println(no + ": is not a prime no");
		            flag=1;
		            break;
		        }
		    }
		}
		if(flag==0)
		{
		    System.out.println( no + ": is a prime number");
		}
		
		
		
	}
}
