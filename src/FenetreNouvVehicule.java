import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreNouvVehicule implements ActionListener {
    private Main main;
    private JFrame fenetre=new JFrame();
    private JPanel panel = new JPanel();
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    private JPanel panel4 = new JPanel();
    private JButton boutonVoiture = new JButton("Voiture");
    private JButton boutonMoto = new JButton("Moto");
    private JButton boutonAvion = new JButton("Avion");
    public FenetreNouvVehicule(Main m)
    {
        main=m;
        fenetre.setTitle("Ajouter véhicule");
        fenetre.setContentPane(panel);
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
        panel.setLayout(new GridLayout(4,1));
        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        panel.add(panel4);
        panel1.add(new Label("Vous voulez ajouter..."));
        panel2.add(boutonVoiture);
        panel3.add(boutonMoto);
        panel4.add(boutonAvion);
        boutonAvion.addActionListener(this);
        boutonMoto.addActionListener(this);
        boutonVoiture.addActionListener(this);
        fenetre.pack();
        Dimension windowSize = fenetre.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fenetre.setLocation(screenSize.width/2-windowSize.width/2,screenSize.height/2-windowSize.height/2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton recup = (JButton) e.getSource();
        if (recup == boutonAvion)
        {
            new FenetreNouvAvion(main);
            fenetre.dispose();
        }
        else if (recup == boutonMoto)
        {
            new FenetreNouvMoto(main);
            fenetre.dispose();
        }
        else if (recup == boutonVoiture)
        {
            new FenetreNouvVoiture(main);
            fenetre.dispose();
        }
    }
}
