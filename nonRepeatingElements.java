import java.util.*;
public class Main
{
    public static void comp(int a[],int b[],int n,int m)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i]!=b[j])
                count++;
            }
            for (int k = a[i]; k < n - 1; k++) {
             a[k] = a[k + 1];
             System.out.print(a[k]);
        }
        }
       // System.out.print(a[k]);
       
        System.out.println();
        return;
    }
   
public static void main(String[] args)
{
//System.out.println("Hello World");
Scanner sn=new Scanner(System.in);
System.out.println("count in array 1");
int n=sn.nextInt();
System.out.println("count in array 2");
int m=sn.nextInt();
int a[]=new int[n];
System.out.println("Array 1 elements");
for(int i=0;i<n;i++)
{
   a[i]=sn.nextInt();
}
int b[]=new int[m];
System.out.println("Array 2 elements");
for(int i=0;i<m;i++)
{
   b[i]=sn.nextInt();
}
comp(a,b,n,m);
}

}
