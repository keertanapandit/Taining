import java.util.*;
class inv{
    static int A[]= new int[] {1,20,6,4,5};
    static int invCount(int n){
         int count=0;
         for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
                if(A[i]>A[j])
                count++;
        return count;
    }
    public static void main(String[] args) {
        System.out.println("no of inversion pairs\n"+invCount(A.length));
    }
}
