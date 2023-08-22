

public interface IKonto {

    public String getName();
    public int getBalance();
    public Konto getPrev();
    public Konto getNext();

    public void setPrev(Konto konto);
    public void setNext(Konto konto);
}
