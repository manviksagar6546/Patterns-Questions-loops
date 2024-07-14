//   1  3  5  7  9 
//  11 13 15 17 19
//  21 23 25 27 29
//  31 33 35 37 39 
//  41 43 45 47 49
public class Pattern_7 {
    public static void main(String[] args) {
        int k = 1,n=5;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n ;j++){
                System.out.printf(" %2d",k);
                    k=k+2;
            }
            System.out.println(" ");
        }
    }
}
