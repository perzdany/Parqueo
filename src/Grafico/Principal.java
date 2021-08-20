package Grafico;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import static java.lang.Integer.parseInt;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame implements Runnable {

    int Total;
    int Cobrohora = 2500;

    String hora, minutos, segundos;
    Thread hilo;
    FondoPanel fondo = new FondoPanel();
    DefaultTableModel modelo = new DefaultTableModel();

    public void Abrir(String nombre) {
        try {
            File path = new File(nombre + ".pdf");
            Desktop.getDesktop().open(path);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Atencion", 2);
        }

    }

    public void generar(String nombre) throws FileNotFoundException, DocumentException {
        if (!jTxtNombre.getText().isEmpty()) {

            if (!jTxtApellido1.getText().isEmpty()) {

                if (!jTxtPlaca.getText().isEmpty()) {

                    FileOutputStream archivo = new FileOutputStream(nombre + ".Pdf");
                    Document Documento = new Document();
                    PdfWriter.getInstance(Documento, archivo);
                    Documento.open();

                    Paragraph parrafo = new Paragraph("Factura de Salida");
                    parrafo.setAlignment(1);
                    Documento.add(parrafo);

                    Documento.add(new Paragraph("Nombre:" + jTxtNombre.getText()));
                    Documento.add(new Paragraph("Apellidos:" + jTxtApellido1.getText() + "" + jTxtApellido2.getText()));
                    Documento.add(new Paragraph("Placa del vehiculo:" + jTxtPlaca.getText()));

                    Documento.add(Chunk.NEWLINE);

                    Documento.add(new Paragraph("Esta es la factrura por usar los servicios de parking click"));

                    Documento.add(Chunk.NEWLINE);

                    Documento.add(new Paragraph("Muchas gracias por utilizar parking Click"));
                    Documento.add(Chunk.NEWLINE);
                    Documento.add(new Paragraph("Fecha:" + LabelFecha.getText()));

                    Documento.close();
                    JOptionPane.showMessageDialog(null, "Factura creada correctamente ");

                } else {
                    JOptionPane.showMessageDialog(null, "Debe llenar como minimo los campos de Nombre/Apellidos/Placa ");
                }
            } else {

                JOptionPane.showMessageDialog(null, "Debe llenar como minimo los campos de Nombre/Apellidos/Placa ");

            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar como minimo los campos de Nombre/Apellidos/Placa");
        }

    }

    public void generarEntrada(String nombre) throws FileNotFoundException, DocumentException {

        FileOutputStream archivo = new FileOutputStream(nombre + ".Pdf");
        Document Documento = new Document();
        PdfWriter.getInstance(Documento, archivo);
        Documento.open();

        Paragraph parrafo = new Paragraph("Ticket de entrada Parking Click");
        parrafo.setAlignment(1);
        Documento.add(parrafo);

        Documento.add(new Paragraph("Nombre:" + jTxtNombre.getText()));
        Documento.add(new Paragraph("Apellidos:" + jTxtApellido1.getText() + "" + jTxtApellido2.getText()));
        Documento.add(new Paragraph("Placa del vehiculo:" + jTxtPlaca.getText()));

        Documento.add(Chunk.NEWLINE);

        Documento.add(new Paragraph("Esta es la factrura por entrar a los parqueos de parking click"));

        Documento.add(Chunk.NEWLINE);

        Documento.add(new Paragraph("Muchas gracias por utilizar parking Click"));
        Documento.add(Chunk.NEWLINE);
        Documento.add(new Paragraph("Fecha:" + LabelFecha.getText()));

        Documento.close();
        JOptionPane.showMessageDialog(null, "Factura creada correctamente ");

    }

    public Principal() {
        this.setContentPane(fondo);
        initComponents();
        LabelFecha.setText(fecha());
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);
        txtUsuarioverificar.grabFocus();
        jConfiguracion.setVisible(false);

        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido 1");
        modelo.addColumn("Apellido 2");
        modelo.addColumn("Cédula");
        modelo.addColumn("Placa");
        modelo.addColumn("Tipo transporte");
        modelo.addColumn("Posición");
        modelo.addColumn("Hora Entrada");
        modelo.addColumn("Hora Salida");
        modelo.addColumn("Total a Pagar");
        Tabla.setModel(modelo);

        botonesgrupo1.add(opcionAdmin);
        botonesgrupo1.add(opcionInvitado);

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

        botonesgrupo1 = new javax.swing.ButtonGroup();
        jPMenu = new javax.swing.JPanel();
        jBRetirar = new javax.swing.JButton();
        jBIngresarV = new javax.swing.JButton();
        jConfig = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();
        LogIn = new javax.swing.JPanel();
        txtUsuarioverificar = new javax.swing.JTextField();
        contra = new javax.swing.JTextField();
        opcionInvitado = new javax.swing.JRadioButton();
        opcionAdmin = new javax.swing.JRadioButton();
        jLimpiar = new javax.swing.JButton();
        jIniciarSesion = new javax.swing.JButton();
        jSalirLog = new javax.swing.JButton();
        jIniciarSesion1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPCuerpo = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        JRegistrarse = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jBIngresar2 = new javax.swing.JButton();
        jBIngresar5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        HorasE = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        placaverificar1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jBIngresar4 = new javax.swing.JButton();
        jBSalirRetiro = new javax.swing.JButton();
        jPIngresoVehiculo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Vehiculo = new javax.swing.JRadioButton();
        Moto = new javax.swing.JRadioButton();
        jTxtNombre = new javax.swing.JTextField();
        jTxtApellido1 = new javax.swing.JTextField();
        jTxtApellido2 = new javax.swing.JTextField();
        jTxtCedula = new javax.swing.JTextField();
        jTxtPlaca = new javax.swing.JTextField();
        jBSalirIngreso = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBIngresar1 = new javax.swing.JButton();
        ComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jBIngresar3 = new javax.swing.JButton();
        jConfiguracion = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Buscarfactura = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jMapa = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jReloj = new javax.swing.JPanel();
        LabelFecha = new javax.swing.JLabel();
        LabelHora = new javax.swing.JLabel();
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
        jListar2 = new javax.swing.JButton();
        jTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jListar1 = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setExtendedState(6);
        setName(""); // NOI18N
        setSize(new java.awt.Dimension(0, 0));

        jPMenu.setVisible(false);
        jPMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPMenu.setMinimumSize(new java.awt.Dimension(300, 400));
        jPMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBRetirar.setBackground(new java.awt.Color(63, 150, 230));
        jBRetirar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBRetirar.setText("Retirar vehículo");
        jBRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRetirarActionPerformed(evt);
            }
        });
        jPMenu.add(jBRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 140, 41));

        jBIngresarV.setBackground(new java.awt.Color(63, 150, 230));
        jBIngresarV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBIngresarV.setText("Ingresar vehículo");
        jBIngresarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresarVActionPerformed(evt);
            }
        });
        jPMenu.add(jBIngresarV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 150, 41));

        jConfig.setBackground(new java.awt.Color(63, 150, 230));
        jConfig.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jConfig.setText("Configuración");
        jConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfigActionPerformed(evt);
            }
        });
        jPMenu.add(jConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 150, 37));

        jBSalir.setBackground(new java.awt.Color(63, 150, 230));
        jBSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBSalir.setText("Cerrar Sesión");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        jPMenu.add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 140, 37));

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/F1.png"))); // NOI18N
        jPMenu.add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 400));

        LogIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuarioverificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioverificarActionPerformed(evt);
            }
        });
        LogIn.add(txtUsuarioverificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 190, -1));

        contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraActionPerformed(evt);
            }
        });
        LogIn.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 190, -1));

        opcionInvitado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        opcionInvitado.setText("Invitado");
        LogIn.add(opcionInvitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, 30));

        opcionAdmin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        opcionAdmin.setText("Administrador");
        opcionAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionAdminActionPerformed(evt);
            }
        });
        LogIn.add(opcionAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, 30));

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
        jIniciarSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        jIniciarSesion1.setBackground(new java.awt.Color(0, 0, 0));
        jIniciarSesion1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jIniciarSesion1.setForeground(new java.awt.Color(255, 255, 255));
        jIniciarSesion1.setText("Registrarse");
        jIniciarSesion1.setBorder(null);
        jIniciarSesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIniciarSesion1ActionPerformed(evt);
            }
        });
        LogIn.add(jIniciarSesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 110, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Log.png"))); // NOI18N
        jLabel8.setAlignmentY(0.0F);
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LogIn.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 490));

        jPCuerpo.setVisible(false);
        jPCuerpo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPCuerpo.setMinimumSize(new java.awt.Dimension(1219, 498));
        jPCuerpo.setPreferredSize(new java.awt.Dimension(1219, 498));
        jPCuerpo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPCuerpo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, -20, 10, 440));

        JRegistrarse.setEnabled(false);
        JRegistrarse.setPreferredSize(new java.awt.Dimension(300, 400));
        JRegistrarse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel2.setText("Retiro de Vehículos");
        JRegistrarse.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 9, -1, 60));

        jBIngresar2.setBackground(new java.awt.Color(63, 150, 230));
        jBIngresar2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBIngresar2.setText("Abrir Factura");
        jBIngresar2.setToolTipText("");
        jBIngresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresar2ActionPerformed(evt);
            }
        });
        JRegistrarse.add(jBIngresar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 120, 30));

        jBIngresar5.setBackground(new java.awt.Color(63, 150, 230));
        jBIngresar5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBIngresar5.setText("Crear Factura");
        jBIngresar5.setToolTipText("");
        jBIngresar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresar5ActionPerformed(evt);
            }
        });
        JRegistrarse.add(jBIngresar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 130, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Horas de uso:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Placa:");

        jBIngresar4.setBackground(new java.awt.Color(63, 150, 230));
        jBIngresar4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBIngresar4.setText("Retirar");
        jBIngresar4.setToolTipText("");
        jBIngresar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresar4ActionPerformed(evt);
            }
        });

        jBSalirRetiro.setBackground(new java.awt.Color(63, 150, 230));
        jBSalirRetiro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBSalirRetiro.setText("Salir");
        jBSalirRetiro.setToolTipText("");
        jBSalirRetiro.setActionCommand("");
        jBSalirRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirRetiroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(placaverificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(HorasE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jBIngresar4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jBSalirRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HorasE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placaverificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBIngresar4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalirRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        JRegistrarse.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        JRegistrarse.setVisible(false);

        jPCuerpo.add(JRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 400));

        jPIngresoVehiculo.setName(""); // NOI18N
        jPIngresoVehiculo.setPreferredSize(new java.awt.Dimension(300, 400));
        jPIngresoVehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        jPIngresoVehiculo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 82, -1, 28));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Apellido 1:");
        jPIngresoVehiculo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 116, -1, 28));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Apellido 2:");
        jPIngresoVehiculo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 150, -1, 28));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Cédula:");
        jPIngresoVehiculo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 184, -1, 28));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Seleccione posición:");
        jPIngresoVehiculo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 298, 130, 20));

        botonesgrupo1.add(Vehiculo);
        Vehiculo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Vehiculo.setText("Carro");
        Vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehiculoActionPerformed(evt);
            }
        });
        jPIngresoVehiculo.add(Vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        botonesgrupo1.add(Moto);
        Moto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Moto.setText("Motocicleta");
        jPIngresoVehiculo.add(Moto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

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
        jPIngresoVehiculo.add(jBSalirIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 90, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setText("Ingreso de Vehículos");
        jPIngresoVehiculo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 220, 60));

        jBIngresar1.setBackground(new java.awt.Color(63, 150, 230));
        jBIngresar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBIngresar1.setText("Ingresar");
        jBIngresar1.setToolTipText("");
        jBIngresar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBIngresar1MouseEntered(evt);
            }
        });
        jBIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresar1ActionPerformed(evt);
            }
        });
        jPIngresoVehiculo.add(jBIngresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 90, 40));

        ComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Posición 1", "Posición 2", "Posición 3", "Posición 4", "Posición 5", "Posición 6", "Posición 7", "Posición 8", "Posición 9", "Posición 10", "Posición 11", "Posición 12", "Posición 13", "Posición 14", "Posición 15", "Posición 16           ", "Posición 17", "Posición 18", "Posición M1", "Posición M2", "Posición M3", "Posición M4", "Posición M5", "Posición M6", "            " }));
        ComboBox.setToolTipText("");
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });
        jPIngresoVehiculo.add(ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 290, 120, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Placa:");
        jPIngresoVehiculo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 218, -1, 28));

        jBIngresar3.setBackground(new java.awt.Color(63, 150, 230));
        jBIngresar3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBIngresar3.setText("Limpiar");
        jBIngresar3.setToolTipText("");
        jBIngresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresar3ActionPerformed(evt);
            }
        });
        jPIngresoVehiculo.add(jBIngresar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 100, 40));

        jPIngresoVehiculo.setVisible(false);

        jPCuerpo.add(jPIngresoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 400));

        jConfiguracion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jConfiguracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel10.setText("Configuración de Costos");
        jConfiguracion.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Nombre de factura:");
        jConfiguracion.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));
        jConfiguracion.add(Buscarfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 150, -1));

        jButton1.setBackground(new java.awt.Color(63, 150, 230));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Cambiar precio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jConfiguracion.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 150, 30));

        jButton2.setBackground(new java.awt.Color(63, 150, 230));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Buscar Factura");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jConfiguracion.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 150, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Costo por hora:");
        jConfiguracion.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));
        jConfiguracion.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 150, -1));

        jPCuerpo.add(jConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 410));

        jMapa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel34.setText("Mapa del Parqueo");
        jMapa.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 17, -1, 40));

        jReloj.setBackground(new java.awt.Color(255, 255, 255));
        jReloj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        jListar2.setBackground(new java.awt.Color(63, 150, 230));
        jListar2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jListar2.setText("Ver lista de ingresos");
        jListar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListar2ActionPerformed(evt);
            }
        });
        jMapa.add(jListar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 190, 40));

        jPCuerpo.add(jMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 800, 400));

        jTabla.setVisible(false);
        jTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Tabla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(Tabla);

        jListar1.setBackground(new java.awt.Color(63, 150, 230));
        jListar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jListar1.setText("Editar Tabla");
        jListar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListar1ActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(63, 150, 230));
        btnBorrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBorrar.setText("Borrar Tabla");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jTablaLayout = new javax.swing.GroupLayout(jTabla);
        jTabla.setLayout(jTablaLayout);
        jTablaLayout.setHorizontalGroup(
            jTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTablaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jListar1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jTablaLayout.setVerticalGroup(
            jTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jListar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 116, Short.MAX_VALUE)
                    .addComponent(LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 115, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfigActionPerformed
        JRegistrarse.setVisible(false);
        jPIngresoVehiculo.setVisible(false);
        jConfiguracion.setVisible(true);

    }//GEN-LAST:event_jConfigActionPerformed

    private void jListar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListar1ActionPerformed

    }//GEN-LAST:event_jListar1ActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        jPMenu.setVisible(false);
        jPCuerpo.setVisible(false);
        LogIn.setVisible(true);
        contra.setText(null);
        txtUsuarioverificar.setText(null);
        opcionAdmin.setSelected(false);
        opcionInvitado.setSelected(false);
        jTabla.setVisible(false);
        jConfiguracion.setVisible(false);
        txtUsuarioverificar.grabFocus();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRetirarActionPerformed
        JRegistrarse.setVisible(true);
        jPIngresoVehiculo.setVisible(false);
        placaverificar1.grabFocus();
    }//GEN-LAST:event_jBRetirarActionPerformed

    private void jBIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresar1ActionPerformed

        if (!jTxtNombre.getText().isEmpty()) {

            if (!jTxtApellido1.getText().isEmpty()) {

                if (!jTxtPlaca.getText().isEmpty()) {

                    String boton = "";
                    if (Vehiculo.isSelected()) {
                        boton = "Carro";
                    } else if (Moto.isSelected()) {
                        boton = "Moto";
                    }

                    String combo = ComboBox.getSelectedItem().toString();

                    if (combo.equals("Posición 1")) {
                        Espacio1.setBackground(Color.red);
                    }
                    if (combo.equals("Posición 2")) {
                        Espacio2.setBackground(Color.red);
                    }
                    if (combo.equals("Posición 3")) {
                        Espacio3.setBackground(Color.red);
                    }
                    if (combo.equals("Posición 4")) {
                        Espacio4.setBackground(Color.red);
                    }
                    if (combo.equals("Posición 5")) {
                        Espacio5.setBackground(Color.red);
                    }
                    if (combo.equals("Posición 6")) {
                        Espacio6.setBackground(Color.red);
                    }
                    if (combo.equals("Posición 7")) {
                        Espacio7.setBackground(Color.red);
                    }
                    if (combo.equals("Posición 8")) {
                        Espacio8.setBackground(Color.red);
                    }
                    if (combo.equals("Posición 9")) {
                        Espacio9.setBackground(Color.red);
                    }
                    if (combo.equals("Posición 10")) {
                        Espacio10.setBackground(Color.red);
                    }
                    if (combo.equals("Posición 11")) {
                        Espacio11.setBackground(Color.red);
                    }
                    if (combo.equals("Posición 12")) {
                        Espacio12.setBackground(Color.red);
                    }
                    if (combo.equals("Posición 13")) {
                        Espacio13.setBackground(Color.red);
                    }
                    if (combo.equals("Posición 14")) {
                        Espacio14.setBackground(Color.red);
                    }
                    if (combo.equals("Posición 15")) {
                        Espacio15.setBackground(Color.red);
                    }
                    if (combo.equals("Posición 16")) {
                        Espacio16.setBackground(Color.red);
                    }
                    if (combo.equals("Posición 17")) {
                        Espacio17.setBackground(Color.red);
                    }
                    if (combo.equals("Posición 18")) {
                        Espacio18.setBackground(Color.red);
                    }
                    if (combo.equals("Posición M1")) {
                        EspacioMoto1.setBackground(Color.red);
                    }
                    if (combo.equals("Posición M2")) {
                        EspacioMoto2.setBackground(Color.red);
                    }
                    if (combo.equals("Posición M3")) {
                        EspacioMoto3.setBackground(Color.red);
                    }
                    if (combo.equals("Posición M4")) {
                        EspacioMoto4.setBackground(Color.red);
                    }
                    if (combo.equals("Posición M5")) {
                        EspacioMoto5.setBackground(Color.red);
                    }
                    if (combo.equals("Posición M6")) {
                        EspacioMoto6.setBackground(Color.red);
                    }

                    String Dato[] = new String[7];
                    Dato[0] = jTxtNombre.getText();
                    Dato[1] = jTxtApellido1.getText();
                    Dato[2] = jTxtApellido2.getText();
                    Dato[3] = jTxtCedula.getText();
                    Dato[4] = jTxtPlaca.getText();
                    Dato[5] = boton.toString();
                    Dato[6] = ComboBox.getSelectedItem().toString();
                    /* Dato[7]=*/

                    modelo.addRow(Dato);

                    try {
                        generarEntrada(jTxtNombre.getText());
                    } catch (FileNotFoundException e) {
                        System.err.println(e.getMessage());
                    } catch (DocumentException e) {
                        System.err.println(e.getMessage());

                    }

                    if (!jTxtNombre.getText().isEmpty()) {
                        Abrir(jTxtNombre.getText());

                    } else {
                        JOptionPane.showMessageDialog(null, "Campo de nombre vacio");
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Placa en blanco /n "
                            + "Porfavor ingrese su placa");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Apellido en blanco /n "
                        + "Porfavor ingrese el Apellidp");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nombre en blanco /n "
                    + "Porfavor ingrese el Nombre");
        }
    }//GEN-LAST:event_jBIngresar1ActionPerformed

    public void limpiar() {
        jTxtNombre.setText("");
        jTxtApellido1.setText("");
        jTxtApellido2.setText("");
        jTxtCedula.setText("");
        jTxtPlaca.setText("");
        botonesgrupo1.clearSelection();
        jTxtNombre.requestFocus();
    }

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

    private void VehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VehiculoActionPerformed

    private void jBIngresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresar2ActionPerformed
        if (!jTxtNombre.getText().isEmpty()) {
            Abrir(jTxtNombre.getText());

        } else {
            JOptionPane.showMessageDialog(null, "Campo de nombre vacio");
        }
    }//GEN-LAST:event_jBIngresar2ActionPerformed

    private void jBSalirRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirRetiroActionPerformed
        JRegistrarse.setVisible(false);
    }//GEN-LAST:event_jBSalirRetiroActionPerformed

    private void Espacio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio1ActionPerformed

    }//GEN-LAST:event_Espacio1ActionPerformed

    private void EspacioMoto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspacioMoto5ActionPerformed

    }//GEN-LAST:event_EspacioMoto5ActionPerformed

    private void Espacio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio2ActionPerformed

    }//GEN-LAST:event_Espacio2ActionPerformed

    private void Espacio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio3ActionPerformed

    }//GEN-LAST:event_Espacio3ActionPerformed

    private void Espacio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio4ActionPerformed

    }//GEN-LAST:event_Espacio4ActionPerformed

    private void Espacio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio5ActionPerformed

    }//GEN-LAST:event_Espacio5ActionPerformed

    private void Espacio6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio6ActionPerformed

    }//GEN-LAST:event_Espacio6ActionPerformed

    private void Espacio7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio7ActionPerformed

    }//GEN-LAST:event_Espacio7ActionPerformed

    private void Espacio8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio8ActionPerformed

    }//GEN-LAST:event_Espacio8ActionPerformed

    private void Espacio9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio9ActionPerformed

    }//GEN-LAST:event_Espacio9ActionPerformed

    private void Espacio10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio10ActionPerformed

    }//GEN-LAST:event_Espacio10ActionPerformed

    private void Espacio11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio11ActionPerformed

    }//GEN-LAST:event_Espacio11ActionPerformed

    private void Espacio12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio12ActionPerformed

    }//GEN-LAST:event_Espacio12ActionPerformed

    private void Espacio13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio13ActionPerformed

    }//GEN-LAST:event_Espacio13ActionPerformed

    private void Espacio14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio14ActionPerformed

    }//GEN-LAST:event_Espacio14ActionPerformed

    private void Espacio15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio15ActionPerformed

    }//GEN-LAST:event_Espacio15ActionPerformed

    private void Espacio16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio16ActionPerformed

    }//GEN-LAST:event_Espacio16ActionPerformed

    private void Espacio17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio17ActionPerformed

    }//GEN-LAST:event_Espacio17ActionPerformed

    private void Espacio18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio18ActionPerformed

    }//GEN-LAST:event_Espacio18ActionPerformed

    private void EspacioMoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspacioMoto1ActionPerformed

    }//GEN-LAST:event_EspacioMoto1ActionPerformed

    private void EspacioMoto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspacioMoto2ActionPerformed

    }//GEN-LAST:event_EspacioMoto2ActionPerformed

    private void EspacioMoto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspacioMoto3ActionPerformed

    }//GEN-LAST:event_EspacioMoto3ActionPerformed

    private void EspacioMoto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspacioMoto4ActionPerformed

    }//GEN-LAST:event_EspacioMoto4ActionPerformed

    private void EspacioMoto6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspacioMoto6ActionPerformed

    }//GEN-LAST:event_EspacioMoto6ActionPerformed

    private void jBIngresarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresarVActionPerformed
        jPIngresoVehiculo.setVisible(true);
        JRegistrarse.setVisible(false);
        jTxtNombre.grabFocus();
    }//GEN-LAST:event_jBIngresarVActionPerformed

    private void txtUsuarioverificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioverificarActionPerformed
        txtUsuarioverificar.grabFocus();
    }//GEN-LAST:event_txtUsuarioverificarActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        txtUsuarioverificar.setText(null);
        contra.setText(null);
        botonesgrupo1.clearSelection();
        txtUsuarioverificar.grabFocus();
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void jSalirLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirLogActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jSalirLogActionPerformed

    private void jIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIniciarSesionActionPerformed

        DatosdelRegistro r = new DatosdelRegistro();
        String mensaje = "";
        String Nombredijit;
        String passdijit;

        Nombredijit = txtUsuarioverificar.getText();
        passdijit = contra.getText();

        if (!txtUsuarioverificar.getText().isEmpty()) {

            if (!contra.getText().isEmpty()) {

                if (opcionAdmin.isSelected()) {

                    mensaje = "Ingresando a Sistema de Administrador";
                    for (DatosdelRegistro d : Logica.usuariosLista) {
                        if (!Nombredijit.equals(d.getNombre())) {
                            JOptionPane.showMessageDialog(rootPane, "Nombre incorrecto, mi pana");
                            break;
                        } else if (!passdijit.equals(d.getPass())) {
                            JOptionPane.showMessageDialog(rootPane, "Password incorrecto incorrecto, mi pana");
                            break;

                        } else if (!d.getPerfil().equalsIgnoreCase("a")) {

                            JOptionPane.showMessageDialog(rootPane, "Usted esta intentando ingresar como Admin \n"
                                    + "y esta registrado como Invitado");

                        } else if (d.getPerfil().equalsIgnoreCase("a")) {
                            JOptionPane.showMessageDialog(this, mensaje + " \nBienvenido, " + d.getNombre());

                            jPMenu.setVisible(true);
                            LogIn.setVisible(false);
                            jPCuerpo.setVisible(true);

                        } else if (!txtUsuarioverificar.getText().isEmpty()) {

                            JOptionPane.showMessageDialog(rootPane, "Usuario en blanco /n "
                                    + "Porfavor ingrese el usuario");

                        } else if (!contra.getText().isEmpty()) {

                            JOptionPane.showMessageDialog(rootPane, "Contraseña en blanco /n"
                                    + "Porfavor ingrese la contraseña");
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Datos incorrectos");
                        }

                    }

                } else if (opcionInvitado.isSelected()) {

                    mensaje = "Ingresando a Sistema de Invitado";

                    for (DatosdelRegistro d : Logica.usuariosLista) {
                        if (!Nombredijit.equals(d.getNombre())) {
                            JOptionPane.showMessageDialog(rootPane, "Nombre incorrecto");
                            break;
                        } else if (!passdijit.equals(d.getPass())) {
                            JOptionPane.showMessageDialog(rootPane, "Password incorrecto incorrecto");
                            break;

                        } else if (!d.getPerfil().equalsIgnoreCase("i")) {

                            JOptionPane.showMessageDialog(rootPane, "Usted esta intentando ingresar como Invitado \n"
                                    + "y esta registrado como Administrador");

                        } else if (d.getPerfil().equalsIgnoreCase("i")) {
                            JOptionPane.showMessageDialog(this, mensaje + " \nBienvenido, " + d.getNombre());

                            jPMenu.setVisible(true);
                            LogIn.setVisible(false);
                            jPCuerpo.setVisible(true);
                            jConfiguracion.setVisible(false);
                            jListar2.setVisible(false);

                        } else if (!txtUsuarioverificar.getText().isEmpty()) {

                            JOptionPane.showMessageDialog(rootPane, "Usuario en blanco /n "
                                    + "Porfavor ingrese el usuario");

                        } else if (!contra.getText().isEmpty()) {

                            JOptionPane.showMessageDialog(rootPane, "Contraseña en blanco /n"
                                    + "Porfavor ingrese la contraseña");

                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Datos incorrectos");
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Debe seleccionar el tipo de perfil");
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Debe de llenar los campos en blanco");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe de llenar los campos en blanco");
        }
    }//GEN-LAST:event_jIniciarSesionActionPerformed

    private void opcionAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionAdminActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed

    }//GEN-LAST:event_ComboBoxActionPerformed

    private void jIniciarSesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIniciarSesion1ActionPerformed

        Registro r = new Registro();
        r.setVisible(true);
    }//GEN-LAST:event_jIniciarSesion1ActionPerformed

    private void jBIngresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresar3ActionPerformed
        limpiar();

    }//GEN-LAST:event_jBIngresar3ActionPerformed

    private void jListar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListar2ActionPerformed
        jTabla.setVisible(true);
    }//GEN-LAST:event_jListar2ActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int fila = Tabla.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            modelo.removeRow(i);

        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void jBIngresar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBIngresar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jBIngresar1MouseEntered

    private void contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraActionPerformed

    private void jBIngresar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresar4ActionPerformed

        if (!HorasE.getText().isEmpty()) {

            if (!placaverificar1.getText().isEmpty()) {
                DatosdelRegistro drr = new DatosdelRegistro();
                
                String placaverificar = placaverificar1.getText();
                int horas;

                horas = Integer.parseInt(HorasE.getText());
                Total = horas * Cobrohora;
                
                

                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    Espacio1.setBackground(Color.green);
                } else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    Espacio2.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    Espacio3.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    Espacio4.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    Espacio5.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    Espacio6.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    Espacio7.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    Espacio8.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    Espacio9.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    Espacio10.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    Espacio11.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    Espacio12.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    Espacio13.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    Espacio14.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    Espacio15.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    Espacio16.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    Espacio17.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    Espacio18.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    EspacioMoto1.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    EspacioMoto2.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    EspacioMoto3.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    EspacioMoto4.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    EspacioMoto5.setBackground(Color.green);
                }
                if (placaverificar.equalsIgnoreCase(jTxtPlaca.getText())) {
                    EspacioMoto6.setBackground(Color.green);
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Debe indicar la placa de su vehiculo");
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe indicar cuantas hora utilizo el parqueo");
        }


    }//GEN-LAST:event_jBIngresar4ActionPerformed

    private void jBIngresar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresar5ActionPerformed

        try {
            generar(jTxtNombre.getText());
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (DocumentException e) {
            System.err.println(e.getMessage());

        }


    }//GEN-LAST:event_jBIngresar5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!Buscarfactura.getText().isEmpty()) {
            Abrir(Buscarfactura.getText());

        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar que factura buscar /n"
                    + "'Crack'");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JTextField Buscarfactura;
    private javax.swing.JComboBox<String> ComboBox;
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
    private javax.swing.JTextField HorasE;
    private javax.swing.JPanel JRegistrarse;
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JPanel LogIn;
    private javax.swing.JRadioButton Moto;
    private javax.swing.JTable Tabla;
    private javax.swing.JRadioButton Vehiculo;
    private javax.swing.ButtonGroup botonesgrupo1;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JTextField contra;
    private javax.swing.JButton jBIngresar1;
    private javax.swing.JButton jBIngresar2;
    private javax.swing.JButton jBIngresar3;
    private javax.swing.JButton jBIngresar4;
    private javax.swing.JButton jBIngresar5;
    private javax.swing.JButton jBIngresarV;
    private javax.swing.JButton jBRetirar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBSalirIngreso;
    private javax.swing.JButton jBSalirRetiro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jConfig;
    private javax.swing.JPanel jConfiguracion;
    private javax.swing.JButton jIniciarSesion;
    private javax.swing.JButton jIniciarSesion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JButton jListar1;
    private javax.swing.JButton jListar2;
    private javax.swing.JPanel jMapa;
    private javax.swing.JPanel jPCuerpo;
    private javax.swing.JPanel jPIngresoVehiculo;
    private javax.swing.JPanel jPMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jReloj;
    private javax.swing.JButton jSalirLog;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jTabla;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTxtApellido1;
    private javax.swing.JTextField jTxtApellido2;
    private javax.swing.JTextField jTxtCedula;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtPlaca;
    private javax.swing.JRadioButton opcionAdmin;
    private javax.swing.JRadioButton opcionInvitado;
    private javax.swing.JTextField placaverificar1;
    private javax.swing.JTextField txtUsuarioverificar;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/r.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    }
}
