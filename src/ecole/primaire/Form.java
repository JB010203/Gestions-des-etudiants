/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecole.primaire;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hjuve
 */
public class Form extends javax.swing.JFrame {

    private DataBase data;
    private List<Matiere> listmatiere;
    private List<Eleve> listEleve;
    private List<Classe> ListClasse;
    private List<Professeur> listProfesseur;
    private Classe selectedClasse;
    private Matiere selectedMatier;
    private Eleve selectedEleve;
    private Professeur selectedProf;

    /**
     * Creates new form Form
     */
    public Form() {
        try {
            initComponents();
            data = new DataBase();
            listmatiere = new ArrayList<>();
            listEleve = new ArrayList<>();
            ListClasse = new ArrayList<>();
            listProfesseur = new ArrayList<>();
            
            selectedClasse = new Classe();
            selectedMatier = new Matiere();
            selectedEleve = new Eleve();
            selectedProf = new Professeur();

            actualiserMatiere();
            actualiserClasse();
            actualiserEleve();
            actualiserPrfesseur();

        } catch (SQLException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        eTable.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                DefaultTableModel tableModel = (DefaultTableModel) eTable.getModel();
                Vector cl = tableModel.getDataVector().elementAt(eTable.getSelectedRow());
                selectedEleve.setId(Integer.parseInt(cl.elementAt(0).toString()));
                selectedEleve.setClasse_fk(Integer.parseInt(cl.elementAt(3).toString()));
                selectedEleve.setNom(cl.elementAt(1).toString());
                selectedEleve.setPrenom(cl.elementAt(2).toString());
                eNom.setText(selectedEleve.getNom());
                ePrenom.setText(selectedEleve.getPrenom());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
            
        });
        
