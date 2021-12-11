package pack1;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int age;

        System.out.println("Some terms:");
        System.out.println("1) Must be 18yrs old or older\n");
        System.out.println("2) Adjective - A description used to modify or describe a noun\n   Examples - smart, talented, happy\n");
        System.out.println("3) Noun - Person, place or thing\n   Examples - country, lamp, role model, adult\n");
        System.out.println("4) Adverb - A description used to modify or describe a verb\n   Examples - quickly, fearfully, frantically\n");
        System.out.println("5) Verb - An action\n   Examples - running, wallking, throwing\n\n");

        System.out.println("How old are you?  ");
        String ageAsString = input.nextLine();
        age = Integer.parseInt(ageAsString);

        if(age < 18) {
            System.out.println("Sorry you must be at least 18 to use this program. Exiting...\n");
            System.exit(0);
        }

        String name;
        String adjective;
        String noun;
        String adverb;
        String verb;
        boolean isInvalidWord;

        System.out.println("Enter a name:  ");
        name = input.nextLine();
        System.out.println("Enter an adjective:  ");
        adjective = input.nextLine();

        do{
            System.out.println("Enter a noun:  ");
            noun = input.nextLine();
            isInvalidWord = (noun.equalsIgnoreCase("dork") ||
                    noun.equalsIgnoreCase("jerk") ||
                    noun.equalsIgnoreCase("nerd") ||
                    noun.equalsIgnoreCase("punk"));

            if(isInvalidWord){
                System.out.println("That language is not allowed. Try again. \n\n");
            }

        } while(isInvalidWord);

        System.out.println("Enter an adverb:  ");
        adverb = input.nextLine();
        System.out.println("Enter a verb ending with -ing:  ");
        verb = input.nextLine();

        System.out.println("\n\nYour Story:\n------------------------------\n");
        System.out.printf("%s is a %s %s\n", name, adjective, noun);
        System.out.printf("he or she is always %s %s.", adverb, verb);
    }
}