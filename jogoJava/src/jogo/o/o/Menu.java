/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.o.o;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author 20171INF_I0238
 */
public class Menu extends javax.swing.JFrame {
        public int Forca = 0, Velocidade = 0, Energia = 0, Visao = 0, Resistencia = 0, Altura = 0, Recebeu = 0, Estato = 0;
        String Nome = "", Habilidade = "";  
        Timer Tempo = null;
        int Click = 0, Progresso = 0;
        Texto TEX = new Texto();
        
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        Click = 1;
        lb_nome.setText("Nome: "+ TEX.Ler(Click, Recebeu, Estato));
        Click = 2;
        lb_habilidade.setText("Habilidade: "+ TEX.Ler(Click, Recebeu, Estato));
        Click = 3;
        lb_forca.setText("Força: "+ TEX.Ler(Click, Recebeu, Estato));
        Click = 4;
        lb_velocidade.setText("Velocidade: "+ TEX.Ler(Click, Recebeu, Estato));
        Click = 5;
        lb_energia.setText("Energia: "+ TEX.Ler(Click, Recebeu, Estato));
        Energia = Integer.parseInt(TEX.Ler(Click, Recebeu, Estato));
        Click = 6;
        lb_visao.setText("Visao: "+ TEX.Ler(Click, Recebeu, Estato));
        Click = 7;
        lb_resistencia.setText("Resistencia: "+ TEX.Ler(Click, Recebeu, Estato));
        Click = 8;
        lb_altura.setText("Altura: "+ TEX.Ler(Click, Recebeu, Estato)+ "cm");
        getContentPane().setBackground(new Color(153, 225, 153));
        Tempo = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              BarraIndo(); 
            }
        });
        
    }
    
    public void BarraIndo(){
        switch(Click){
            case 3:
                pb_forca.setValue(Progresso);
                if(Progresso < 100){
                    Progresso++;
                }else{
                    Progresso = 0;
                    pb_forca.setValue(Progresso);
                    Forca = Integer.parseInt(TEX.Ler(Click, Recebeu, Estato));
                    Click = 2;
                    System.out.println(TEX.Ler(Click, Recebeu, Estato));
                    if ("Aprende Rápido".equals(TEX.Ler(Click, Recebeu, Estato))){
                       Forca += 2; 
                    }else{
                       Forca += 1;
                    }
                    Estato = Forca;
                    lb_forca.setText("Força: "+ String.valueOf(Forca));
                    Click = 0;
                    Recebeu = 3;
                    bt_resistencia.setEnabled(true);
                    bt_visao.setEnabled(true);
                    bt_velocidade.setEnabled(true);
                    TEX.Ler(Click, Recebeu, Estato);
                    Click = 5;
                    lb_energia.setText("Energia: "+ TEX.Ler(Click, Recebeu, Estato));
                    Energia = Integer.parseInt(TEX.Ler(Click, Recebeu, Estato));
                }
                break;
            case 4:
                pb_velocidade.setValue(Progresso);
                if(Progresso < 100){
                    Progresso++;
                }else{
                    Progresso = 0;
                    pb_velocidade.setValue(Progresso);
                    Velocidade = Integer.parseInt(TEX.Ler(Click, Recebeu, Estato));
                    Click = 2;
                    if ("Aprende Rápido".equals(TEX.Ler(Click, Recebeu, Estato))){
                       Velocidade += 2; 
                    }else{
                       Velocidade += 1;
                    }
                    Estato = Velocidade;
                    lb_velocidade.setText("Velocidade: "+ String.valueOf(Velocidade));
                    Click = 0;
                    Recebeu = 4;
                    bt_resistencia.setEnabled(true);
                    bt_visao.setEnabled(true);
                    bt_forca.setEnabled(true);
                    TEX.Ler(Click, Recebeu, Estato);
                    Click = 5;
                    lb_energia.setText("Energia: "+ TEX.Ler(Click, Recebeu, Estato));
                    Energia = Integer.parseInt(TEX.Ler(Click, Recebeu, Estato));
                }
                break;
            case 6:
                pb_visao.setValue(Progresso);
                if(Progresso < 100){
                    Progresso++;
                }else{
                    Progresso = 0;
                    pb_visao.setValue(Progresso);
                    Visao = Integer.parseInt(TEX.Ler(Click, Recebeu, Estato));
                    Click = 2;
                    if ("Aprende Rápido".equals(TEX.Ler(Click, Recebeu, Estato))){
                       Visao += 2; 
                    }else{
                       Visao += 1;
                    }
                    Estato = Visao;
                    lb_visao.setText("Visão: "+ String.valueOf(Visao));
                    Click = 0;
                    Recebeu = 6;
                    bt_resistencia.setEnabled(true);
                    bt_forca.setEnabled(true);
                    bt_velocidade.setEnabled(true);
                    TEX.Ler(Click, Recebeu, Estato);
                    Click = 5;
                    lb_energia.setText("Energia: "+ TEX.Ler(Click, Recebeu, Estato));
                    Energia = Integer.parseInt(TEX.Ler(Click, Recebeu, Estato));
                }
                
                break;
            case 7:
                pb_resistencia.setValue(Progresso);
                if(Progresso < 100){
                    Progresso++;
                }else{
                    Progresso = 0;
                    pb_resistencia.setValue(Progresso);
                    Resistencia = Integer.parseInt(TEX.Ler(Click, Recebeu, Estato));
                    Click = 2;
                    if ("Aprende Rápido".equals(TEX.Ler(Click, Recebeu, Estato))){
                       Resistencia += 2; 
                    }else{
                       Resistencia += 1;
                    }
                    Estato = Resistencia;
                    lb_resistencia.setText("Resistencia: "+ String.valueOf(Resistencia));
                    Click = 0;
                    Recebeu = 7;
                    bt_visao.setEnabled(true);
                    bt_forca.setEnabled(true);
                    bt_velocidade.setEnabled(true);
                    TEX.Ler(Click, Recebeu, Estato);
                    Click = 5;
                    lb_energia.setText("Energia: "+ TEX.Ler(Click, Recebeu, Estato));
                    Energia = Integer.parseInt(TEX.Ler(Click, Recebeu, Estato));
                }
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_forca = new javax.swing.JButton();
        bt_velocidade = new javax.swing.JButton();
        bt_visao = new javax.swing.JButton();
        bt_resistencia = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        pb_forca = new javax.swing.JProgressBar();
        pb_velocidade = new javax.swing.JProgressBar();
        pb_visao = new javax.swing.JProgressBar();
        pb_resistencia = new javax.swing.JProgressBar();
        lb_forca = new javax.swing.JLabel();
        lb_velocidade = new javax.swing.JLabel();
        lb_resistencia = new javax.swing.JLabel();
        lb_altura = new javax.swing.JLabel();
        lb_visao = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        lb_habilidade = new javax.swing.JLabel();
        lb_energia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        bt_forca.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        bt_forca.setText("Treinar Força");
        bt_forca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_forcaActionPerformed(evt);
            }
        });
        getContentPane().add(bt_forca);
        bt_forca.setBounds(375, 50, 150, 50);

        bt_velocidade.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        bt_velocidade.setText("Treinar Velocidade");
        bt_velocidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_velocidadeActionPerformed(evt);
            }
        });
        getContentPane().add(bt_velocidade);
        bt_velocidade.setBounds(625, 50, 150, 50);

        bt_visao.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        bt_visao.setText("Treinar Visão");
        bt_visao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_visaoActionPerformed(evt);
            }
        });
        getContentPane().add(bt_visao);
        bt_visao.setBounds(375, 300, 150, 50);

        bt_resistencia.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        bt_resistencia.setText("Treinar Resistencia");
        bt_resistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_resistenciaActionPerformed(evt);
            }
        });
        getContentPane().add(bt_resistencia);
        bt_resistencia.setBounds(625, 300, 150, 50);

        bt_sair.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        bt_sair.setText("Sair");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });
        getContentPane().add(bt_sair);
        bt_sair.setBounds(25, 500, 150, 50);
        getContentPane().add(pb_forca);
        pb_forca.setBounds(375, 110, 150, 14);
        getContentPane().add(pb_velocidade);
        pb_velocidade.setBounds(625, 110, 150, 14);
        getContentPane().add(pb_visao);
        pb_visao.setBounds(375, 360, 150, 14);
        getContentPane().add(pb_resistencia);
        pb_resistencia.setBounds(625, 360, 150, 14);

        lb_forca.setFont(new java.awt.Font("Segoe UI Emoji", 0, 22)); // NOI18N
        lb_forca.setText("Força: 1");
        getContentPane().add(lb_forca);
        lb_forca.setBounds(375, 135, 150, 30);

        lb_velocidade.setFont(new java.awt.Font("Segoe UI Emoji", 0, 22)); // NOI18N
        lb_velocidade.setText("Velocidade: 1");
        getContentPane().add(lb_velocidade);
        lb_velocidade.setBounds(625, 135, 150, 30);

        lb_resistencia.setFont(new java.awt.Font("Segoe UI Emoji", 0, 22)); // NOI18N
        lb_resistencia.setText("Resistencia: 1");
        getContentPane().add(lb_resistencia);
        lb_resistencia.setBounds(625, 385, 150, 30);

        lb_altura.setFont(new java.awt.Font("Segoe UI Emoji", 0, 22)); // NOI18N
        lb_altura.setText("Altura: ");
        getContentPane().add(lb_altura);
        lb_altura.setBounds(25, 310, 150, 30);

        lb_visao.setFont(new java.awt.Font("Segoe UI Emoji", 0, 22)); // NOI18N
        lb_visao.setText("Visão: 1");
        getContentPane().add(lb_visao);
        lb_visao.setBounds(375, 385, 150, 30);

        lb_nome.setFont(new java.awt.Font("Segoe UI Emoji", 0, 22)); // NOI18N
        lb_nome.setText("Nome: ");
        getContentPane().add(lb_nome);
        lb_nome.setBounds(25, 110, 200, 30);

        lb_habilidade.setFont(new java.awt.Font("Segoe UI Emoji", 0, 22)); // NOI18N
        lb_habilidade.setText("Habilidade: ");
        getContentPane().add(lb_habilidade);
        lb_habilidade.setBounds(25, 210, 325, 30);

        lb_energia.setFont(new java.awt.Font("Segoe UI Emoji", 0, 22)); // NOI18N
        lb_energia.setText("Energia: ");
        getContentPane().add(lb_energia);
        lb_energia.setBounds(25, 410, 150, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        Inicio frame0 = new Inicio();
        frame0.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_sairActionPerformed

    private void bt_forcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_forcaActionPerformed
        if(Energia > 0){
            Energia--;
            lb_energia.setText("Energia: "+ String.valueOf(Energia));
        Click = 3;
        bt_resistencia.setEnabled(false);
        bt_visao.setEnabled(false);
        bt_velocidade.setEnabled(false);
        Progresso++;
        Tempo.start();
        }
    }//GEN-LAST:event_bt_forcaActionPerformed

    private void bt_velocidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_velocidadeActionPerformed
        if(Energia > 0){
            Energia--;
            lb_energia.setText("Energia: "+ String.valueOf(Energia));
        Click = 4;
        bt_resistencia.setEnabled(false);
        bt_visao.setEnabled(false);
        bt_forca.setEnabled(false);
        Progresso++;
        Tempo.start();
        }
    }//GEN-LAST:event_bt_velocidadeActionPerformed

    private void bt_visaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_visaoActionPerformed
        if(Energia > 0){
            Energia--;
            lb_energia.setText("Energia: "+ String.valueOf(Energia));
        Click = 6;
        bt_resistencia.setEnabled(false);
        bt_velocidade.setEnabled(false);
        bt_forca.setEnabled(false);
        Progresso++;
        Tempo.start();
        }
    }//GEN-LAST:event_bt_visaoActionPerformed

    private void bt_resistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_resistenciaActionPerformed
        if(Energia > 0){
            Energia--;
            lb_energia.setText("Energia: "+ String.valueOf(Energia));
        Click = 7;
        bt_visao.setEnabled(false);
        bt_velocidade.setEnabled(false);
        bt_forca.setEnabled(false);
        Progresso++;
        Tempo.start();
        }
    }//GEN-LAST:event_bt_resistenciaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_forca;
    private javax.swing.JButton bt_resistencia;
    private javax.swing.JButton bt_sair;
    private javax.swing.JButton bt_velocidade;
    private javax.swing.JButton bt_visao;
    private javax.swing.JLabel lb_altura;
    private javax.swing.JLabel lb_energia;
    private javax.swing.JLabel lb_forca;
    private javax.swing.JLabel lb_habilidade;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_resistencia;
    private javax.swing.JLabel lb_velocidade;
    private javax.swing.JLabel lb_visao;
    private javax.swing.JProgressBar pb_forca;
    private javax.swing.JProgressBar pb_resistencia;
    private javax.swing.JProgressBar pb_velocidade;
    private javax.swing.JProgressBar pb_visao;
    // End of variables declaration//GEN-END:variables
}
