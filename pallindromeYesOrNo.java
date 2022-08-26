import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b="";
        int len=a.length();
        int x=len-1;
        for(int i=x;i>=0;i--)
        {
            b =b + a.charAt(i);
        }
        if(a.equals(b))
        {
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
    }
    }
}
