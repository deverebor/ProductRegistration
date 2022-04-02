import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
  private JTextField tfProductName;
  private JTextField tfProductPrice;
  private JButton btnOk;
  private JButton btnClear;
  private JLabel lbWelcome;
  private JPanel mainPanel;
  private JLabel lbEmpty;

  public MainFrame() {
    setContentPane(mainPanel);
    setTitle("Product Registration");
    setSize(450, 500);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);

    btnOk.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String productName = tfProductName.getText();
        String productPrice = tfProductPrice.getText();
        lbWelcome.setText(productName + " o produto foi cadastrado com sucesso!");
      }
    });

    btnClear.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        tfProductName.setText("");
        tfProductPrice.setText("");
        lbWelcome.setText("");
      }
    });
  }

  public static void main(String[] args) {
    MainFrame myFrame = new MainFrame();
  }
}
