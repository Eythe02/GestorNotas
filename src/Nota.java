public class Nota {

    private String titulo;
    private String contenido;

    public Nota(String titulo, String contenido){

        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getContenido(){
        return contenido;
    }

    public void setTitulo(String t){
        titulo = t;
    }

    public void setContenido(String c){
        contenido = c;
    }

    
    @Override
    public String toString() {
       return titulo;
   }

}