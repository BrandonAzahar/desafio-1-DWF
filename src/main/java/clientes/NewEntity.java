
 *import java.util.List;

public interface CarritoCompra {
    void agregarProducto(String producto);
    void eliminarProducto(String producto);
    List<String> obtenerProductos();
    float calcularTotal();
}
