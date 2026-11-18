public class Benchmark {

    public static long medir() {
        //Tiempo actual
        long startTime = System.nanoTime();
        //accion
        long sum = 0;
        //Tiempo final 
        long endTime = System.nanoTime();
        //Retoranar el tiempo de duracion
        return endTime - startTime;
    }
    
}
