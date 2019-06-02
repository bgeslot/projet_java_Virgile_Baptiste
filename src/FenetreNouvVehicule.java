import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.JarURLConnection;

public class FenetreNouvVehicule implements ActionListener {
    Main main;
    JFrame fenetre=new JFrame();
    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JButton boutonVoiture = new JButton("Voiture");
    JButton boutonMoto = new JButton("Moto");
    JButton boutonAvion = new JButton("Avion");
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
