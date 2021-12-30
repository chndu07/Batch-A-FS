import java.util.*;
class Test{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String str="";
        
        for(int i=0;i<st.length();i++)
        {
            char c =st.charAt(i);
            if( (c=='a' || c=='e' || c=='i' || c=='u' || c=='o' || c=='A' || c=='E' || c=='I' || c=='U' || c=='O'))
            {
                str = str+'V';
            }
            else{
                str = str+'C';
            }
        }
        str = str.replaceAll("(.)\\1{1,}","$1");
        System.out.println(str);
    }
}
