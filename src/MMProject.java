import java.util.Scanner;

public class MMProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        boolean hasCorrectInput = true;

        System.out.println("Please enter an odd number between 2 and 10 000.");

        while (true) {
            n = Integer.parseInt(sc.nextLine());
            if(n > 2 && n < 10000 && n % 2 != 0){
                break;
            }else {
                System.out.println("Incorrect input!\nPlease enter an odd number between 2 and 10 000.");
            }
        }
        printUpperBody(n);
        printLowerBody(n);

    }

    public static String getRepeatedCharacter(char letter, int times){
        StringBuilder fullString = new StringBuilder("");

        for (int i = 0; i < times; i++){
            fullString.append(letter);
        }

        return fullString.toString();
    }

    public static void printUpperBody(int n){
        int borderDashCount = n;
        int letterStarCount = n;
        int middleDashCount = n;

        for (int i = 0; i < Math.ceil(n/2.0); i++){
            StringBuilder line = new StringBuilder("");
            for (int j = 0; j < 2; j++){
                line.append(getRepeatedCharacter('-',borderDashCount));
                line.append(getRepeatedCharacter('*',letterStarCount));
                line.append(getRepeatedCharacter('-',middleDashCount));
                line.append(getRepeatedCharacter('*',letterStarCount));
                line.append(getRepeatedCharacter('-',borderDashCount));
            }
            borderDashCount -= 1;
            letterStarCount += 2;
            middleDashCount -= 2;
            System.out.println(line.toString());
        }
    }

    public static void printLowerBody(int n){
        int borderDashCount = n/2;
        int letterStarCount = n;
        int middleDashCount = 1;
        int middleLetterStarCount = (n*2)-1;

        for (int i = 0; i < Math.ceil(n/2.0); i++){
            StringBuilder line = new StringBuilder("");
            for (int j = 0; j < 2; j++){
                line.append(getRepeatedCharacter('-',borderDashCount));
                line.append(getRepeatedCharacter('*',letterStarCount));
                line.append(getRepeatedCharacter('-',middleDashCount));
                line.append(getRepeatedCharacter('*',middleLetterStarCount));
                line.append(getRepeatedCharacter('-',middleDashCount));
                line.append(getRepeatedCharacter('*',letterStarCount));
                line.append(getRepeatedCharacter('-',borderDashCount));
            }
            borderDashCount -= 1;
            middleDashCount += 2;
            middleLetterStarCount -= 2;
            System.out.println(line.toString());
        }
    }

}
