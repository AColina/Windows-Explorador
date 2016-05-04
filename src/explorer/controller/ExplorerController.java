/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorer.controller;

import explorer.*;
import java.awt.Dimension;
import java.io.FilenameFilter;
import javax.swing.JDialog;

/**
 *
 * @author Angel Colina
 */
public class ExplorerController extends javax.swing.JPanel {

    private static String Ruta[];
    private static int Indicador;
    private static String idf;
    private String Archivos[];
    private jButton button[];
    private int lastClick = -1;
    private int Select = -1;
    private int lastSelect = -1;
    private final JDialog dialog;

    public ExplorerController(JDialog dialog) {
        this.dialog = dialog;
        dialog.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder_ico.ico")).getImage());
        star();
        initComponents();
        ini();
        fondo.setDoubleBuffered(true);

    }

    public void setRuta(String Ruta) {
        lastClick = -1;
        Select = -1;
        lastSelect = -1;
        button = null;
        label = null;
        Archivos = null;
        ini();
        fondo.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Barra_es = new javax.swing.JPanel();
        atras = new javax.swing.JButton();
        adelante = new javax.swing.JButton();
        Enviar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        auto32 = new javax.swing.JButton();
        javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
        javax.swing.JSeparator jSeparator3 = new javax.swing.JSeparator();
        javax.swing.JSeparator jSeparator4 = new javax.swing.JSeparator();
        auto64 = new javax.swing.JButton();
        ayuda = new javax.swing.JButton();
        Barra_d = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        barra_direccion = new TextField(new Dimension(100, 20));
        ir = new javax.swing.JButton();
        javax.swing.JSeparator jSeparator2 = new javax.swing.JSeparator();
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
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
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
        adelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adelanteActionPerformed(evt);
            }
        });
        adelante.setFocusPainted(false);
        adelante.setBorderPainted(false);
        adelante.setContentAreaFilled(false);/**/

        Enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/send.png"))); // NOI18N
        Enviar.setToolTipText("Copiar carpeta");
        Enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EnviarMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                EnviarMouseExited(evt);
            }
        });
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });
        Enviar.setFocusPainted(false);
        Enviar.setBorderPainted(false);
        Enviar.setContentAreaFilled(false);/**/

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
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
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
        auto32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auto32ActionPerformed(evt);
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
        auto64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auto64ActionPerformed(evt);
            }
        });
        auto64.setFocusPainted(false);
        auto64.setBorderPainted(false);
        auto64.setContentAreaFilled(false);/**/

        ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Help.png"))); // NOI18N
        ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ayudaMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                ayudaMouseExited(evt);
            }
        });
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
                        .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(Barra_esLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(auto32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(auto64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Direccion :");

        barra_direccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder_ico.ico"))); // NOI18N
        barra_direccion.setEditable(false);
        barra_direccion.setBackground(new java.awt.Color(255, 255, 255));
        barra_direccion.setFocusable(false);
        barra_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                barra_direccionKeyPressed(evt);
            }
        });

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
        ir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irActionPerformed(evt);
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
                                        .addGap(6, 6, 6)
                                        .addComponent(barra_direccion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2))
        );
        Barra_dLayout.setVerticalGroup(
                Barra_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Barra_dLayout.createSequentialGroup()
                        .addGroup(Barra_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(barra_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, Short.MAX_VALUE)
                                .addComponent(jLabel1))
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
        fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fondoMouseClicked(evt);
            }
        });

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
    }// </editor-fold>                        
    // <editor-fold defaultstate="collapsed" desc="Eventos">  

    private void atrasMouseEntered(java.awt.event.MouseEvent evt) {
        atras.setFocusPainted(true);
        atras.setBorderPainted(true);
        atras.setContentAreaFilled(true);/**/

    }

    private void atrasMouseExited(java.awt.event.MouseEvent evt) {
        atras.setFocusPainted(false);
        atras.setBorderPainted(false);
        atras.setContentAreaFilled(false);/**/

    }

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {
        // Atras
        if (Indicador > 0) {
            Indicador--;
            setRuta(Ruta[Indicador]);
        }
    }

    private void adelanteMouseEntered(java.awt.event.MouseEvent evt) {
        adelante.setFocusPainted(true);
        adelante.setBorderPainted(true);
        adelante.setContentAreaFilled(true);/**/

    }

    private void adelanteMouseExited(java.awt.event.MouseEvent evt) {
        adelante.setFocusPainted(false);
        adelante.setBorderPainted(false);
        adelante.setContentAreaFilled(false);/**/

    }

    private void adelanteActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (Indicador + 1 < Ruta.length) {
            Indicador++;
            setRuta(Ruta[Indicador]);
        }
    }

    private void EnviarMouseEntered(java.awt.event.MouseEvent evt) {
        Enviar.setFocusPainted(true);
        Enviar.setBorderPainted(true);
        Enviar.setContentAreaFilled(true);/**/

    }

    private void EnviarMouseExited(java.awt.event.MouseEvent evt) {
        Enviar.setFocusPainted(false);
        Enviar.setBorderPainted(false);
        Enviar.setContentAreaFilled(false);/**/

    }

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {
        // Enviar
        send(Select, null);
    }

    private void actualizarMouseEntered(java.awt.event.MouseEvent evt) {
        actualizar.setFocusPainted(true);
        actualizar.setBorderPainted(true);
        actualizar.setContentAreaFilled(true);/**/

    }

    private void actualizarMouseExited(java.awt.event.MouseEvent evt) {
        actualizar.setFocusPainted(false);
        actualizar.setBorderPainted(false);
        actualizar.setContentAreaFilled(false);/**/

    }

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {
        // actualizar
        setRuta(Ruta[Indicador]);
    }

    private void barra_direccionKeyPressed(java.awt.event.KeyEvent evt) {
        // ir con enter
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            buscar();
            fondo.setFocusCycleRoot(true);
        }
    }

    private void irMouseEntered(java.awt.event.MouseEvent evt) {
        ir.setFocusPainted(true);
        ir.setBorderPainted(true);
        ir.setContentAreaFilled(true);/**/

    }

    private void irMouseExited(java.awt.event.MouseEvent evt) {
        ir.setFocusPainted(false);
        ir.setBorderPainted(false);
        ir.setContentAreaFilled(false);/**/

    }

    private void irActionPerformed(java.awt.event.ActionEvent evt) {
        //ir
        buscar();
    }

    private void auto32MouseEntered(java.awt.event.MouseEvent evt) {
        auto32.setFocusPainted(true);
        auto32.setBorderPainted(true);
        auto32.setContentAreaFilled(true);
    }

    private void auto32MouseExited(java.awt.event.MouseEvent evt) {
        auto32.setFocusPainted(false);
        auto32.setBorderPainted(false);
        auto32.setContentAreaFilled(false);/**/

    }

    private void auto64MouseEntered(java.awt.event.MouseEvent evt) {
        auto64.setFocusPainted(true);
        auto64.setBorderPainted(true);
        auto64.setContentAreaFilled(true);
    }

    private void auto64MouseExited(java.awt.event.MouseEvent evt) {
        auto64.setFocusPainted(false);
        auto64.setBorderPainted(false);
        auto64.setContentAreaFilled(false);/**/

    }

    private void ayudaMouseEntered(java.awt.event.MouseEvent evt) {
        ayuda.setFocusPainted(true);
        ayuda.setBorderPainted(true);
        ayuda.setContentAreaFilled(true);
        Helps = new javax.swing.JPopupMenu();
        Helps.setBackground(new java.awt.Color(255, 255, 255));
        Helps.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Helps.add(new popuphelps(Archivos));
        Helps.show(this, ayuda.getX() - 255, ayuda.getY() + 10);
    }

    private void ayudaMouseExited(java.awt.event.MouseEvent evt) {
        ayuda.setFocusPainted(false);
        ayuda.setBorderPainted(false);
        ayuda.setContentAreaFilled(false);
        Helps.hide();
        Helps.setVisible(false);
        Helps = null;
    }

    private void auto32ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        sent("\"\\\\10.200.16.4\\autocad 2010\\AdminImage\\setup.exe\" /qb/I \\\\Nodo1\\AutoCAD 2010\\AdminImage\\AutoCAD 2010.ini /language en-us", "setup.exe");
    }

    private void auto64ActionPerformed(java.awt.event.ActionEvent evt) {
        sent("\"\\\\10.200.16.4\\Autocad 2010 64bit\\AdminImage\\setup.exe\" /qb /I \\\\10.200.16.4\\Autocad 2010 64bit\\AdminImage\\prueba2.ini /language en-us", "setup.exe");
    }

    private void fondoMouseClicked(java.awt.event.MouseEvent evt) {
        lastSelect = Select;
        Select = -1;
        lastClick = -1;
        setSelect();
    }
    // </editor-fold>   

    private void ini() {
        fondo.removeAll();
        java.io.File f1 = new java.io.File(Ruta[Indicador]);
        barra_direccion.setText(Ruta[Indicador].substring(FindnChar(Ruta[Indicador], '\\', 4) + 1));

        FilenameFilter filtro = new FilenameFilter() {

            @Override
            public boolean accept(java.io.File dir, String name) {
                return name.endsWith(".exe") || new java.io.File(dir + "\\" + name).isDirectory();
            }
        };

        Archivos = f1.list(filtro);

        dialog.setTitle(Ruta[Indicador].substring(Ruta[Indicador].lastIndexOf("\\") + 1));

        if (Archivos != null) {

            button = new jButton[Archivos.length];
            label = new javax.swing.JLabel[Archivos.length];

            for (int i = 0; i < Archivos.length; i++) {
                Archivos[i] = Ruta[Indicador] + "\\" + Archivos[i];
            }
            Archivos = ordenar(Archivos);
            int ancho = 48, alto = 48;
            int x = 25, y = 10;

            for (int i = 0; i < Archivos.length; i++) {
                button[i] = new jButton(x, y, ancho, alto);
                String af = Archivos[i].substring(Archivos[i].lastIndexOf("\\") + 1);
                label[i] = new javax.swing.JLabel();
                if (new java.io.File(Archivos[i]).isFile()) {
                    af = af.substring(0, af.lastIndexOf("."));
                }
                label[i].setText("<html> <p align =\"center\" >" + af + "</p></html>");
                label[i].setSize((ancho * 2) - 4, 30);
                label[i].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                label[i].setVerticalAlignment(javax.swing.SwingConstants.TOP);
                label[i].setLocation(x - 24, y + 50);
                button[i].setToolTipText(Archivos[i]);
                if (i + 1 < Archivos.length) {
                    if (x + 170 > 913) {
                        y += 90;
                        x = 25;
                    } else {
                        x += 100;
                    }
                }
                fondo.add(button[i]);
                fondo.add(label[i]);
                buttonProperties(i);
                final int aux = i;
                button[i].addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mousePressed(java.awt.event.MouseEvent evt) {
                        ButtonActionPerformed(aux);
                        if (evt.getButton() == 3) {
                            PopUp_desplegable(evt, aux);
                        }

                    }
                });
                button[i].addKeyListener(new java.awt.event.KeyAdapter() {
                    @Override
                    public void keyPressed(java.awt.event.KeyEvent evt) {
                        ButtonKeyPressed(evt, aux);
                    }
                });
            }

            if (y > 434) {
                Scroll.setPreferredSize(new java.awt.Dimension(908, 444));
                fondo.setPreferredSize(new java.awt.Dimension(902, y + 80));
            } else {
                fondo.setPreferredSize(new java.awt.Dimension(902, 434));
            }

        }
        if (Indicador > 0) {
            atras.setEnabled(true);
        } else {
            atras.setEnabled(false);
        }
        if (Indicador < Ruta.length - 1) {
            adelante.setEnabled(true);
        } else {
            adelante.setEnabled(false);
        }
    }

    private String[] ordenar(String vec[]) {
        String v[] = new String[vec.length];
        String v2[] = new String[vec.length];
        short nexe = 0;
        short nfolder = 0;
        for (int i = 0; i < vec.length; i++) {
            if (new java.io.File(vec[i]).isDirectory() == true) {
                v[nfolder] = vec[i];
                nfolder++;
            } else {
                v2[nexe] = vec[i];
                nexe++;
            }
        }

        if (nexe > 0) {
            System.arraycopy(v2, 0, v, nfolder, nexe);

        }
        return v;
    }

    private void ButtonActionPerformed(int index) {
        if (lastClick == index) {
            lastClick = -1;
            Goto(index);
        } else {
            lastSelect = Select;
            Select = index;
            setSelect();
            lastClick = index;
        }
    }

    private void ButtonKeyPressed(java.awt.event.KeyEvent evt, int index) {
        lastClick = -1;

        if (Character.isLetter(evt.getKeyChar()) || Character.isDigit(evt.getKeyChar())) {
            boolean repeat = true;
            int selector = Select;
            if (Select + 1 >= button.length) {
                selector = -1;
            }
            for (int i = selector + 1; i < button.length; i++) {
                if (label[i].getText().replaceAll("<html> <p align =\"center\" >", "").toLowerCase().charAt(0) == ("" + evt.getKeyChar()).toLowerCase().charAt(0)) {
                    lastSelect = Select;
                    Select = i;
                    repeat = false;
                    Scroll.getVerticalScrollBar().setValue(button[Select].getY());
                    break;
                }
                if (repeat == true && i >= button.length - 1) {
                    i = -1;
                    repeat = false;
                }
            }
        } else {
            switch (evt.getKeyCode()) {
                //atras
                case 8:
                    if (Indicador > 0) {
                        Indicador--;
                        setRuta(Ruta[Indicador]);
                        Select = 0;
                        button[Select].requestFocus(true);
                    }
                    break;
                //enter
                case 10:
                    if (new java.io.File(Archivos[Select]).isDirectory()) {
                        lastSelect = -1;
                        Goto(Select);
                        Select = 0;
                        try {
                            button[Select].requestFocus(true);
                        } catch (Exception ex) {
                            Select = -1;
                        }
                    } else {
                        send(Select, null);
                    }
                    break;
                //inicio
                case 35:
                    lastSelect = Select;
                    Select = button.length - 1;
                    Scroll.getVerticalScrollBar().setValue(button[Select].getY());
                    break;
                //fin
                case 36:
                    lastSelect = Select;
                    Select = 0;
                    Scroll.getVerticalScrollBar().setValue(button[Select].getY());
                    break;
                //izquierda
                case 37:
                    if (Select > 0) {
                        lastSelect = Select;
                        Select--;
                    }
                    break;
                //arriba
                case 38:
                    if (Select - 9 > -1) {
                        lastSelect = Select;
                        Select -= 9;
//                        Scroll.getVerticalScrollBar().setValue(button[Select].getY());
                        Scroll.getVerticalScrollBar().setValue(Scroll.getVerticalScrollBar().getValue() - 80);
                    }
                    break;
                //derecha
                case 39:
                    if (Select + 1 < button.length) {
                        lastSelect = Select;
                        Select++;
                    }
                    break;
                //abajo
                case 40:
                    if (Select + 9 < button.length) {
                        lastSelect = Select;
                        Select += 9;
                        // Scroll.getVerticalScrollBar().setValue(button[Select].getY());
                        Scroll.getVerticalScrollBar().setValue(Scroll.getVerticalScrollBar().getValue() + 80);
                    } else {
                        lastSelect = Select;
                        Select = button.length - 1;
//                        Scroll.getVerticalScrollBar().setValue(button[Select].getY());
                        Scroll.getVerticalScrollBar().setValue(Scroll.getVerticalScrollBar().getValue() + 80);
                    }
                    break;
            }
        }
        setSelect();

    }

    private void PopUp_desplegable(java.awt.event.MouseEvent evt, final int boton) {
        javax.swing.JPopupMenu Pmenu = new javax.swing.JPopupMenu();

        if (new java.io.File(Archivos[boton]).isDirectory()) {
            javax.swing.JMenuItem a = new javax.swing.JMenuItem("Abrir");
            a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder16.png")));
            a.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    Goto(boton);
                }
            });
            Pmenu.removeAll();
            Pmenu.add(a);
        } else {
            javax.swing.JMenuItem b = new javax.swing.JMenuItem("Enviar");
            b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/send16.png")));
            b.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    send(boton, null);
                }
            });
            final ExplorerController ex = this;
            javax.swing.JMenuItem c = new javax.swing.JMenuItem("Enviar con");
            c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/coman16.png")));
            c.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    JDialog dialog = new JDialog();
