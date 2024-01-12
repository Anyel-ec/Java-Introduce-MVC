package org.espe.controlador;
import org.espe.modelo.ClienteBean;
import org.espe.vista.ClienteVista;
public class ClienteControlador {
    // objetos vista y modelo
    private ClienteVista oVista;
    private ClienteBean oModelo;
    // constructo para incializar el modelo y la vista

    public ClienteControlador(ClienteVista oVista, ClienteBean oModelo) {
        this.oVista = oVista;
        this.oModelo = oModelo;
    }

    // pasar el modelo a la vista
    public void actualizarVista(){
        oVista.impimirDatosCliente(oModelo.getIdCli(), oModelo.getNombreCli(),
                oModelo.getApellidoCli(),oModelo.getCedulaCli());
    }
}
