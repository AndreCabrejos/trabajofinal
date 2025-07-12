
package GUI;
import proyecto.*;

public class Iniciar_sesion extends javax.swing.JFrame {

   
    public Iniciar_sesion() {
       
        initComponents();
        setDefaultCloseOperation(Iniciar_sesion.DISPOSE_ON_CLOSE);
    }

   
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        titulo_sis_label = new javax.swing.JLabel();
        contrase_label = new javax.swing.JLabel();
        usuario_label = new javax.swing.JLabel();
        usuario_TextField = new javax.swing.JTextField();
        iniciar_sesion_Button = new javax.swing.JButton();
        contrase_PasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo_sis_label.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); 
        titulo_sis_label.setText("INICIAR SESION");
        titulo_sis_label.setToolTipText("");

        contrase_label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); 
        contrase_label.setText("Contraseña:");

        usuario_label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); 
        usuario_label.setText("Usuario:");

        usuario_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuario_TextFieldActionPerformed(evt);
            }
        });

        iniciar_sesion_Button.setText("Iniciar sesion");
        iniciar_sesion_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciar_sesion_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(titulo_sis_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(262, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuario_label, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contrase_label, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usuario_TextField)
                            .addComponent(contrase_PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(213, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iniciar_sesion_Button)
                .addGap(275, 275, 275))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(titulo_sis_label, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuario_label, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contrase_label, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contrase_PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(iniciar_sesion_Button)
                .addGap(72, 72, 72))
        );

        pack();
    }

    private void usuario_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void iniciar_sesion_ButtonActionPerformed(java.awt.event.ActionEvent evt) {

        String usuario = usuario_TextField.getText();
        String contrasena = new String(contrase_PasswordField.getPassword());
        if (!usuario.isEmpty()&& !contrasena.isEmpty() && (usuario.equals("admin")&& contrasena.equals("1234") ) ) {
            TramiteController controller = new TramiteController();
            Menu main = new Menu(controller);
            main.setVisible(true);
            this.dispose();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Error de usuario o contraseña", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);

        }
    }

    
    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iniciar_sesion().setVisible(true);
            }
        });
    }

   
    private javax.swing.JPasswordField contrase_PasswordField;
    private javax.swing.JLabel contrase_label;
    private javax.swing.JButton iniciar_sesion_Button;
    private javax.swing.JLabel titulo_sis_label;
    private javax.swing.JTextField usuario_TextField;
    private javax.swing.JLabel usuario_label;
}
