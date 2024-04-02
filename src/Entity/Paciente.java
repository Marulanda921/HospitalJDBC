package Entity;

import java.time.LocalDate;

public class Paciente {
    private int idPaciente;
    private String nombre;
    private String apellido;
    private LocalDate date;
    private String documentoIdentidad;

    public Paciente(int idPaciente) {
    }

    public Paciente(int idPaciente, String nombre, String apellido, LocalDate date, String documentoIdentidad) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.date = date;
        this.documentoIdentidad = documentoIdentidad;
    }

    public Paciente() {

    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    @Override
    public String toString() {
        return "Paciente: " +
                "idPaciente=" + idPaciente +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", date=" + date +
                ", documentoIdentidad='" + documentoIdentidad + '\'';
    }
}

