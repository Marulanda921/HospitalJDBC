package Entity;

import java.sql.Time;
import java.util.Date;

public class Cita extends Paciente{
    private static final int idPaciente = 0;
    private int idCita;

    private Date fechaCita;
    private Time horaCita;

    private String motivo;

    public Cita() {
        super(idPaciente);
    }
    

    public Cita(int idPaciente, int idCita, Date fechaCita, Time horaCita, String motivo) {
        super(idPaciente);
        this.idCita = idCita;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.motivo = motivo;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public Time getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(Time horaCita) {
        this.horaCita = horaCita;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
