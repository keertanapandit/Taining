import java.util.*;
class Main{
    public static void cal(int n){
        int i;
        int prod;
        for(i=1;i<=10;i++){
           prod=n*i;
        System.out.println(prod+"\n");
    }
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("n value");
        int n=sc.nextInt();
        cal(n);
    }
}
