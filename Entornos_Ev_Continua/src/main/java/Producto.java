public class Producto {

    private String id;
    private String modelo;
    private String material;
    private String color;
    private double precio;

    public Producto(String idMueble, String modelo, String material, String color, double precio) {
        this.id = idMueble;
        this.modelo = modelo;
        this.material = material;
        this.color = color;
        this.precio = precio;
    }

    /**
     * Función para obtener el ID de un producto
     * @return - ID del producto
     */
    public String getId() {
        return id;
    }

    /**
     * Función para obtener el modelo del producto
     * @return - Modelo del producto
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Función para obtener el material del producto
     * @return - Material del producto
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Función para obtener el color de un producto
     * @return - Color producto
     */
    public String getColor() {
        return color;
    }

    /**
     * Función para obtener el precio de un producto
     * @return - Precio
     */

    public double getPrecio() {
        return precio;
    }

    /**
     * Función que me imprime el detalle de los productos que se encuentran
     * cargados en mi base.
     */

    public void verDetalle(){
        System.out.println("\n ID mueble: " + this.id + "\n Modelo: " + this.modelo + "\n Material: " + this.material +
                "\n Color: " + this.color + "\n Precio: " + this.precio);
    }
}
