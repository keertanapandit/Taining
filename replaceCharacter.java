import java.util.*;
class Main {
    public static void replaceChar(String str,char ch1,char ch2){
        String res=" ";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch1)
                res=res+ch2;
            else if(str.charAt(i)==ch2)
                res=res+ch1;
            else
                res=res+str.charAt(i);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.next();
        System.out.println("enter ch1");
        char ch1=sc.next().charAt(0);
        System.out.println("enter ch2");
        char ch2=sc.next().charAt(0);
        replaceChar(str,ch1,ch2);
    }
}
