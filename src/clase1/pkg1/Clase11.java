/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase1.pkg1;

/**
 *
 * @author estuam
 */
public class Clase11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Santiago", 50000);

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo: " + cuenta.getSaldo());
    
    
    cuenta.consignar(20000);
        System.out.println("Saldo final: " + cuenta.getSaldo());
    
    // Retiro válido
    cuenta.retirar(20000);

    // Retiro mayor al saldo
    cuenta.retirar(100000);
    
    // Segunda cuenta
    CuentaBancaria cuenta2 = new CuentaBancaria("Carlos", 100000);

    // Operación sobre la primera cuenta
    cuenta.consignar(20000);

    // Mostrar saldos
    System.out.println("Saldo cuenta 1: " + cuenta.getSaldo());
    System.out.println("Saldo cuenta 2: " + cuenta2.getSaldo());
    }
    }
