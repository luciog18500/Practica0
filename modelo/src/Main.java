
import java.time.LocalDate;
import java.util.Date;


public class Main {

    public static void main(String[] args) {

        Tiempo tiempo = new Tiempo();

        Date fechaA = new Date();
        TiempoAnemica tiempoA = new TiempoAnemica(fechaA);

        System.out.println(tiempoA.getFecha());

        Date fecha = tiempo.crearFecha();

        tiempo.mostrarFechaFormatoDDMMYY(fecha);

        LocalDate.now();
        TiempoRecord tiempoR = new TiempoRecord(LocalDate.now());
        System.out.println(tiempoR.fecha());
    }
}