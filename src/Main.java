import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        String zodiac = null;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your birth year: ");
        year = input.nextInt();

        zodiac = switch (year % 12) {
            case 0 -> "Monkey";
            case 1 -> "Rooster";
            case 2 -> "Dog";
            case 3 -> "Pig";
            case 4 -> "Rat";
            case 5 -> "Ox";
            case 6 -> "Tiger";
            case 7 -> "Rabbit";
            case 8 -> "Dragon";
            case 9 -> "Snake";
            case 10 -> "Horse";
            case 11 -> "Goat";
            default -> zodiac;
        };
        System.out.println("Your Chinese zodiac is " + zodiac);
    }
}