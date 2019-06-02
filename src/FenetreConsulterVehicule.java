import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreConsulterVehicule implements ActionListener {
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
    public FenetreConsulterVehicule(Main m)
    {
        main=m;
        fenetre.setTitle("Consulter véhicules");
        fenetre.setContentPane(panel);
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
        panel.setLayout(new GridLayout(4,1));
        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        panel.add(panel4);
        panel1.add(new Label("Vous voulez voir la liste des..."));
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
            new FenetreConsulterAvion(main);
            fenetre.dispose();
        }
        else if (recup == boutonMoto)
        {
            new FenetreConsulterMoto(main);
            fenetre.dispose();
        }
        else if (recup == boutonVoiture)
        {
            new FenetreConsulterVoiture(main);
            fenetre.dispose();
        }
    }
}
