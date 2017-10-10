package eu.sig.training.ch04;

public class Accounts {
   public static CheckingAccount findAcctByNumber(String number) {
        return new CheckingAccount();
    }

    public static boolean isValid(String number) {
        int sum = 0;
        int lengthCard=9;
        for (int i = 0; i < number.length(); i++) {
            sum = sum + (lengthCard - i) * Character.getNumericValue(number.charAt(i));
        }
        return sum % 11 == 0;
    }
}