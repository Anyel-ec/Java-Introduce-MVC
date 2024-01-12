package org.espe.prueba;

import org.espe.modelo.ClienteBean;
import org.espe.vista.ClienteVista;
import org.espe.controlador.ClienteControlador;
public class Demo {
    public static void main(String[] args) {
        // objeto vista y modelo
        ClienteBean oModelo = llenarDatosCliente();
        ClienteVista oVista = new ClienteVista();

        // objeto controlador y pasamos la vista y el modleo
        ClienteControlador oControlador = new ClienteControlador(oVista, oModelo);
        oControlador.actualizarVista();

    }
    // se muestra los datos del cliente
    private static ClienteBean llenarDatosCliente() {
        ClienteBean cliente = new ClienteBean();
        cliente.setIdCli(1);
        cliente.setNombreCli("Angel");
        cliente.setApellidoCli("Patiño");
        cliente.setCedulaCli("22222222222");
        return cliente;
    }
}
