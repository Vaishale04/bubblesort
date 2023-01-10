import java.util.*;
public class BubbleSort{
public static void main(String []args)
{
int n;
Scanner s = new Scanner(System.in);
System.out.println("Enter the size");
n = s.nextInt();
int arr[] = new int[n];
System.out.println("Enter the numbers ");
for(int i=0;i<n;i++)
{
arr[i] = s.nextInt();
}
System.out.println(“Before Sorting”);
for(int i=0;i<n;i++)
{
System.out.print(arr[i] + “ ”);
}
System.out.println(“After Sorting”);
int temp;
for(int i=0;i<n-1;i++)
{
for(int j=0;j<n-i-1;j++)
{
if(arr[j]>arr[j+1])
{
temp = arr[j];
22
arr[j] = arr[j+1];
arr[j+1] = temp;
}
}
}
for(int i=0;i<n;i++)
{
System.out.print(arr[i] + " ");
}
}