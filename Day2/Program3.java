import java.util.*;
class d2p3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n1=s1.length();
        int n2=s2.length();
        int i = 0;
        for(int j=0; j<n2 && i<n1;j++){
            if(s1.charAt(i) == s2.charAt(j))
            i++;
        }
        System.out.println((i==n1));
    }
}
