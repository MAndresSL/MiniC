/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocompiladores;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.swingViewer.ViewPanel;
import org.graphstream.ui.view.Viewer;

/**
 *
 * @author Maslz
 */
public class App extends javax.swing.JFrame {

    //Variables globales
    PrintWriter writer;
    Process powerShellProcess;
    String path = ".\\src\\FlexAndCup\\";
    String[] pathSyntax = {"-parser", "Syntax", path + "Syntax.cup"};

    /**
     * Creates new form App
     */
    public App() {
        initComponents();
        this.setLocationRelativeTo(null);

        this.ta_code.setBackground(Color.BLACK);
        this.ta_code.setForeground(Color.WHITE);
        this.ta_result.setBackground(Color.BLACK);
        this.ta_result.setForeground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ta_code = new javax.swing.JTextArea();
        jb_clear = new javax.swing.JButton();
        jb_save = new javax.swing.JButton();
        jb_load = new javax.swing.JButton();
        jb_compile = new javax.swing.JButton();
        jb_genFlex = new javax.swing.JButton();
        jb_genFlex1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_result = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jb_save_as = new javax.swing.JButton();
        jb_RUN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        ta_code.setColumns(20);
        ta_code.setRows(5);
        jScrollPane1.setViewportView(ta_code);

        jb_clear.setText("Clear");
        jb_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_clearActionPerformed(evt);
            }
        });

        jb_save.setText("Save");
        jb_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_saveActionPerformed(evt);
            }
        });

        jb_load.setText("Load");
        jb_load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_loadActionPerformed(evt);
            }
        });

        jb_compile.setText("Compile");
        jb_compile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_compileActionPerformed(evt);
            }
        });

        jb_genFlex.setText("Generate Flex");
        jb_genFlex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_genFlexActionPerformed(evt);
            }
        });

        jb_genFlex1.setText("Generate Syntax");
        jb_genFlex1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_genFlex1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Your Code:");

        ta_result.setEditable(false);
        ta_result.setColumns(20);
        ta_result.setRows(5);
        jScrollPane2.setViewportView(ta_result);

        jLabel2.setText("Output:");

        jb_save_as.setText("Save as..");
        jb_save_as.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_save_asActionPerformed(evt);
            }
        });

        jb_RUN.setText("RUN");
        jb_RUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_RUNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jb_genFlex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_genFlex1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_clear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_load))
                            .addComponent(jb_save_as)
                            .addComponent(jb_save)
                            .addComponent(jb_compile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_RUN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel2))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_clear)
                            .addComponent(jb_load))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_save_as)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_genFlex)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_genFlex1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_compile))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_RUN))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_saveActionPerformed

        if (this.input_C == null) {
            this.saveNewFile();

        } else if (input_C.exists()) {
            FileWriter fr = null;
            try {
                fr = new FileWriter(input_C);
                fr.write(this.ta_code.getText());
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }//GEN-LAST:event_jb_saveActionPerformed

    private void jb_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_clearActionPerformed
        clear();
        this.input_C = null;
    }//GEN-LAST:event_jb_clearActionPerformed

    private void jb_compileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_compileActionPerformed
        try {
            // TODO add your handling code here:
            generate();

            /*
            parser p = new parser(new compilerminic.Lexar(new StringReader(ta_code.getText())));
            
            try {
            p.parse();
            p.parse();
            p.parse();
            
            ta_result.setText("Tu hermana");
            
            } catch (Exception ex) {
            Symbol sym = p.getS();
            //ta_result.setText(p.getS().toString());
            
            }
            /*
            
            String command = "powershell.exe  cd '.\\Flex and Cup files\\' ;; jflex .\\main.flex;; javac Lexar.java;; java Lexar .\\test.c";
            // Executing the command
            try {
            powerShellProcess = Runtime.getRuntime().exec(command);
            powerShellProcess.getOutputStream().close();
            String line;
            System.out.println("Standard Output:");
            BufferedReader stdout = new BufferedReader(new InputStreamReader(
            powerShellProcess.getInputStream()));
            while ((line = stdout.readLine()) != null) {
            System.out.println(line);
            }
            stdout.close();
            System.out.println("Standard Error:");
            BufferedReader stderr = new BufferedReader(new InputStreamReader(
            powerShellProcess.getErrorStream()));
            while ((line = stderr.readLine()) != null) {
            System.out.println(line);
            }
            stderr.close();
            System.out.println("Done");
            
            } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
            // Getting the results
             */
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jb_compileActionPerformed

    private void jb_genFlexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_genFlexActionPerformed
        try {
            generate();
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_genFlexActionPerformed

    private void jb_genFlex1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_genFlex1ActionPerformed

    }//GEN-LAST:event_jb_genFlex1ActionPerformed

    private void jb_loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_loadActionPerformed
        clear();
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("C files.", "c");
        jfc.setFileFilter(filter);
        int result = jfc.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            this.input_C = jfc.getSelectedFile();
            try {
                this.ta_code.setText(this.getCFileText(input_C));
            } catch (IOException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jb_loadActionPerformed

    private void jb_save_asActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_save_asActionPerformed
        this.saveNewFile();
    }//GEN-LAST:event_jb_save_asActionPerformed

    private void jb_RUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_RUNActionPerformed
        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        if (ta_code.getText() != null) {
            try {
                parser p = new parser(new Lexer(new StringReader(ta_code.getText())));
                Object x = p.parse().value;

                //System.out.println(x.toString());
                TreeNode myTree = (TreeNode) x;
                Values v = myTree.printAndFill();
                Graph graph = new SingleGraph("AST");

                ArrayList<String> resultado = p.errors;
                String errores = "";

                for (String error : resultado) {
                    errores += error + "\n";
                }

                if (errores.isEmpty()) {
                    this.ta_result.setForeground(Color.GREEN);
                    this.ta_result.setText("¡Analisis lexico y sintactico exitoso!");
                } else {
                    this.ta_result.setForeground(Color.RED);
                    this.ta_result.setText(errores);

                }
                //graph.addNode("");
                int initialPositionX = 0;
                int initialPositionY = 0;

                for (int i = 0; i < v.list.size(); i++) {
                    String sub1, sub2, sub3;
                    sub1 = myTree.graphList.get(i)[0];
                    sub2 = myTree.graphList.get(i)[1];
                    sub3 = myTree.graphList.get(i)[2];
                    /*
                    System.out.println("Main graphList Element 1: " + myTree.graphList.get(i)[0]);
                    System.out.println("Main graphList Element 2: " + myTree.graphList.get(i)[1]);
                    System.out.println("Main graphList Element 2: " + myTree.graphList.get(i)[1]);
                     */
                    graph.addNode(sub1).addAttribute("ui.label", sub3/*,*/);
                    if (sub1 == "translation_unit") {
                        Node node = graph.getNode(sub1);
                        node.addAttribute("ui.class", "F");
                        node.addAttribute("layout.frozen");
                        node.addAttribute("x", 0.0);
                        node.addAttribute("y", 0.0);

                        node.addAttribute("ui.style", "fill-color: rgb(255,0,0);"
                                + "size: 40px, 40px;");


                    } else {
                        Node node = graph.getNode(sub1);
                        node.addAttribute("ui.class", "N");

                        //node.addAttribute("ui.style", "fill-color: rgb(255,255,0);");
                        //graph.getNode(sub1).addAttribute("ui.style", "fill-mode: none;");
                        //graph.getNode(sub1).addAttribute("ui.style", "text-align: center;");
                    }

                    //graph.getNode(sub1).addAttribute("ui.style", "text-alignment: center;");
                    //initialPositionY += 20;
                    //initialPositionX += 20;
                    //graph.addNode(sub1).addAttribute("ui.label", "Name: " + sub1 + "        Parent: " + sub2);
                }
                System.out.println(v.tree);
                System.out.println("length " + myTree.graphList.size());

                for (int i = 0; i < v.list.size(); i++) {
                    String sub1, sub2;
                    sub1 = myTree.graphList.get(i)[0];
                    sub2 = myTree.graphList.get(i)[1];

                    if (sub1.equals("translation_unit") && sub2.equals("")) {
                        //System.out.println("translation_unit");
                    } else {
                        graph.addEdge(sub2 + " " + sub1, sub2, sub1).addAttribute("layout.weight", 4, pathSyntax);

                    }
                }

                graph.addAttribute("ui.stylesheet", "graph { fill-color: #bc572f; "
                        + "fill-mode: gradient-vertical;}"
                        + "node { text-color: white;"
                        + "text-size: 18px;"
                        + "size: 30px, 30px;"
                        + "shape: circle; "
                        + "fill-color: red, orange;"
                        + "    fill-mode: gradient-vertical;"
                        + "    stroke-mode: plain;"
                        + "    stroke-color: black;"
                        + "    stroke-width: 5px; }"
                        + "edge { fill-color: #d19214;"
                        + "    size: 2px;  } "
                        + "node:clicked { fill-color: rgb(0,0,255); } ");

                graph.setAttribute("ui.antialias");
                graph.setAttribute("ui.quality");

                //viewer.disableAutoLayout();
                //graph.display().disableAutoLayout();
                //myTree.printGraph();
                /*
                Viewer viewer = graph.display();

                viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
                 */
                JFrame frame = new JFrame("GRAPH");
                @SuppressWarnings("serial")
                JPanel panel = new JPanel(new GridLayout()) {
                    @Override
                    public Dimension getPreferredSize() {
                        return new Dimension(640, 480);
                    }
                };
                panel.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
                Viewer viewer = new Viewer(graph, Viewer.ThreadingModel.GRAPH_IN_GUI_THREAD);
                ViewPanel viewPanel = viewer.addDefaultView(false);
                viewer.enableAutoLayout();
                viewPanel.getCamera().setViewPercent(0.25);
                viewPanel.getCamera().setViewCenter(0, 0, 0);
                viewPanel.requestFocusInWindow();
                panel.add(viewPanel);
                frame.add(panel);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            } catch (FileNotFoundException ex) {

                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Para navegar el arbol utilize las teclas direccionales, Page UP y Page Down para hacer Zoom");
            System.out.println();

        }

    }//GEN-LAST:event_jb_RUNActionPerformed

    public static void generate() throws IOException, Exception {
        generateLexer();
        generateParser();
    }

    String getCFileText(File file) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        String out = "";
        while ((st = br.readLine()) != null) {
            System.out.println(st);
            out += st + "\n";
        }
        br.close();
        return out;
    }

    void clear() {
        this.ta_result.setText("");
        this.ta_code.setText("");
    }

    void saveNewFile() {
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("C files.", "c");
        jfc.setFileFilter(filter);
        int option = jfc.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            String new_file_path = jfc.getSelectedFile().getAbsolutePath();
            if (!new_file_path.endsWith(".c")) {
                new_file_path += ".c";
            }
            input_C = new File(new_file_path);
            FileWriter fr = null;
            try {
                fr = new FileWriter(input_C);
                fr.write(this.ta_code.getText());
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void generateLexer() {

        String paramsLexer[] = new String[3];
        paramsLexer[0] = "-d";
        paramsLexer[1] = "src/proyectocompiladores/";
        paramsLexer[2] = "src/proyectocompiladores/newLexer.flex";
        try {
            jflex.Main.generate(paramsLexer);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void generateParser() {
        String params[] = new String[5];
        params[0] = "-destdir";
        params[1] = "src/proyectocompiladores/";
        params[2] = "-parser";
        params[3] = "parser";
        params[4] = "src/proyectocompiladores/parser.cup";
        try {
            java_cup.Main.main(params);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //sym s = new sym();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_RUN;
    private javax.swing.JButton jb_clear;
    private javax.swing.JButton jb_compile;
    private javax.swing.JButton jb_genFlex;
    private javax.swing.JButton jb_genFlex1;
    private javax.swing.JButton jb_load;
    private javax.swing.JButton jb_save;
    private javax.swing.JButton jb_save_as;
    private javax.swing.JTextArea ta_code;
    private javax.swing.JTextArea ta_result;
    // End of variables declaration//GEN-END:variables
    File input_C;

}
