import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("This is a simple Math Lib Game!!!");

        System.out.println("Choose a Adjective");
        String Adjective = userInput.nextLine();

        System.out.println("Choose a Type of Bird");
        String TypeofBird = userInput.nextLine();

        System.out.println("Choose a room in a House");
        String RoomInHouse = userInput.nextLine();

        System.out.println("Choose a verb in past tense");
        String VerbPastTense = userInput.nextLine();

        System.out.println("Choose a verb");
        String Verb = userInput.nextLine();

        System.out.println("Choose a relative's name");
        String RelativeName = userInput.nextLine();

        System.out.println("Choose a plural noun");
        String PluralNoun = userInput.nextLine();

        System.out.println("Choose a noun");
        String Noun = userInput.nextLine();

        System.out.println("Choose a liquid");
        String aLiquid = userInput.nextLine();

        System.out.println("Choose a verb ending in ing");
        String VerbEndingInIng = userInput.nextLine();

        System.out.println("Choose a part of the body that is plural");
        String PartsOfTheBody = userInput.nextLine();


        System.out.printf(
                "it was a cold November day. I woke up to the %s smell of %s roasting in the %s downstairs." +
                        "\nI %s down the stairs to see if I could help %s the dinner." +
                        "\nMy mom said, \"see if %s need a fresh %s.\"" +
                        "\nSo I carried a tray of glasses full of %s into the %s room. When I got there, I couldn't believe my %s!" +
                        "\nthere were %s %s on the %s!",Adjective,TypeofBird,RoomInHouse,VerbPastTense,Verb,RelativeName,Noun,aLiquid,VerbEndingInIng,
                        PartsOfTheBody,PluralNoun,VerbEndingInIng,Noun

        );


        userInput.close();
    }
}