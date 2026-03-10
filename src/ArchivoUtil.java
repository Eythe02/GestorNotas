import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

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
}
