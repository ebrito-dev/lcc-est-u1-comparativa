import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
      Generador g = new Generador();
      Benchmark b = new Benchmark();

      List<Integer> list = g.generate(size: 100);
      System.out.println(list);

      Results benGenList = b.medir(
          () -> g.generate(size: 100)
         nombre: "Generacion de listado", sample: "100");
      
         System.out.println("Funcion: " + benGenList.getFuncionName());
      




    /*  
      long nanoTime=System.nanoTime();

      long currentTimeMillis=System.currentTimeMillis();
      System.out.println("nano time"+nanoTime);
      System.out.println("current time "+currentTimeMillis);

      Runnable x = ()-> {
        System.out.println("ejecutando tarea 1");
        System.out.println("ejecutando tarea 2");
    };

    List<Integer>list = new ArrayList<>();
    MetodosOrd mO =new MetodosOrd();
    mO.burbuja(list);
    Runnable burbujaOrden = ()-> mO.burbuja(list);
    ejecutarMasTarde();

      //Callable<T>x para que retorne
      System.out.println("ejecucion de la funcionb Runnable");
      x.run();
      
    */      
        
    }
}
