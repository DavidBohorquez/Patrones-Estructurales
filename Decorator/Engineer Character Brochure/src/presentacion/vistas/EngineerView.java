package presentacion.vistas;

import java.awt.Canvas;
import javax.swing.JLabel;
import presentacion.controladores.EngineerController;
import presentacion.modelo.Game;

/**
 *
 * @author David Bohorquez
 */
public class EngineerView extends javax.swing.JFrame {

    private Game modelo;
    private EngineerController ctlEngineerController;

    public EngineerView(Game modelo) {
        this.modelo = modelo;

        initComponents();

        fix();
        asignarListeners();
    }

    public void fix() {
        setSize(800, 400);
        setLocationRelativeTo(null);

        getCtlEngineerController();

        lblCert.setVisible(false);
        lblStop.setVisible(false);
    }

    public void asignarListeners() {
        lblClose.addMouseListener(getCtlEngineerController());
        lblBack.addMouseListener(getCtlEngineerController());
        //lblBgEngWindow.addMouseListener(getCtlEngineerController());
        lblIngeniar.addMouseListener(getCtlEngineerController());
    }

    public EngineerController getCtlEngineerController() {
        if (ctlEngineerController == null) {
            ctlEngineerController = new EngineerController(this);
        }
        return ctlEngineerController;
    }

    public Game getModelo() {
        return modelo;
    }

    public JLabel getLblIngeniar() {
        return lblIngeniar;
    }

    public Canvas getLienzo() {
        return lienzo;
    }

    public JLabel getLblBack() {
        return lblBack;
    }

    public JLabel getLblClose() {
        return lblClose;
    }

    public JLabel getLblBgEngWindow() {
        return lblBgEngWindow;
    }

    public JLabel getLblEngr() {
        return lblEngr;
    }

    public JLabel getLblCert() {
        return lblCert;
    }

    public JLabel getLblStop() {
        return lblStop;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClose = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lienzo = new java.awt.Canvas();
        lblIngeniar = new javax.swing.JLabel();
        lblEngr = new javax.swing.JLabel();
        lblCert = new javax.swing.JLabel();
        lblStop = new javax.swing.JLabel();
        lblBgEngWindow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 400));
        setMinimumSize(new java.awt.Dimension(800, 400));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 400));
        setSize(new java.awt.Dimension(800, 400));
        getContentPane().setLayout(null);
        getContentPane().add(lblClose);
        lblClose.setBounds(760, 0, 30, 20);
        getContentPane().add(lblBack);
        lblBack.setBounds(730, 0, 30, 20);

        lienzo.setMaximumSize(new java.awt.Dimension(326, 261));
        lienzo.setName(""); // NOI18N
        lienzo.setPreferredSize(new java.awt.Dimension(326, 261));
        lienzo.setVisible(false);
        getContentPane().add(lienzo);
        lienzo.setBounds(60, 64, 326, 261);
        getContentPane().add(lblIngeniar);
        lblIngeniar.setBounds(530, 140, 100, 100);

        lblEngr.setText("jLabel1");
        lblEngr.setPreferredSize(new java.awt.Dimension(326, 261));
        getContentPane().add(lblEngr);
        lblEngr.setBounds(60, 64, 326, 261);

        lblCert.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        lblCert.setForeground(new java.awt.Color(255, 255, 255));
        lblCert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCert.setText("Certificación");
        getContentPane().add(lblCert);
        lblCert.setBounds(520, 290, 130, 40);

        lblStop.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        lblStop.setForeground(new java.awt.Color(255, 255, 255));
        lblStop.setText("Descansar");
        getContentPane().add(lblStop);
        lblStop.setBounds(530, 60, 97, 30);

        lblBgEngWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/images/background.jpg"))); // NOI18N
        getContentPane().add(lblBgEngWindow);
        lblBgEngWindow.setBounds(0, 0, 800, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBgEngWindow;
    private javax.swing.JLabel lblCert;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblEngr;
    private javax.swing.JLabel lblIngeniar;
    private javax.swing.JLabel lblStop;
    private java.awt.Canvas lienzo;
    // End of variables declaration//GEN-END:variables
}
