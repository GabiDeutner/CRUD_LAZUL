package Frames;

import Objeto.Objeto_Paciente;
import Objeto.Objeto_Sexo;
import Objeto.Objeto_EstadoCivil;

import BancoDado.BD_Paciente;
import BancoDado.BD_Sexo;
import BancoDado.BD_EstadoCivil;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Fr_Cad_Paciente extends javax.swing.JFrame {

    private BD_Paciente bd_paciente     = new BD_Paciente ();
    private ArrayList<Objeto_Paciente> ListaPaciente = new ArrayList();
    private Objeto_Paciente RegistroPaciente   = new Objeto_Paciente ();
    
    private BD_Sexo         bd_sexo            = new BD_Sexo ();
    private ArrayList<Objeto_Sexo> ListaSexo = new ArrayList();
    
    private BD_EstadoCivil  bd_estadocivil     = new BD_EstadoCivil ();
    private ArrayList<Objeto_EstadoCivil> ListaEstadoCivil = new ArrayList();
    
    private String Operacao;
    
    public Fr_Cad_Paciente() {
        initComponents();
        
        try {
            CargaTabela ();
            CargaListaSexo();
            CargaListaEstadoCivil();
            CargaComboBoxSexo ();
            CargaComboBoxEstadoCivil ();
            Desabilita ();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro Carga Grid/Combobox \n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        Operacao=""; 
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_paciente = new javax.swing.JTable();
        lb_codigo = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        lb_ddd = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_telefone = new javax.swing.JLabel();
        lb_dtnasc = new javax.swing.JLabel();
        lb_cpf = new javax.swing.JLabel();
        lb_rg = new javax.swing.JLabel();
        lb_sexo = new javax.swing.JLabel();
        lb_estadocivil = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        tf_nome = new javax.swing.JTextField();
        tf_ddd = new javax.swing.JTextField();
        tf_telefone = new javax.swing.JTextField();
        tf_dtnasc = new javax.swing.JTextField();
        tf_cpf = new javax.swing.JTextField();
        tf_rg = new javax.swing.JTextField();
        cb_sexo = new javax.swing.JComboBox();
        cb_estadocivil = new javax.swing.JComboBox();
        bt_limpar = new javax.swing.JButton();
        bt_incluir = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();
        bt_alterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb_paciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "DDD", "Telefone", "Data de Nasc", "CPF", "RG", "Sexo", "Estado Civil"
            }
        ));
        tb_paciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_pacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_paciente);

        lb_codigo.setText("Código:");

        lb_nome.setText("Nome:");

        lb_ddd.setText("DDD:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Cadastro de Pacientes");

        lb_telefone.setText("Telefone:");

        lb_dtnasc.setText("Data de Nascimento:");

        lb_cpf.setText("CPF:");

        lb_rg.setText("RG:");

        lb_sexo.setText("Sexo:");

        lb_estadocivil.setText("Estado Civil:");

        bt_limpar.setText("Limpar");
        bt_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limparActionPerformed(evt);
            }
        });

        bt_incluir.setText("Incluir");
        bt_incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_incluirActionPerformed(evt);
            }
        });

        bt_excluir.setText("Excluir");
        bt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirActionPerformed(evt);
            }
        });

        bt_alterar.setText("Alterar");
        bt_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_alterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(323, 323, 323))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_dtnasc)
                .addGap(277, 277, 277))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(bt_limpar)
                                .addGap(48, 48, 48)
                                .addComponent(bt_incluir)
                                .addGap(54, 54, 54)
                                .addComponent(bt_excluir)
                                .addGap(51, 51, 51)
                                .addComponent(bt_alterar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lb_nome)
                                    .addComponent(lb_codigo)
                                    .addComponent(lb_ddd)
                                    .addComponent(lb_telefone))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_codigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(tf_telefone)
                                    .addComponent(tf_ddd)
                                    .addComponent(tf_nome, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lb_estadocivil)
                                        .addComponent(lb_sexo)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_rg)
                                            .addComponent(lb_cpf)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cb_estadocivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(tf_rg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_cpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_dtnasc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_codigo)
                            .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_nome)
                            .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_ddd)
                            .addComponent(tf_ddd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_telefone)
                            .addComponent(tf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_cpf)
                            .addComponent(tf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_rg))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_dtnasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_dtnasc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_sexo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_estadocivil)
                            .addComponent(cb_estadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_limpar)
                    .addComponent(bt_incluir)
                    .addComponent(bt_excluir)
                    .addComponent(bt_alterar))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void tb_pacienteMouseClicked(java.awt.event.MouseEvent evt) {                                         
        CarregaTabela_TextFileld();
        MontaTela();
        // TODO add your handling code here:
    }                                        

    private void bt_incluirActionPerformed(java.awt.event.ActionEvent evt) {                                           
   
        int cd_sexo=0;
        int cd_estadocivil=0;
        
        if(Operacao.equals("Incluir")) 
        {
        
            if(isCamposPreenchidos ()) 
            {

                carregaRegPaciente_Inclusao ();
                
                if(isCamposValidos()) {
                
                    try {
                        cd_sexo=bd_sexo.busca_abr_Sexo(RegistroPaciente.getAbr_Sexo());
                        RegistroPaciente.setCd_SexoPaciente(cd_sexo);
                        cd_estadocivil = bd_estadocivil.busca_abr_EstadoCivil(cb_estadocivil.getSelectedItem().toString());
                        RegistroPaciente.setCd_EstCivilPaciente(cd_estadocivil);
                        
                    } catch (Exception ex) {
                       JOptionPane.showMessageDialog(null,"Erro ao buscar Sexo\n"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);
                    }
                    
                    try {
                    
                        if(bd_paciente.InserirPaciente(RegistroPaciente)) {
                            JOptionPane.showMessageDialog(null,"Paciente Incluído com Sucesso","MENSAGEM",JOptionPane.INFORMATION_MESSAGE);     
                        } else {
                            JOptionPane.showMessageDialog(null,"Erro ao incluir Paciente. Erro de Dados","ERRO BD",JOptionPane.ERROR_MESSAGE);     
                        }
                        
                    }  catch (Exception ex) {
                       JOptionPane.showMessageDialog(null,"Erro ao incluir Paciente\n"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);
                    } finally {
                        try {
                            CargaTabela ();
                            CargaListaSexo();
                            CargaListaEstadoCivil();
                            CargaComboBoxSexo ();
                            CargaComboBoxEstadoCivil ();
                            Desabilita ();
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Erro Carga Grid/Combobox \n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                        }
                        Operacao="";
                        
                    } // finally 
                    
                    
                } else { //  if(isCamposValidos()) {
                   JOptionPane.showMessageDialog(null, "Preencha Corretamente:\n Nome com até 30 Caracteres","ERRO",JOptionPane.ERROR_MESSAGE);
                }
                
                
            } else { // if(isCamposPreenchidos ()) {
           
               JOptionPane.showMessageDialog(null, "Preencha todos os campo!","ERRO",JOptionPane.ERROR_MESSAGE);
            }


            
        }else { // if(Operacao.equals("Incluir")) {
            Operacao="Incluir"; 
            Limpar();
            habilitaEdicao ();
        }

// TODO add your handling code here:
    }                                          

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {                                           
 
        int resp = JOptionPane.showConfirmDialog(null,"Confirma Exclusão?","Mensagem Exclusão",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(resp==0) {
            
            try {
               RegistroPaciente.setCd_paciente(Integer.parseInt(tf_codigo.getText().trim()));
               
               if(bd_paciente.ExcluirPaciente(RegistroPaciente) ) {
                  JOptionPane.showMessageDialog(null, "Paciente excluído com Sucesso","Mensagem",JOptionPane.INFORMATION_MESSAGE);            
               } else {
                  JOptionPane.showMessageDialog(null, "Erro ao Excluir Paciente","ERRO BD",JOptionPane.ERROR_MESSAGE);               
               }
               
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(null, "Erro ao Excluir Paciente"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);           
                        
           } finally  {
                Limpar();
                       
                habilitaConsulta();
                try {
                    CargaTabela ();
                } catch (Exception ex) {
                       JOptionPane.showMessageDialog(null, "Erro ao carregar GRID \n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            Desabilita ();
        }

// TODO add your handling code here:
    }                                          

    private void bt_alterarActionPerformed(java.awt.event.ActionEvent evt) {                                           
          
        int cd_sexo=0;
        int cd_estadocivil=0;
        
        if(Operacao.equals("A")) 
        {
        
            if(isCamposPreenchidos ()) 
            {

                carregaRegPaciente();
                
                if(isCamposValidos()) {
                
                    try {
                        cd_sexo=bd_sexo.busca_abr_Sexo(RegistroPaciente.getAbr_Sexo());
                        RegistroPaciente.setCd_SexoPaciente(cd_sexo);
                        cd_estadocivil = bd_estadocivil.busca_abr_EstadoCivil(cb_estadocivil.getSelectedItem().toString());
                        RegistroPaciente.setCd_EstCivilPaciente(cd_estadocivil);
                        
                    } catch (Exception ex) {
                       JOptionPane.showMessageDialog(null,"Erro ao buscar Sexo\n"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);
                    }
                    
                    try {
                    
                        if(bd_paciente.AlteraPaciente(RegistroPaciente)) {
                            JOptionPane.showMessageDialog(null,"Paciente Alterado com Sucesso","MENSAGEM",JOptionPane.INFORMATION_MESSAGE);     
                        } else {
                            JOptionPane.showMessageDialog(null,"Erro ao Alterar Paciente. Erro de Dados","ERRO BD",JOptionPane.ERROR_MESSAGE);     
                        }
                        
                    }  catch (Exception ex) {
                       JOptionPane.showMessageDialog(null,"Erro ao Alterar Paciente\n"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);
                    } finally {
                        try {
                            CargaTabela ();
                            CargaListaSexo();
                            CargaListaEstadoCivil();
                            CargaComboBoxSexo ();
                            CargaComboBoxEstadoCivil ();
                            Desabilita ();
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Erro Carga Grid/Combobox \n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                        }
                        Operacao="";
                        
                    } // finally 
                    
                    
                } else { //  if(isCamposValidos()) {
                   JOptionPane.showMessageDialog(null, "Preencha Corretamente:\n Nome com até 30 Caracteres","ERRO",JOptionPane.ERROR_MESSAGE);
                }
                
                
            } else { // if(isCamposPreenchidos ()) {
           
               JOptionPane.showMessageDialog(null, "Preencha todos os campo!","ERRO",JOptionPane.ERROR_MESSAGE);
            }


            
        }else { // if(Operacao.equals("Incluir")) {
            Operacao="A"; 
            Limpar();
            habilitaEdicao ();
        }

// TODO add your handling code here:
    }                                          

    private void bt_limparActionPerformed(java.awt.event.ActionEvent evt) {                                          
        tf_codigo.setText(null);      
        tf_nome.setText(null);
        tf_cpf.setText(null);
        tf_ddd.setText(null);
        tf_rg.setText(null);
        tf_telefone.setText(null);
        tf_dtnasc.setText(null);
        cb_sexo.setSelectedIndex(-1);
        cb_estadocivil.setSelectedIndex(-1);
        

// TODO add your handling code here:
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fr_Cad_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fr_Cad_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fr_Cad_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fr_Cad_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fr_Cad_Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bt_alterar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_incluir;
    private javax.swing.JButton bt_limpar;
    private javax.swing.JComboBox cb_estadocivil;
    private javax.swing.JComboBox cb_sexo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_codigo;
    private javax.swing.JLabel lb_cpf;
    private javax.swing.JLabel lb_ddd;
    private javax.swing.JLabel lb_dtnasc;
    private javax.swing.JLabel lb_estadocivil;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_rg;
    private javax.swing.JLabel lb_sexo;
    private javax.swing.JLabel lb_telefone;
    private javax.swing.JTable tb_paciente;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_cpf;
    private javax.swing.JTextField tf_ddd;
    private javax.swing.JTextField tf_dtnasc;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_rg;
    private javax.swing.JTextField tf_telefone;
    // End of variables declaration                   

 private void Desabilita () {  
        Limpar();
        tf_codigo.setEditable(false);
        tf_nome.setEditable(false);
        tf_cpf.setEditable(false);
        tf_ddd.setEditable(false);
        tf_rg.setEditable(false);
        tf_telefone.setEditable(false);
        tf_dtnasc.setEditable(false);
        cb_sexo.setEditable(false);
        cb_estadocivil.setEditable(false);
        
  }
    
    private void habilitaConsulta () {
        Limpar();
        tf_codigo.setEditable(true);
        tf_nome.setEditable(false);
        tf_cpf.setEditable(false);
        tf_ddd.setEditable(false);
        tf_rg.setEditable(false);
        tf_telefone.setEditable(false);
        tf_dtnasc.setEditable(false);
        cb_sexo.setEditable(false);
        cb_estadocivil.setEditable(false);
    }
    
    private void habilitaEdicao () {
        Limpar();
        tf_codigo.setEditable(false);
        tf_nome.setEditable(true);
        tf_cpf.setEditable(true);
        tf_ddd.setEditable(true);
        tf_rg.setEditable(true);
        tf_telefone.setEditable(true);
        tf_dtnasc.setEditable(true);
        cb_sexo.setEditable(true);
        cb_estadocivil.setEditable(true);
    }

    private void MontaTela() {
     
        tf_nome.setText(RegistroPaciente.getNm_paciente());        
        tf_codigo.setText(String.valueOf(RegistroPaciente.getCd_paciente()));
        tf_cpf.setText(String.valueOf(RegistroPaciente.getNr_CPFpaciente()));
        tf_ddd.setText(String.valueOf(RegistroPaciente.getNr_DDDPaciente()));
        tf_rg.setText(String.valueOf(RegistroPaciente.getNr_RGpaciente()));
        tf_telefone.setText(String.valueOf(RegistroPaciente.getNr_TelefonePaciente()));
        tf_dtnasc.setText(RegistroPaciente.getDt_nascimentoPaciente());
        cb_sexo.setSelectedItem(RegistroPaciente.getAbr_Sexo());
        cb_estadocivil.setSelectedItem(RegistroPaciente.getAbr_EstadoCivilPaciente());
    }
    
    
    private void Limpar() {
        tf_codigo.setText(null);      
        tf_nome.setText(null);
        tf_cpf.setText(null);
        tf_ddd.setText(null);
        tf_rg.setText(null);
        tf_telefone.setText(null);
        tf_dtnasc.setText(null);
        cb_sexo.setSelectedIndex(-1);
        cb_estadocivil.setSelectedIndex(-1);
        
    }
    
    
     private void carregaRegPaciente_Inclusao () {
        
        
        RegistroPaciente.setNm_paciente(tf_nome.getText().trim());
        RegistroPaciente.setNr_CPFpaciente(Integer.parseInt(tf_cpf.getText().trim()));
        RegistroPaciente.setDt_nascimentoPaciente(tf_dtnasc.getText().trim());
        RegistroPaciente.setNr_RGpaciente(Integer.parseInt(tf_rg.getText().trim()));
        RegistroPaciente.setNr_DDDPaciente(Integer.parseInt(tf_ddd.getText().trim()));
        RegistroPaciente.setNr_TelefonePaciente(Integer.parseInt(tf_telefone.getText().trim()));
        RegistroPaciente.setAbr_Sexo(cb_sexo.getSelectedItem().toString());
        RegistroPaciente.setAbr_EstadoCivilPaciente(cb_estadocivil.getSelectedItem().toString());
        
        System.out.println(cb_sexo.getSelectedItem().toString());
        System.out.println(cb_estadocivil.getSelectedItem().toString());
        
        
    } 
     
     
    private void carregaRegPaciente () {
        
        RegistroPaciente.setNm_paciente(tf_nome.getText().trim());    
        RegistroPaciente.setNr_CPFpaciente(Integer.parseInt(tf_cpf.getText().trim()));
        RegistroPaciente.setDt_nascimentoPaciente(tf_dtnasc.getText().trim());
        RegistroPaciente.setNr_RGpaciente(Integer.parseInt(tf_rg.getText().trim()));
        RegistroPaciente.setNr_DDDPaciente(Integer.parseInt(tf_ddd.getText().trim()));
        RegistroPaciente.setNr_TelefonePaciente(Integer.parseInt(tf_telefone.getText().trim()));
        RegistroPaciente.setAbr_Sexo(cb_sexo.getSelectedItem().toString());  
        RegistroPaciente.setAbr_EstadoCivilPaciente(cb_estadocivil.getSelectedItem().toString());
    }
    
   
    
    private  boolean isCamposPreenchidos () {
       boolean saida=false;
       
       if((!tf_nome.getText().trim().isEmpty())&&
          (!tf_cpf.getText().trim().isEmpty())&&
          (!tf_dtnasc.getText().trim().isEmpty())&&
          (!tf_rg.getText().trim().isEmpty())&&
          (!tf_ddd.getText().trim().isEmpty())&&
          (!tf_telefone.getText().trim().isEmpty())&&     
          (cb_sexo.getSelectedIndex()!=-1) &&
          (cb_estadocivil.getSelectedIndex()!=-1))
       {  
           saida=true;
       }

       
       return saida;
    }
    
    public void CargaTabela () throws Exception {
        try {
            
        
           DefaultTableModel modelo = (DefaultTableModel) tb_paciente.getModel();
           modelo.setNumRows(0);  
           modelo.setRowCount(0);
           
           for(Objeto_Paciente registro: bd_paciente.CarregarListaPaciente()) {
               modelo.addRow( new Object [] 
                            {
                               registro.getCd_paciente(),
                               registro.getNm_paciente(),
                               registro.getNr_DDDPaciente(),
                               registro.getNr_TelefonePaciente(),
                               registro.getDt_nascimentoPaciente(),
                               registro.getNr_CPFpaciente(),
                               registro.getNr_RGpaciente(),
                               registro.getAbr_Sexo(),
                               registro.getAbr_EstadoCivilPaciente()
                       
                            }
                            );
           }
           
        } catch (Exception ex)   {
            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Paciente\n"+ex.getMessage(), "ERRO GRID", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    

    

    private void CarregaTabela_TextFileld() {
        
        RegistroPaciente.setCd_paciente((int) tb_paciente.getValueAt(tb_paciente.getSelectedRow(),0));
        RegistroPaciente.setNm_paciente((String) tb_paciente.getValueAt(tb_paciente.getSelectedRow(),1));
        RegistroPaciente.setNr_DDDPaciente((int) tb_paciente.getValueAt(tb_paciente.getSelectedRow(),2));
        RegistroPaciente.setNr_TelefonePaciente((int) tb_paciente.getValueAt(tb_paciente.getSelectedRow(),3));
        RegistroPaciente.setDt_nascimentoPaciente((String) tb_paciente.getValueAt(tb_paciente.getSelectedRow(),4));
        RegistroPaciente.setNr_CPFpaciente((int) tb_paciente.getValueAt(tb_paciente.getSelectedRow(),5));
        RegistroPaciente.setNr_RGpaciente((int) tb_paciente.getValueAt(tb_paciente.getSelectedRow(),6));
        RegistroPaciente.setAbr_Sexo(((String) tb_paciente.getValueAt(tb_paciente.getSelectedRow(),7)));
        RegistroPaciente.setAbr_EstadoCivilPaciente(((String) tb_paciente.getValueAt(tb_paciente.getSelectedRow(),8))); 
         
    }   

    
    public boolean isCamposValidos(){
        boolean saida=false;
        if ((RegistroPaciente.isNm_Paciente_Valida())&& (RegistroPaciente.isDt_Paciente_Valida())) {
            saida=true;
        }
        return saida;
    }
    
     
    private void CargaListaSexo() throws Exception {
 
      
        ListaSexo  = bd_sexo.CarregarListaSexo();
     
     
    }
    
    private void CargaListaEstadoCivil() throws Exception {
 
      
        ListaEstadoCivil  = bd_estadocivil.CarregarListaEstadoCivil();
     
     
    }
      
    private void CargaComboBoxSexo () {
 
        Iterator<Objeto_Sexo> it = ListaSexo.iterator();
       
        while(it.hasNext()) {
           Objeto_Sexo  reg = it.next();
           String sexo = reg.getAbr_Sexo();
           
           cb_sexo.addItem(sexo);
        }
           
        cb_sexo.setSelectedIndex(-1); 
     
    }
    
    private void CargaComboBoxEstadoCivil () {
 
        Iterator<Objeto_EstadoCivil> it = ListaEstadoCivil.iterator();
       
        while(it.hasNext()) {
           Objeto_EstadoCivil  reg = it.next();
           String estadocivil = reg.getAbr_EstadoCivilPaciente();
           
           cb_estadocivil.addItem(estadocivil);
        }
           
        cb_estadocivil.setSelectedIndex(-1); 
     
    }
}
