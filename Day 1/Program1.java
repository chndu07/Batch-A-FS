import java.util.*;
class Test{
    static Boolean checkDup(int n){
        Set<Integer> s = new HashSet();
        while(n>0){
            int d=n%10;
            if(s.contains(d)){
                return true;
            }
            else{
                s.add(d);
            }
            n=n/10;
        }
        return false;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
       for(int i=1;i<=num;i++){
           if(!checkDup(i)){
            System.out.print(i+" ");
           }
       }
    }
}
