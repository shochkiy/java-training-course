package Main;

public class Main {
    static int number = (int) (Math.random() * 1000000000 + 1);
    static boolean isCatch = false;
    static int sec;
    public static void main(String[] args) {
        System.out.println(String.format("Загаданная переменная: %s", number));
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                try {
                    while (!isCatch) {
                        System.out.println(i);
                        sec = i;
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {

                }
            }
        });
        timer.start();
        Thread randomCatcher = new Thread(new Runnable() {
            @Override
            public void run() {
                int i;
                    while (!isCatch) {
                        i = (int) (Math.random() * 1000000000 + 1);

                        if (i == number) {
                            isCatch = true;
                            System.out.println(String.format("Попытка %s", i));
                        }
                    }
                }
        });
        randomCatcher.start();
    }
}
