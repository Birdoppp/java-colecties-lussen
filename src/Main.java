import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] numeric = {1,2,3,4,5,6,7,8,9,0};
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        Translator tr = new Translator(alphabetic, numeric);
        System.out.println(tr.translate(6));

        Boolean play = true;
        String ongeldig = "ongeldige invoer";
        Scanner sc = new Scanner(System.in);

        while(play){
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            String input = sc.nextLine();
            if (input.equals("x")){
                play = false;
            } else if (input.equals("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                int number = sc.nextInt();
                sc.nextLine();
                if (number < 10) {
                    String result = tr.translate(number);
                    System.out.println("de vertaling van " + number + " is " + result);
                } else {
                    System.out.println(ongeldig);
                }
            } else {
                System.out.println(ongeldig);
            }
        }
    }
}
