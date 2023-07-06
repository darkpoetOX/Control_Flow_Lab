public class WeatherCheck {

    public static void main(String[] args) {

        //assuming integers
        int temperature = 100;
        boolean currentlyRaining = true;

        if (temperature >= 100 && !currentlyRaining) {
            System.out.println("Wear shorts and sunscreen. You probably need more than sunscreen mate! Try and not die.");
        } else if (temperature < 100 && currentlyRaining) {
            System.out.println("Wear a waterproof coat.");
        } else if (temperature < 100 && !currentlyRaining) {
                System.out.println("It is just cold.");
        } else {
            System.out.println("How is that even possible? You sure you're not in a kettle?");
        }

    }
}
