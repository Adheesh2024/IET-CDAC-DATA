package lab21_pass_gen;

/**
 * Lab 21: Random 8-character password generator using Math.random()
 * Run command: java -cp bin lab21_pass_gen.RandomPasswordGenerator
 */
public class RandomPasswordGenerator {

    private static final String CHAR_POOL = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int PASSWORD_LENGTH = 8;

    public static String generatePassword() {
        StringBuilder sb = new StringBuilder();
        int poolLength = CHAR_POOL.length();

        for (int i = 0; i < PASSWORD_LENGTH; i++) {
            int randomIndex = (int) (Math.random() * poolLength);
            char randomChar = CHAR_POOL.charAt(randomIndex);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   RANDOM PASSWORD GENERATOR (Math.random())      ");
        System.out.println("==================================================");
        System.out.println("Allowed Characters : A-Z, a-z, 0-9");
        System.out.println("Password Length    : " + PASSWORD_LENGTH + " characters\n");

        System.out.println("Generated Random Passwords Sample:");
        System.out.println("------------------------------------");
        for (int i = 1; i <= 5; i++) {
            String password = generatePassword();
            System.out.printf("Sample #%d : %s\n", i, password);
        }
        System.out.println("==================================================");
    }
}
