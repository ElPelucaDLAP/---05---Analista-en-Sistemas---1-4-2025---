public class EmpleadoTiempoCompleto extends Empleado {
    int cantidadDeDiaz;//editar
    boolean finesDeSemana;

    public EmpleadoTiempoCompleto(String nombre, String contacto, double precioXhora, double sueldo, int cantidadDeDiaz, boolean finesDeSemana) {
        super(nombre, contacto, precioXhora, sueldo);
        this.cantidadDeDiaz = cantidadDeDiaz;
        this.finesDeSemana = finesDeSemana;
    }

    public int getCantidadDeDiaz() {
        return cantidadDeDiaz;
    }

    public void setCantidadDeDiaz(int cantidadDeDiaz) {
        this.cantidadDeDiaz = cantidadDeDiaz;
    }
}
