package Grafico;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;

public class Principal extends javax.swing.JFrame implements Runnable {

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
        hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);

    }

    public void run() {

        Thread current = Thread.currentThread();

        while (current == hilo) {
            hora();
            LabelHora.setText(hora + ":" + minutos + ":" + segundos);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogIn = new javax.swing.JPanel();
        jPassword = new javax.swing.JPasswordField();
        jUsuario = new javax.swing.JTextField();
        jRadioInv = new javax.swing.JRadioButton();
        jRadioAdm = new javax.swing.JRadioButton();
        jLimpiar = new javax.swing.JButton();
        jIniciarSesion = new javax.swing.JButton();
        jSalirLog = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setName(""); // NOI18N

        LogIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        LogIn.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 190, 30));

        jUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsuarioActionPerformed(evt);
            }
        });
        LogIn.add(jUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 190, -1));

        jRadioInv.setText("Invitado");
        LogIn.add(jRadioInv, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, 30));

        jRadioAdm.setText("Administrador");
        jRadioAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioAdmActionPerformed(evt);
            }
        });
        LogIn.add(jRadioAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, 30));

        jLimpiar.setBackground(new java.awt.Color(63, 150, 230));
        jLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLimpiar.setText("Limpiar");
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });
        LogIn.add(jLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 80, 30));

        jIniciarSesion.setBackground(new java.awt.Color(63, 150, 230));
        jIniciarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jIniciarSesion.setText("Iniciar sesión");
        jIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIniciarSesionActionPerformed(evt);
            }
        });
        LogIn.add(jIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 130, 30));

        jSalirLog.setBackground(new java.awt.Color(63, 150, 230));
        jSalirLog.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSalirLog.setText("Salir");
        jSalirLog.setPreferredSize(new java.awt.Dimension(75, 25));
        jSalirLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirLogActionPerformed(evt);
            }
        });
        LogIn.add(jSalirLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 80, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Log.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LogIn.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        jPMenu.setVisible(false);
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
        jPMenu.add(jBRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 120, 41));

        jBIngresarV.setBackground(new java.awt.Color(79, 119, 238));
        jBIngresarV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBIngresarV.setForeground(new java.awt.Color(255, 255, 255));
        jBIngresarV.setText("Ingresar vehículo");
        jBIngresarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresarVActionPerformed(evt);
            }
        });
        jPMenu.add(jBIngresarV, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 130, 41));

        jConfig.setBackground(new java.awt.Color(79, 119, 238));
        jConfig.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jConfig.setForeground(new java.awt.Color(255, 255, 255));
        jConfig.setText("Configuración");
        jConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfigActionPerformed(evt);
            }
        });
        jPMenu.add(jConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 130, 37));

        jBSalir.setBackground(new java.awt.Color(79, 119, 238));
        jBSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        jPMenu.add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 120, 37));

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/F1.png"))); // NOI18N
        jPMenu.add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 400));

        jPCuerpo.setVisible(false);
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
        jLabel2.setText("Retiro de Vehículos");
        jPRetirarVehiculo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 9, -1, 60));

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

        jPCuerpo.add(jPRetirarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 400));

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

        jPCuerpo.add(jPIngresoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 400));

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

        Espacio1.setBackground(new java.awt.Color(51, 204, 0));
        Espacio1.setText("1");
        Espacio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio1ActionPerformed(evt);
            }
        });
        jMapa.add(Espacio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 40, 60));

        Espacio2.setBackground(new java.awt.Color(51, 204, 0));
        Espacio2.setText("2");
        Espacio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio2ActionPerformed(evt);
            }
        });
        jMapa.add(Espacio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 40, 60));

        Espacio3.setBackground(new java.awt.Color(51, 204, 0));
        Espacio3.setText("3");
        Espacio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio3ActionPerformed(evt);
            }
        });
        jMapa.add(Espacio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 40, 60));

        Espacio4.setBackground(new java.awt.Color(51, 204, 0));
        Espacio4.setText("4");
        Espacio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio4ActionPerformed(evt);
            }
        });
        jMapa.add(Espacio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 40, 60));

        Espacio5.setBackground(new java.awt.Color(51, 204, 0));
        Espacio5.setText("5");
        Espacio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio5ActionPerformed(evt);
            }
        });
        jMapa.add(Espacio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 40, 60));

        Espacio6.setBackground(new java.awt.Color(51, 204, 0));
        Espacio6.setText("6");
        Espacio6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio6ActionPerformed(evt);
            }
        });
        jMapa.add(Espacio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 40, 60));

        Espacio7.setBackground(new java.awt.Color(51, 204, 0));
        Espacio7.setText("7");
        Espacio7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio7ActionPerformed(evt);
            }
        });
        jMapa.add(Espacio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 40, 60));

        Espacio8.setBackground(new java.awt.Color(51, 204, 0));
        Espacio8.setText("8");
        Espacio8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio8ActionPerformed(evt);
            }
        });
        jMapa.add(Espacio8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 40, 60));

        Espacio9.setBackground(new java.awt.Color(51, 204, 0));
        Espacio9.setText("9");
        Espacio9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio9ActionPerformed(evt);
            }
        });
        jMapa.add(Espacio9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 40, 60));

        Espacio10.setBackground(new java.awt.Color(51, 204, 0));
        Espacio10.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Espacio10.setText("10");
        Espacio10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio10ActionPerformed(evt);
            }
        });
        jMapa.add(Espacio10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 40, 60));

        Espacio11.setBackground(new java.awt.Color(51, 204, 0));
        Espacio11.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Espacio11.setText("11");
        Espacio11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio11ActionPerformed(evt);
            }
        });
        jMapa.add(Espacio11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 40, 60));

        Espacio12.setBackground(new java.awt.Color(51, 204, 0));
        Espacio12.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Espacio12.setText("12");
        Espacio12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio12ActionPerformed(evt);
            }
        });
        jMapa.add(Espacio12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 40, 60));

        Espacio13.setBackground(new java.awt.Color(51, 204, 0));
        Espacio13.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Espacio13.setText("13");
        Espacio13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio13ActionPerformed(evt);
            }
        });
        jMapa.add(Espacio13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 40, 60));

        Espacio14.setBackground(new java.awt.Color(51, 204, 0));
        Espacio14.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Espacio14.setText("14");
        Espacio14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio14ActionPerformed(evt);
            }
        });
        jMapa.add(Espacio14, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 40, 60));

        Espacio15.setBackground(new java.awt.Color(51, 204, 0));
        Espacio15.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Espacio15.setText("15");
        Espacio15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio15ActionPerformed(evt);
            }
        });
        jMapa.add(Espacio15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 40, 60));

        Espacio16.setBackground(new java.awt.Color(51, 204, 0));
        Espacio16.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Espacio16.setText("16");
        Espacio16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio16ActionPerformed(evt);
            }
        });
        jMapa.add(Espacio16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 40, 60));

        Espacio17.setBackground(new java.awt.Color(51, 204, 0));
        Espacio17.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Espacio17.setText("17");
        Espacio17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio17ActionPerformed(evt);
            }
        });
        jMapa.add(Espacio17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 40, 60));

        Espacio18.setBackground(new java.awt.Color(51, 204, 0));
        Espacio18.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Espacio18.setText("18");
        Espacio18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio18ActionPerformed(evt);
            }
        });
        jMapa.add(Espacio18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 40, 60));

        EspacioMoto1.setBackground(new java.awt.Color(51, 204, 0));
        EspacioMoto1.setText("M1");
        EspacioMoto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspacioMoto1ActionPerformed(evt);
            }
        });
        jMapa.add(EspacioMoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 50, 30));

        EspacioMoto2.setBackground(new java.awt.Color(51, 204, 0));
        EspacioMoto2.setText("M2");
        EspacioMoto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspacioMoto2ActionPerformed(evt);
            }
        });
        jMapa.add(EspacioMoto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 50, 30));

        EspacioMoto3.setBackground(new java.awt.Color(51, 204, 0));
        EspacioMoto3.setText("M3");
        EspacioMoto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspacioMoto3ActionPerformed(evt);
            }
        });
        jMapa.add(EspacioMoto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 50, 30));

        EspacioMoto4.setBackground(new java.awt.Color(51, 204, 0));
        EspacioMoto4.setText("M4");
        EspacioMoto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspacioMoto4ActionPerformed(evt);
            }
        });
        jMapa.add(EspacioMoto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 50, 30));

        EspacioMoto5.setBackground(new java.awt.Color(51, 204, 0));
        EspacioMoto5.setText("M5");
        EspacioMoto5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspacioMoto5ActionPerformed(evt);
            }
        });
        jMapa.add(EspacioMoto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 50, 30));

        EspacioMoto6.setBackground(new java.awt.Color(51, 204, 0));
        EspacioMoto6.setText("M6");
        EspacioMoto6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspacioMoto6ActionPerformed(evt);
            }
        });
        jMapa.add(EspacioMoto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 50, 30));

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
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(412, 412, 412)
                    .addComponent(LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(423, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                    .addComponent(jPCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 415, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConfigActionPerformed

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

    private void Espacio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio1ActionPerformed
        if (Espacio1.isSelected()) {
            Espacio1.setBackground(Color.red);
        }else{
            Espacio1.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_Espacio1ActionPerformed

    private void EspacioMoto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspacioMoto5ActionPerformed
        if (EspacioMoto5.isSelected()) {
            EspacioMoto5.setBackground(Color.red);
        }else{
            EspacioMoto5.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_EspacioMoto5ActionPerformed

    private void Espacio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio2ActionPerformed
        if (Espacio2.isSelected()) {
            Espacio2.setBackground(Color.red);
        }else{
            Espacio2.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_Espacio2ActionPerformed

    private void Espacio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio3ActionPerformed
        if (Espacio3.isSelected()) {
            Espacio3.setBackground(Color.red);
        }else{
            Espacio3.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_Espacio3ActionPerformed

    private void Espacio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio4ActionPerformed
        if (Espacio4.isSelected()) {
            Espacio4.setBackground(Color.red);
        }else{
            Espacio4.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_Espacio4ActionPerformed

    private void Espacio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio5ActionPerformed
        if (Espacio5.isSelected()) {
            Espacio5.setBackground(Color.red);
        }else{
            Espacio5.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_Espacio5ActionPerformed

    private void Espacio6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio6ActionPerformed
        if (Espacio6.isSelected()) {
            Espacio6.setBackground(Color.red);
        }else{
            Espacio6.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_Espacio6ActionPerformed

    private void Espacio7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio7ActionPerformed
        if (Espacio7.isSelected()) {
            Espacio7.setBackground(Color.red);
        }else{
            Espacio7.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_Espacio7ActionPerformed

    private void Espacio8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio8ActionPerformed
        if (Espacio8.isSelected()) {
            Espacio8.setBackground(Color.red);
        }else{
            Espacio8.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_Espacio8ActionPerformed

    private void Espacio9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio9ActionPerformed
        if (Espacio9.isSelected()) {
            Espacio9.setBackground(Color.red);
        }else{
            Espacio9.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_Espacio9ActionPerformed

    private void Espacio10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio10ActionPerformed
        if (Espacio10.isSelected()) {
            Espacio10.setBackground(Color.red);
        }else{
            Espacio10.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_Espacio10ActionPerformed

    private void Espacio11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio11ActionPerformed
        if (Espacio11.isSelected()) {
            Espacio11.setBackground(Color.red);
        }else{
            Espacio11.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_Espacio11ActionPerformed

    private void Espacio12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio12ActionPerformed
        if (Espacio12.isSelected()) {
            Espacio12.setBackground(Color.red);
        }else{
            Espacio12.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_Espacio12ActionPerformed

    private void Espacio13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio13ActionPerformed
        if (Espacio13.isSelected()) {
            Espacio13.setBackground(Color.red);
        }else{
            Espacio13.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_Espacio13ActionPerformed

    private void Espacio14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio14ActionPerformed
        if (Espacio14.isSelected()) {
            Espacio14.setBackground(Color.red);
        }else{
            Espacio14.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_Espacio14ActionPerformed

    private void Espacio15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio15ActionPerformed
        if (Espacio15.isSelected()) {
            Espacio15.setBackground(Color.red);
        }else{
            Espacio15.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_Espacio15ActionPerformed

    private void Espacio16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio16ActionPerformed
        if (Espacio16.isSelected()) {
            Espacio16.setBackground(Color.red);
        }else{
            Espacio16.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_Espacio16ActionPerformed

    private void Espacio17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio17ActionPerformed
        if (Espacio17.isSelected()) {
            Espacio17.setBackground(Color.red);
        }else{
            Espacio17.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_Espacio17ActionPerformed

    private void Espacio18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio18ActionPerformed
        if (Espacio18.isSelected()) {
            Espacio18.setBackground(Color.red);
        }else{
            Espacio18.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_Espacio18ActionPerformed

    private void EspacioMoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspacioMoto1ActionPerformed
        if (EspacioMoto1.isSelected()) {
            EspacioMoto1.setBackground(Color.red);
        }else{
            EspacioMoto1.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_EspacioMoto1ActionPerformed

    private void EspacioMoto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspacioMoto2ActionPerformed
        if (EspacioMoto2.isSelected()) {
            EspacioMoto2.setBackground(Color.red);
        }else{
            EspacioMoto2.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_EspacioMoto2ActionPerformed

    private void EspacioMoto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspacioMoto3ActionPerformed
        if (EspacioMoto3.isSelected()) {
            EspacioMoto3.setBackground(Color.red);
        }else{
            EspacioMoto3.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_EspacioMoto3ActionPerformed

    private void EspacioMoto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspacioMoto4ActionPerformed
        if (EspacioMoto4.isSelected()) {
            EspacioMoto4.setBackground(Color.red);
        }else{
            EspacioMoto4.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_EspacioMoto4ActionPerformed

    private void EspacioMoto6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspacioMoto6ActionPerformed
        if (EspacioMoto6.isSelected()) {
            EspacioMoto6.setBackground(Color.red);
        }else{
            EspacioMoto6.setBackground(new Color(51,204,0));
        }
    }//GEN-LAST:event_EspacioMoto6ActionPerformed

    private void jBIngresarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresarVActionPerformed
        jPIngresoVehiculo.setVisible(true);
        jPRetirarVehiculo.setVisible(false);
    }//GEN-LAST:event_jBIngresarVActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUsuarioActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        jPassword.setText(null);
        jUsuario.setText(null);
        jRadioAdm.setSelected(false);
        jRadioInv.setSelected(false);
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void jSalirLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirLogActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jSalirLogActionPerformed

    private void jIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIniciarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIniciarSesionActionPerformed

    private void jRadioAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioAdmActionPerformed

    /**
     * @param args the command line arguments
     */
    public static String fecha() {
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
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JPanel LogIn;
    private javax.swing.JButton jBIngresar1;
    private javax.swing.JButton jBIngresar2;
    private javax.swing.JButton jBIngresarV;
    private javax.swing.JButton jBRetirar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBSalirIngreso;
    private javax.swing.JButton jBSalirRetiro;
    private javax.swing.JButton jConfig;
    private javax.swing.JButton jIniciarSesion;
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
    private javax.swing.JButton jLimpiar;
    private javax.swing.JButton jListar1;
    private javax.swing.JPanel jMapa;
    private javax.swing.JPanel jPCuerpo;
    private javax.swing.JPanel jPIngresoVehiculo;
    private javax.swing.JPanel jPMenu;
    private javax.swing.JPanel jPRetirarVehiculo;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JRadioButton jRadioAdm;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioInv;
    private javax.swing.JPanel jReloj;
    private javax.swing.JButton jSalirLog;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTxtApellido1;
    private javax.swing.JTextField jTxtApellido2;
    private javax.swing.JTextField jTxtCedula;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtPlaca;
    private javax.swing.JTextField jTxtPlaca1;
    private javax.swing.JTextField jUsuario;
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
