
package tareaed6;

public class Tarea6EDClase {
    private static final double DESCUENTO_BAJO = 0.95;
    private static final double DESCUENTO_ALTO = 0.8;
    
    public void aplicarDescuento(double precioProducto, int numProductos){     
        double total;
        if(numProductos>3)
            precioProducto-=5;
                if (numProductos!=0){
                total = calculoDescuentoAlto(precioProducto);
                System.out.println("El total a pagar es:"+total);
                System.out.println("Enviado");
            }else {
                total = calculoDescuentoBajo(precioProducto);
                System.out.println("El total a pagar es:"+total);
                System.out.println("Enviado");
            }   

        }

    private double calculoDescuentoBajo(double precioProducto) {
        double total;
        total = precioProducto*DESCUENTO_BAJO;
        return total;
    }

    private double calculoDescuentoAlto(double precioProducto) {
        double total;
        total = precioProducto*DESCUENTO_ALTO;
        return total;
    }
    
}
