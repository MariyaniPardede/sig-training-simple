package eu.sig.training.ch04;

public class CheckingAccount {
    private static final float INTEREST_PERCENTAGE = 0.01f;
    private Money balance = new Money();
    private int transferLimit = 100;

    public Transfer makeTransfer(String counterAccount, Money amount)
        throws BusinessException {
         if (amount.greaterThan(this.transferLimit)) {
            throw new BusinessException("Limit exceeded!");
        }
          int sum = 0;
          int hasil = 0;
          int max = 9;
          int accNo = 11;
        for (int i = hasil; i < counterAccount.length(); i++) {
            char character = counterAccount.charAt(i);
            int characterValue = Character.getNumericValue(character);
            sum = sum + (max - i) * characterValue;
        }
        if (sum % accNo == hasil) {
            CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
            Transfer result = new Transfer(this, acct, amount);
            return result;
        } else {
            throw new BusinessException("Invalid account number!");
        }
    }

    public void addInterest() {
        Money interest = balance.multiply(INTEREST_PERCENTAGE);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }
}
