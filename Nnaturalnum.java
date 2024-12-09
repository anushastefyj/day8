import java.util.*;
class Nnaturalnum
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int s=0;
    int k=0;
    for(int i=1;i<n;i++)
    {
        s+=i;
        arr[k]=s;
        k++;
    }
    System.out.println(Arrays.toString(arr));
} 
}
