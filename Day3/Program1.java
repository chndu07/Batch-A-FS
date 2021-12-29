import java.util.*;

class D3_1
{
       
       
        
    static String lr(String s,int n)
    {
        String ans=s.substring(n)+s.substring(0,n);
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int n=sc.nextInt();
        System.out.println(lr(s1,n));
    }
    
}
