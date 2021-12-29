import java.util.*;
class Test{
    
    public static void main(String args[]){
        Set<Integer> s=new HashSet(Arrays.asList(32,97,101,105,111,117,65,69,73,79,85));
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder( );
        for(int i=0;i<str.length();i++){
            int j=str.charAt(i);
            if(s.contains(j)){
                sb.append(str.charAt(i));
            }
            else{
                sb.append(str.charAt(i));
                sb.append('#');
                sb.append(str.charAt(i));
            }
        }
         System.out.println(sb);
    }
    
}
