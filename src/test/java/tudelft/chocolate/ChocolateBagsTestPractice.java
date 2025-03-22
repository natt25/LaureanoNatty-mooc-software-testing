package tudelft.chocolate;

public class ChocolateBagsTestPractice {
    public static void main(String[] args) {
        ChocolateBags cb = new ChocolateBags();

        int result1 = cb.calculate(5, 3, 17);
        System.out.println("Resultado: " + result1); // sale 2

        int result2 = cb.calculate(1, 1, 10);
        System.out.println("Resultado: " + result2); // sale -1

        int result3 = cb.calculate(1, 1, 7);
        System.out.println("Resultado: " + result3); // sale -1


    }
}
