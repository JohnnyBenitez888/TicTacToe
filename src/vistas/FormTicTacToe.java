package vistas;

import java.awt.Color;
import modelo.Jugador;

public class FormTicTacToe extends javax.swing.JFrame {

    private Jugador jugador1;
    private Jugador jugador2;

    public FormTicTacToe(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        init();
    }

    private void init() {
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        lblNombreJ1.setText(jugador1.getNombre());//Setear el label con el nombre del jugador1
        lblNombreJ2.setText(jugador2.getNombre());//Setear el label con el nombre del jugador2
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        lblCierre = new javax.swing.JLabel();
        imagen1 = new modelo.Imagen();
        imagen2 = new modelo.Imagen();
        lblNombreJ2 = new javax.swing.JLabel();
        lblNombreJ1 = new javax.swing.JLabel();
        lblPuntajeJ2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPuntajeJ1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setBackground(new java.awt.Color(14, 19, 43));
        PanelFondo.setPreferredSize(new java.awt.Dimension(400, 500));
        PanelFondo.setLayout(null);

        lblCierre.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(240, 192, 255));
        lblCierre.setText("X");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt);
            }
        });
        PanelFondo.add(lblCierre);
        lblCierre.setBounds(370, 10, 20, 25);

        imagen1.setText("imagen1");
        imagen1.setRuta("/resourses/JugadorCirculo.png");
        PanelFondo.add(imagen1);
        imagen1.setBounds(275, 50, 50, 50);

        imagen2.setText("imagen1");
        imagen2.setRuta("/resourses/JugadorEquis.png");
        PanelFondo.add(imagen2);
        imagen2.setBounds(75, 50, 50, 50);

        lblNombreJ2.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        lblNombreJ2.setForeground(new java.awt.Color(255, 200, 255));
        lblNombreJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreJ2.setText("NAME");
        PanelFondo.add(lblNombreJ2);
        lblNombreJ2.setBounds(255, 100, 90, 30);

        lblNombreJ1.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        lblNombreJ1.setForeground(new java.awt.Color(180, 232, 255));
        lblNombreJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreJ1.setText("NAME");
        PanelFondo.add(lblNombreJ1);
        lblNombreJ1.setBounds(55, 100, 90, 30);

        lblPuntajeJ2.setFont(new java.awt.Font("MS PGothic", 1, 36)); // NOI18N
        lblPuntajeJ2.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntajeJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeJ2.setText("0");
        PanelFondo.add(lblPuntajeJ2);
        lblPuntajeJ2.setBounds(210, 50, 60, 60);

        jLabel2.setFont(new java.awt.Font("MS PGothic", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("-");
        PanelFondo.add(jLabel2);
        jLabel2.setBounds(190, 50, 20, 60);

        lblPuntajeJ1.setFont(new java.awt.Font("MS PGothic", 1, 36)); // NOI18N
        lblPuntajeJ1.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntajeJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeJ1.setText("0");
        PanelFondo.add(lblPuntajeJ1);
        lblPuntajeJ1.setBounds(130, 50, 60, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //cerrar la app al cliquear la X
    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked

    //cambia de color rojo la X al pasar el mouse
    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.red);
    }//GEN-LAST:event_lblCierreMouseEntered

    //vuelve al color original la X al quitar el mouse
    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(240, 192, 255));
    }//GEN-LAST:event_lblCierreMouseExited

    //GETTER AND SETTER
    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFondo;
    private modelo.Imagen imagen1;
    private modelo.Imagen imagen2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblNombreJ1;
    private javax.swing.JLabel lblNombreJ2;
    private javax.swing.JLabel lblPuntajeJ1;
    private javax.swing.JLabel lblPuntajeJ2;
    // End of variables declaration//GEN-END:variables
}
