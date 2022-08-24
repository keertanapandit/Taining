import java.util.*;
public class Main
{
    public static void addition(int arr[],int n,int m)
    {
   
        for(int i=0;i<arr.length;i++)
        {
           
           if((arr[i]-n)<m)
           {
               arr[i]=(arr[i]-n)+m;
               
           }
           System.out.println();
               System.out.println(arr[i]);
        }
        return;
    }
public static void main(String[] args) {
Scanner sn=new Scanner(System.in);
System.out.println("count");
int ni=sn.nextInt();
System.out.println("elements");
int arr[]=new int[ni];
for(int i=0;i<ni;i++)
{
   arr[i]=sn.nextInt();
}
System.out.println("enter n");
int n=sn.nextInt();
System.out.println("enter m");
int m=sn.nextInt();
addition(arr,n,m);
}
}
