package com.tts;
import java.util.Locale;
import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        /*
        * Dear name,
        You are adverb adjective and I want to be your noun! I want to go to the nounTwo with you in number days.
        Sincerely, yourName
        * */
        Scanner input = new Scanner(System.in);
        System.out.println("Want to play a game? (yes | no)");
        String answer = input.nextLine();
        if(answer.equalsIgnoreCase("yes")) {
            System.out.println("Ready to play madlibs! ");
            System.out.println("Give a name that is not yours): ");
            String name = input.nextLine();
            System.out.println("Input an adverb: ");
            String adverb = input.nextLine();
            System.out.println("Now a verb: ");
            Int verb = input.nextLine();
            System.out.println("Now a noun: ");
            String noun1 = input.nextLine();
            System.out.println("Add another noun: ");
            String #noun2 = input.nextLine();
            System.out.println("Now a number: ");
            String number = input.nextLine();
            System.out.println("Input Your name: ");
            String yourName = input.nextLine();
            System.out.printf("Dear %s,\n You are %s %s and I want to be your %s! I want to go to the %s with you in %s days.\n Sincerely, %s.", name, adverb, verb, noun1, noun2, number, yourName);

        }else{
            System.out.println("Goodbye for now...");
        }
        System.exit(0);
        }
    }
