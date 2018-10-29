import java.util.Scanner;
import java.util.Random;

public class Main {
    private static Main main=new Main();

    private int input_letter(){
        Scanner in=new Scanner(System.in);
        int users_score=0;
        int isLatinSymbol=0;
        while(isLatinSymbol==0){
            System.out.print("Please, enter the latin letter: ");
            String users_symbol=in.next();
            users_score=(int)users_symbol.charAt(0);
            isLatinSymbol=check_letter(users_symbol);
        }
        return users_score;
    }

    public int check_letter(String users_symbol){
        users_symbol=users_symbol.toLowerCase();
        int isLatinSymbol=0;
        if (users_symbol.length()!=1){
            System.out.println("Please input only one symbol!");
        }else {
            if ((int) users_symbol.charAt(0) > 'z' || (int) users_symbol.charAt(0) < 'a') {
                System.out.println("Check the rules!");
            }else{
                isLatinSymbol=1;
            }
        }
        return isLatinSymbol;
    }

    private int random_letter(){
        Random rand=new Random();
        return rand.nextInt(('z'-'a'))+'a';
    }
    private void result(int random_number, int user_number){
        if (random_number == user_number) {
            System.out.println("You win!!!");
        } else if (random_number > user_number) {
            System.out.println("Too low! Try again!");
        } else {
            System.out.println("Too high! Try again!");
        }
    }

    private int game_process(){
        int attempts=1;
        int random_number=random_letter();
        int user_number=input_letter();
        while(random_number!=user_number){
            attempts++;
            result(random_number,user_number);
            user_number=input_letter();
        }
        result(random_number,user_number);
        return attempts;
    }

    public static void main(String[] args) {
        int total_attempts=main.game_process();
        System.out.println("Total attempts: "+total_attempts);
    }
}