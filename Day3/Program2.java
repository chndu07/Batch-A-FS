import java.util.*;
public class program{
    public static boolean check(String str){
        boolean[] k = new boolean[26];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
                index = str.charAt(i) - 'A';
            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
                index = str.charAt(i) - 'a';
            else
                continue;
            k[index] = true;
        }
        for (int i = 0; i <= 25; i++)
            if (k[i] == false)
                return false;
 
        return true;
    }
 
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(check(s));
        
    }
}
