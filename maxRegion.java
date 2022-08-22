import java.util.*;
public class nr {
    public static void maxReg(int n)
    {
        int num;
        if(n==0)
        {
           System.out.println(n);
        }
        else if(n==1)
        {
                System.out.println(n+1);
        }
        else
        {
        num=n*(n+1)/3;
        System.out.println(num+n);
        }
    }

    public static void main(String[] args) {
      int n=1;
       maxReg(1);
    }
}
