package main.primera_evaluacion.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Carrito {

    private List<ItemCarrito> items;
    private Cupon cupon;
    private Cliente cliente;

    public Carrito(){

    }

    public Carrito(Cliente cliente){
        this.cliente = cliente;
        this.items = new ArrayList<>();
    }

    public List<ItemCarrito> getItems() {
        return items;
    }

    public void setItems(List<ItemCarrito> items) {
        this.items = items;
    }

    public Cupon getCupon() {
        return cupon;
    }

    public void setCupon(Cupon cupon) {
        this.cupon = cupon;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto producto, int cantidad){
        ItemCarrito nuevoItem = new ItemCarrito.Builder().producto(producto).cantidad(cantidad).build();
        for(ItemCarrito item : items) {
            if (item.getProducto().equals(producto)) {
                item.setCantidad(item.getCantidad() + cantidad);
            }
        }
        items.add(nuevoItem);
    }

    void quitarProducto(int idProducto){
        Producto buscado = new Producto();
        for(ItemCarrito item : items){
            if(item.getProducto().getId() == idProducto){
                if(item.getCantidad() > 1){
                    item.setCantidad(item.getCantidad() - 1);
                }else {
                    items.remove(item);
                }
            }
        }
    }

    public double calcularSubtotal(){
        return items.stream()
                .mapToDouble(ItemCarrito::calcularSubtotal)
                .sum();
    }

    public void aplicarCupon(Cupon cupon){
        this.cupon = cupon;
    }

    private double obtenerPorentajeDeDescuentoFinal(){
        if (cupon != null) return cupon.getPorcentajeDescuento();
        double subotal = calcularSubtotal();
        if (subotal > 10000) return 10.0;
        if ( subotal > 5000) return 5.0;
        return 0.0;
    }

    public double calcularTotalConDescuento(){
        double subtotal = calcularSubtotal();
        double descuento = obtenerPorentajeDeDescuentoFinal();
        return subtotal * (1 - descuento / 100);
    }

    public List<ItemCarrito> obtenerItemsPorCategoria(String categoria){
        return items.stream().filter(item -> item.getProducto().getCategoria().equalsIgnoreCase(categoria))
                .collect(Collectors.toList());
    }

    public int obtenerCantidadTotalProductos(){
        return items.stream()
                .mapToInt(ItemCarrito::getCantidad)
                .sum();
    }

    public double obtenerPromedioDePrecioDeProducto(){
        return items.stream()
                .mapToDouble(item-> item.getProducto().getPrecio())
                .average()
                .orElse(0.0);
    }

    public void mostrarResumen(){
        System.out.println(" Resumen de tu carrito ");
        for (ItemCarrito item : items){
            System.out.println(item);
        }

        System.out.println("Subtotal: $" + calcularSubtotal());
        System.out.println("Descuento aplicado: %" + obtenerPorentajeDeDescuentoFinal());
        System.out.println("Total con descuento: $" + calcularTotalConDescuento());
        System.out.println("Cantidad total de productos: " + obtenerCantidadTotalProductos());
        System.out.println("Promedio de precios: $" + obtenerPromedioDePrecioDeProducto());

    }

    public List<Producto> obtenerProductosOrdenadosPorPrecio(){
        return items.stream()
                .map(ItemCarrito::getProducto)
                .sorted()
                .collect(Collectors.toList());
    }







}