        pTable.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                DefaultTableModel tableModel = (DefaultTableModel) pTable.getModel();
                Vector cl = tableModel.getDataVector().elementAt(pTable.getSelectedRow());
                selectedProf.setId(Integer.parseInt(cl.elementAt(0).toString()));
                selectedProf.setNom(cl.elementAt(1).toString());
                selectedProf.setPrenom(cl.elementAt(2).toString());
                pNom.setText(selectedProf.getNom());
                pPrenom.setText(selectedProf.getPrenom());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
            
        });
        
        crTable.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                DefaultTableModel tableModel = (DefaultTableModel) crTable.getModel();
                Vector cl = tableModel.getDataVector().elementAt(crTable.getSelectedRow());
                selectedMatier.setId(Integer.parseInt(cl.elementAt(0).toString()));
                selectedMatier.setNom(cl.elementAt(1).toString());
                crNom.setText(selectedMatier.getNom());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
            
        });
        csTable.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
                DefaultTableModel tableModel = (DefaultTableModel) csTable.getModel();
                Vector cl = tableModel.getDataVector().elementAt(csTable.getSelectedRow());
                selectedClasse.setId(Integer.parseInt(cl.elementAt(0).toString()));
                selectedClasse.setNom(cl.elementAt(1).toString());
                csNom.setText(selectedClasse.getNom());
                System.out.println(selectedClasse.getId() +"   :    "+ selectedClasse.getNom());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pNom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pPrenom = new javax.swing.JTextField();
        pSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pTable = new javax.swing.JTable();
        pModify = new javax.swing.JButton();
        pDelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        eNom = new javax.swing.JTextField();
        ePrenom = new javax.swing.JTextField();
        eSelect = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        eSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        eTable = new javax.swing.JTable();
        eModify = new javax.swing.JButton();
        eDelete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        crNom = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        crSave = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        crTable = new javax.swing.JTable();
        crmadify = new javax.swing.JButton();
        crDelete = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        csModify = new javax.swing.JButton();
        csDelete = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        csTable = new javax.swing.JTable();
        csSave = new javax.swing.JButton();
        csNom = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ecole  primaire");

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Professeur");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Nom");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Prenom");

        pSave.setText("Enregistre");
        pSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pSaveActionPerformed(evt);
            }
        });

        pTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(pTable);

        pModify.setText("Modifier");
        pModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pModifyActionPerformed(evt);
            }
        });

        pDelete.setText("Supprimer");
        pDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(25, 25, 25)
                                .addComponent(pNom, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pPrenom)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pSave, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(pModify)
                .addGap(76, 76, 76)
                .addComponent(pDelete)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(pNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(pPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(pSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pModify)
                    .addComponent(pDelete))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Professeur", jPanel1);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Eleves");

        eSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Classe");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Prénom");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Nom");

        eSave.setText("Enregistre");
        eSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eSaveActionPerformed(evt);
            }
        });

        eTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(eTable);

        eModify.setText("Modifier");
        eModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eModifyActionPerformed(evt);
            }
        });

        eDelete.setText("Supprimer");
        eDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(25, 25, 25)
                                .addComponent(eNom, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ePrenom)
                                    .addComponent(eSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eSave, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(eModify)
                .addGap(76, 76, 76)
                .addComponent(eDelete)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(eNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(ePrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(eSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(eSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eModify)
                    .addComponent(eDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eleves", jPanel2);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Cours");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Nom");

        crSave.setText("Enregistre");
        crSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crSaveActionPerformed(evt);
            }
        });

        crTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(crTable);

        crmadify.setText("Modifier");
        crmadify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crmadifyActionPerformed(evt);
            }
        });

        crDelete.setText("Supprimer");
        crDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel15)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(crSave, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crNom, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(crmadify)
                .addGap(76, 76, 76)
                .addComponent(crDelete)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(crNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crmadify)
                    .addComponent(crDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cours", jPanel3);

        csModify.setText("Modifier");
        csModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csModifyActionPerformed(evt);
            }
        });

        csDelete.setText("Supprimer");
        csDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csDeleteActionPerformed(evt);
            }
        });

        csTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(csTable);

        csSave.setText("Enregistre");
        csSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csSaveActionPerformed(evt);
            }
        });

        csNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csNomActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Nom");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Classes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel16)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(csSave, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(csNom, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(csModify)
                .addGap(76, 76, 76)
                .addComponent(csDelete)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(csNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(csSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(csModify)
                    .addComponent(csDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Classes", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pSaveActionPerformed
        // TODO add your handling code here:
        if (pNom.getText().toString().isEmpty() || pPrenom.getText().toString().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Verifier si les champs sont bien remplis",
                    "Control des champ de saisie",
                    JOptionPane.PLAIN_MESSAGE);
        } else {
            Professeur professeur = new Professeur();
            professeur.setNom(pNom.getText().toString());
            professeur.setPrenom(pPrenom.getText().toString());
            data.enregitrerElementProfesseur(professeur);
            actualiserPrfesseur();
        }
    }//GEN-LAST:event_pSaveActionPerformed

    private void eSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eSaveActionPerformed
        // TODO add your handling code here:
        if(!eNom.getText().toString().isEmpty() || !ePrenom.getText().toString().isEmpty() ){
            Eleve eleve = new Eleve();
            eleve.setNom(eNom.getText().toString());
            eleve.setPrenom(ePrenom.getText().toString());
            eleve.setClasse_fk(1);
            data.enregitrerElementEleve(eleve);
            actualiserEleve();
        }else{
            JOptionPane.showMessageDialog(this,
                    "Verifier si les champs sont bien remplis",
                    "Control des champ de saisie",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_eSaveActionPerformed

    private void crSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crSaveActionPerformed
        // TODO add your handling code here:
        if (crNom.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Verifier si les champs sont bien remplis",
                    "Control des champ de saisie",
                    JOptionPane.PLAIN_MESSAGE);
        } else {
            Matiere matiere = new Matiere(crNom.getText().toString());
            data.enregitrerElementMatiere(matiere);
            actualiserMatiere();
        }
    }//GEN-LAST:event_crSaveActionPerformed

    private void csSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csSaveActionPerformed
        // TODO add your handling code her
        if (csNom.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Verifier si les champs sont bien remplis",
                    "Control des champ de saisie",
                    JOptionPane.PLAIN_MESSAGE);
        } else {
            Classe classe = new Classe(csNom.getText().toString());
            data.enregitrerElementClasse(classe);
            actualiserClasse();
        }
    }//GEN-LAST:event_csSaveActionPerformed

    private void csNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_csNomActionPerformed

    private void pModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pModifyActionPerformed
        // TODO add your handling code here:
        if(selectedProf !=null && !pNom.getText().toString().equals(selectedProf.getNom())&& !pPrenom.getText().toString().equals(selectedProf.getPrenom()) ){
            selectedProf.setNom(csNom.getText().toString());
            data.UpdateElementProfesseur(selectedProf);
            actualiserPrfesseur();
        }else{
            JOptionPane.showMessageDialog(this,
                    "Verifier si les champs sont bien remplis",
                    "Control des champ de saisie",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_pModifyActionPerformed

    private void csModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csModifyActionPerformed
        // TODO add your handling code here:
        if(selectedClasse !=null && !csNom.getText().toString().equals(selectedClasse.getNom()) ){
            selectedClasse.setNom(csNom.getText().toString());
            data.UpdateElemenClasse(selectedClasse);
            actualiserClasse();
        }else{
            JOptionPane.showMessageDialog(this,
                    "Verifier si les champs sont bien remplis",
                    "Control des champ de saisie",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_csModifyActionPerformed

    private void csDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csDeleteActionPerformed
        // TODO add your handling code here:
        if(selectedClasse !=null && csNom.getText().toString().equals(selectedClasse.getNom()) ){
            selectedClasse.setNom(csNom.getText().toString());
            data.SupprimerClasse(selectedClasse.getId());
            actualiserClasse();
        }else{
            JOptionPane.showMessageDialog(this,
                    "Verifier si les champs sont bien remplis",
                    "Control des champ de saisie",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_csDeleteActionPerformed

    private void crmadifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crmadifyActionPerformed
        // TODO add your handling code here:
        if(selectedMatier !=null && !crNom.getText().toString().equals(selectedMatier.getNom()) ){
            selectedMatier.setNom(crNom.getText().toString());
            data.UpdateElementMatiere(selectedMatier);
            actualiserMatiere();
        }else{
            JOptionPane.showMessageDialog(this,
                    "Verifier si les champs sont bien remplis",
                    "Control des champ de saisie",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_crmadifyActionPerformed

    private void crDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crDeleteActionPerformed
        // TODO add your handling code here:
        if(selectedMatier !=null && !crNom.getText().toString().equals(selectedMatier.getNom()) ){
            selectedMatier.setNom(crNom.getText().toString());
            data.SupprimerMatiere(selectedMatier.getId());
            actualiserMatiere();
        }else{
            JOptionPane.showMessageDialog(this,
                    "Verifier si les champs sont bien remplis",
                    "Control des champ de saisie",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_crDeleteActionPerformed

    private void eModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eModifyActionPerformed
        // TODO add your handling code here:
        if(selectedEleve !=null && !eNom.getText().toString().equals(selectedEleve.getNom()) && !pNom.getText().toString().equals(selectedEleve.getNom()) ){
            selectedEleve.setNom(crNom.getText().toString());
            data.UpdateElementEleve(selectedEleve);
            actualiserEleve();
        }else{
            JOptionPane.showMessageDialog(this,
                    "Verifier si les champs sont bien remplis",
                    "Control des champ de saisie",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_eModifyActionPerformed

    private void eDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eDeleteActionPerformed
        // TODO add your handling code here:
        if(selectedEleve !=null && eNom.getText().toString().equals(selectedEleve.getNom()) && pNom.getText().toString().equals(selectedEleve.getNom()) ){
            selectedEleve.setNom(crNom.getText().toString());
            data.SupprimerEleve(selectedEleve.getId());
            actualiserEleve();
        }else{
            JOptionPane.showMessageDialog(this,
                    "Verifier si les champs sont bien remplis",
                    "Control des champ de saisie",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_eDeleteActionPerformed

    private void pDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pDeleteActionPerformed
        // TODO add your handling code here:
        if(selectedProf !=null && pNom.getText().toString().equals(selectedProf.getNom())&& pPrenom.getText().toString().equals(selectedProf.getPrenom()) ){
            selectedProf.setNom(csNom.getText().toString());
            data.SupprimerProfesseur(selectedProf.getId());
            actualiserPrfesseur();
        }else{
            JOptionPane.showMessageDialog(this,
                    "Verifier si les champs sont bien remplis",
                    "Control des champ de saisie",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_pDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    private void actualiserMatiere() {
        listmatiere = data.afficherToutMatiere();
        Vector linedMatiere = new Vector();
        Vector headers = new Vector();
        Vector nnn = new Vector();

        for (int i = 0; i < listmatiere.size(); i++) {
            linedMatiere.add(listmatiere.get(i).toLine());
        }
        headers.add("Id");
        headers.add("Nom");

        DefaultTableModel model = new DefaultTableModel(linedMatiere, headers);
        crTable.setModel(model);
    }

    private void actualiserClasse() {
        ListClasse = data.afficherToutClasse();
        Vector linedClasse = new Vector();
        Vector headers = new Vector();
        Vector nnn = new Vector();

        for (int i = 0; i < ListClasse.size(); i++) {
            linedClasse.add(ListClasse.get(i).toLine());
        }
        headers.add("Id");
        headers.add("Nom");

        DefaultTableModel model = new DefaultTableModel(linedClasse, headers);
        csTable.setModel(model);
    }

    private void actualiserEleve() {
        listEleve = data.afficherTouteleve();
        Vector linedEleve = new Vector();
        Vector headers = new Vector();
        Vector nnn = new Vector();

        for (int i = 0; i < listEleve.size(); i++) {
            linedEleve.add(listEleve.get(i).toLine());
        }
        headers.add("Id");
        headers.add("Nom");
        headers.add("Prenom");
        headers.add("Classe_Id");

        DefaultTableModel model = new DefaultTableModel(linedEleve, headers);
        eTable.setModel(model);
    }

    private void actualiserPrfesseur() {
        listProfesseur = data.afficherToutProfesseur();
        Vector linedProfesseur = new Vector();
        Vector headers = new Vector();
        Vector nnn = new Vector();

        for (int i = 0; i < listProfesseur.size(); i++) {
            linedProfesseur.add(listProfesseur.get(i).toLine());
        }
        headers.add("Id");
        headers.add("Nom");
        headers.add("Prenom");
        headers.add("Cours_Id");

        DefaultTableModel model = new DefaultTableModel(linedProfesseur, headers);
        pTable.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crDelete;
    private javax.swing.JTextField crNom;
    private javax.swing.JButton crSave;
    private javax.swing.JTable crTable;
    private javax.swing.JButton crmadify;
    private javax.swing.JButton csDelete;
    private javax.swing.JButton csModify;
    private javax.swing.JTextField csNom;
    private javax.swing.JButton csSave;
    private javax.swing.JTable csTable;
    private javax.swing.JButton eDelete;
    private javax.swing.JButton eModify;
    private javax.swing.JTextField eNom;
    private javax.swing.JTextField ePrenom;
    private javax.swing.JButton eSave;
    private javax.swing.JComboBox<String> eSelect;
    private javax.swing.JTable eTable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton pDelete;
    private javax.swing.JButton pModify;
    private javax.swing.JTextField pNom;
    private javax.swing.JTextField pPrenom;
    private javax.swing.JButton pSave;
    private javax.swing.JTable pTable;
    // End of variables declaration//GEN-END:variables
}
