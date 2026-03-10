
    import javax.swing.*;

public class Registro extends JFrame {

   public Registro(){
       setTitle("Registro");
       setSize(300,200);
       setLayout(null);
       setVisible(true);

        JTextField usuario;
        JPasswordField pass;

        JLabel l1 = new JLabel("Usuario");
        l1.setBounds(20,20,100,20);
        add(l1);

        usuario = new JTextField();
        usuario.setBounds(100,20,150,20);
        add(usuario);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(20,60,100,20);
        add(l2);

        pass = new JPasswordField();
        pass.setBounds(100,60,150,20);
        add(pass);


   }

   
}

