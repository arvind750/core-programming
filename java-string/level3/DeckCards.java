import java.util.Scanner;

public class DeckCards {
    public static String[] deckOfCards(String[] suits, String[] ranks){
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int k=0;

        for(int i=0; i<ranks.length; i++){
            for(int j=0; j<suits.length; j++){
                deck[k++] = ranks[i] + " of " + suits[j];
            }
        }
        return deck;
    }

    public static String[] shuffelTheDeck(String[] deck){
        int n = deck.length;
        
        for(int i=0; i<n; i++){
            int randomCardNumber = i + (int) (Math.random() * (n - i));  
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int player){

        int numOfcard= deck.length/player;
        String[][] res = new String[player][numOfcard+1];
        int k=0;

        for(int i=0; i<player; i++){
            res[i][0] = "Player " + (i+1); 
            for(int j=1; j<numOfcard+1; j++){
                res[i][j] =  deck[k++];
            }
        }
        return res;
    }


    public static void display(String[][]playerDetail ){
        for(int i=0; i<playerDetail.length; i++){
            for(int j=0; j<playerDetail[0].length; j++){
                System.out.print (playerDetail[i][j] + "  ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King","Ace"};

        
        System.out.println("Enter the number of player");
        int player = sc.nextInt();

        String[] deck = deckOfCards(suits,ranks);
        String[] shuffel = shuffelTheDeck(deck);
        String[][] playerDetail = distributeCards(shuffel,player);

        display(playerDetail);

    }
}
