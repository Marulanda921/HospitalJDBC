package Entity;

public class Medico extends Especialidad {
    private int idMedico;
    private String nombre;
    private String apellido;


    public Medico() {
    }


    public Medico(int idEspecialidad, int idMedico, String nombre, String apellido, int idEspecialidad1) {
        super(idEspecialidad);
        this.idMedico = idMedico;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
