import java.util.*;

class Test{
    public static void main(String[] args) {
        int r, c, n;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        n = sc.nextInt();
        int[][] b = new int[r][c];
        List<Integer> que = new ArrayList<Integer>();
        for (int i = 0; i < r * c; i++) {
            int x = sc.nextInt();
            que.add(x);
        }
        Collections.rotate(que, n);
        int j=0;
        for(int i=0;i<r*c;i++){
            System.out.print(que.get(i)+" ");
            j++;
            if(j>=c){
                j=0;
                System.out.println();
            }
        }
    }
}
