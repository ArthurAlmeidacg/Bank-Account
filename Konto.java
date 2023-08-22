//package pvl_3;

public class Konto implements IKonto {

    private String name;
    private int balance;
    private Konto prev;
    private Konto next;

    public Konto(String name, int balance) {
        this.name = name;
        this.balance = balance;
        this.prev = null;
        this.next = null;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public Konto getPrev() {
        return this.prev;
    }

    public Konto getNext() {
        return this.next;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setPrev(Konto konto) {
        if (this.prev != null) {

            this.prev.next = konto;
            konto.prev = this.prev;
        }
        this.prev = konto;
        konto.next = this;
    }

    public void setNext(Konto konto) {
        if (this.next != null) {

            this.next.prev = konto;
            konto.next = this.next;
        }
        this.next = konto;
        konto.prev = this;
    }

}
