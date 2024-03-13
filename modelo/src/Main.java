
import java.util.Date;


public class Main {

    public static void main(String[] args) {

        Tiempo tiempo = new Tiempo();

        Date fechaA = new Date();
        TiempoAnemica tiempoA = new TiempoAnemica(fechaA);

        System.out.println(tiempoA.getFecha());

        Date fecha = tiempo.crearFecha();

        tiempo.mostrarFechaFormatoDDMMYY(fecha);


//        TiempoRecord tiempoR = new TiempoRecord(fechaA);
//        System.out.println(tiempoR.getFecha());
    }
}