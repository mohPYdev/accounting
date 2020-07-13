package accountant;

public interface Computation {
    public double costComputer(String path) throws InterruptedException;
    public double profitComputer(String path) throws InterruptedException;
    public double incomeComputer(String path) throws InterruptedException;
}
