// Part 1. Syntax
import java.util.Scanner;
public class Syntax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //string
        System.out.println("What is Your name?");
        String name = in.nextLine();
        System.out.println("Nice to meet You, " + name);

        //int
        System.out.println("How old are You?");
        int age = in.nextInt();

        //boolean
        System.out.println("What program are You applying for?");
        String program = in.nextLine();
        System.out.println(program.contains("BSE"));
        boolean isBSE = program.contains("BSE");
        if (isBSE) {
            System.out.println("Oh, my congrats. It seems You like programming!)");
        }

        //char
        System.out.println("Did You get higher secondary education in Ukraine?(Please, type + or -)");
        String edu = in.nextLine();
        char c1 = '+';
        char c2 = '-';
        System.out.println(edu.contains("+"));
        boolean isc1 = edu.contains("+");
        if (isc1) {
            System.out.println("Excellent");
        }

        //double
        double num1=5;
        double num2=10;
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }
}