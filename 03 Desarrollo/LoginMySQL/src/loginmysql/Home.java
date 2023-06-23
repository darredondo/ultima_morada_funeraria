package loginmysql;



import java.awt.Color;
import java.awt.event.MouseEvent;


public class Home extends javax.swing.JFrame {

   
   int MouseX,MouseY;
    public Home() {
        initComponents();
        cboservicios.addItem("Traslados");
        cboservicios.addItem("Cremaciones");
        cboservicios.addItem("Velatorio");
        
        cbosexo.addItem("Hombre");
        cbosexo.addItem("Mujer");
        
        cbopago.addItem("Efectivo");
        cbopago.addItem("Tarjeta");
        
        
        
        this.setLocationRelativeTo(null);
        
  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        PanelPrincipal = new javax.swing.JPanel();
        BarraLateral = new javax.swing.JPanel();
        Button_Mi_Info = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Button_Busqueda = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        Panel_Exit = new javax.swing.JPanel();
        Button_Exit = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Button_Home = new javax.swing.JLabel();
        Button_Documentos = new javax.swing.JLabel();
        Button_info = new javax.swing.JLabel();
        Button_Ajustes = new javax.swing.JLabel();
        PanelContenedor = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbosexo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbopago = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboservicios = new javax.swing.JComboBox<>();
        Panel_Min = new javax.swing.JPanel();
        Button_Min = new javax.swing.JLabel();
        Panel_Close = new javax.swing.JPanel();
        Button_Close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraLateral.setBackground(new java.awt.Color(204, 204, 255));
        BarraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Mi_Info.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Button_Mi_Info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Mi_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/usuario48.png"))); // NOI18N
        Button_Mi_Info.setText("Ver mi Información");
        Button_Mi_Info.setToolTipText("");
        Button_Mi_Info.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_Mi_Info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Mi_Info.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraLateral.add(Button_Mi_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Busqueda.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Button_Busqueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Busqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/búsqueda-35.png"))); // NOI18N
        Button_Busqueda.setToolTipText("");
        Button_Busqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_Busqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_BusquedaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_BusquedaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_BusquedaMouseExited(evt);
            }
        });
        jPanel1.add(Button_Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 210, 40));

        BarraLateral.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, 40));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        BarraLateral.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 210, 40));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        BarraLateral.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 210, 40));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        BarraLateral.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 210, 40));

        Panel_Exit.setBackground(new java.awt.Color(102, 0, 0));
        Panel_Exit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Exit.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        Button_Exit.setForeground(new java.awt.Color(255, 255, 255));
        Button_Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Exit.setText("Salir");
        Button_Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_ExitMouseExited(evt);
            }
        });
        Panel_Exit.add(Button_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        BarraLateral.add(Panel_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 190, 40));

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Home.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Button_Home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/windows-35.png"))); // NOI18N
        Button_Home.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_HomeMouseExited(evt);
            }
        });
        jPanel7.add(Button_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

        BarraLateral.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 210, 40));

        Button_Documentos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Button_Documentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Documentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/documento-35.png"))); // NOI18N
        Button_Documentos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_Documentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_DocumentosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_DocumentosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_DocumentosMouseExited(evt);
            }
        });
        BarraLateral.add(Button_Documentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 210, 40));

        Button_info.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Button_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/información-35.png"))); // NOI18N
        Button_info.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_infoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_infoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_infoMouseExited(evt);
            }
        });
        BarraLateral.add(Button_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 210, 40));

        Button_Ajustes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Button_Ajustes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ajustes-35.png"))); // NOI18N
        Button_Ajustes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_Ajustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_AjustesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_AjustesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_AjustesMouseExited(evt);
            }
        });
        BarraLateral.add(Button_Ajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 210, 40));

        PanelPrincipal.add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 550));

        PanelContenedor.setBackground(new java.awt.Color(102, 255, 255));
        PanelContenedor.setForeground(new java.awt.Color(51, 255, 255));

        jButton1.setText("Plan Previsor");

        jButton2.setText("Consultar Reportes");

        jToggleButton1.setText("Cambiar Contraseña");

        jButton3.setText("Gestionar Cuentas");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Sexo");

        cbosexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbosexoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Forma de pago");

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("servicios");

        cboservicios.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout PanelContenedorLayout = new javax.swing.GroupLayout(PanelContenedor);
        PanelContenedor.setLayout(PanelContenedorLayout);
        PanelContenedorLayout.setHorizontalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelContenedorLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(15, 15, 15)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton1))
                    .addGroup(PanelContenedorLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbosexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelContenedorLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbopago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
            .addGroup(PanelContenedorLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboservicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelContenedorLayout.setVerticalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenedorLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jToggleButton1)
                    .addComponent(jButton3))
                .addGap(37, 37, 37)
                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(cbosexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbopago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboservicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(249, Short.MAX_VALUE))
        );

        PanelPrincipal.add(PanelContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 760, 500));

        Panel_Min.setBackground(new java.awt.Color(255, 255, 255));

        Button_Min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Min.setText("—");
        Button_Min.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_MinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_MinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_MinMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel_MinLayout = new javax.swing.GroupLayout(Panel_Min);
        Panel_Min.setLayout(Panel_MinLayout);
        Panel_MinLayout.setHorizontalGroup(
            Panel_MinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button_Min, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        Panel_MinLayout.setVerticalGroup(
            Panel_MinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button_Min, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        PanelPrincipal.add(Panel_Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, -1, 30));

        Panel_Close.setBackground(new java.awt.Color(255, 255, 255));

        Button_Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Close.setText("x");
        Button_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_CloseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel_CloseLayout = new javax.swing.GroupLayout(Panel_Close);
        Panel_Close.setLayout(Panel_CloseLayout);
        Panel_CloseLayout.setHorizontalGroup(
            Panel_CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button_Close, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        Panel_CloseLayout.setVerticalGroup(
            Panel_CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button_Close, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        PanelPrincipal.add(Panel_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Edwardian Script ITC", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ULTIMA MORADA");
        PanelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 270, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-cross-60.png"))); // NOI18N
        PanelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-cross-60.png"))); // NOI18N
        PanelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ExitMouseClicked
        if(MouseEvent.BUTTON1 == evt.getButton()){
            System.exit(0);
        }
    }//GEN-LAST:event_Button_ExitMouseClicked

    private void Button_DocumentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_DocumentosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_DocumentosMouseClicked

    private void Button_AjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_AjustesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_AjustesMouseClicked

    private void Button_BusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_BusquedaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_BusquedaMouseClicked

    private void Button_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_infoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_infoMouseClicked

    private void Button_DocumentosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_DocumentosMouseEntered

    }//GEN-LAST:event_Button_DocumentosMouseEntered

    private void Button_DocumentosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_DocumentosMouseExited
        
    }//GEN-LAST:event_Button_DocumentosMouseExited

    private void Button_AjustesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_AjustesMouseEntered
        jPanel4.setBackground(Color.lightGray);
        Button_Ajustes.setText("Ajustes");
    }//GEN-LAST:event_Button_AjustesMouseEntered

    private void Button_AjustesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_AjustesMouseExited
        jPanel4.setBackground(new Color(204,204,255));
        Button_Ajustes.setText("");
    }//GEN-LAST:event_Button_AjustesMouseExited

    private void Button_BusquedaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_BusquedaMouseEntered
        jPanel5.setBackground(Color.lightGray);
        Button_Busqueda.setText("Busqueda");
    }//GEN-LAST:event_Button_BusquedaMouseEntered

    private void Button_BusquedaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_BusquedaMouseExited
        jPanel5.setBackground(new Color(204,204,255));
        Button_Busqueda.setText("");
    }//GEN-LAST:event_Button_BusquedaMouseExited

    private void Button_infoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_infoMouseEntered
        jPanel6.setBackground(Color.lightGray);
        Button_info.setText("Información");
    }//GEN-LAST:event_Button_infoMouseEntered

    private void Button_infoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_infoMouseExited
        jPanel6.setBackground(new Color(204,204,255));
        Button_info.setText("");
    }//GEN-LAST:event_Button_infoMouseExited

    private void Button_ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ExitMouseEntered
        Panel_Exit.setBackground(Color.red);
    }//GEN-LAST:event_Button_ExitMouseEntered

    private void Button_ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ExitMouseExited
        Panel_Exit.setBackground(new Color(102,0,0));
    }//GEN-LAST:event_Button_ExitMouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        MouseX = evt.getX();
        MouseY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();
        this.setLocation(X-MouseX, Y-MouseY);
    }//GEN-LAST:event_formMouseDragged

    private void Button_MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_MinMouseClicked
        if(MouseEvent.BUTTON1 == evt.getButton()){
            this.setState(Home.ICONIFIED);
        }
    }//GEN-LAST:event_Button_MinMouseClicked

    private void Button_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CloseMouseClicked
        if(MouseEvent.BUTTON1 == evt.getButton()){
            System.exit(0);
        }
    }//GEN-LAST:event_Button_CloseMouseClicked

    private void Button_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CloseMouseEntered
        Panel_Close.setBackground(Color.red);
        Button_Close.setForeground(Color.white);
    }//GEN-LAST:event_Button_CloseMouseEntered

    private void Button_MinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_MinMouseEntered
        Panel_Min.setBackground(Color.lightGray);
        Button_Min.setForeground(Color.white);
    }//GEN-LAST:event_Button_MinMouseEntered

    private void Button_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CloseMouseExited
        Panel_Close.setBackground(Color.white);
        Button_Close.setForeground(Color.black);
    }//GEN-LAST:event_Button_CloseMouseExited

    private void Button_MinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_MinMouseExited
        Panel_Min.setBackground(Color.white);
        Button_Min.setForeground(Color.black);
    }//GEN-LAST:event_Button_MinMouseExited

    private void Button_HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_HomeMouseEntered
        jPanel7.setBackground(Color.lightGray);
        Button_Home.setText("Inicio");
    }//GEN-LAST:event_Button_HomeMouseEntered

    private void Button_HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_HomeMouseExited
        jPanel7.setBackground(new Color(204,204,255));
        Button_Home.setText("");
    }//GEN-LAST:event_Button_HomeMouseExited

    private void cbosexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbosexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbosexoActionPerformed

   
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JLabel Button_Ajustes;
    private javax.swing.JLabel Button_Busqueda;
    private javax.swing.JLabel Button_Close;
    private javax.swing.JLabel Button_Documentos;
    private javax.swing.JLabel Button_Exit;
    private javax.swing.JLabel Button_Home;
    private javax.swing.JLabel Button_Mi_Info;
    private javax.swing.JLabel Button_Min;
    private javax.swing.JLabel Button_info;
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel Panel_Close;
    private javax.swing.JPanel Panel_Exit;
    private javax.swing.JPanel Panel_Min;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cbopago;
    private javax.swing.JComboBox<String> cboservicios;
    private javax.swing.JComboBox<String> cbosexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
