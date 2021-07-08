package Grafico;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Principal extends javax.swing.JFrame {
    
    FondoPanel fondo = new FondoPanel();

    public Principal() {
        this.setContentPane(fondo);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPMenu = new javax.swing.JPanel();
        jBIngresarV = new javax.swing.JButton();
        jBRetirar = new javax.swing.JButton();
        jConfig = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();
        jPCuerpo = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jListar1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jPIngresoVehiculo = new javax.swing.JPanel();
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
        jPRetirarVehiculo = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTxtPlaca1 = new javax.swing.JTextField();
        jBSalirRetiro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBIngresar2 = new javax.swing.JButton();
        jReloj = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setName(""); // NOI18N

        jPMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBIngresarV.setBackground(new java.awt.Color(79, 119, 238));
        jBIngresarV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBIngresarV.setForeground(new java.awt.Color(255, 255, 255));
        jBIngresarV.setText("Ingresar vehículo");
        jBIngresarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresarVActionPerformed(evt);
            }
        });
        jPMenu.add(jBIngresarV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 130, 41));

        jBRetirar.setBackground(new java.awt.Color(79, 119, 238));
        jBRetirar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBRetirar.setForeground(new java.awt.Color(255, 255, 255));
        jBRetirar.setText("Retirar vehículo");
        jBRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRetirarActionPerformed(evt);
            }
        });
        jPMenu.add(jBRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 120, 41));

        jConfig.setBackground(new java.awt.Color(79, 119, 238));
        jConfig.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jConfig.setForeground(new java.awt.Color(255, 255, 255));
        jConfig.setText("Configuración");
        jConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfigActionPerformed(evt);
            }
        });
        jPMenu.add(jConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 130, 37));

        jBSalir.setBackground(new java.awt.Color(79, 119, 238));
        jBSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        jPMenu.add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 120, 37));

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/F1.png"))); // NOI18N
        BackGround.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPMenu.add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 400));

        jPCuerpo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPCuerpo.setMinimumSize(new java.awt.Dimension(1219, 498));
        jPCuerpo.setPreferredSize(new java.awt.Dimension(1219, 498));
        jPCuerpo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel34.setText("Mapa del Parqueo");
        jPCuerpo.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        jListar1.setBackground(new java.awt.Color(79, 119, 238));
        jListar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jListar1.setForeground(new java.awt.Color(255, 255, 255));
        jListar1.setText("Listar ingresos y salidas");
        jListar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListar1ActionPerformed(evt);
            }
        });
        jPCuerpo.add(jListar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 190, 40));

        jButton2.setBackground(new java.awt.Color(0, 204, 0));
        jButton2.setText("1");
        jPCuerpo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 40, 60));

        jButton3.setBackground(new java.awt.Color(0, 204, 0));
        jButton3.setText("2");
        jPCuerpo.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 40, 60));

        jButton4.setBackground(new java.awt.Color(0, 204, 0));
        jButton4.setText("3");
        jPCuerpo.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 40, 60));

        jButton5.setBackground(new java.awt.Color(0, 204, 0));
        jButton5.setText("4");
        jPCuerpo.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 40, 60));

        jButton6.setBackground(new java.awt.Color(0, 204, 0));
        jButton6.setText("5");
        jPCuerpo.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 40, 60));

        jButton7.setBackground(new java.awt.Color(0, 204, 0));
        jButton7.setText("6");
        jPCuerpo.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 40, 60));

        jButton8.setBackground(new java.awt.Color(0, 204, 0));
        jButton8.setText("7");
        jPCuerpo.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 40, 60));

        jButton9.setBackground(new java.awt.Color(0, 204, 0));
        jButton9.setText("8");
        jPCuerpo.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 40, 60));

        jButton10.setBackground(new java.awt.Color(0, 204, 0));
        jButton10.setText("9");
        jPCuerpo.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 40, 60));

        jButton11.setBackground(new java.awt.Color(0, 204, 0));
        jButton11.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton11.setText("10");
        jPCuerpo.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 40, 60));

        jButton12.setBackground(new java.awt.Color(0, 204, 0));
        jButton12.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton12.setText("11");
        jPCuerpo.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 40, 60));

        jButton13.setBackground(new java.awt.Color(0, 204, 0));
        jButton13.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton13.setText("12");
        jPCuerpo.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 40, 60));

        jButton14.setBackground(new java.awt.Color(0, 204, 0));
        jButton14.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton14.setText("13");
        jPCuerpo.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 40, 60));

        jButton15.setBackground(new java.awt.Color(0, 204, 0));
        jButton15.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton15.setText("14");
        jPCuerpo.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 40, 60));

        jButton16.setBackground(new java.awt.Color(0, 204, 0));
        jButton16.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton16.setText("15");
        jPCuerpo.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 40, 60));

        jButton17.setBackground(new java.awt.Color(0, 204, 0));
        jButton17.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton17.setText("16");
        jPCuerpo.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 40, 60));

        jButton18.setBackground(new java.awt.Color(0, 204, 0));
        jButton18.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton18.setText("17");
        jPCuerpo.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 40, 60));

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton1.setText("18");
        jPCuerpo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 40, 60));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPCuerpo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 1, 15, 398));

        jButton21.setBackground(new java.awt.Color(0, 204, 0));
        jButton21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton21.setText("M1");
        jPCuerpo.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 50, 30));

        jButton22.setBackground(new java.awt.Color(0, 204, 0));
        jButton22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton22.setText("M2");
        jPCuerpo.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 50, 30));

        jButton23.setBackground(new java.awt.Color(0, 204, 0));
        jButton23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton23.setText("M3");
        jPCuerpo.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 50, 30));

        jButton24.setBackground(new java.awt.Color(0, 204, 0));
        jButton24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton24.setText("M4");
        jPCuerpo.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 50, 30));

        jButton25.setBackground(new java.awt.Color(0, 204, 0));
        jButton25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton25.setText("M5");
        jPCuerpo.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 50, 30));

        jButton20.setBackground(new java.awt.Color(0, 204, 0));
        jButton20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton20.setText("M6");
        jPCuerpo.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 50, 30));

        jPIngresoVehiculo.setPreferredSize(new java.awt.Dimension(300, 400));
        jPIngresoVehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");
        jPIngresoVehiculo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 82, -1, 28));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Apellido 1:");
        jPIngresoVehiculo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 116, -1, 28));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Apellido 2:");
        jPIngresoVehiculo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 150, -1, 28));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Cédula:");
        jPIngresoVehiculo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 184, -1, 28));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Placa:");
        jPIngresoVehiculo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 218, -1, 28));

        jRadioButton2.setText("Vehículo");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPIngresoVehiculo.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jRadioButton1.setText("Motocicleta");
        jPIngresoVehiculo.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        jTxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNombreActionPerformed(evt);
            }
        });
        jPIngresoVehiculo.add(jTxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 82, 178, 28));
        jPIngresoVehiculo.add(jTxtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 116, 178, 28));

        jTxtApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtApellido2ActionPerformed(evt);
            }
        });
        jPIngresoVehiculo.add(jTxtApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 150, 178, 28));

        jTxtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCedulaActionPerformed(evt);
            }
        });
        jPIngresoVehiculo.add(jTxtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 184, 178, 28));
        jPIngresoVehiculo.add(jTxtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 218, 178, 28));

        jBSalirIngreso.setBackground(new java.awt.Color(79, 119, 238));
        jBSalirIngreso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBSalirIngreso.setForeground(new java.awt.Color(255, 255, 255));
        jBSalirIngreso.setText("Salir");
        jBSalirIngreso.setToolTipText("");
        jBSalirIngreso.setActionCommand("");
        jBSalirIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirIngresoActionPerformed(evt);
            }
        });
        jPIngresoVehiculo.add(jBSalirIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 100, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setText("Ingreso de Vehículos");
        jPIngresoVehiculo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 220, 60));

        jBIngresar1.setBackground(new java.awt.Color(79, 119, 238));
        jBIngresar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBIngresar1.setForeground(new java.awt.Color(255, 255, 255));
        jBIngresar1.setText("Ingresar");
        jBIngresar1.setToolTipText("");
        jBIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresar1ActionPerformed(evt);
            }
        });
        jPIngresoVehiculo.add(jBIngresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 100, 40));

        jPIngresoVehiculo.setVisible(false);

        jPCuerpo.add(jPIngresoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 370));

        jPRetirarVehiculo.setPreferredSize(new java.awt.Dimension(300, 400));
        jPRetirarVehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Placa:");
        jPRetirarVehiculo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 28));
        jPRetirarVehiculo.add(jTxtPlaca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 178, 28));

        jBSalirRetiro.setBackground(new java.awt.Color(79, 119, 238));
        jBSalirRetiro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBSalirRetiro.setForeground(new java.awt.Color(255, 255, 255));
        jBSalirRetiro.setText("Salir");
        jBSalirRetiro.setToolTipText("");
        jBSalirRetiro.setActionCommand("");
        jBSalirRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirRetiroActionPerformed(evt);
            }
        });
        jPRetirarVehiculo.add(jBSalirRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 100, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel2.setText("Retirar de Vehículo");
        jPRetirarVehiculo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 220, 60));

        jBIngresar2.setBackground(new java.awt.Color(79, 119, 238));
        jBIngresar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBIngresar2.setForeground(new java.awt.Color(255, 255, 255));
        jBIngresar2.setText("Retirar");
        jBIngresar2.setToolTipText("");
        jBIngresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresar2ActionPerformed(evt);
            }
        });
        jPRetirarVehiculo.add(jBIngresar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 100, 40));

        jPRetirarVehiculo.setVisible(false);

        jPCuerpo.add(jPRetirarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 370));

        javax.swing.GroupLayout jRelojLayout = new javax.swing.GroupLayout(jReloj);
        jReloj.setLayout(jRelojLayout);
        jRelojLayout.setHorizontalGroup(
            jRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jRelojLayout.setVerticalGroup(
            jRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPCuerpo.add(jReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 230, 100));

        jLabel8.setText("jLabel8");
        jPCuerpo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        jLabel9.setText("jLabel9");
        jPCuerpo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConfigActionPerformed

    private void jBIngresarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresarVActionPerformed
        jPIngresoVehiculo.setVisible(true);
    }//GEN-LAST:event_jBIngresarVActionPerformed

    private void jBSalirIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirIngresoActionPerformed
        jPIngresoVehiculo.setVisible(false);
    }//GEN-LAST:event_jBSalirIngresoActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTxtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCedulaActionPerformed

    private void jTxtApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtApellido2ActionPerformed

    private void jTxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNombreActionPerformed

    private void jListar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jListar1ActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBIngresar1ActionPerformed

    private void jBSalirRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirRetiroActionPerformed
        jPRetirarVehiculo.setVisible(false);
    }//GEN-LAST:event_jBSalirRetiroActionPerformed

    private void jBIngresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBIngresar2ActionPerformed

    private void jBRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRetirarActionPerformed
        jPRetirarVehiculo.setVisible(true);
    }//GEN-LAST:event_jBRetirarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JButton jBIngresar1;
    private javax.swing.JButton jBIngresar2;
    private javax.swing.JButton jBIngresarV;
    private javax.swing.JButton jBRetirar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBSalirIngreso;
    private javax.swing.JButton jBSalirRetiro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jConfig;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jListar1;
    private javax.swing.JPanel jPCuerpo;
    private javax.swing.JPanel jPIngresoVehiculo;
    private javax.swing.JPanel jPMenu;
    private javax.swing.JPanel jPRetirarVehiculo;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JPanel jReloj;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTxtApellido1;
    private javax.swing.JTextField jTxtApellido2;
    private javax.swing.JTextField jTxtCedula;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtPlaca;
    private javax.swing.JTextField jTxtPlaca1;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/f.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
            
    }
}
