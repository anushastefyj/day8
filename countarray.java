import java.util.*;
 class countarray
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    //finding max
    for (int i=0;i<n;i++)
    arr[i]=sc.nextInt();
    Arrays.sort(arr);
    int max=arr[n-1];
    // finding count
    int C[]=new int[max+1];
    for (int i=0;i<n;i++)
    C[arr[i]]++;
    System.out.println(Arrays.toString(C));
  }
}