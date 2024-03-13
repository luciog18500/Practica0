
import java.util.*;

public class TiempoAnemica {

    public Date fecha;

    TiempoAnemica (Date fecha){
        this.fecha=fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /*La forma Anemica tiene poco o nulo comportamiento, siendo asi una escasa representacion del objeto real. Solo contiene al tipo de dato en este caso Date y no tiene la cantidad de comportamientos minimos.
     */
}