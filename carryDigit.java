import java.util.*;
class Main{
    public static int carry(int a, int b)
    {
        int count=0;
        int temp1=a;
        int temp2=b;
        int rem=0;
        while(temp1!=0&&temp2!=0)
        {
            int d1=temp1%10;
            int d2=temp2%10;
            if((d1+d2+rem)>9)
            {
                count++;
                int sum=d1+d2+rem;
                sum=sum/10;
                rem=sum;
            }
            temp1=temp1/10;
            temp2=temp2/10;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        System.out.println(carry(a,b));
    }
}
