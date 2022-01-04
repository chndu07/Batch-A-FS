import java.util.*;
class prog{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuffer sb = new StringBuffer(str);
        int i=1;
        while(i<sb.length())
        {
            if(sb.charAt(i)==sb.charAt(i-1))
            {
                sb.delete(i-1,i+1);
                i=1;
            }
            else i++;
        }
      // System.out.println(sb.length());
        if(sb.length()!=0)
        System.out.print(sb);
        else System.out.print("-1");
    }
}
