public class Usuario {
    
    private String nombre;
    private String passwordHash;

    public Usuario(String nombre, String passwordHash){

        this.nombre = nombre;
        this.passwordHash = passwordHash;
    }
}
