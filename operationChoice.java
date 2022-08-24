import java.util.*;
class Main{
    public static int opChoice(int c,int a, int b)
    {
        int res=0;
        switch(c)
        {
            case 1: res=a+b;
            break;
            case 2:res=a-b;
            break;
            case 3:res=a*b;
            break;
            case 4:res=a/b;
            break;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter c");
        int c=sc.nextInt();
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        System.out.println(opChoice(c,a,b));
    }
}
