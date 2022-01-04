import java.util.*;
class test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String b=sc.next();
        int n=0;
        for(int i=0;i<b.length();i+=2){
            n=(b.charAt(i)-'0')*10+(b.charAt(i+1)-'0');
            System.out.print(s.charAt(n-1));
            n=0;
        }
    }
}
