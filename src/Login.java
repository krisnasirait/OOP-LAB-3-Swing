import javax.swing.*;


public class Login {
    public static void main(String[] args) {
        LoginFrame frame = new LoginFrame();
        frame.setTitle("Login");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}
