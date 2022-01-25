import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int p=0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j]==1){
                    p+=4;
                    if(i>0 && arr[i-1][j]==1){
                        p-=2;  //up
                    }
                    if(j>0 && arr[i][j-1]==1){
                        p-=2;  //left
                    }
                }
            }
        }
        System.out.println(p);
    }
}
