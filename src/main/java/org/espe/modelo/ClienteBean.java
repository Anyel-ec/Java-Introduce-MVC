package org.espe.modelo;

public class ClienteBean {
    //Atributos
    private int idCli;
    private String nombreCli;
    private String apellidoCli;
    private String cedulaCli;
    //Constructor
    public ClienteBean() {
    }

    //Getters y Setters
    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getNombreCli() {
        return nombreCli;
    }

    public void setNombreCli(String nombreCli) {
        this.nombreCli = nombreCli;
    }

    public String getApellidoCli() {
        return apellidoCli;
    }

    public void setApellidoCli(String apellidoCli) {
        this.apellidoCli = apellidoCli;
    }

    public String getCedulaCli() {
        return cedulaCli;
    }

    public void setCedulaCli(String cedulaCli) {
        this.cedulaCli = cedulaCli;
    }

    //toString
    @Override
    public String toString() {
        return "ClienteBean{" +
                "idCli=" + idCli +
                ", nombreCli='" + nombreCli + '\'' +
                ", apellidoCli='" + apellidoCli + '\'' +
                ", cedulaCli='" + cedulaCli + '\'' +
                '}';
    }
}
