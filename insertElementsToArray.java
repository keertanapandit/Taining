import java.util.*;
class Main {
    public static void main(String[] args){
        int n,pos,x;
        Scanner sc =new Scanner(System.in);
        System.out.print("enter count");
        n=sc.nextInt();
        int arr[]=new int[n+1];
        System.out.print("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter positon");
        pos=sc.nextInt();
        System.out.print("enter element to be inserted");
        x=sc.nextInt();
        for(int i=(n-1);i>=(pos-1);i--){
            arr[i+1]=arr[i];
        }
        arr[pos-1]=x;
        System.out.print("After insering");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[n]);
    }
}
