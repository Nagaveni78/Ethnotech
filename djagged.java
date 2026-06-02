import java.util.*;
class djagged 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[][] arr=new int[n][];
         for(int i = 0; i < n; i++)
        {
            arr[i] = new int[i + 2]; 
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=(i+1)*(j+1);
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
