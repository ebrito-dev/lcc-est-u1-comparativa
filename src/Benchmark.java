public class Benchmark {

    public static Results medir(Runnable accion, String nombre, String sample) {
        //System.out.println("Funcion" + nomnbre);
        //Tiempo actual
        long tA = System.nanoTime();
        //accion
        accion.run();
        //Tiempo final 
        long tF = System.nanoTime();
        //Retoranar el tiempo de duracion\
        Results results = new Results(nombre, (tF - tA), sample);
        return results;
    }
    
}
