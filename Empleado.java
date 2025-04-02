public class Empleado {
    protected String nombre;
    protected String contacto;
    protected  double precioXhora = 80;
    protected double sueldo;
    protected int cantidadDeHoras;

    public Empleado(String nombre, String contacto, double precioXhora,int cantidadDeHoras) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.precioXhora = precioXhora;
        this.sueldo = (precioXhora * cantidadDeHoras);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public double getPrecioXhora() {
        return precioXhora;
    }

    public void setPrecioXhora(double precioXhora) {
        this.precioXhora = precioXhora;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", contacto='" + contacto + '\'' +
                ", precioXhora=" + precioXhora +
                ", sueldo=" + sueldo +
                '}';
    }
}
