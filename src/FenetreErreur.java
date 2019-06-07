import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Cette classe permet de crer les fenetre d'erreur
 */
public class FenetreErreur implements ActionListener {

    public JFrame fenetre = new JFrame();
    private JPanel panel = new JPanel();
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JLabel message = new JLabel();
    private JButton boutonOk = new JButton("OK");


    public FenetreErreur(String messageError) {
        fenetre.setTitle("Erreur");
        fenetre.setVisible(true);
        fenetre.setContentPane(panel);
        this.message.setText(messageError);
        panel.setLayout(new GridLayout(2,1));
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER,40,8));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER,40,8));
        panel.add(panel1);
        panel.add(panel2);
        panel1.add(message);
        panel2.add(boutonOk);
        boutonOk.addActionListener(this);
        fenetre.pack();
        Dimension windowSize = fenetre.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fenetre.setLocation(screenSize.width/2-windowSize.width/2,screenSize.height/2-windowSize.height/2);
    }

    /**
     * permet grace a un bouton de fermer une fenetre d'erreur
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        fenetre.dispose();
    }
}