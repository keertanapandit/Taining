import java.util.*;
class Main {
    public static void main(String[] args) {
        int i,n;
        int fact,ld;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        int total=0;
        int temp=n;
        while(n!=0){
            i=1;
            fact=1;
            ld=n%10;
            while(i<=ld)
            {
                fact=fact*i;
                i++;
            }
            total=total+fact;
            n=n/10;
        }
        if(total==temp){
            System.out.println(temp + " is a strong number");
        }
        else
            System.out.println("not a strong number");
        System.out.println();
    }
}
