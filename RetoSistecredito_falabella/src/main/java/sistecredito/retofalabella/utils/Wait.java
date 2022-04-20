package sistecredito.retofalabella.utils;

public class Wait {
    public static void stopExecutions(int miliseconds){
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
