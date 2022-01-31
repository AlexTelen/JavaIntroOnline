import java.util.Scanner;

/**
 * 4. Счета. Клиент может иметь несколько
 * счетов в банке. Учитывать возможность
 * блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов.
 * Вычисление общей суммы по счетам.
 * Вычисление суммы по всем счетам,
 * имеющим положительный и отрицательный
 * балансы отдельно.
 */
class Account {
    private String number;
    private double balance;
    private boolean unlocked;

    Account(String number, double balance, boolean unlocked) {
        this.number = number;
        this.balance = balance;
        this.unlocked = unlocked;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    public void setLock(boolean unlocked) {
        this.unlocked = unlocked;
    }

    public String toString() {
        return this.getNumber() + " | " + this.getBalance() + " | " + this.isUnlocked();
    }
}

class BankCustomer {
    private String name;
    private Account[] accounts;

    BankCustomer(String name, Account[] accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public Account search(String number) {
        for (Account account : accounts) {
            if (account.getNumber().equals(number))
                return account;
        }
        return null;
    }

    public void sortNumber() {
        for (int i = 1; i < accounts.length; ) {
            if (accounts[i - 1].getNumber().compareTo(accounts[i].getNumber()) > 0) {
                Account temp = accounts[i - 1];
                accounts[i - 1] = accounts[i];
                accounts[i] = temp;
                i = 1;
            } else
                i++;
        }
        for (Account account : accounts)
            System.out.println(account.toString());
    }

    public void sortBalance() {
        for (int i = 1; i < accounts.length; ) {
            if (accounts[i - 1].getBalance() > accounts[i].getBalance()) {
                Account temp = accounts[i - 1];
                accounts[i - 1] = accounts[i];
                accounts[i] = temp;
                i = 1;
            } else
                i++;
        }
        for (Account account : accounts)
            System.out.println(account.toString());
    }

    public void sortLock() {
        for (int i = 1; i < accounts.length; ) {
            if (!accounts[i - 1].isUnlocked() && accounts[i].isUnlocked()) {
                Account temp = accounts[i - 1];
                accounts[i - 1] = accounts[i];
                accounts[i] = temp;
                i = 1;
            } else
                i++;
        }
        for (Account account : accounts)
            System.out.println(account.toString());
    }

    public double sum() {
        double sum = 0;
        for (Account account : accounts) {
            sum += account.getBalance();
        }
        return sum;
    }

    public double positiveSum() {
        double sum = 0;
        for (Account account : accounts) {
            if (account.getBalance() > 0)
                sum += account.getBalance();
        }
        return sum;
    }

    public double negativeSum() {
        double sum = 0;
        for (Account account : accounts) {
            if (account.getBalance() < 0)
                sum += account.getBalance();
        }
        return sum;
    }
}

public class AggComp4 {


    public static void main(String[] args) {
        Account account1 = new Account("684351456765", 100.99, true);
        Account account2 = new Account("655351456765", 0.99, true);
        Account account3 = new Account("515655465654", -50.00, true);
        Account account4 = new Account("864356676545", 0.90, false);
        Account account5 = new Account("964351566765", -15.69, true);

        BankCustomer bankCustomer = new BankCustomer("John Smith", new Account[]{account1, account2, account3, account4, account5});
        Scanner scan = new Scanner(System.in);
        int choose = -1;
        while (choose != 0) {
            System.out.println("Client support");
            System.out.println("1. Search for the account");
            System.out.println("2. Sort by number");
            System.out.println("3. Sort by balance");
            System.out.println("4. Sort by lock");
            System.out.println("5. All sum on the accounts");
            System.out.println("6. Positive sum");
            System.out.println("7. Negative sum");
            System.out.println("8. Lock account");
            System.out.println("9. Unlock account");
            System.out.println("0. Exit");
            choose = scan.nextInt();
            scan.nextLine();
            switch (choose) {
                case 1: {
                    System.out.println("Enter the number: ");
                    String searchFor = scan.nextLine();
                    if (bankCustomer.search(searchFor) != null)
                        System.out.println("Found: " + bankCustomer.search(searchFor).toString());
                    else
                        System.out.println(404);
                }
                break;
                case 2:
                    System.out.println("\n Sort by number");
                    bankCustomer.sortNumber();
                    break;
                case 3:
                    System.out.println("\n Sort by balance");
                    bankCustomer.sortBalance();
                    break;
                case 4:
                    System.out.println("\n Sort by lock");
                    bankCustomer.sortLock();
                    break;
                case 5:
                    System.out.println("\n All accounts balance sum: " + bankCustomer.sum());
                    break;
                case 6:
                    System.out.println("\n Only positive sum: " + bankCustomer.positiveSum());
                    break;
                case 7:
                    System.out.println("\n Only negative sum: " + bankCustomer.negativeSum());
                    break;
                case 8: {
                    System.out.println("Enter the number: ");
                    String searchFor = scan.nextLine();
                    if (bankCustomer.search(searchFor) != null) {
                        bankCustomer.search(searchFor).setLock(false);
                        System.out.println("Locked successfully");
                    } else
                        System.out.println(404);
                }
                break;
                case 9: {
                    System.out.println("Enter the number: ");
                    String searchFor = scan.nextLine();
                    if (bankCustomer.search(searchFor) != null) {
                        bankCustomer.search(searchFor).setLock(true);
                        System.out.println("Unlocked successfully");
                    } else
                        System.out.println(404);
                }
                break;
                default:
                    System.out.println("\n Error. Please try again" + "\n");

            }
        }

    }
}
