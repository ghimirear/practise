import java.util.*;

public class noGame {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
       return isWinnable(leap, game, 0);
    }
    private static boolean isWinnable(int leap, int[]game, int i){
        if(i<0|| game[i]==1) return false;
        if((i==game.length-1)|| i+leap>game.length-1) return true;
        game[i]=1;
        return isWinnable(leap, game, i+1)|| isWinnable(leap, game, i-1)|| isWinnable(leap, game, i+leap);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
