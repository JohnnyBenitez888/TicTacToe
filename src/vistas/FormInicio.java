package vistas;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import modelo.Jugador;
import modelo.TipoImagen;

public class FormInicio extends javax.swing.JFrame {
    
    public FormInicio() {
        this.setUndecorated(true);//quita botones min, max y cerrar
        initComponents();
        init();
    }

    //metodo para iniciar algunos metodos de clases
    private void init() {
        this.setResizable(false);//desactiva el maximizar pantalla
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0,0,0,0));//hacer transparente las esquinas del PanelFondo
        PanelFondo.requestFocus(); //quita el cursor del medio de la app // sin focus
        PanelFondo.setOpaque(false);
        //Agregar borde al Boton iniciar
        Border borde = BorderFactory.createLineBorder(new Color(243, 211, 246), 2);
        PanelBoton.setBorder(borde);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtJugador2 = new javax.swing.JTextField();
        txtJugador1 = new javax.swing.JTextField();
        PanelBoton = new javax.swing.JPanel();
        lblIniciar = new javax.swing.JLabel();
        imagen1 = new modelo.Imagen();
        imagen2 = new modelo.Imagen();
        imagen3 = new modelo.Imagen();
        imagen4 = new modelo.Imagen();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setBackground(new java.awt.Color(14, 19, 49));
        PanelFondo.setPreferredSize(new java.awt.Dimension(416, 315));
        PanelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelFondoMousePressed(evt);
            }
        });
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
        lblCierre.setBounds(390, 10, 20, 25);

        jLabel1.setFont(new java.awt.Font("MS PGothic", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 251, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIK TAC TOE");
        PanelFondo.add(jLabel1);
        jLabel1.setBounds(0, 30, 420, 40);

        txtJugador2.setBackground(new java.awt.Color(249, 230, 254));
        txtJugador2.setFont(new java.awt.Font("MS PGothic", 1, 28)); // NOI18N
        txtJugador2.setForeground(new java.awt.Color(202, 105, 220));
        txtJugador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador2.setText("JUGADOR2");
        txtJugador2.setBorder(null);
        txtJugador2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtJugador2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJugador2FocusLost(evt);
            }
        });
        txtJugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtJugador2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtJugador2MouseExited(evt);
            }
        });
        txtJugador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJugador2KeyTyped(evt);
            }
        });
        PanelFondo.add(txtJugador2);
        txtJugador2.setBounds(100, 160, 230, 40);
        txtJugador2.getAccessibleContext().setAccessibleName("");

        txtJugador1.setBackground(new java.awt.Color(214, 252, 249));
        txtJugador1.setFont(new java.awt.Font("MS PGothic", 1, 28)); // NOI18N
        txtJugador1.setForeground(new java.awt.Color(101, 175, 245));
        txtJugador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador1.setText("JUGADOR1");
        txtJugador1.setBorder(null);
        txtJugador1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtJugador1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJugador1FocusLost(evt);
            }
        });
        txtJugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtJugador1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtJugador1MouseExited(evt);
            }
        });
        txtJugador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJugador1KeyTyped(evt);
            }
        });
        PanelFondo.add(txtJugador1);
        txtJugador1.setBounds(100, 100, 230, 40);

        PanelBoton.setBackground(new java.awt.Color(42, 22, 79));

        lblIniciar.setFont(new java.awt.Font("MS PGothic", 1, 20)); // NOI18N
        lblIniciar.setForeground(new java.awt.Color(241, 227, 252));
        lblIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciar.setText("INICIAR");
        lblIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIniciarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIniciarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonLayout = new javax.swing.GroupLayout(PanelBoton);
        PanelBoton.setLayout(PanelBotonLayout);
        PanelBotonLayout.setHorizontalGroup(
            PanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        PanelBotonLayout.setVerticalGroup(
            PanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        PanelFondo.add(PanelBoton);
        PanelBoton.setBounds(130, 230, 160, 50);

        imagen1.setText("imagen1");
        imagen1.setRuta("/resourses/Circulo.png");
        PanelFondo.add(imagen1);
        imagen1.setBounds(340, 160, 40, 40);

        imagen2.setText("imagen1");
        imagen2.setRuta("/resourses/JugadorEquis.png");
        PanelFondo.add(imagen2);
        imagen2.setBounds(40, 100, 40, 40);

        imagen3.setText("imagen1");
        imagen3.setRuta("/resourses/JugadorCirculo.png");
        PanelFondo.add(imagen3);
        imagen3.setBounds(40, 160, 40, 40);

        imagen4.setText("imagen1");
        imagen4.setRuta("/resourses/Equis.png");
        PanelFondo.add(imagen4);
        imagen4.setBounds(340, 100, 40, 40);

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

    //cambia de color los bordes al pasar el mouse
    private void txtJugador1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador1MouseEntered
        Border border = BorderFactory.createLineBorder(new Color(52, 136, 235), 2);
        txtJugador1.setBorder(border);
    }//GEN-LAST:event_txtJugador1MouseEntered

    //vuelve al borde original al quitar el mouse
    private void txtJugador1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador1MouseExited
        txtJugador1.setBorder(null);
    }//GEN-LAST:event_txtJugador1MouseExited

    //cambia de color los bordes al pasar el mouse
    private void txtJugador2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador2MouseEntered
        Border border = BorderFactory.createLineBorder(new Color(165, 40, 174), 2);
        txtJugador2.setBorder(border);
    }//GEN-LAST:event_txtJugador2MouseEntered

    //vuelve al borde original al quitar el mouse
    private void txtJugador2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador2MouseExited
        txtJugador2.setBorder(null);
    }//GEN-LAST:event_txtJugador2MouseExited

    //Borra el texto JUGADOR1 al hacer clic 
    private void txtJugador1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador1FocusGained
        if (txtJugador1.getText().equals("JUGADOR1")) {
            txtJugador1.setText("");
        }
    }//GEN-LAST:event_txtJugador1FocusGained

    //Borra el texto JUGADOR2 al hacer clic 
    private void txtJugador2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador2FocusGained
        if (txtJugador2.getText().equals("JUGADOR2")) {
            txtJugador2.setText("");
        }
    }//GEN-LAST:event_txtJugador2FocusGained

    //volvemos al texto original JUGADOR1 si el user no agregó nada
    private void txtJugador1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador1FocusLost
        if (txtJugador1.getText().equals("")) {
            txtJugador1.setText("JUGADOR1");
        }
    }//GEN-LAST:event_txtJugador1FocusLost

    //volvemos al texto original JUGADOR2 si el user no agregó nada
    private void txtJugador2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador2FocusLost
        if (txtJugador2.getText().equals("")) {
            txtJugador2.setText("JUGADOR2");
        }
    }//GEN-LAST:event_txtJugador2FocusLost

    //Al hacer clic en el fondoPanel centramos el focus en el panel
    private void PanelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelFondoMousePressed
        PanelFondo.requestFocus();
    }//GEN-LAST:event_PanelFondoMousePressed

    //Convertir cada caracter en mayusculas y permitir solo 8 caracteres (JUGADOR1)
    private void txtJugador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador1KeyTyped
        //mayusculas
        char unChar = Character.toUpperCase(evt.getKeyChar());
        evt.setKeyChar(unChar);
        //solo 8 caracteres
        if (txtJugador1.getText().length() >= 8) {
            evt.consume();//ignora evento.. no se puede escribir más con el teclado
        }
    }//GEN-LAST:event_txtJugador1KeyTyped

    //Convertir cada caracter en mayusculas y permitir solo 8 caracteres (JUGADOR2)
    private void txtJugador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador2KeyTyped
        //mayusculas
        char unChar = Character.toUpperCase(evt.getKeyChar());
        evt.setKeyChar(unChar);
        //solo 8 caracteres
        if (txtJugador2.getText().length() >= 8)
            evt.consume();//ignora evento.. no se puede escribir más con el teclado
    }//GEN-LAST:event_txtJugador2KeyTyped

    //Cambiar de color el boton al pasar el mouse
    private void lblIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMouseEntered
        PanelBoton.setBackground(new Color(126, 49, 196));
    }//GEN-LAST:event_lblIniciarMouseEntered

    //volver al color original al quitar el mouse del boton
    private void lblIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMouseExited
        PanelBoton.setBackground(new Color(42, 22, 79));
    }//GEN-LAST:event_lblIniciarMouseExited

    //llamamos al JFrame TicTacToe con el boton Iniciar
    private void lblIniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMousePressed
       this.dispose();
       
       Jugador jugador1 = new Jugador(TipoImagen.EQUIS);
       if(txtJugador1.getText().equals("")){
           jugador1.setNombre("JUGADOR1");
       }else{
           jugador1.setNombre(txtJugador1.getText());
       }
       Jugador jugador2 = new Jugador(TipoImagen.CIRCULO);
       if(txtJugador2.getText().equals("")){
           jugador2.setNombre("JUGADOR2");
       }else{
           jugador2.setNombre(txtJugador2.getText());
       }
       
       FormTicTacToe tic = new FormTicTacToe(jugador1, jugador2);
       tic.setVisible(true);
    }//GEN-LAST:event_lblIniciarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBoton;
    private javax.swing.JPanel PanelFondo;
    private modelo.Imagen imagen1;
    private modelo.Imagen imagen2;
    private modelo.Imagen imagen3;
    private modelo.Imagen imagen4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblIniciar;
    private javax.swing.JTextField txtJugador1;
    private javax.swing.JTextField txtJugador2;
    // End of variables declaration//GEN-END:variables
}
