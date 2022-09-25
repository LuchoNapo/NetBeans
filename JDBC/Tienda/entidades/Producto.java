
package tienda.entidades;

/**
 *
 * @author Lucho Napo
 */
public class Producto {
    
    private int codigo;
    private String nombre;
    private double precio;
    private Integer codigo_fabricante;

    public Producto() {
    }

    public Producto(int codigo, String nombre, double precio, Integer codigo_fabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigo_fabricante = codigo_fabricante;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Integer getCodigo_fabricante() {
        return codigo_fabricante;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCodigo_fabricante(Integer codigo_fabricante) {
        this.codigo_fabricante = codigo_fabricante;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", codigo_fabricante=" + codigo_fabricante + '}';
    }
    
    
}
