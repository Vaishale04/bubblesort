import java.util.*;
class Bubblesort
{
public static void main(String[]args)
{
int n;
Scanner s = new Scanner(System.in);
System.out.println("Enter the size");
n = s.nextInt();
int arr[]=new int[n];
System.out.println("Enter the numbers");
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
int temp;
for(int i = 0;i<n-1;i++)
{
for(int j=0;j<n-i-1;j++)
{
if(arr[j]>arr[j+1])
{
temp =arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
System.out.println("After sorting");
for(int i=0;i<n;i++)
{
System.out.println(arr[i]+"");
}
}
}