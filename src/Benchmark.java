public class Benchmark {

    public static long medir(Runnable accion, String nomnbre, String sample) {
        //System.out.println("Funcion" + nomnbre);
        //Tiempo actual
        long tA = System.nanoTime();
        //accion
        accion.run();
        //Tiempo final 
        long tF = System.nanoTime();
        //Retoranar el tiempo de duracion\
        Results results = new Results(nomnbre, (tF - tA), sample);

        return results;
    }
    
}
