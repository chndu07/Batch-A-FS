import java.util.*;
class Test{
    public static void main(String args[]){
        //public static ArrayList<Integer> al=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String[] srr = s.split(" ");
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<srr.length;i++){
            al.add(Integer.parseInt(srr[i]));
        }
        for(int i=0;i<al.size();i++){
            if(al.get(i)<0 && i>0){
                if(al.get(i-1)>0){
                    if(al.get(i-1)-Math.abs(al.get(i))<0){
                        al.remove(i-1);
                        i=0;
                        continue;
                    }
                    else if(al.get(i-1)-Math.abs(al.get(i))==0){
                        al.remove(i);
                        al.remove(i-1);
                        i=0;
                        continue;
                    
                    }
                    else{
                        al.remove(i);
                        i=0;
                        continue;
                    }
                }
            }
        }
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i)+" ");
        }
    }
}
