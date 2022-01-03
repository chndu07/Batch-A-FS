import java.util.*;
class Test{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        char [][]arr = new char[n][str.length()];
        int k=0, down=1;
        int i=0,j=0;
        if(n==1) {
            System.out.println(str);
            return;
        }
        while(k<str.length()) {
            if(i==n-1) {
                down=0;
            }
            else if(i==0) {
                down=1;
            2
            if(down==1) {
                arr[i][j] = str.charAt(k);
                i++;
                j++;
            }
            else {
                arr[i][j] = str.charAt(k);
                i--;
                j++;
            }
            k++;
        }
        
        
        for(int l=0;l<n;++l) {
            for(int m=0;m<str.length();++m) {
                if(arr[l][m] != '\0') {
                    System.out.print(arr[l][m]);
                }
            }
        }
    }
}
