package IGU;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


/**
 *
 * @author sgcm14
 */
public class AgendaElectronica extends javax.swing.JFrame {
//Declarando las variables globales

    String dni;
    String nombre;
    String apellido;
    String direccion;
    String telefono;
    String fechaNac;
    int indice=0;
    
    
//Declarando los vectores    
    String dnis [] = new String [10];
    String nombres [] = new String [10];
    String apellidos [] = new String [10];
    String direcciones [] = new String [10];
    String telefonos [] = new String [10];
    String fechaNacs [] = new String [10];
    
    public AgendaElectronica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfApellido = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblFechaNac = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        tfTelefono = new javax.swing.JTextField();
        tfFechaNac = new javax.swing.JTextField();
        btnGrabar = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        lblIndice = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblIndiceValor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lblTitulo.setFont(new java.awt.Font("Bernard MT Condensed", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 153));
        lblTitulo.setText("AGENDA ELECTRÓNICA");

        lblDni.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDni.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDni.setText("DNI :");

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre:");

        lblApellido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblApellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApellido.setText("Apellido:");

        lblDireccion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDireccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDireccion.setText("Dirección:");

        lblTelefono.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTelefono.setText("Teléfono:");

        lblFechaNac.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFechaNac.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFechaNac.setText("F. Nac.:");

        btnGrabar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setText("<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblIndice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblIndice.setText("Indice:");

        lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User.png"))); // NOI18N

        lblIndiceValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIndiceValor.setText("0");
        lblIndiceValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblIndiceValor.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(tfNombre)
                            .addComponent(tfDni))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(lblTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfDireccion)
                            .addComponent(tfTelefono)
                            .addComponent(tfFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImagen)))
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIndice)
                    .addComponent(btnBack))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIndiceValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74)
                .addComponent(btnNext)
                .addGap(260, 260, 260))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblTitulo)
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDni)
                            .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDireccion)
                            .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefono)
                            .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellido)
                            .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaNac)
                            .addComponent(tfFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lblImagen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrabar)
                    .addComponent(btnNext)
                    .addComponent(btnBack))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIndice)
                    .addComponent(lblIndiceValor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(204, 204, 204))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
    // Asignando variables a las cajas de texto
        dni=tfDni.getText();
        nombre=tfNombre.getText();
        apellido=tfApellido.getText();
        direccion=tfDireccion.getText();
        telefono=tfTelefono.getText();
        fechaNac=tfFechaNac.getText();
        
    // Validando que en el campo tfFechaNac se ingrese una fecha
                    SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
                    formatoDelTexto.setLenient(false);
                    boolean esFechaValida = true;
                    try {
                        if(!fechaNac.equals(""))
                            formatoDelTexto.parse(fechaNac);
                        
                        } catch (ParseException ex) {
                            esFechaValida = false;
                            JOptionPane.showMessageDialog(null, "El formato de fecha es: dd/MM/yyyy");
                        }
    /* Si el valor ingresado es una fecha entonces permitirá que se guarde en el indice indicado
     * De lo contrario pedirá se ingrese una fecha correcta
     */
            if(esFechaValida){
                dnis[indice]=dni;
                nombres[indice]=nombre;
                apellidos[indice]=apellido;
                direcciones[indice]=direccion;
                telefonos[indice]=telefono;
                fechaNacs[indice]=fechaNac;
                JOptionPane.showMessageDialog(null, "Se guardó en el indice ("+(indice)+")");
            }
        
        
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
    // si el indice es menor que 9 este incrementará su valor en 1
        if(indice<9){
            indice=indice+1;
            lblIndiceValor.setText(String.valueOf(indice));
    
    // Limpia las cajas de texto
            tfDni.setText("");
            tfNombre.setText("");
            tfApellido.setText("");
            tfDireccion.setText("");
            tfTelefono.setText("");
            tfFechaNac.setText("");
    
    // Seteando las cajas de texto de acuerdo al indice que se incrementó
            tfDni.setText(dnis[indice]);
            tfNombre.setText(nombres[indice]);
            tfApellido.setText(apellidos[indice]);
            tfDireccion.setText(direcciones[indice]);
            tfTelefono.setText(telefonos[indice]);
            tfFechaNac.setText(fechaNacs[indice]);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
    // si el indice es mayor que 0 este decrementará su valor en 1
        if(indice>0){
            indice=indice-1;
            lblIndiceValor.setText(String.valueOf(indice));

    // Limpia las cajas de texto
            tfDni.setText("");
            tfNombre.setText("");
            tfApellido.setText("");
            tfDireccion.setText("");
            tfTelefono.setText("");
            tfFechaNac.setText("");

    // Seteando las cajas de texto de acuerdo al indice que se incrementó
            tfDni.setText(dnis[indice]);
            tfNombre.setText(nombres[indice]);
            tfApellido.setText(apellidos[indice]);
            tfDireccion.setText(direcciones[indice]);
            tfTelefono.setText(telefonos[indice]);
            tfFechaNac.setText(fechaNacs[indice]);
        }
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnNext;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblFechaNac;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblIndice;
    private javax.swing.JLabel lblIndiceValor;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfFechaNac;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
