package main.primera_evaluacion.model;

public class Cliente extends Usuario{

    private String nombreCompleto;

    public Cliente() {
    }

    public Cliente(Integer id, String nombreUsuario, String contrasenia, String nombreCompeto) {
        super(id, nombreUsuario, contrasenia);
        this.nombreCompleto = nombreCompeto;
    }

    public String getNombreCompeto() {
        return nombreCompleto;
    }

    public void setNombreCompeto(String nombreCompeto) {
        this.nombreCompleto = nombreCompeto;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + getId() +
                "nombre de usuario='" + getNombreUsuario() + '\'' +
                "nombre completo='" + nombreCompleto + '\'' +
                '}';
    }
}
