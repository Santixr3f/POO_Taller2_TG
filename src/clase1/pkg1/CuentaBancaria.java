/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase1.pkg1;

/**
 *
 * @author estuam
 */
public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void consignar(double monto) {
    saldo = saldo+monto;
    System.out.println("Nuevo saldo: " + saldo);
}
    public void retirar(double monto) {
        if (monto <= saldo) {
        saldo -= monto;
        System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
    } else {
        System.out.println("Fondos insuficientes");
    }
}
}
