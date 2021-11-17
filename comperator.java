import java.util.*;

// Write your Checker class here
class Checker implements Comparator<Player> {
      // complete this method
    public int compare(Player a, Player b) {
//     int nameCheck =a.name .compareTo(b.name);
//     int scoreCheck =a.score .compareTo(b.score);
//    return (scoreCheck == 0) ? scoreCheck: nameCheck;
if(a.score==b.score){
    return a.name .compareTo(b.name);
} else return b.score-a.score;
    }
   
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class comperator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
