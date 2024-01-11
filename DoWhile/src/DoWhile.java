public class DoWhile {
    public static void main(String[] args) throws InterruptedException {

        int i = 1;

        do {
            System.out.println(i);
            i++;
            Thread.sleep(500);
        }
        while (i <= 5);
    }
}