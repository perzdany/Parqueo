package Grafico;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;


public class Principal extends javax.swing.JFrame implements Runnable{
String hora, minutos, segundos;
Thread hilo;

    FondoPanel fondo = new FondoPanel();

    public Principal() {
        this.setContentPane(fondo);
        initComponents();
        LabelFecha.setText(fecha());
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);
    }
    
    public void hora() {
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();
        calendario.setTime(horaactual);
        hora= calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
            
    }
    
    public void run() {      
        
        Thread current = Thread.currentThread();
        
        while (current==hilo) {
            hora();
            LabelHora.setText(hora+":"+minutos+":"+segundos);
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPMenu = new javax.swing.JPanel();
        jBRetirar = new javax.swing.JButton();
        jBIngresarV = new javax.swing.JButton();
        jConfig = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();
        jPCuerpo = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPRetirarVehiculo = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTxtPlaca1 = new javax.swing.JTextField();
        jBSalirRetiro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBIngresar2 = new javax.swing.JButton();
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
        jMapa = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jReloj = new javax.swing.JPanel();
        LabelFecha = new javax.swing.JLabel();
        LabelHora = new javax.swing.JLabel();
        jListar1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setName(""); // NOI18N

        jPMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPMenu.setMinimumSize(new java.awt.Dimension(300, 400));
        jPMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBRetirar.setBackground(new java.awt.Color(79, 119, 238));
        jBRetirar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBRetirar.setForeground(new java.awt.Color(255, 255, 255));
        jBRetirar.setText("Retirar vehículo");
        jBRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRetirarActionPerformed(evt);
            }
        });
        jPMenu.add(jBRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 120, 41));

        jBIngresarV.setBackground(new java.awt.Color(79, 119, 238));
        jBIngresarV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBIngresarV.setForeground(new java.awt.Color(255, 255, 255));
        jBIngresarV.setText("Ingresar vehículo");
        jBIngresarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresarVActionPerformed(evt);
            }
        });
        jPMenu.add(jBIngresarV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 130, 41));

        jConfig.setBackground(new java.awt.Color(79, 119, 238));
        jConfig.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jConfig.setForeground(new java.awt.Color(255, 255, 255));
        jConfig.setText("Configuración");
        jConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfigActionPerformed(evt);
            }
        });
        jPMenu.add(jConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 130, 37));

        jBSalir.setBackground(new java.awt.Color(79, 119, 238));
        jBSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        jPMenu.add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 120, 37));

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/F1.png"))); // NOI18N
        BackGround.setMaximumSize(new java.awt.Dimension(300, 400));
        BackGround.setMinimumSize(new java.awt.Dimension(300, 400));
        BackGround.setPreferredSize(new java.awt.Dimension(300, 400));
        jPMenu.add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 400));

        jPCuerpo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPCuerpo.setMinimumSize(new java.awt.Dimension(1219, 498));
        jPCuerpo.setPreferredSize(new java.awt.Dimension(1219, 498));
        jPCuerpo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPCuerpo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, -20, 10, 440));

        jPRetirarVehiculo.setEnabled(false);
        jPRetirarVehiculo.setPreferredSize(new java.awt.Dimension(300, 400));
        jPRetirarVehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Placa:");
        jPRetirarVehiculo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 28));
        jPRetirarVehiculo.add(jTxtPlaca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 178, 28));

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
        jLabel2.setText("Retiro de Vehículos");
        jPRetirarVehiculo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 10, -1, 60));

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

        jPCuerpo.add(jPRetirarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 390));

        jPIngresoVehiculo.setEnabled(false);
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
        jPIngresoVehiculo.add(jBSalirIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 100, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setText("Ingreso de Vehículos");
        jPIngresoVehiculo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 220, 60));

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
        jPIngresoVehiculo.add(jBIngresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 100, 40));

        jPIngresoVehiculo.setVisible(false);

        jPCuerpo.add(jPIngresoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 400));

        jMapa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel34.setText("Mapa del Parqueo");
        jMapa.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 17, -1, 40));

        jReloj.setBackground(new java.awt.Color(255, 255, 255));
        jReloj.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jReloj.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelFecha.setBackground(new java.awt.Color(0, 204, 255));
        LabelFecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelFecha.setText("DD/MM/YYYY");
        LabelFecha.setAlignmentY(0.0F);
        jReloj.add(LabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 110, -1));

        LabelHora.setBackground(new java.awt.Color(0, 204, 255));
        LabelHora.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        LabelHora.setText("00:00:00");
        LabelHora.setAlignmentY(0.0F);
        jReloj.add(LabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jMapa.add(jReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 190, 80));

        jListar1.setBackground(new java.awt.Color(79, 119, 238));
        jListar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jListar1.setForeground(new java.awt.Color(255, 255, 255));
        jListar1.setText("Listar ingresos y salidas");
        jListar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListar1ActionPerformed(evt);
            }
        });
        jMapa.add(jListar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 190, 40));

        jButton2.setBackground(new java.awt.Color(0, 204, 0));
        jButton2.setText("1");
        jMapa.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 40, 60));

        jButton3.setBackground(new java.awt.Color(0, 204, 0));
        jButton3.setText("2");
        jMapa.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 40, 60));

        jButton4.setBackground(new java.awt.Color(0, 204, 0));
        jButton4.setText("3");
        jMapa.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 40, 60));

        jButton5.setBackground(new java.awt.Color(0, 204, 0));
        jButton5.setText("4");
        jMapa.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 40, 60));

        jButton7.setBackground(new java.awt.Color(0, 204, 0));
        jButton7.setText("6");
        jMapa.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 40, 60));

        jButton10.setBackground(new java.awt.Color(0, 204, 0));
        jButton10.setText("9");
        jMapa.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 40, 60));

        jButton9.setBackground(new java.awt.Color(0, 204, 0));
        jButton9.setText("8");
        jMapa.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 40, 60));

        jButton24.setBackground(new java.awt.Color(0, 204, 0));
        jButton24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton24.setText("M4");
        jMapa.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 50, 30));

        jButton36.setBackground(new java.awt.Color(0, 204, 0));
        jButton36.setText("8");
        jMapa.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 40, 60));

        jButton25.setBackground(new java.awt.Color(0, 204, 0));
        jButton25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton25.setText("M5");
        jMapa.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 50, 30));

        jButton37.setBackground(new java.awt.Color(0, 204, 0));
        jButton37.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton37.setText("15");
        jMapa.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 40, 60));

        jButton13.setBackground(new java.awt.Color(0, 204, 0));
        jButton13.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton13.setText("12");
        jMapa.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 40, 60));

        jButton8.setBackground(new java.awt.Color(0, 204, 0));
        jButton8.setText("7");
        jMapa.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 40, 60));

        jButton31.setBackground(new java.awt.Color(0, 204, 0));
        jButton31.setText("7");
        jMapa.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 40, 60));

        jButton16.setBackground(new java.awt.Color(0, 204, 0));
        jButton16.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton16.setText("15");
        jMapa.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 40, 60));

        jButton21.setBackground(new java.awt.Color(0, 204, 0));
        jButton21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton21.setText("M1");
        jMapa.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 50, 30));

        jButton17.setBackground(new java.awt.Color(0, 204, 0));
        jButton17.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton17.setText("16");
        jMapa.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 40, 60));

        jButton15.setBackground(new java.awt.Color(0, 204, 0));
        jButton15.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton15.setText("14");
        jMapa.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 40, 60));

        jButton26.setBackground(new java.awt.Color(0, 204, 0));
        jButton26.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton26.setText("13");
        jMapa.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 40, 60));

        jButton20.setBackground(new java.awt.Color(0, 204, 0));
        jButton20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton20.setText("M6");
        jMapa.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 50, 30));

        jButton27.setBackground(new java.awt.Color(0, 204, 0));
        jButton27.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton27.setText("14");
        jMapa.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 40, 60));

        jButton23.setBackground(new java.awt.Color(0, 204, 0));
        jButton23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton23.setText("M3");
        jMapa.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 50, 30));

        jButton22.setBackground(new java.awt.Color(0, 204, 0));
        jButton22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton22.setText("M2");
        jMapa.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 50, 30));

        jButton14.setBackground(new java.awt.Color(0, 204, 0));
        jButton14.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton14.setText("13");
        jMapa.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 40, 60));

        jButton41.setBackground(new java.awt.Color(0, 204, 0));
        jButton41.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton41.setText("18");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jMapa.add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 40, 60));

        jButton32.setBackground(new java.awt.Color(0, 204, 0));
        jButton32.setText("9");
        jMapa.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 40, 60));

        jButton6.setBackground(new java.awt.Color(0, 204, 0));
        jButton6.setText("5");
        jMapa.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 40, 60));

        jButton12.setBackground(new java.awt.Color(0, 204, 0));
        jButton12.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton12.setText("11");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jMapa.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 40, 60));

        jButton18.setBackground(new java.awt.Color(0, 204, 0));
        jButton18.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton18.setText("10");
        jMapa.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 40, 60));

        jButton42.setBackground(new java.awt.Color(0, 204, 0));
        jButton42.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton42.setText("17");
        jMapa.add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 40, 60));

        jPCuerpo.add(jMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 800, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                    .addComponent(jPCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 415, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConfigActionPerformed

    private void jBIngresarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresarVActionPerformed
        jPIngresoVehiculo.setVisible(true);
        jPRetirarVehiculo.setVisible(false);
    }//GEN-LAST:event_jBIngresarVActionPerformed

    private void jListar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jListar1ActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRetirarActionPerformed
        jPRetirarVehiculo.setVisible(true);
        jPIngresoVehiculo.setVisible(false);
    }//GEN-LAST:event_jBRetirarActionPerformed

    private void jBIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBIngresar1ActionPerformed

    private void jBSalirIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirIngresoActionPerformed
        jPIngresoVehiculo.setVisible(false);
    }//GEN-LAST:event_jBSalirIngresoActionPerformed

    private void jTxtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCedulaActionPerformed

    private void jTxtApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtApellido2ActionPerformed

    private void jTxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNombreActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jBIngresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBIngresar2ActionPerformed

    private void jBSalirRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirRetiroActionPerformed
        jPRetirarVehiculo.setVisible(false);
    }//GEN-LAST:event_jBSalirRetiroActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static String fecha(){
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }
            
            
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
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JButton jBIngresar1;
    private javax.swing.JButton jBIngresar2;
    private javax.swing.JButton jBIngresarV;
    private javax.swing.JButton jBRetirar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBSalirIngreso;
    private javax.swing.JButton jBSalirRetiro;
    private javax.swing.JButton jButton10;
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
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
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
    private javax.swing.JButton jListar1;
    private javax.swing.JPanel jMapa;
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
