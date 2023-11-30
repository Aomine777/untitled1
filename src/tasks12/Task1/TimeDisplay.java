package tasks12.Task1;

public class TimeDisplay {
    public static void main(String[] args) {
        Thread timeThread = new Thread(()-> {
            long startTime = System.currentTimeMillis();
            while(true) {
                long currentTime = System.currentTimeMillis();
                long elepsedTime = (currentTime - startTime) / 1000;
                System.out.println("Пройшло часу:" + elepsedTime + "секунд");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread messageThread = new Thread(() ->{
            while(true){
                System.out.println("Минуло 5 секунд");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        timeThread.start();
        messageThread.start();
    }
}
