package Clinica;
//DEPENDENCIA DE CLASES O COLABORACION DE CLASES

public class Doctor {
    private String nombre;
    private String especialidad;
     private Paciente paciente;
    private int valorConsulta;

    public Doctor(String nombre, String especialidad, Paciente paciente, int valorConsulta) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.paciente = paciente;
        this.valorConsulta = valorConsulta;
    }

    public Doctor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public int getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(int valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public double imc2(){
        return paciente.getPesoKg()/Math.pow(paciente.getEstaturaCm()/100,2);
    }

    public int rebaja(){
        if (paciente.estadoPaciente().compareToIgnoreCase("Sobrepeso")==0)
            return (int) (valorConsulta * 0.3);
        if (paciente.estadoPaciente().compareToIgnoreCase("Obeso")==0)
            return (int) (valorConsulta*0.3);
        return 0;
    }

    public int totalAPagar(){

        return valorConsulta - rebaja();
    }
    // COMENTARIO PARA SUBIR COMMIT EN  GITHUB

}
