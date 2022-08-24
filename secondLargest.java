import java.util.*;
class Main{
    public static void secLargest(int arr[], int n)
    {
        int i,f,s;
        if(n<2)
        {
            System.out.println("invalid input");
            return;
        }
        Arrays.sort(arr);
        for(i=n-2;i>=0;i--)
        {
            if(arr[i]!=arr[n-1])
            {
                System.out.print(arr[i]);
                return;
            }
        }
        System.out.println("there is no second largest element");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        secLargest(arr,n);
    }
}
