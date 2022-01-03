import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = a+a;
        if(a.length()==b.length() && c.contains(b)){
            System.out.println("true");
        }
        else{
             System.out.println("false");
        }
    }
}
