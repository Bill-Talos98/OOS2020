import javax.swing.JFrame;
               import javax.swing.JPanel;
               import javax.swing.JLabel;
               import javax.swing.JTextField;
               import javax.swing.JPasswordField;
               import javax.swing.JButton;
               import java.awt.event.*;
               import javax.swing.JOptionPane;

               public class Login implements ActionListener
               {
                    private static JLabel emailLabel;
                    private static JTextField firstText;
                    private static JLabel passwordLabel;
                    private static JPasswordField secondText;
                    private static JButton button;
                    private static JLabel success;
    
 
                    public static void main(String[] args)
                    {
                        JFrame frame = new JFrame ();
                        JPanel panel = new JPanel();
                        frame.setSize(350,200);
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.add(panel);
                        panel.setLayout(null);
                        emailLabel = new JLabel("Email");
                        emailLabel.setBounds(10, 20, 80, 25);
                        panel.add(emailLabel);
                        firstText = new JTextField(20);
                        firstText.setBounds(100, 20, 165, 25);
                        panel.add(firstText);
                        passwordLabel = new JLabel("Password");
                        passwordLabel.setBounds(10, 50, 80, 25);
                        panel.add(passwordLabel);
                        secondText = new JPasswordField(20);
                        secondText.setBounds(100, 50, 165, 25);
                        panel.add(secondText);
                        button = new JButton("Login");
                        button.setBounds(10, 80, 80, 25);
                        button.addActionListener(new Login());
                        panel.add(button);
                        success = new JLabel(" ");
                        success.setBounds(10, 110, 300, 25);
                        panel.add(success);
                        frame.setVisible(true);
                    }
  
                    public void actionPerformed(ActionEvent e)
                    {
                        String email= firstText.getText();
                        String password = secondText.getText();
                        System.out.println(email + ", " + password);
                            if(email.equals("John123@hotmail.com") && password.equals("1234"))
                            {
                                success.setText("Login   successful!");
                            }
                                else
                                    {
                                        success.setText("Wrong email or       password.Please try again!");
                                    }
                    }
                }
            