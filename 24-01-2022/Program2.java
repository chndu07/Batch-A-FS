import java.util.*;
class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,c=0;
        String s1,s2,s="";
      
        s1 = sc.nextLine();
        s2 = sc.next();
      
        String arr[] = s1.split(" ");
        ArrayList<String> arr1 = new ArrayList<>();
      
        for(i=0;i<arr.length;i++){
            arr1.add(arr[i]);
        }
      
        for(i=0;i<s2.length();i++){
            s=s+s2.charAt(i);
            if(arr1.contains(s))
            {
                c=c+s.length();
                s="";
            }
        }
      
        if(c==s2.length())
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
