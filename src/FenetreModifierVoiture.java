import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Cette classe permet de crer une fenetre pour modifier les information sur une voiture
 */
public class FenetreModifierVoiture implements ActionListener {
    private Main main;
    private Voiture voiture;
    private JFrame fenetre=new JFrame();
    private JPanel panel=new JPanel();
    private JPanel panel11=new JPanel();
    private JPanel panel12=new JPanel();
    private JPanel panel21=new JPanel();
    private JPanel panel22=new JPanel();
    private JPanel panel31=new JPanel();
    private JPanel panel32=new JPanel();
    private JPanel panel41=new JPanel();
    private JPanel panel42=new JPanel();
    private JPanel panel51=new JPanel();
    private JPanel panel52=new JPanel();
    private JPanel panel61=new JPanel();
    private JPanel panel62=new JPanel();
    private JPanel panel71=new JPanel();
    private JPanel panel72=new JPanel();
    private JPanel panel81=new JPanel();
    private JPanel panel82=new JPanel();
    private JPanel panel91=new JPanel();
    private JPanel panel92=new JPanel();
    private JTextField fieldMarque = new JTextField();
    private JTextField fieldModele = new JTextField();
    private JTextField fieldVitesseMax = new JTextField();
    private JTextField fieldPrixLocationJour = new JTextField();
    private JTextField fieldEtat = new JTextField();
    private JTextField fieldKm = new JTextField();
    private JTextField fieldNbPlace = new JTextField();
    private JTextField fieldPuissance = new JTextField();
    private JButton boutonModifier = new JButton("Modifier");
    private JButton boutonAnnuler = new JButton("Annuler");

    public FenetreModifierVoiture(Main main,Voiture voiture) {
        this.main=main;
        this.voiture=voiture;
        fenetre.setTitle("Ajout voiture");
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
        fenetre.setContentPane(panel);
        panel.setLayout(new GridLayout(9,2));
        panel.add(panel11);
        panel.add(panel12);
        panel.add(panel21);
        panel.add(panel22);
        panel.add(panel31);
        panel.add(panel32);
        panel.add(panel41);
        panel.add(panel42);
        panel.add(panel51);
        panel.add(panel52);
        panel.add(panel61);
        panel.add(panel62);
        panel.add(panel71);
        panel.add(panel72);
        panel.add(panel81);
        panel.add(panel82);
        panel.add(panel91);
        panel.add(panel92);
        panel11.add(new Label("Marque :"));
        panel12.add(fieldMarque);
        panel21.add(new Label("Modele :"));
        panel22.add(fieldModele);
        panel31.add(new Label("Vitesse Maximale :"));
        panel32.add(fieldVitesseMax);
        panel41.add(new Label("Prix de location par jour de base :"));
        panel42.add(fieldPrixLocationJour);
        panel51.add(new Label("État :"));
        panel52.add(fieldEtat);
        panel61.add(new Label("Nombre de kilomètres :"));
        panel62.add(fieldKm);
        panel71.add(new Label("Nombre de places :"));
        panel72.add(fieldNbPlace);
        panel81.add(new Label("Puissance :"));
        panel82.add(fieldPuissance);
        fieldEtat.setText(voiture.getEtat());
        fieldKm.setText(voiture.getKm());
        fieldMarque.setText(voiture.getMarque());
        fieldModele.setText(voiture.getModele());
        fieldNbPlace.setText(voiture.getNbPlace());
        fieldPrixLocationJour.setText(voiture.getPrixLocationJour());
        fieldPuissance.setText(voiture.getPuissance());
        fieldVitesseMax.setText(voiture.getVitesseMax());
        panel91.add(boutonModifier);
        panel92.add(boutonAnnuler);
        fieldEtat.setColumns(15);
        fieldMarque.setColumns(15);
        fieldModele.setColumns(15);
        fieldVitesseMax.setColumns(15);
        fieldPrixLocationJour.setColumns(15);
        fieldKm.setColumns(15);
        fieldNbPlace.setColumns(15);
        fieldPuissance.setColumns(15);
        boutonModifier.addActionListener(this);
        boutonAnnuler.addActionListener(this);

        fenetre.pack();
        Dimension windowSize = fenetre.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fenetre.setLocation(screenSize.width/2-windowSize.width/2,screenSize.height/2-windowSize.height/2);
    }

    /**
     * Permet d'utiliser les different boutons
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton recup = (JButton) e.getSource();
        if (recup==boutonModifier)
        {
            voiture.setNbPlace(fieldNbPlace.getText());
            voiture.setEtat(fieldEtat.getText());
            voiture.setKm(fieldKm.getText());
            voiture.setMarque(fieldMarque.getText());
            voiture.setModele(fieldModele.getText());
            voiture.setPrixLocationJour(fieldPrixLocationJour.getText());
            voiture.setPuissance(fieldPuissance.getText());
            voiture.setVitesseMax(fieldVitesseMax.getText());
            if (main.fenetreConsulterVoiture!=null)
            {
                main.fenetreConsulterVoiture.fenetre.dispose();
            }
            main.fenetreConsulterVoiture = new FenetreConsulterVoiture(main);
            fenetre.dispose();
        }
        else if (recup==boutonAnnuler)
        {
            fenetre.dispose();
        }
    }
}
