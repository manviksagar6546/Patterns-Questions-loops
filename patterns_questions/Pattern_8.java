//   2  4  6  8 10 
//  12 14 16 18 20
//  22 24 26 28 30
//  32 34 36 38 40
//  42 44 46 48 50
public class Pattern_8 {
    public static void main(String[] args) {
        int k = 2,n=5;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n ;j++){
                System.out.printf(" %2d",k);
                k=k+2;
            }
            System.out.println(" ");
        }
    }
}
