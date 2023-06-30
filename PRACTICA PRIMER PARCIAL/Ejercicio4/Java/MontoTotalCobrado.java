public class MontoTotalCobrado {
    public static double calcularMontoTotal(double[] precios) {
        double montoTotal = 0;
        
        for (double precio : precios) {
            double descuento;
            
            if (precio > 300) {
                descuento = 0.2;
            } else if (precio > 200) {
                descuento = 0.15;
            } else if (precio > 100) {
                descuento = 0.07;
            } else {
                descuento = 0;
            }
            
            double montoDescuento = precio * descuento;
            double montoCobrado = precio - montoDescuento;
            montoTotal += montoCobrado;
        }
        
        return montoTotal;
    }
    
    public static void main(String[] args) {
        double[] precios = {350, 250, 120};
        double montoTotalCobrado = calcularMontoTotal(precios);
        System.out.println("El monto total cobrado es: " + montoTotalCobrado + " Bs.");
    }
}
