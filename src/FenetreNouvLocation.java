import javax.swing.*;
import java.awt.*;

public class FenetreNouvLocation {
    private Main main;
    private JFrame fenetre = new JFrame();
    private JPanel panel = new JPanel();
    private JComboBox jComboBox;
    private JTextField fieldDateDebut=new JTextField();
    private JTextField fieldDateFin=new JTextField();
    private JTextField fieldKmPrevi=new JTextField();
    private JTextField fieldPrixPrevi=new JTextField();
    private JCheckBox reduction=new JCheckBox();
    private JPanel panel1=new JPanel();
    private JPanel panel2=new JPanel();
    private JPanel panel3=new JPanel();
    private JPanel panel4=new JPanel();
    private JPanel panel5=new JPanel();
    private JPanel panel6=new JPanel();
    private JPanel panel7=new JPanel();
    private JPanel panel8=new JPanel();

    String[] clients={"Client 0","Client 1","Client 2","Client 3","Client 4","Client 5","Client 6"};

    public FenetreNouvLocation(Main m) {
        main = m;
        fenetre.setTitle("Nouvelle location");
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
        fenetre.setContentPane(panel);
        jComboBox = new JComboBox(clients);
        panel.add(jComboBox);
        panel.add(reduction);
        panel.setLayout(new GridLayout(8,1));


        fenetre.pack();
    }
}
