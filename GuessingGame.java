public class GuessingGame {
    public static void main(String[] args) {

        //Assuming numbers are integers and not decimal values
        int secretNumber = 8;
        int guess = 7;
        
        if(secretNumber == guess){
            System.out.println("It was 8, your guess is correct!");
        } else if (secretNumber < guess) {
            System.out.println("Nope. Too high");
        } else {
            System.out.println("Nope. Too low");
        }
    }
}



