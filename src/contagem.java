public class contagem {
    public static void main(String[] args) {
        for (int x = 0; x <= 100; x+=10) {
            System.out.println(x);
        }

        System.out.println("Multiplicação I x J");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + " = " + j * i);
            }
        }
    }
}
