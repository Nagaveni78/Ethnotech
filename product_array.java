import java.util.*;
public class 
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=s.nextInt();
	    }
	 	for(int i=0;i<n;i++)
	    {
	        int product=1;
	        for(int j=0;j<n;j++)
	        {
	            if(i!=j)
	            {
	                product*=arr[j];
	            } 
	        }
	         System.out.println(product);
	    }
	}
}