import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator implements Characters{

    static Random random = new Random();
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = readNumber(in);

        while (true) {
            String password = createPassword(length);
            if (new Password(password).Strength() == false) {
                password = createPassword(length);
            } else {
                System.out.println(password);
                break;
            }
        }
    }
    public static String createPassword(int n) {

        String password = "";

        for (int i = 0; i < n; i++) {
            password += randomOne();
        }
        return password;
    }

    public static int readNumber(Scanner reader) {
        System.out.println("Password length?");
        while (true) {
            try {
                int length = Integer.parseInt(reader.nextLine());
                return length;
            } catch (Exception e) {
                System.out.println("Please enter a number");
            }          
        }
    }
    
    public static char randomCharacter() {
        char y = charactersLower.charAt(random.nextInt(charactersLower.length()));
        int x = new Random().nextInt(2);
        
        if (x == 0) {
            return Character.toUpperCase(y);
        } else {
            return y;
        }
    }
    public static char randomInteger() {
        return integers.charAt(random.nextInt(integers.length()));

    }
    public static char randomSpecial() {
        return specials.charAt(random.nextInt(specials.length()));

    }
    public static char randomOne() {
        int x = new Random().nextInt(3);
        if (x == 0) {
            return randomCharacter();
        } else if (x == 1) {
            return randomInteger();
        } else {
            return randomSpecial();
        }
    }
}
