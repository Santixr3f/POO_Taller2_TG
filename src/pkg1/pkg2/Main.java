/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.pkg2;

/**
 *
 * @author estuam
 */
public class Main {

    public static void main(String[] args) {

        Producto producto1 = new Producto("Laptop", 2500000, 10);
        Producto producto2 = new Producto("Mouse", 50000, 20);

        producto1.registrarVenta(3);
        producto1.reponer(5);

        producto2.registrarVenta(4);

        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
    }
}