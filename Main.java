public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.append("João", 1000);
        bank.append("Maria", 1500);
        bank.append("Pedro", 500);
        bank.append("Ana", 2000);

        // System.out.println("original order");
        // bank.printAccounts();
        // System.out.println();

        // bank.sortByBalance();

        // System.out.println("accounts after sorting:");
        // bank.printAccounts();
        // System.out.println();

        // double median = bank.getMedian();
        // System.out.println("median balance: " + median);

        // bank.swap(1, 3);

        
        // System.out.println("swap: ");
        // bank.printAccounts();
        // System.out.println();

        // boolean inserted = bank.insert(2, "Carlos", 800);
        // if (inserted) {
        //     System.out.println("new account");
        // } else {
        //     System.out.println("dailed to insert new account!!");
        // }

        // bank.printAccounts();
        // System.out.println();

        // boolean deleted = bank.delete(0);
        // if (deleted) {
        //     System.out.println("deleted");
        // } else {
        //     System.out.println("failed to remove account!");
        // }

        // System.out.println("after remove");
        // bank.printAccounts();

        
        System.out.println("get bank " +bank.get(1));
    }
}
// 1 Konto@7ba4f24f