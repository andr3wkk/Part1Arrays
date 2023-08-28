//Part 2.1 Input Array
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hey! We'd like to know some information about You.");

        //name
        System.out.println("What is Your name?");
        String name = in.nextLine();
        System.out.println("Nice to meet You, " + name);

        //age
        System.out.println("How old are You?");
        int age = in.nextInt();
        in.nextLine();
        System.out.println(name + ", You're welcome to the AUK student enrollment space");

        //gender
        System.out.println("What is Your gender");
        String gen = in.nextLine();

        //location
        System.out.println("Where do You live at the moment?");
        String loc = in.nextLine();
        boolean isKyiv = loc.contains("Kyiv");
        if (isKyiv) {
            System.out.println("What a nice city!");
        }

        //education
        System.out.println("Did You get higher secondary education in Ukraine?(Please, type + or -)");
        String edu = in.nextLine();
        char c1 = '+';
        char c2 = '-';
        System.out.println(edu.contains("+"));
        boolean isc1 = edu.contains("+");
        if (isc1) {
            System.out.println("Excellent");
        }

        //program
        System.out.println("What program are You applying for?");
        String program = in.nextLine();
        System.out.println(program.contains("BSE"));
        boolean isBSE = program.contains("BSE");
        if (isBSE) {
            System.out.println("Oh, my congrats. It seems You like programming!)");
        }
        System.out.println(program + " is an excellent choice");

        //info list
        System.out.println("Do you want to get Your personal info list?(type YES or NO)");
        String infolist = in.nextLine();
        System.out.println(infolist.startsWith("Y"));
        boolean isY = infolist.startsWith("Y");
        if (isY) {
            System.out.println("Alright, thank You for giving information about yourself. Here is your info list:");
            System.out.println("Your name is " + name);
            System.out.println("Your age is " + age);
            System.out.println("Your gender is "+ gen);
            System.out.println("Your program is " + program);
            System.out.println("You live in " +loc);
        }

        //AUK programs
        System.out.println("Would You like to know more information about AUK programs? (type YES or NO)");
        String auk = in.nextLine();
        System.out.println(auk.endsWith("S"));
        boolean isS = auk.endsWith("S");
        if (isS) {
            System.out.println("There are two schools in AUK: EPAM School of Digital Technologies and School of Management. There are 2 programs in EPAM school: BDS and BSE, and 3 in School of Management: BMS, BBA, and BGM");
        }

        //Campus
        System.out.println("Do You want to know about AUK campus building history? (type YES or NO)");
        String cmp = in.nextLine();
        System.out.println(cmp.contains("YES"));
        boolean isYES = cmp.contains("YES");
        if (isYES) {
            System.out.println("It was built by the Main Department of the Dnipro River Shipping Company under the Council of Ministers of the Ukrainian SSR and the Kyiv River Port. The cost was about 1,000,400 rubles, and the building's total volume was 29 015 cubic meters. The structure and surrounding area resembled a ship standing in the port.");
        }

        //end
        System.out.println("Bye, thanks for using my chatbot:)");
        System.out.println("Please, rate this chatbot from 1 to 10");
        int rate = in.nextInt();

        System.out.println("Thanks for Your feedback :)");

    }
}