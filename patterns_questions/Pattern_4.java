/*
 5 5 5 5 5 
 4 4 4 4 4
 3 3 3 3 3
 2 2 2 2 2
 1 1 1 1 1
 */
public class Pattern_4 {
    public static void main(String[] args) {
        int n = 5;

        for(int i=5 ; i>=1 ; i--){
            for(int j=1 ; j<=n ;j++){
                System.out.print(" "+i);
            }
            System.out.println(" ");
        }
    }
}
