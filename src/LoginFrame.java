import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {
    Container container = getContentPane();
    JLabel userLabel = new JLabel("Username: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JTextField userTextField = new JTextField();
    JPasswordField passField = new JPasswordField();
    JButton loginButton = new JButton("Login");
    JButton cancelButton = new JButton("Cancel");

    LoginFrame(){
        setLayoutManager();
        setLocationAndSize();
        addComponents();
        addAction();
    }

    public void setLayoutManager(){
        container.setLayout(null);
    }

    public void setLocationAndSize(){
        userLabel.setBounds(50, 30, 100, 30);
        passwordLabel.setBounds(50, 90, 100, 30);
        userTextField.setBounds(150, 30, 150, 30);
        passField.setBounds(150, 90, 150, 30);
        loginButton.setBounds(50, 170, 100, 30);
        cancelButton.setBounds(200, 170, 100, 30);
    }

    public void addComponents(){
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passField);
        container.add(loginButton);
        container.add(cancelButton);
    }

    public void addAction(){
        loginButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loginButton){
            String usernameText;
            String passText;
            usernameText = userTextField.getText();
            passText = passField.getText();
            if(usernameText.equals("admin") && passText.equalsIgnoreCase("12345")){
                JOptionPane.showMessageDialog(this, "Login Sucessfull");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
        }
    }
}
