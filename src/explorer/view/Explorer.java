
package explorer.view;

import explorer.*;
import java.awt.Dimension;
import java.io.FilenameFilter;
import javax.swing.JDialog;

/**
 *
 * @author Angel Colina
 */
public class Explorer extends javax.swing.JPanel {

  
    private Explorer() {
     
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Barra_es = new javax.swing.JPanel();
        atras = new javax.swing.JButton();
        adelante = new javax.swing.JButton();
        enviar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        auto32 = new javax.swing.JButton();
        javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
        javax.swing.JSeparator jSeparator3 = new javax.swing.JSeparator();
        javax.swing.JSeparator jSeparator4 = new javax.swing.JSeparator();
        auto64 = new javax.swing.JButton();
        ayuda = new javax.swing.JButton();
        Barra_d = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ir = new javax.swing.JButton();
        javax.swing.JSeparator jSeparator2 = new javax.swing.JSeparator();
        barraDireccion = new explorer.TextField();
        Scroll = new javax.swing.JScrollPane();
        fondo = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(32767, 556));

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        atras.setToolTipText("Atras");
        atras.setEnabled(false);
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                atrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                atrasMouseExited(evt);
            }
        });
        atras.setFocusPainted(false);
        atras.setBorderPainted(false);
        atras.setContentAreaFilled(false);/**/

        adelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/next.png"))); // NOI18N
        adelante.setToolTipText("Adelante");
        adelante.setEnabled(false);
        adelante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adelanteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adelanteMouseExited(evt);
            }
        });
        adelante.setFocusPainted(false);
        adelante.setBorderPainted(false);
        adelante.setContentAreaFilled(false);/**/

        enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/send.png"))); // NOI18N
        enviar.setToolTipText("Copiar carpeta");
        enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enviarMouseExited(evt);
            }
        });
        enviar.setFocusPainted(false);
        enviar.setBorderPainted(false);
        enviar.setContentAreaFilled(false);/**/

        actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/view-refresh-32.png"))); // NOI18N
        actualizar.setToolTipText("Actualizar");
        actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actualizarMouseExited(evt);
            }
        });
        actualizar.setFocusPainted(false);
        actualizar.setBorderPainted(false);
        actualizar.setContentAreaFilled(false);/**/

        auto32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/auto32-2.png"))); // NOI18N
        auto32.setToolTipText("AutoCad 32Bits");
        auto32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                auto32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                auto32MouseExited(evt);
            }
        });
        auto32.setFocusPainted(false);
        auto32.setBorderPainted(false);
        auto32.setContentAreaFilled(false);/**/

        jSeparator1.setAlignmentX(0.0F);
        jSeparator1.setAlignmentY(0.0F);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        auto64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/auto64-2.png"))); // NOI18N
        auto64.setToolTipText("AutoCad 64Bits");
        auto64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                auto64MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                auto64MouseExited(evt);
            }
        });
        auto64.setFocusPainted(false);
        auto64.setBorderPainted(false);
        auto64.setContentAreaFilled(false);/**/

        ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Help.png"))); // NOI18N
        ayuda.setFocusPainted(false);
        ayuda.setBorderPainted(false);
        ayuda.setContentAreaFilled(false);

        javax.swing.GroupLayout Barra_esLayout = new javax.swing.GroupLayout(Barra_es);
        Barra_es.setLayout(Barra_esLayout);
        Barra_esLayout.setHorizontalGroup(
            Barra_esLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Barra_esLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(adelante, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(auto32, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(auto64, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addComponent(jSeparator1)
        );
        Barra_esLayout.setVerticalGroup(
            Barra_esLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_esLayout.createSequentialGroup()
                .addGroup(Barra_esLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adelante, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Barra_esLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(auto32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(auto64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Direccion :");

        ir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/go.png"))); // NOI18N
        ir.setText("ir");
        ir.setToolTipText("Ir a :");
        ir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                irMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                irMouseExited(evt);
            }
        });
        ir.setFocusPainted(false);
        ir.setBorderPainted(false);
        ir.setContentAreaFilled(false);/**/

        jSeparator2.setAlignmentX(0.0F);
        jSeparator2.setAlignmentY(0.0F);

        javax.swing.GroupLayout Barra_dLayout = new javax.swing.GroupLayout(Barra_d);
        Barra_d.setLayout(Barra_dLayout);
        Barra_dLayout.setHorizontalGroup(
            Barra_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Barra_dLayout.createSequentialGroup()
                .addGroup(Barra_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addGroup(Barra_dLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );
        Barra_dLayout.setVerticalGroup(
            Barra_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_dLayout.createSequentialGroup()
                .addGroup(Barra_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(barraDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        Scroll.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Scroll.setDoubleBuffered(true);
        Scroll.setFocusable(false);
        Scroll.setMaximumSize(new java.awt.Dimension(905, 476));
        Scroll.setWheelScrollingEnabled(false);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setFocusable(false);

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        Scroll.setViewportView(fondo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Barra_es, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Barra_d, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Scroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Barra_es, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Barra_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Scroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // <editor-fold defaultstate="collapsed" desc="Eventos">  
    private void atrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseEntered
        atras.setFocusPainted(true);
        atras.setBorderPainted(true);
        atras.setContentAreaFilled(true);/**/
    }//GEN-LAST:event_atrasMouseEntered

    private void atrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseExited
        atras.setFocusPainted(false);
        atras.setBorderPainted(false);
        atras.setContentAreaFilled(false);/**/
    }//GEN-LAST:event_atrasMouseExited

    private void adelanteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adelanteMouseEntered
        adelante.setFocusPainted(true);
        adelante.setBorderPainted(true);
        adelante.setContentAreaFilled(true);/**/
    }//GEN-LAST:event_adelanteMouseEntered

    private void adelanteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adelanteMouseExited
        adelante.setFocusPainted(false);
        adelante.setBorderPainted(false);
        adelante.setContentAreaFilled(false);/**/
    }//GEN-LAST:event_adelanteMouseExited

    private void enviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseEntered
        enviar.setFocusPainted(true);
        enviar.setBorderPainted(true);
        enviar.setContentAreaFilled(true);/**/
    }//GEN-LAST:event_enviarMouseEntered

    private void enviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseExited
        enviar.setFocusPainted(false);
        enviar.setBorderPainted(false);
        enviar.setContentAreaFilled(false);/**/
    }//GEN-LAST:event_enviarMouseExited

    private void actualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarMouseEntered
        actualizar.setFocusPainted(true);
        actualizar.setBorderPainted(true);
        actualizar.setContentAreaFilled(true);/**/

    }//GEN-LAST:event_actualizarMouseEntered

    private void actualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarMouseExited
        actualizar.setFocusPainted(false);
        actualizar.setBorderPainted(false);
        actualizar.setContentAreaFilled(false);/**/
    }//GEN-LAST:event_actualizarMouseExited

    private void irMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_irMouseEntered
        ir.setFocusPainted(true);
        ir.setBorderPainted(true);
        ir.setContentAreaFilled(true);/**/
    }//GEN-LAST:event_irMouseEntered

    private void irMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_irMouseExited
        ir.setFocusPainted(false);
        ir.setBorderPainted(false);
        ir.setContentAreaFilled(false);/**/
    }//GEN-LAST:event_irMouseExited

    private void auto32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_auto32MouseEntered
        auto32.setFocusPainted(true);
        auto32.setBorderPainted(true);
        auto32.setContentAreaFilled(true);
    }//GEN-LAST:event_auto32MouseEntered

    private void auto32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_auto32MouseExited
        auto32.setFocusPainted(false);
        auto32.setBorderPainted(false);
        auto32.setContentAreaFilled(false);/**/
    }//GEN-LAST:event_auto32MouseExited

    private void auto64MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_auto64MouseEntered
        auto64.setFocusPainted(true);
        auto64.setBorderPainted(true);
        auto64.setContentAreaFilled(true);
    }//GEN-LAST:event_auto64MouseEntered

    private void auto64MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_auto64MouseExited
        auto64.setFocusPainted(false);
        auto64.setBorderPainted(false);
        auto64.setContentAreaFilled(false);/**/
    }//GEN-LAST:event_auto64MouseExited
    // </editor-fold>   
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra_d;
    private javax.swing.JPanel Barra_es;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton adelante;
    private javax.swing.JButton atras;
    private javax.swing.JButton auto32;
    private javax.swing.JButton auto64;
    private javax.swing.JButton ayuda;
    private explorer.TextField barraDireccion;
    private javax.swing.JButton enviar;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton ir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JLabel label[];
    private javax.swing.JPopupMenu Helps;
}
