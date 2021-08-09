package Grafico;

import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class tabla_reguistro extends javax.swing.JFrame {

    DefaultTableModel modelo;

    public tabla_reguistro() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Primer Apellido");
        modelo.addColumn("Segundo Apellido");
        modelo.addColumn("Cedula");
        modelo.addColumn("Placa");
        this.tabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        Espacio1 = new javax.swing.JToggleButton();
        Espacio2 = new javax.swing.JToggleButton();
        Espacio3 = new javax.swing.JToggleButton();
        Espacio4 = new javax.swing.JToggleButton();
        Espacio5 = new javax.swing.JToggleButton();
        Espacio6 = new javax.swing.JToggleButton();
        Espacio7 = new javax.swing.JToggleButton();
        Espacio8 = new javax.swing.JToggleButton();
        Espacio9 = new javax.swing.JToggleButton();
        Espacio10 = new javax.swing.JToggleButton();
        Espacio11 = new javax.swing.JToggleButton();
        Espacio12 = new javax.swing.JToggleButton();
        Espacio13 = new javax.swing.JToggleButton();
        Espacio14 = new javax.swing.JToggleButton();
        Espacio15 = new javax.swing.JToggleButton();
        Espacio16 = new javax.swing.JToggleButton();
        Espacio17 = new javax.swing.JToggleButton();
        Espacio18 = new javax.swing.JToggleButton();
        EspacioMoto1 = new javax.swing.JToggleButton();
        EspacioMoto2 = new javax.swing.JToggleButton();
        EspacioMoto3 = new javax.swing.JToggleButton();
        EspacioMoto4 = new javax.swing.JToggleButton();
        EspacioMoto5 = new javax.swing.JToggleButton();
        EspacioMoto6 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jTxtNombre = new javax.swing.JTextField();
        jTxtApellido1 = new javax.swing.JTextField();
        jTxtApellido2 = new javax.swing.JTextField();
        jTxtCedula = new javax.swing.JTextField();
        jTxtPlaca = new javax.swing.JTextField();
        jBSalirIngreso = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBIngresar1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnBorrar_todo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel34.setBackground(new java.awt.Color(0, 153, 153));
        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 153, 153));
        jLabel34.setText("Mapa del Parqueo");

        Espacio1.setBackground(new java.awt.Color(51, 204, 0));
        Espacio1.setText("1");
        Espacio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio1ActionPerformed(evt);
            }
        });

        Espacio2.setBackground(new java.awt.Color(51, 204, 0));
        Espacio2.setText("2");
        Espacio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio2ActionPerformed(evt);
            }
        });

        Espacio3.setBackground(new java.awt.Color(51, 204, 0));
        Espacio3.setText("3");
        Espacio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio3ActionPerformed(evt);
            }
        });

        Espacio4.setBackground(new java.awt.Color(51, 204, 0));
        Espacio4.setText("4");
        Espacio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio4ActionPerformed(evt);
            }
        });

        Espacio5.setBackground(new java.awt.Color(51, 204, 0));
        Espacio5.setText("5");
        Espacio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio5ActionPerformed(evt);
            }
        });

        Espacio6.setBackground(new java.awt.Color(51, 204, 0));
        Espacio6.setText("6");
        Espacio6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio6ActionPerformed(evt);
            }
        });

        Espacio7.setBackground(new java.awt.Color(51, 204, 0));
        Espacio7.setText("7");
        Espacio7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio7ActionPerformed(evt);
            }
        });

        Espacio8.setBackground(new java.awt.Color(51, 204, 0));
        Espacio8.setText("8");
        Espacio8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio8ActionPerformed(evt);
            }
        });

        Espacio9.setBackground(new java.awt.Color(51, 204, 0));
        Espacio9.setText("9");
        Espacio9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio9ActionPerformed(evt);
            }
        });

        Espacio10.setBackground(new java.awt.Color(51, 204, 0));
        Espacio10.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Espacio10.setText("10");
        Espacio10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio10ActionPerformed(evt);
            }
        });

        Espacio11.setBackground(new java.awt.Color(51, 204, 0));
        Espacio11.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Espacio11.setText("11");
        Espacio11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio11ActionPerformed(evt);
            }
        });

        Espacio12.setBackground(new java.awt.Color(51, 204, 0));
        Espacio12.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Espacio12.setText("12");
        Espacio12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio12ActionPerformed(evt);
            }
        });

        Espacio13.setBackground(new java.awt.Color(51, 204, 0));
        Espacio13.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Espacio13.setText("13");
        Espacio13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio13ActionPerformed(evt);
            }
        });

        Espacio14.setBackground(new java.awt.Color(51, 204, 0));
        Espacio14.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Espacio14.setText("14");
        Espacio14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio14ActionPerformed(evt);
            }
        });

        Espacio15.setBackground(new java.awt.Color(51, 204, 0));
        Espacio15.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Espacio15.setText("15");
        Espacio15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio15ActionPerformed(evt);
            }
        });

        Espacio16.setBackground(new java.awt.Color(51, 204, 0));
        Espacio16.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Espacio16.setText("16");
        Espacio16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio16ActionPerformed(evt);
            }
        });

        Espacio17.setBackground(new java.awt.Color(51, 204, 0));
        Espacio17.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Espacio17.setText("17");
        Espacio17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio17ActionPerformed(evt);
            }
        });

        Espacio18.setBackground(new java.awt.Color(51, 204, 0));
        Espacio18.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Espacio18.setText("18");
        Espacio18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio18ActionPerformed(evt);
            }
        });

        EspacioMoto1.setBackground(new java.awt.Color(51, 204, 0));
        EspacioMoto1.setText("M1");
        EspacioMoto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspacioMoto1ActionPerformed(evt);
            }
        });

        EspacioMoto2.setBackground(new java.awt.Color(51, 204, 0));
        EspacioMoto2.setText("M2");
        EspacioMoto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspacioMoto2ActionPerformed(evt);
            }
        });

        EspacioMoto3.setBackground(new java.awt.Color(51, 204, 0));
        EspacioMoto3.setText("M3");
        EspacioMoto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspacioMoto3ActionPerformed(evt);
            }
        });

        EspacioMoto4.setBackground(new java.awt.Color(51, 204, 0));
        EspacioMoto4.setText("M4");
        EspacioMoto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspacioMoto4ActionPerformed(evt);
            }
        });

        EspacioMoto5.setBackground(new java.awt.Color(51, 204, 0));
        EspacioMoto5.setText("M5");
        EspacioMoto5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspacioMoto5ActionPerformed(evt);
            }
        });

        EspacioMoto6.setBackground(new java.awt.Color(51, 204, 0));
        EspacioMoto6.setText("M6");
        EspacioMoto6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspacioMoto6ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Apellido 1:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Apellido 2:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Cédula:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Seleccione posición:");

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setText("Vehículo");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setText("Motocicleta");

        jTxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNombreActionPerformed(evt);
            }
        });

        jTxtApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtApellido2ActionPerformed(evt);
            }
        });

        jTxtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCedulaActionPerformed(evt);
            }
        });

        jBSalirIngreso.setBackground(new java.awt.Color(63, 150, 230));
        jBSalirIngreso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBSalirIngreso.setText("Salir");
        jBSalirIngreso.setToolTipText("");
        jBSalirIngreso.setActionCommand("");
        jBSalirIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirIngresoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setText("Ingreso de Vehículos");

        jBIngresar1.setBackground(new java.awt.Color(63, 150, 230));
        jBIngresar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBIngresar1.setText("Ingresar");
        jBIngresar1.setToolTipText("");
        jBIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresar1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setToolTipText("");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Placa:");

        btnBorrar_todo.setText("Borrar todo");
        btnBorrar_todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar_todoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(263, 263, 263)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jBIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel9))
                                            .addGap(29, 29, 29)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTxtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(53, 53, 53)
                                            .addComponent(jRadioButton2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jRadioButton1))))))
                        .addGap(204, 204, 204))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Espacio1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Espacio8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Espacio15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Espacio2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Espacio9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Espacio16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Espacio7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Espacio12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(100, 100, 100)
                                        .addComponent(Espacio14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(EspacioMoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(EspacioMoto4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(EspacioMoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(EspacioMoto5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(EspacioMoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(EspacioMoto6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Espacio3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Espacio10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Espacio17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Espacio11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(103, 103, 103)
                                        .addComponent(Espacio13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Espacio4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(Espacio5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(Espacio6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Espacio18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(209, 209, 209))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnBorrar_todo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalirIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(jTxtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Espacio1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Espacio2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Espacio3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Espacio4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Espacio5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Espacio6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Espacio7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Espacio16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Espacio15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Espacio18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Espacio17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Espacio9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Espacio8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Espacio10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Espacio12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Espacio11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Espacio13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Espacio14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jTxtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton2)
                                .addComponent(jRadioButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EspacioMoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EspacioMoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EspacioMoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EspacioMoto4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EspacioMoto5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EspacioMoto6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jBIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalirIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar_todo)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Espacio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio1ActionPerformed
        if (Espacio1.isSelected()) {
            Espacio1.setBackground(Color.red);
        } else {
            Espacio1.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_Espacio1ActionPerformed

    private void Espacio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio2ActionPerformed
        if (Espacio2.isSelected()) {
            Espacio2.setBackground(Color.red);
        } else {
            Espacio2.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_Espacio2ActionPerformed

    private void Espacio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio3ActionPerformed
        if (Espacio3.isSelected()) {
            Espacio3.setBackground(Color.red);
        } else {
            Espacio3.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_Espacio3ActionPerformed

    private void Espacio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio4ActionPerformed
        if (Espacio4.isSelected()) {
            Espacio4.setBackground(Color.red);
        } else {
            Espacio4.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_Espacio4ActionPerformed

    private void Espacio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio5ActionPerformed
        if (Espacio5.isSelected()) {
            Espacio5.setBackground(Color.red);
        } else {
            Espacio5.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_Espacio5ActionPerformed

    private void Espacio6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio6ActionPerformed
        if (Espacio6.isSelected()) {
            Espacio6.setBackground(Color.red);
        } else {
            Espacio6.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_Espacio6ActionPerformed

    private void Espacio7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio7ActionPerformed
        if (Espacio7.isSelected()) {
            Espacio7.setBackground(Color.red);
        } else {
            Espacio7.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_Espacio7ActionPerformed

    private void Espacio8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio8ActionPerformed
        if (Espacio8.isSelected()) {
            Espacio8.setBackground(Color.red);
        } else {
            Espacio8.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_Espacio8ActionPerformed

    private void Espacio9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio9ActionPerformed
        if (Espacio9.isSelected()) {
            Espacio9.setBackground(Color.red);
        } else {
            Espacio9.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_Espacio9ActionPerformed

    private void Espacio10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio10ActionPerformed
        if (Espacio10.isSelected()) {
            Espacio10.setBackground(Color.red);
        } else {
            Espacio10.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_Espacio10ActionPerformed

    private void Espacio11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio11ActionPerformed
        if (Espacio11.isSelected()) {
            Espacio11.setBackground(Color.red);
        } else {
            Espacio11.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_Espacio11ActionPerformed

    private void Espacio12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio12ActionPerformed
        if (Espacio12.isSelected()) {
            Espacio12.setBackground(Color.red);
        } else {
            Espacio12.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_Espacio12ActionPerformed

    private void Espacio13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio13ActionPerformed
        if (Espacio13.isSelected()) {
            Espacio13.setBackground(Color.red);
        } else {
            Espacio13.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_Espacio13ActionPerformed

    private void Espacio14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio14ActionPerformed
        if (Espacio14.isSelected()) {
            Espacio14.setBackground(Color.red);
        } else {
            Espacio14.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_Espacio14ActionPerformed

    private void Espacio15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio15ActionPerformed
        if (Espacio15.isSelected()) {
            Espacio15.setBackground(Color.red);
        } else {
            Espacio15.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_Espacio15ActionPerformed

    private void Espacio16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio16ActionPerformed
        if (Espacio16.isSelected()) {
            Espacio16.setBackground(Color.red);
        } else {
            Espacio16.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_Espacio16ActionPerformed

    private void Espacio17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio17ActionPerformed
        if (Espacio17.isSelected()) {
            Espacio17.setBackground(Color.red);
        } else {
            Espacio17.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_Espacio17ActionPerformed

    private void Espacio18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio18ActionPerformed
        if (Espacio18.isSelected()) {
            Espacio18.setBackground(Color.red);
        } else {
            Espacio18.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_Espacio18ActionPerformed

    private void EspacioMoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspacioMoto1ActionPerformed
        if (EspacioMoto1.isSelected()) {
            EspacioMoto1.setBackground(Color.red);
        } else {
            EspacioMoto1.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_EspacioMoto1ActionPerformed

    private void EspacioMoto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspacioMoto2ActionPerformed
        if (EspacioMoto2.isSelected()) {
            EspacioMoto2.setBackground(Color.red);
        } else {
            EspacioMoto2.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_EspacioMoto2ActionPerformed

    private void EspacioMoto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspacioMoto3ActionPerformed
        if (EspacioMoto3.isSelected()) {
            EspacioMoto3.setBackground(Color.red);
        } else {
            EspacioMoto3.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_EspacioMoto3ActionPerformed

    private void EspacioMoto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspacioMoto4ActionPerformed
        if (EspacioMoto4.isSelected()) {
            EspacioMoto4.setBackground(Color.red);
        } else {
            EspacioMoto4.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_EspacioMoto4ActionPerformed

    private void EspacioMoto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspacioMoto5ActionPerformed
        if (EspacioMoto5.isSelected()) {
            EspacioMoto5.setBackground(Color.red);
        } else {
            EspacioMoto5.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_EspacioMoto5ActionPerformed

    private void EspacioMoto6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspacioMoto6ActionPerformed
        if (EspacioMoto6.isSelected()) {
            EspacioMoto6.setBackground(Color.red);
        } else {
            EspacioMoto6.setBackground(new Color(51, 204, 0));
        }
    }//GEN-LAST:event_EspacioMoto6ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNombreActionPerformed

    private void jTxtApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtApellido2ActionPerformed

    private void jTxtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCedulaActionPerformed

    private void jBSalirIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirIngresoActionPerformed
        Principal abrir = new Principal();
        abrir.setVisible(true);

    }//GEN-LAST:event_jBSalirIngresoActionPerformed

    private void jBIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresar1ActionPerformed
        String[] info = new String[5];
        info[0] = jTxtNombre.getText();
        info[1] = jTxtApellido1.getText();
        info[2] = jTxtApellido2.getText();
        info[3] = jTxtCedula.getText();
        info[4] = jTxtPlaca.getText();
        modelo.addRow(info);

        jTxtNombre.setText("");
        jTxtApellido1.setText("");
        jTxtApellido2.setText("");
        jTxtCedula.setText("");
        jTxtPlaca.setText("");
    }//GEN-LAST:event_jBIngresar1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnBorrar_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar_todoActionPerformed

    }//GEN-LAST:event_btnBorrar_todoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Espacio1;
    private javax.swing.JToggleButton Espacio10;
    private javax.swing.JToggleButton Espacio11;
    private javax.swing.JToggleButton Espacio12;
    private javax.swing.JToggleButton Espacio13;
    private javax.swing.JToggleButton Espacio14;
    private javax.swing.JToggleButton Espacio15;
    private javax.swing.JToggleButton Espacio16;
    private javax.swing.JToggleButton Espacio17;
    private javax.swing.JToggleButton Espacio18;
    private javax.swing.JToggleButton Espacio2;
    private javax.swing.JToggleButton Espacio3;
    private javax.swing.JToggleButton Espacio4;
    private javax.swing.JToggleButton Espacio5;
    private javax.swing.JToggleButton Espacio6;
    private javax.swing.JToggleButton Espacio7;
    private javax.swing.JToggleButton Espacio8;
    private javax.swing.JToggleButton Espacio9;
    private javax.swing.JToggleButton EspacioMoto1;
    private javax.swing.JToggleButton EspacioMoto2;
    private javax.swing.JToggleButton EspacioMoto3;
    private javax.swing.JToggleButton EspacioMoto4;
    private javax.swing.JToggleButton EspacioMoto5;
    private javax.swing.JToggleButton EspacioMoto6;
    private javax.swing.JButton btnBorrar_todo;
    private javax.swing.JButton jBIngresar1;
    private javax.swing.JButton jBSalirIngreso;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtApellido1;
    private javax.swing.JTextField jTxtApellido2;
    private javax.swing.JTextField jTxtCedula;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtPlaca;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
