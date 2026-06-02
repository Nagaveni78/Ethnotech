import java.util.*;
class rotation
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
        int k=s.nextInt();
        for(int i=k+1;i<n;i++)
        {
            System.out.print(arr[i]);
        }
        for(int i=0;i<=k;i++)
        {
            System.out.print(arr[i]);
        }
    }
}