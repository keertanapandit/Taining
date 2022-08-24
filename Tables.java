import java.util.*;
class Main{
    public static void cal(int n){
        int i;
        int prod;
        int sum=0;
        for(i=1;i<=10;i++){
           prod=n*i;
           sum+=prod;
            System.out.println(prod+"\n");
        }
       
        System.out.println(sum+"\n");
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("n value");
        int n=sc.nextInt();
        cal(n);
    }
}
