
    import javax.swing.*;

public class Login extends JFrame {
    JTextField usuarioField;
    JPasswordField passField;

    public Login(){
        setTitle("Login");
        setSize(300, 200);
        setLayout(null);

        JLabel l1 = new JLabel("Usuario");
        l1.setBounds(20,20,100,20);
        add(l1);

        usuarioField = new JTextField();
        usuarioField.setBounds(100,20,150,20);
        add(usuarioField);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(20,60,100,20);
        add(l2);

        passField = new JPasswordField();
        passField.setBounds(100,60,150,20);
        add(passField);

        JButton login = new JButton("Login");
        login.setBounds(100,100,80,30);
        add(login);

        JButton registro = new JButton("Registro");
        registro.setBounds(190,100,80,30);
        add(registro);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){
        new Login();
    }
}

