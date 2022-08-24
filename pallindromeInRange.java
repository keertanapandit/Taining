import java.util.*;
class Main{
    public static void pal(int m,int n){
        int i;
        int sum,rem,temp;
        for(i=m;i<n;i++)
        {
            temp=i;
            sum=0;
            while(temp>0){
                rem=temp%10;
                temp=temp/10;
                sum=(sum*10)+rem;
                
                if(i==sum)
                    System.out.println(sum);
            }
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("m value");
        int m=sc.nextInt();
        System.out.println("n value");
        int n=sc.nextInt();
        pal(m,n);
    }
}
