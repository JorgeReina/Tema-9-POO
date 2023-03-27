public class Productos {
  
  private String nombre;
  private int cantidad;

  public Productos(String nombre, int cantidad) {

    this.nombre = nombre;
    this.cantidad = cantidad;

  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre (String nombre) {
    this.nombre = nombre;
  }

  public int getCantidad() {
    return this.cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

}
