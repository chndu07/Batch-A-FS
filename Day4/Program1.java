import java.util.*;
public class program{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char arr[]=new char[str.length()];
        char k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o' || str.charAt(i)=='u'
            ||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
            {
                arr[i]='V';
            }
            else
            {
                arr[i]='C';
            }
        }
        for(int i=1;i<arr.length;i++)
        {
            if(k!=arr[i])
            {
                k=arr[i];
                System.out.print(k);
            }
                
        }
    }
}
