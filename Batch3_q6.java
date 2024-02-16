/* Design a AWT window(TextField,Label ,Button) that handles a 'Login' screen with user and password fields.Incorporate non empty check for the fields , also show for both incorrect and current login */

import java.awt.*;
import java.awt.event.*;

public class Batch3_q6 extends Frame implements ActionListener {
  private TextField userField, passwordField;
  private Label resultLabel;

  public Batch3_q6() {
    setTitle("Login Screen");
    setSize(300, 200);
    setLayout(new FlowLayout());

    Label userLabel = new Label("Username:");
    userField = new TextField(20);
    Label passwordLabel = new Label("Password:");
    passwordField = new TextField(20);
    passwordField.setEchoChar('*'); // To hide the password characters
    Button loginButton = new Button("Login");

    resultLabel = new Label("");

    add(userLabel);
    add(userField);
    add(passwordLabel);
    add(passwordField);
    add(loginButton);
    add(resultLabel);

    loginButton.addActionListener(this);

    // Handle window close event
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });

    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    String username = userField.getText();
    String password = passwordField.getText();

    if (username.isEmpty() || password.isEmpty()) {
      resultLabel.setText("Both username and password are required.");
    } else if (username.equals("admin") && password.equals("password")) {
      resultLabel.setText("Login successful!");
    } else {
      resultLabel.setText("Incorrect username or password. Try again.");
    }
  }

  public static void main(String[] args) {
    new Batch3_q6();
  }
}