//                    dialog.add(new comando(dialog, ex, boton));
                    dialog.setModal(true);
                    dialog.setTitle("Parametros a enviar");
                    dialog.setResizable(false);
                    dialog.pack();
                    dialog.setLocationRelativeTo(null);
                    dialog.setVisible(true);
                    dialog.repaint();
                    dialog.validate();
                }
            });
            Pmenu.removeAll();
            Pmenu.add(b);
            Pmenu.add(c);
        }

        Pmenu.show(fondo, evt.getX() + button[boton].getX(), evt.getY() + button[boton].getY());
    }

    private void Goto(int index) {
        if (new java.io.File(Archivos[index]).isDirectory()) {
            String aux = Archivos[index];
            redim(aux);
            setRuta(aux);
            Scroll.getVerticalScrollBar().setValue(0);
        }
    }

    public void send(int index, String parametro) {
        if (index != -1 && new java.io.File(Archivos[index]).isFile()) {
            String mensaje = Archivos[index];
            if (parametro != null && new java.io.File(Archivos[index]).isFile()) {
                mensaje = mensaje.concat(" " + parametro);
            }

            sent(mensaje, Archivos[index].substring(Archivos[index].lastIndexOf("\\")));
        }

    }

    public void sent(String parame, String detalle) {
        // final String parametro=parame.replace("\\", "\\\\");
        final String parametro = parame;
        final String dat = "net use \\\\10.200.16.4 /user:labcomp\\bernardo 12345678";

//        String s =MacF.EsquemaMenu.getLastSelectedPathComponent().toString();
//                    if(s.matches("Internet")){s="Int";}
//                    if(!"Internet".equals(s)){
//                        MacF.inst(replace,s+"-%");
//                        MacF.reporte("Instalar Software","",detalle, x, Argumentos[5]);
//
//                    }
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    System.out.println(dat);
//                    Thread.sleep(2000);
//                    System.out.println(parametro);
//                } catch (InterruptedException ex) {
//                }
//            }
//        });
    }

    private void buttonProperties(int index) {

        java.awt.Image img;
        if (new java.io.File(Archivos[index]).isDirectory()) {
            img = new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder_close.png")).getImage();
        } else {
            img = new javax.swing.ImageIcon(getClass().getResource("/imagenes/exe.png")).getImage();

        }

        button[index].SelectIcon(new java.io.File(Archivos[index]).isDirectory());
        button[index].setIcon(new javax.swing.ImageIcon(img));

    }

    private void buscar() {
        if (new java.io.File(idf + barra_direccion.getText()).exists()) {
            redim(idf + barra_direccion.getText());
            setRuta(idf + barra_direccion.getText());
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "El directorio no existe\n" + idf + barra_direccion.getText(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setSelect() {

        if (lastSelect != -1) {
            button[lastSelect].setSelect(false);
            button[lastSelect].repaint();
        }
        if (Select != -1) {
            button[Select].setSelect(true);
            button[Select].repaint();
        }
        this.repaint();
    }

    private static int FindnChar(String str, char chr, int rep) {
        int ct = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr) {
                ct++;
                if (ct == rep) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static void redim(String nuevo_valor) {
        if (!Ruta[Indicador].equalsIgnoreCase(nuevo_valor)) {
            String aux[] = Ruta;
            Ruta = new String[Indicador + 2];
            System.arraycopy(aux, 0, Ruta, 0, Indicador + 1);
            Ruta[Indicador + 1] = nuevo_valor;
            Indicador++;
        }
    }

    private static boolean exec() {
        String dat = "net use \\\\10.200.16.4 /user:labcomp\\bernardo 12345678";
        try {
            Process p = Runtime.getRuntime().exec(dat);
            return true;
        } catch (java.io.IOException ex) {
        }
        return false;
    }

    public static void star() {
        if (exec() == true) {
            Ruta = new String[1];
            Indicador = 0;
            Ruta[Indicador] = "\\\\10.200.16.4\\Software";
//            Ruta[Indicador]="C:\\";
            idf = Ruta[Indicador].substring(0, FindnChar(Ruta[Indicador], '\\', 4) + 1);
        }
    }
    // Variables declaration - do not modify                     
    private javax.swing.JPanel Barra_d;
    private javax.swing.JPanel Barra_es;
    private javax.swing.JButton Enviar;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton adelante;
    private javax.swing.JButton atras;
    private javax.swing.JButton auto32;
    private javax.swing.JButton auto64;
    private javax.swing.JButton ayuda;
    /*
     private javax.swing.JTextField barra_direccion;
     */
    private TextField barra_direccion;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton ir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
    private javax.swing.JLabel label[];
    private javax.swing.JPopupMenu Helps;
}
