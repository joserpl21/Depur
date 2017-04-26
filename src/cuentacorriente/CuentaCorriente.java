package cuentacorriente;

/**
 *
 * @author JHOSEP JOEL MENDOZA LAZO
 */
public class CuentaCorriente {

    // Condiciones de las variables de entrada
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /* Constructor sin argumentos */
    public CuentaCorriente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    // Constructor con parámetro para iniciar todas las propiedades de la clase
    public CuentaCorriente(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    // Método para asignar el nombre del titular de la cuenta

    public void asignarNombre(String nom) {
        nombre = nom;
    }

    // Método que me devuelve el nombre del titular
    public String obtenerNombre() {
        return nombre;
    }

    // Método que me devuelve el saldo disponible en cada momento
    public double estado() {
        return saldo;
    }

    /* Método para ingresar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    public void ingresarYretirar(double cantidadIngreso, double cantidadRetiro) throws Exception {
        if (cantidadIngreso < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidadIngreso;
        if (cantidadRetiro < 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidadRetiro) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo = saldo - cantidadRetiro;
    }

    /* Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
//    public void retirar (double cantidad) throws Exception
//    {
//        if (cantidad < 0)
//            throw new Exception ("No se puede retirar una cantidad negativa");
//        if (estado()< cantidad)
//            throw new Exception ("No hay suficiente saldo");
//        saldo = saldo - cantidad;
//    }
    // Método que me devuelve el número de cuenta
    public String obtenerCuenta() {
        return cuenta;
    }
}
