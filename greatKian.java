import java.util.*;
class Main{
    public static void main(String[] args)
    {
        int n,i;
        long n1=0,n2=0,n3=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i=i+3)
        {
            n1=n1+a[i];
            if(i+1<n)
                n2=n2+a[i+1];
            if(i+2<n)
                n3=n3+a[i+2];
        }
        System.out.println(n1 + " "+ n2 + " " + n3);
    }
}
