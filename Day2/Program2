import java.util.*;
class prog2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String temp="0";
        char[] c=s.toCharArray();
        int res=0;
        int j=0;
        for(int i=0;i<c.length;i++){
            if(Character.isDigit(c[i])){
                temp=temp+c[i];
            }
            else{
                res=res+Integer.parseInt(temp);
                temp="0";
            }
        }
        System.out.println(res+Integer.parseInt(temp));
    }
}

