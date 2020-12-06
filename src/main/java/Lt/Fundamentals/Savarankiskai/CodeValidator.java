package Lt.Fundamentals.Savarankiskai;

import java.time.LocalDate;
import java.util.Scanner;

public class CodeValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter personal code: ");
        String personalCode = sc.nextLine();

        validator(personalCode);
    }

    private static Boolean validator(String n) {

        String isCorrect = "([3-6])([0-9]{2})(0[0-9]|1[0-2])([0-9]{6})";
        if (!n.matches(isCorrect)) {
            System.out.println("Must be 11 symbols and digits only");
            return false;
        }

        char split[] = n.toCharArray();  // Stringas į char array
        int code[] = new int[11];       // char array į int array
        for (int i = 0; i < 11; i++) {
            code[i] = Character.getNumericValue(split[i]);// char array į int array
        }

        int year, month, day, century, lastDigit;
        year = code[1] * 10 + code[2];
        month = code[3] * 10 + code[4];
        day = code[5] * 10 + code[6];
        century = code[0];
        if (century <= 4) {
            year += 1900;
        } else {
            year += 2000; // pakeičiamas metų formatas į keturženklį
        }
        if ((year % 4 != 0 && month == 2 && day > 28) || (year % 4 == 0 && month == 2 && day > 29) ||
                ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31) ||
                ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30)) {
            System.out.println("Wrong date input");
            return false; // patikrinama ar dienų skaičius mėnesiuose atitinka
        }

        int sum = 0;
        int sumB = 0;
        int multiplierA = 1;
        int multiplierB = 3;

        for (int i = 0; i < split.length - 1; i++) { //skaiciuojamas paskutinis a.k. skaicius
            if (multiplierA > 9) multiplierA = 1;
            if (multiplierB > 9) multiplierB = 1;
            sum = sum + code[i] * (multiplierA);
            sumB = sumB + code[i] * (multiplierB);
            multiplierA++;
            multiplierB++;
        }

        LocalDate date = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);
        if (sum % 11 == 10) lastDigit = sumB % 11;
        else lastDigit = sum % 11;
        if (lastDigit == code[10] && date.isAfter(birthday)) {
        } else {
            System.out.println("Wrong data input");
            return false;
        }
        System.out.println("Code is valid! You must be born in " + birthday);
        return true;

    }
}
