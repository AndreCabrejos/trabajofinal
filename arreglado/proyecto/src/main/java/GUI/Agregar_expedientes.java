
package GUI;
import javax.swing.JOptionPane;

import proyecto.Expediente;
import proyecto.Interesado;
import proyecto.TramiteController;

public class Agregar_expedientes extends javax.swing.JFrame {
    private TramiteController controller;

    public Agregar_expedientes(TramiteController controller) {
        this.controller = controller;
        initComponents();
        setDefaultCloseOperation(Agregar_expedientes.DISPOSE_ON_CLOSE);
    }


    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DNI_TextField = new javax.swing.JTextField();
        Nombre_TextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Apellido_TextField = new javax.swing.JTextField();
        Telefono_TextField = new javax.swing.JTextField();
        Correo_TextField = new javax.swing.JTextField();
        Asunto_TextField = new javax.swing.JTextField();
        Documento_TextField = new javax.swing.JTextField();
        Prioridad_ComboBox = new javax.swing.JComboBox<>();
        Guardar_Button = new javax.swing.JButton();
        Ulima_CheckBox = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Prioridad");

        jLabel2.setText("DNI");

        jLabel3.setText("Nombre");

        DNI_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNI_TextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Apellido");

        jLabel5.setText("Telefono");

        jLabel6.setText("Correo");

        jLabel7.setText("Asunto");

        jLabel8.setText("Documento");

        jLabel9.setText("Trabajador  Ulima");

        Telefono_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Telefono_TextFieldActionPerformed(evt);
            }
        });

        Correo_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Correo_TextFieldActionPerformed(evt);
            }
        });

        Prioridad_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "Alto", "Medio", "Bajo" }));
        Prioridad_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prioridad_ComboBoxActionPerformed(evt);
            }
        });

        Guardar_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cofrimar (1).png"))); 
        Guardar_Button.setText("Guardar");
        Guardar_Button.setMaximumSize(new java.awt.Dimension(130, 57));
        Guardar_Button.setMinimumSize(new java.awt.Dimension(130, 57));
        Guardar_Button.setPreferredSize(new java.awt.Dimension(130, 57));
        Guardar_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar_ButtonActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton-eliminar.png"))); 
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Informacion expediente");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Guardar_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ulima_CheckBox)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Correo_TextField)
                                .addComponent(Asunto_TextField)
                                .addComponent(Documento_TextField)
                                .addComponent(DNI_TextField)
                                .addComponent(Nombre_TextField)
                                .addComponent(Apellido_TextField)
                                .addComponent(Telefono_TextField)
                                .addComponent(Prioridad_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Prioridad_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(DNI_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Nombre_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Apellido_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Telefono_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Correo_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Asunto_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Documento_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(Ulima_CheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Guardar_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(16, 16, 16))
        );

        pack();
    }

    private void DNI_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNI_TextFieldActionPerformed
       
    }

    private void Telefono_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Telefono_TextFieldActionPerformed
       
    }

    private void Correo_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Correo_TextFieldActionPerformed
        
    }

    private void Prioridad_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prioridad_ComboBoxActionPerformed
        
    }

    private void Guardar_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar_ButtonActionPerformed
        String valor = (String) Prioridad_ComboBox.getSelectedItem();
        if (valor.equals("----------")) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione prioridad", "Error", JOptionPane.ERROR_MESSAGE);
            return;
    }
        String texto = DNI_TextField.getText();
    
    if(texto.length()!=8 || texto.matches("d+")){
        JOptionPane.showMessageDialog(this, "Por favor, escriba correctamente el DNI", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String texto2 = Nombre_TextField.getText();
    if(texto2.isEmpty()){
        JOptionPane.showMessageDialog(this, "Por favor, escriba el nombre", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String texto3 = Apellido_TextField.getText();
    if(texto3.isEmpty()){
        JOptionPane.showMessageDialog(this, "Por favor, escriba el apellido", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String texto4 = Telefono_TextField.getText();
    if(texto4.length()!=9 || texto4.matches("d+")){
        JOptionPane.showMessageDialog(this, "Por favor, escriba correctamente el telenfono", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String texto5 = Correo_TextField.getText();
    if(texto5.isEmpty()){
        JOptionPane.showMessageDialog(this, "Por favor, escriba el correo", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String texto6 = Correo_TextField.getText();
    if(texto6.isEmpty()){
        JOptionPane.showMessageDialog(this, "Por favor, escriba el asunto", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String texto7 = Correo_TextField.getText();
    if(texto7.isEmpty()){
        JOptionPane.showMessageDialog(this, "Por favor, escriba documento", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    int val=0;
    if(valor.equals("Alto"))val=1;
    if(valor.equals("Medio"))val=2;
    if(valor.equals("Bajo"))val=3;
     boolean esTrabajador = Ulima_CheckBox.isSelected();
        proyecto.Interesado interesado=new Interesado(texto,texto2,texto3,texto4,texto5, esTrabajador);
        proyecto.Expediente ex=new Expediente(val, interesado, texto6,texto7);
        controller.insertarOrdenadoR(ex);
        this.dispose();

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();        
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
            java.util.logging.Logger.getLogger(Agregar_expedientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_expedientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_expedientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_expedientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        
    }

    
    private javax.swing.JTextField Apellido_TextField;
    private javax.swing.JTextField Asunto_TextField;
    private javax.swing.JTextField Correo_TextField;
    private javax.swing.JTextField DNI_TextField;
    private javax.swing.JTextField Documento_TextField;
    private javax.swing.JButton Guardar_Button;
    private javax.swing.JTextField Nombre_TextField;
    private javax.swing.JComboBox<String> Prioridad_ComboBox;
    private javax.swing.JTextField Telefono_TextField;
    private javax.swing.JCheckBox Ulima_CheckBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
