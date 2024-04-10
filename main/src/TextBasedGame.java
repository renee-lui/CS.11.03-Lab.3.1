import java.util.Scanner;
public class TextBasedGame {

    public static void main(String[] args) {
        System.out.println("Welcome to Renee's Theme Park!");
        System.out.println("Are you ready for an exciting adventure!");
        System.out.println("Your objective is to explore the park, go on thrilling rides, and have a great time!");
        System.out.println("Be prepared to make fun choices and experience the excitement!");

        playGame();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Go on a roller coaster");
            System.out.println("2. Explore the haunted house");
            System.out.println("3. Play games at the carnival");
            System.out.println("4. Enjoy the Ferris wheel");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    rideRollerCoaster();
                    break;
                case 2:
                    exploreHauntedHouse();
                    break;
                case 3:
                    playCarnivalGames();
                    break;
                case 4:
                    enjoyFerrisWheel();
                    break;
                case 5:
                    quitGame();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void rideRollerCoaster() {
        System.out.println("You get in line for the roller coaster and feel the adrenaline rush.");
        System.out.println("As the roller coaster speeds through twists and turns, you scream with excitement!");
        System.out.println("What a thrilling ride!");

    }

    public static void exploreHauntedHouse() {
        System.out.println("You enter the haunted house, and a chill runs down your spine.");
        System.out.println("As you navigate through the dark corridors, spooky surprises await you at every corner.");
        System.out.println("Keep your wits about you!");

    }

    public static void playCarnivalGames() {
        System.out.println("You visit the carnival and see a variety of fun games.");
        System.out.println("You try your luck at ring toss, dart throwing, and basketball shooting.");
        System.out.println("Even though you are competitive, you lost 4 games. Better luck next time!");

    }

    public static void enjoyFerrisWheel() {
        System.out.println("You hop on the Ferris wheel and slowly move into the sky.");
        System.out.println("From the top, you enjoy a  view of the entire amusement park.");
        System.out.println("It's a peaceful and memorable moment.");

        // Additional game logic for enjoying the Ferris wheel ride
    }

    public static void quitGame() {
        System.out.println("Thank you for visiting Renee's Theme Park! I hope you had a fantastic time.");
        System.exit(0);
    }
}
