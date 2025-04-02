public class EmpleadoTiempoParcial extends Empleado {
    int cantidadDeHoras;//editar
    boolean trabajoMasDe6Horas;

    public EmpleadoTiempoParcial(String nombre, String contacto, double precioXhora, double sueldo, int cantidadDeHoras, boolean trabajoMasDe6Horas) {
        super(nombre, contacto, precioXhora, sueldo);
        this.cantidadDeHoras = cantidadDeHoras;
        this.trabajoMasDe6Horas = trabajoMasDe6Horas;
    }

    public int getCantidadDeHoras() {
        return cantidadDeHoras;
    }

    public void setCantidadDeHoras(int cantidadDeHoras) {
        this.cantidadDeHoras = cantidadDeHoras;
    }

    public boolean isTrabajoMasDe6Horas() {
        return trabajoMasDe6Horas;
    }

    public void setTrabajoMasDe6Horas(boolean trabajoMasDe6Horas) {
        this.trabajoMasDe6Horas = trabajoMasDe6Horas;
    }
}
