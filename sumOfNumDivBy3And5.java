import java.util.*;
class Main{
    public static void cal(int m,int n){
        int i;
        int sum=0;
        for(i=m;i<=n;i++){
            if(i%3==0&&i%5==0){
                sum+=i;
            }
        }
        System.out.println(sum);
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("m value");
        int m=sc.nextInt();
        System.out.println("n value");
        int n=sc.nextInt();
        cal(m,n);
    }
}
