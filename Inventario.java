package Inventario;

import java.util.ArrayList;

public class Inventario {
static ArrayList<Producto> productos = new ArrayList<>();

public static void agregarProducto(Producto producto) {
    productos.add(producto);
}

public static void eliminarProducto(Producto producto) {
    productos.remove(producto);
}

public static Producto buscarProducto(String nombre) {
    for (Producto producto : productos) {
        if (producto.getNombre().equals(nombre)) {
            return producto;
        }
    }
    return null;
}

public static void mostrarInventario() {
    if (productos.isEmpty()) {
        System.out.println("El inventario está vacío.");
    } else {
        System.out.println("Inventario:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
}