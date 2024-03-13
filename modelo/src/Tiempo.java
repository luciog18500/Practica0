
import java.util.*;
import java.text.SimpleDateFormat;


public class Tiempo {
    private Date fecha;


    private Date retornarFecha() {
        return this.fecha;
    }

    public Date crearFecha() {
        Date fecha1 = new Date();
        return fecha1;
    }

    private void mostrarFecha(Date fecha1 ) {
        System.out.println(fecha1);
    }

    public void mostrarFechaFormatoDDMMYY( Date fecha1) {
        System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(fecha1));
    }

    private Date obtenerFecha() {
        return fecha;
    }

    private void establecerFecha(Date fecha) {
        this.fecha = fecha;
    }

    /*Esta es la forma no Anemica donde la clase es tratada como un objeto y los nombres de los metodos son significativos y representantes. El objeto adquiere un comportamiento y una representacion mas cercana a la realidad
     */
}