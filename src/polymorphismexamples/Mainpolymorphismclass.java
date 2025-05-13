package polymorphismexamples;

public class Mainpolymorphismclass {
    public static void main(String[] args) {
        performsum sum1 = new performsum();
        sum1.sum(12, 14);
        sum1 .sum(230.0, 12);
    }
}