

public interface IBank {

    public Konto getHead();

    public void append(String name, int balance);
    public Konto get(int index);
    public boolean insert(int index, String name, int balance);
    public boolean delete(int index);

    public boolean swap(int index1, int index2);
    public void sortByBalance();
    public double getMedian();

    public void printAccounts();
}
