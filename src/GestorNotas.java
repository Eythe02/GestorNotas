
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class GestorNotas extends JFrame {

    JTextField tituloField;
    JTextArea contenidoArea;

    DefaultListModel<Nota> modelo;
    JList<Nota> lista;

    ArrayList<Nota> notas;

    String usuario;

    public GestorNotas(String usuario) {

        this.usuario = usuario;

        notas = ArchivoUtil.cargarNotas(usuario);

        setTitle("Notas de " + usuario);
        setSize(600,400);
        setLayout(new BorderLayout());

        tituloField = new JTextField();
        contenidoArea = new JTextArea();

        modelo = new DefaultListModel<>();
        lista = new JList<>(modelo);

        for (Nota n : notas) {
            modelo.addElement(n);
        }
        JButton crear = new JButton("Crear");
        JButton editar = new JButton("Editar");
        JButton eliminar = new JButton("Eliminar");
        JButton guardar = new JButton("Guardar");

        JPanel panel = new JPanel();

        panel.add(crear);
        panel.add(editar);
        panel.add(eliminar);
        panel.add(guardar);

        add(panel, BorderLayout.SOUTH);
        add(tituloField, BorderLayout.NORTH);
        add(new JScrollPane(contenidoArea), BorderLayout.CENTER);
        add(new JScrollPane(lista), BorderLayout.WEST);

        setVisible(true);
    }
}

