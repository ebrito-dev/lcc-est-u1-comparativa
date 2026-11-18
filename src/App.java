
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        long nanoTime = System.nanoTime();
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("Current time in nanoseconds: " + nanoTime);
        System.out.println("Current time in milliseconds: " + currentTimeMillis);

       Runable x = () -> {
            System.out.println("Ejecutando tarea 1");
            System.out.println("Ejecutando tarea 2");

       };

       List<Integer> = new ArrayList<>();
       MetodosOrd mO = new MetodosOrd();
       mO.burbuja(list);
       Runnable BurbujaOrden = () -> mO.burbuja(list);

  
    }
}
