import java.util.*;
public class Main {
    public int lengthOfLastWord(final String a)
    {
        int len = 0;
        String x = a.trim();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ')
                len = 0;
            else
                len++;
        }
 
        return len;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String input = "Sky is pink ";//give any string here
        Main gfg = new Main();
        System.out.println("The length of last word is " + gfg.lengthOfLastWord(input));
    }
}
