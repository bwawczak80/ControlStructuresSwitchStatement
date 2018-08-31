import java.util.Scanner;
public class main {

    public static void main(String[] args){

        int number;

        String altLangNum;

        Scanner scanIn = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        number = scanIn.nextInt();
        switch(number) {
            case 1: altLangNum = "eins";
                break;
            case 2: altLangNum = "zwei";
                break;
            case 3: altLangNum = "drei";
                break;
            case 4: altLangNum = "vier";
                break;
            case 5: altLangNum = "fünf";
                break;
            case 6: altLangNum = "sechs";
                break;
            case 7: altLangNum = "sieben";
                break;
            case 8: altLangNum = "acht";
                break;
            case 9: altLangNum = "neun";
                break;
            case 10: altLangNum = "zehn";
                break;
            default: altLangNum = "Das ist keine gültige Wahl!";
                break;

        }

        System.out.println(altLangNum);
    }
}
