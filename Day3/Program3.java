import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] s1 = s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l) >= 'a' && s.charAt(l) <= 'z'){
                if(s.charAt(r) >= 'a' && s.charAt(r) <= 'z'){
                    // char c,d,e;
                    // c = s.charAt(l);
                    // d = s.charAt(r);
                    // e = c;
                    // c = d;
                    // d = e;
                    char c = s1[r];
                    s1[r] = s1[l];
                    s1[l] = c;
                    l++;
                    r--;
                }
                else{
                    r--;
                }
            }
            else{
                l++;
            }
        }
        for(Character i : s1){
            System.out.print(i);
        }
    }
}
