import java.util.*;
import java.io.*;
public class Main
{
public static void main(String[] args) {
Scanner sn=new Scanner(System.in);
System.out.println("Count of array elements");
int n=sn.nextInt();
ArrayList<Integer> list =new ArrayList<Integer>(n);
System.out.println("Enter elements");
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);


 System.out.println(list);

System.out.println();
System.out.println("Position");
int pos=sn.nextInt();


for(int i=0;i<n;i++)
{
  if(i==pos)
  list.remove(pos);
}

   System.out.println(list);
System.out.println();
}
}
