import java.util.*;
class Main {
    public static void search(int arr[],int num){
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                System.out.println(i);
            }
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter count");
        int n=sc.nextInt();
        System.out.println("enter elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter num");
        int num=sc.nextInt();
        search(arr,num);
    }
}
