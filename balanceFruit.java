import java.util.*;
class Main {
    public static int balanceFruit(int a, int m, int rs)
    {
        int r=0;;
        if(a>m){
            m=a-m;
            r=m*1;
            return rs-r;
        }
         else if(a<m){
            m=m-a;
            r=m*1;
            return rs-r;
        }
        else{
            return rs;
        }
    }
    public static void main(String[] args) {
        System.out.println(balanceFruit(8,4,6));
    }
}
