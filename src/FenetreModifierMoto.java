import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Cette classe permet de crer une fenetre pour modifier les information sur une moto
 */
public class FenetreModifierMoto implements ActionListener {
    private Main main;
    private Moto moto;
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
    private JTextField fieldMarque = new JTextField();
    private JTextField fieldModele = new JTextField();
    private JTextField fieldvitesseMax = new JTextField();
    private JTextField fieldPrixLocationJour = new JTextField();
    private JTextField fieldEtat = new JTextField();
    private JTextField fieldKm = new JTextField();
    private JTextField fieldPuissance = new JTextField();
    private JButton boutonModifier = new JButton("Modifier");
    private JButton boutonAnnuler = new JButton("Annuler");

    public FenetreModifierMoto(Main main, Moto moto) {
        this.main=main;
        this.moto=moto;
        fenetre.setTitle("Ajout moto");
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
        fenetre.setContentPane(panel);
        panel.setLayout(new GridLayout(8,2));
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
        panel11.add(new Label("Marque :"));
        panel12.add(fieldMarque);
        panel21.add(new Label("Modele :"));
        panel22.add(fieldModele);
        panel31.add(new Label("Vitesse Maximale :"));
        panel32.add(fieldvitesseMax);
        panel41.add(new Label("Prix de location par jour de base :"));
        panel42.add(fieldPrixLocationJour);
        panel51.add(new Label("État :"));
        panel52.add(fieldEtat);
        panel61.add(new Label("Nombre de kilomètres :"));
        panel62.add(fieldKm);
        panel71.add(new Label("Puissance :"));
        panel72.add(fieldPuissance);
        fieldPrixLocationJour.setText(moto.getPrixLocationJour());
        fieldvitesseMax.setText(moto.getVitesseMax());
        fieldModele.setText(moto.getModele());
        fieldMarque.setText(moto.getMarque());
        fieldEtat.setText(moto.getEtat());
        fieldKm.setText(moto.getKm());
        fieldPuissance.setText(moto.getPuissance());
        panel81.add(boutonModifier);
        panel82.add(boutonAnnuler);
        fieldEtat.setColumns(15);
        fieldMarque.setColumns(15);
        fieldModele.setColumns(15);
        fieldvitesseMax.setColumns(15);
        fieldPuissance.setColumns(15);
        fieldKm.setColumns(15);
        fieldPrixLocationJour.setColumns(15);
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
            moto.setEtat(fieldEtat.getText());
            moto.setKm(fieldKm.getText());
            moto.setMarque(fieldMarque.getText());
            moto.setModele(fieldModele.getText());
            moto.setPrixLocationJour(fieldPrixLocationJour.getText());
            moto.setPuissance(fieldPuissance.getText());
            moto.setVitesseMax(fieldvitesseMax.getText());
            if (main.fenetreConsulterMoto!=null)
            {
                main.fenetreConsulterMoto.fenetre.dispose();
            }
            main.fenetreConsulterMoto = new FenetreConsulterMoto(main);
            fenetre.dispose();
        }
        else if (recup==boutonAnnuler)
        {
            fenetre.dispose();
        }
    }
}
