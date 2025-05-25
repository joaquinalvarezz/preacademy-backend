package main.primera_evaluacion.model;

public class ItemCarrito {

    private Producto producto;
    private int cantidad;

    public ItemCarrito() {
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularSubtotal(){
        return cantidad != 0 ? producto.getPrecio()*cantidad : 0;
    }

    public static class Builder{

        private final ItemCarrito item;

        public Builder(){
            item = new ItemCarrito();
        }

        public Builder producto(Producto producto){
            item.setProducto(producto);
            return this;
        }

        public Builder cantidad(int cantidad){
            item.setCantidad(cantidad);
            return this;
        }

        public ItemCarrito build(){
            return item;
        }


    }

    @Override
    public String toString() {
        return "ItemCarrito{" +
                "producto= " + producto +
                ", cantidad= " + cantidad +
                ", subtotal= " + calcularSubtotal() +
                '}';
    }
}
