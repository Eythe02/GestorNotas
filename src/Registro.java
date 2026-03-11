import javax.swing.*;

public class Registro extends JFrame {

   JTextField usuario;
   JPasswordField pass;

   public Registro(){

       setTitle("Registro");
       setSize(300,200);
       setLayout(null);

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

       JButton registrar = new JButton("Registrar");
       registrar.setBounds(100,100,100,30);
       add(registrar);

       registrar.addActionListener(e -> {

        String user = usuario.getText();
        String password = new String(pass.getPassword());

        String hash = HashUtil.hash(password);

        ArchivoUtil.guardarUsuario(user, hash);

        JOptionPane.showMessageDialog(null,"Usuario registrado");

        dispose();

});

       setVisible(true);
   }
}



