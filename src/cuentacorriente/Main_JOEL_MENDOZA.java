package cuentacorriente;

/**
 *
 * @author JOEL MENDOZA LAZO
 */
public class Main_JOEL_MENDOZA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente miCuenta;
        double saldoActual;

        miCuenta = new CuentaCorriente("Mariano Martinez", "1001-5632-58-234567891", 2500, 0);
        try {
            miCuenta.ingresarYretirar(-50, -50);
            System.out.println("Ingreso en cuenta");
      
        } catch (Exception e) {
            System.err.println(e.getMessage()+e.getMessage());
            System.out.println("Fallo al retirar");
        }
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es " + saldoActual);
    }

}
