import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first array length");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter first array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter second array length");
        int m=sc.nextInt();
        int b[]=new int[m];
        System.out.println("enter second array elements");
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        System.out.println("the area is");
         System.out.println(largestArea(a,b,n,m));
        
    }
    static int largestArea(int a[],int b[], int n, int m)
    {
        int end=0,start=0,i=0,j=0;
        Arrays.sort(a);
        Arrays.sort(b);
        while(i<n &&j<m)
        {
            if(a[i]==b[j])
            {
                if(start==0)
                    start=a[i];
                else
                    end=a[i];
                i++;
                j++;
        }
        else if(a[i]>b[j])
            j++;
        else
            i++;
    }
    if(end==0||start==0)
        return 0;
    else
         return(end-start);
}
}
