
package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
        
        static boolean endGame=false;
        static int numberOfGames=0;
        static char[] game ={'r','p','s'};
        static String[] Game={"Rock","Paper","Scissors"};
        static int win=0;
       static char playAgain ='y';
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(!endGame){
            numberOfGames++;
            System.out.println("choose : 1- Rock 2- Paper 3- Scissors \n");
            int pc =new Random().nextInt(3);
            int user = in.nextInt();
            user -=1;
            System.out.println("you choose : "+Game[user]+"  computer choose : "+Game[pc]);
            checkWin(game[user],game[pc]);
            System.out.println("Do you want play again (y/n) : ");
            playAgain = in.next().toLowerCase().charAt(0);
            if(playAgain == 'n')
                break;
        }
        System.out.println("********************************");
         System.out.println("you played : "+numberOfGames +" games");
         System.out.println("you won : "+win +" games");
        
       
    }
    
    public static void checkWin(char user,char pc){
    if(user == pc){
     System.out.println("tie");
    }
   
    if(user == 'r' && pc == 's'){
      System.out.println("you win");
      win++;
    }
    
    if(user == 'r' && pc == 'p'){
         System.out.println("computer win");
    }
    
      if(user == 's' && pc == 'r'){
         System.out.println("computer win");
      }
     
      if(user == 's' && pc == 'p'){
       System.out.println("you win");
       win++;
      }
      
      if(user == 'p' && pc == 'r'){
        System.out.println("you win");
        win++;
      }
      
      if(user == 'p' && pc == 's'){
        System.out.println("computer win");
      }
      
      
      
}
    
}
