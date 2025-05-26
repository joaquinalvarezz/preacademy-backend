package main.primera_evaluacion.service;

import main.primera_evaluacion.model.*;

import java.util.List;

public class CarritoService {
    public static void main(String[] args) {
        // Crear productos usando Builder
        Producto producto1 = new Producto.Builder()
                .id(1)
                .nombre("Ryzen 5 5600G")
                .precio(599)
                .categoria("Procesador")
                .build();

        Producto producto2 = new Producto.Builder()
                .id(2)
                .nombre("Mother Asrock B550")
                .precio(600)
                .categoria("Placa Madre")
                .build();

        Producto producto3 = new Producto.Builder()
                .id(3)
                .nombre("RX 7600")
                .precio(999)
                .categoria("Placa de Video")
                .build();

        // Crear cliente
        Cliente cliente = new Cliente(1, "usuario123", "claveSegura", "Juan Pérez");

        // Crear carrito
        Carrito carrito = new Carrito(cliente);

        // Agregar productos
        carrito.agregarProducto(producto1, 1);
        carrito.agregarProducto(producto2, 2);
        carrito.agregarProducto(producto3, 3);

        // Aplicar cupón
        //Cupon cupon = new Cupon();
        //cupon.setCodigo("HOTSALE25");
        //cupon.setPorcentajeDescuento(25);
        //carrito.aplicarCupon(cupon);

        // Calcular y mostrar resultados
        System.out.println("Subtotal: $" + carrito.calcularSubtotal());
        System.out.println("Total con descuento: $" + carrito.calcularTotalConDescuento());

        // Filtrar por categoría
        List<ItemCarrito> ropa = carrito.obtenerItemsPorCategoria("Ropa");
        System.out.println("\nProductos en categoría 'Ropa':");
        ropa.forEach(System.out::println);

        // Mostrar cantidad total y promedio
        System.out.println("\nCantidad total de productos: " + carrito.obtenerCantidadTotalProductos());
        System.out.println("Promedio de precio: $" + carrito.obtenerPromedioDePrecioDeProducto());

        // Mostrar resumen final
        System.out.println("\n--- RESUMEN DEL CARRITO ---");
        carrito.mostrarResumen();

        // Desafío: mostrar productos ordenados por precio
        System.out.println("\nProductos ordenados por precio:");
        carrito.obtenerProductosOrdenadosPorPrecio().forEach(System.out::println);
    }
}