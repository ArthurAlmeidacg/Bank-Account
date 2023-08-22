//package pvl3;

public class Bank implements IBank {

    private Konto head;
    private int size;

    public Bank() {
        this.head = null;
        this.size = 0;
    }

    public Konto getHead() {
        return head;
    }

    public void append(String name, int balance) {
        Konto newKonto = new Konto(name, balance);
        if (head == null) {
            head = newKonto;
        } else {
            Konto lastKonto = head;
            while (lastKonto.getNext() != null) {
                lastKonto = lastKonto.getNext();
            }
            lastKonto.setNext(newKonto);
            newKonto.setPrev(lastKonto);
        }
        size++;
    }

    public Konto get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Konto currentkonto = head;
        for (int i = 0; i < index; i++) {
            currentkonto = currentkonto.getNext();
        }
        return currentkonto;
    }

    public boolean insert(int index, String name, int balance) {
        if (index < 0 || index > size) {
            return false;
        }
        if (index == size) {
            append(name, balance);
            return true;
        }

        Konto newKonto = new Konto(name, balance);
        Konto currentKonto = get(index);
        Konto prevKonto = currentKonto.getPrev();
        newKonto.setPrev(prevKonto);
        newKonto.setNext(currentKonto);

        if (prevKonto != null) {
            prevKonto.setNext(newKonto);
        } else {
            head = newKonto;
        }
        currentKonto.setPrev(newKonto);
        size++;
        return true;
    }

    public boolean delete(int index) {
        if (index < 0 || index > size) {
            return false;
        }
        if (index == 0) {
            head = head.getNext();
            if (head == null) {
                head.setPrev(null);
            }
        } else {
            Konto current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
            if (current.getNext() != null) {
                current.getNext().setPrev(current);
            }
        }
        size--;
        return true;

    }

    public boolean swap(int index1, int index2) {

        Konto konto1 = this.get(index1);
        Konto konto2 = this.get(index2);
        if (konto1 != null && konto2 != null) {
            String name = konto1.getName();
            int balance = konto1.getBalance();
            konto1.setName(konto2.getName());
            konto1.setBalance(konto2.getBalance());
            konto2.setName(name);
            konto2.setBalance(balance);
            return true;
        }
        return false;
    }

    public void sortByBalance() {
        boolean swapped = true;
        int j = 0;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < size - j; i++) {
                if (get(i).getBalance() > get(i + 1).getBalance()) {
                    swap(i, i + 1);
                    swapped = true;
                }
            }
        }
    }

    public double getMedian() {
        int middle = size / 2;
        if (size % 2 == 0) {
            double balance1 = get(middle - 1).getBalance();
            double balance2 = get(middle).getBalance();
            return (balance1 + balance2) / 2.0;
        } else {
            return get(middle).getBalance();
        }
    }

    public void printAccounts() {
        System.out.println("Bank Accounts:");
        System.out.println("--------------");
        for (int i = 0; i < size; i++) {
            String name = get(i).getName();
            int balance = get(i).getBalance();
            System.out.printf("%-20s %10d%n", name, balance);
        }
        System.out.println("--------------");
    }

}
