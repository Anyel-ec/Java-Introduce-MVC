package org.espe.prueba;

import org.espe.modelo.ClienteBean;
import org.espe.vista.ClienteVista;
import org.espe.controlador.ClienteControlador;

public class Demo {
    public static void main(String[] args) {
        // Objeto vista y modelo para el primer cliente
        ClienteBean primerCliente = llenarDatosCliente(1, "Angel",
                "Patiño", "22222222222");
        ClienteVista oVista = new ClienteVista();
        ClienteControlador oControlador = new ClienteControlador(oVista, primerCliente);

        // Actualizar vista con los datos del primer cliente
        oControlador.actualizarVista();

        // Crear un arreglo con los datos de dos clientes adicionales
        ClienteBean[] clientes = new ClienteBean[2];
        clientes[0] = llenarDatosCliente(2, "Eva",
                "Gomez", "33333333333");
        clientes[1] = llenarDatosCliente(3, "Juan",
                "Lopez", "44444444444");

        // Actualizar la vista con los datos de los dos clientes adicionales
        for (ClienteBean cliente : clientes) {
            oControlador = new ClienteControlador(oVista, cliente);
            oControlador.actualizarVista();
        }
    }

    // Método para llenar los datos de un cliente
    private static ClienteBean llenarDatosCliente(int id, String nombre, String apellido, String cedula) {
        ClienteBean cliente = new ClienteBean();
        cliente.setIdCli(id);
        cliente.setNombreCli(nombre);
        cliente.setApellidoCli(apellido);
        cliente.setCedulaCli(cedula);
        return cliente;
    }
}
