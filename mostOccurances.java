import java.util.*;
class Main{
    static final int n=256;
    public static char max(String str)
    {
        int str1[]=new int[n];
        int l=str.length();
        for(int i=0;i<l;i++)
            str1[str.charAt(i)]++;
        int m=-1;
        char res=' ';
        for(int i=0;i<l;i++)
            if(m<str1[str.charAt(i)]){
                m=str1[str.charAt(i)];
                res=str.charAt(i);
            }
    return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.next();
        System.out.println("The given string is "+ str);
        System.out.println("Max occurances is "+ max(str));
    }
}
