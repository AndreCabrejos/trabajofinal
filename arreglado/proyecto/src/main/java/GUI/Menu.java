
package GUI;
import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import proyecto.Expediente;
import proyecto.TramiteController;

public class Menu extends javax.swing.JFrame {
    private TramiteController controller;
  
    public Menu(TramiteController controller) {
        this.controller = controller;
        initComponents();
        mostrarExpiendes();
    }
        public void mostrarExpiendes() {
        DefaultTableModel model = (DefaultTableModel) Expedientes_Table.getModel();
        model.setRowCount(0);
        LinkedList<Expediente> lista = controller.obtenerTodos();

        
        for (Expediente e : lista) {    
            String prio="";
            if(e.getPrioridad()==1)prio="ALTA";
            if(e.getPrioridad()==2)prio="MEDIA";
            if(e.getPrioridad()==3)prio="BAJA";
            model.addRow(new Object[] {
            e.getId(),                       // Columna 0: ID
            prio,                   // Columna 1: Asunto
            e.getInteresado().getDni(),// Columna 2: Prioridad
            e.getInteresado().getNombres(),
            e.getInteresado().getApellidos(),
            e.getInteresado().getTelefono(),
            e.getInteresado().getEmail(),
            e.getDocumentoReferencia(),
            e.getFechaInicio()
        });
    }
        
}

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Expedientes_Table = new javax.swing.JTable();
        agregar_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Expedientes_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "PRIORIDAD", "DNI", "Nombre", "Apellido", "Telefono", "email", "Documento", "Feccha de inicio", "Seleccionar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Expedientes_Table);

        agregar_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar-archivo.png"))); 
        agregar_Button.setText("Agregar");
        agregar_Button.setMaximumSize(new java.awt.Dimension(73, 23));
        agregar_Button.setMinimumSize(new java.awt.Dimension(73, 23));
        agregar_Button.setPreferredSize(new java.awt.Dimension(73, 23));
        agregar_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EXPEDIENTES");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/imagen_mover (2).png"))); 
        jButton1.setText("Mover");
        jButton1.setMaximumSize(new java.awt.Dimension(73, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(73, 23));
        jButton1.setPreferredSize(new java.awt.Dimension(73, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/7db99d46d3568fe5b985e529b133cddb-icono-de-lupa-de-ojo (1).png"))); 
        jButton3.setText("Ver");
        jButton3.setMaximumSize(new java.awt.Dimension(73, 23));
        jButton3.setMinimumSize(new java.awt.Dimension(73, 23));
        jButton3.setPreferredSize(new java.awt.Dimension(73, 23));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/4295938 (1).png"))); 
        jButton2.setText("Finalizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(406, 406, 406))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(agregar_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(agregar_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }

    private void agregar_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Agregar_expedientes formulario = new Agregar_expedientes (controller);
        formulario.setVisible(true);
        formulario.addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowClosed(java.awt.event.WindowEvent windowEvent) {
        mostrarExpiendes();
        }
    });       
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        Mover_expediente formulario = new Mover_expediente();
        int selec = Expedientes_Table.getSelectedRow();
        if (selec != -1) {
            Boolean bol = (Boolean) Expedientes_Table.getValueAt(selec, 9);
            if (bol != null && bol) {
                int Dni=(int)Expedientes_Table.getValueAt(selec, 0);
                Expediente  exp=controller.buscarPorId(Dni);
             if (exp.estaFinalizado()) {
                    JOptionPane.showMessageDialog(this,
                        "Este expediente ya fue finalizado. No se puede mover.",
                        "Acción no permitida", JOptionPane.WARNING_MESSAGE);
                    return; // 🚫 se corta el flujo aquí
                }
            formulario.setDatos(exp);
            formulario.setVisible(true);
            formulario.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
            mostrarExpiendes();
        }});           
            }}
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
                Ver_Movimiento formulario = new Ver_Movimiento();
        int selec = Expedientes_Table.getSelectedRow();
        if (selec != -1) {
            Boolean bol = (Boolean) Expedientes_Table.getValueAt(selec, 9);
            if (bol != null && bol) {
                int Dni=(int)Expedientes_Table.getValueAt(selec, 0);
            Expediente  exp=controller.buscarPorId(Dni);
            formulario.setDatos(exp);
            formulario.setVisible(true);
            formulario.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
            mostrarExpiendes();
        }});           
            }}
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
            int selec = Expedientes_Table.getSelectedRow();
        if (selec != -1) {
            Boolean bol = (Boolean) Expedientes_Table.getValueAt(selec, 9);
            if (bol != null && bol) {
                int Dni=(int)Expedientes_Table.getValueAt(selec, 0);
                Expediente  exp=controller.buscarPorId(Dni);
                if(!exp.estaFinalizado()){
                controller.finalizarExpediente(exp);
                mostrarExpiendes();
                JOptionPane.showMessageDialog(this, "Expediente finalizado con éxito.");
                }
        }}                 
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


    }

    private javax.swing.JTable Expedientes_Table;
    private javax.swing.JButton agregar_Button;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    
}
