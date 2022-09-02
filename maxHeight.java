import java.util.*;
import java.io.*;
class Main{
    public static int maxArea(int[] a)
    {
        int area=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                area=Math.max(area,Math.min(a[i],a[j])*(j-i));
            }
        }
        return area;
    }
    public static void main(String[] args)
    {
        int a[]={1,8,6,2,5,4,8,3,7};
        //int res=maxArea(a);
        System.out.println(maxArea(a));
    }
}
