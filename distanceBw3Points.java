import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x1,y1");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("enter x2,y2");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
         System.out.println("enter x3,y3");
        int x3=sc.nextInt();
        int y3=sc.nextInt();
        int fd=(int)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        int sd=(int)Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
        int td=(int)Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
        System.out.println(fd + " " + sd + " " + td);
    }
}
