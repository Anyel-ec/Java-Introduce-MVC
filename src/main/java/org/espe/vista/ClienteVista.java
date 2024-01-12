package org.espe.vista;

public class ClienteVista {
    public void impimirDatosCliente(int id, String nombreCli,
                                    String apellidoCli, String cedula){
        System.out.println("Datos del cliente: ");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombreCli);
        System.out.println("Apellido: " + apellidoCli);
        System.out.println("Cedula: " + cedula);
    }
}
