import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class ArchivoUtil {
    public static void guardarUsuario(String usuario, String hash){
    try{
        FileWriter fw = new FileWriter("usuarios.txt", true);
        fw.write(usuario + ";" + hash + "\n");
        fw.close();
    }catch(Exception e){}
}

public static boolean comprobarUsuario(String usuario, String hash){
    try{
        BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"));

        String linea;

        while((linea = br.readLine()) != null){
            String[] partes = linea.split(";");

            if(partes[0].equals(usuario) && partes[1].equals(hash)){
                br.close();
                return true;
            }
        }

        br.close();

    }catch(Exception e){}

    return false;
}

public static void guardarNotas(String usuario, ArrayList<Nota> notas){

    try {
        FileWriter fw = new FileWriter(usuario + "_notas.txt");

        for(Nota n : notas){
            
            fw.write(n.getTitulo() + "|" + n.getContenido() + "\n");
        }

        fw.close();
    } catch (Exception e) {}
}

public static ArrayList<Nota> cargarNotas(String usuario){

    ArrayList<Nota> lista = new ArrayList<>();

    try {
        
        BufferedReader br = new BufferedReader(new FileReader(usuario + "_notas.txt"));

        String linea;

        while((linea = br.readLine()) != null){

            String[] partes = linea.split("\\|");

            lista.add(new Nota(partes[0], partes[1]));
        }

        br.close();

    } catch(Exception e) {}

    return lista;
}
}
