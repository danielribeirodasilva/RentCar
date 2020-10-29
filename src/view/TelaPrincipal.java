package view;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        setExtendedState(TelaPrincipal.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnCadastro = new javax.swing.JMenu();
        mnCliente = new javax.swing.JMenuItem();
        mnVeiculo = new javax.swing.JMenuItem();
        mnMarca = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnSaida = new javax.swing.JMenuItem();
        mnAluDev = new javax.swing.JMenu();
        mnAluguel = new javax.swing.JMenuItem();
        mnDecolucao = new javax.swing.JMenuItem();
        mnControle = new javax.swing.JMenu();
        mnUsuario = new javax.swing.JMenuItem();
        mnRelatorio = new javax.swing.JMenu();
        mnAlugueis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de locadora de veiculos - RentCar");

        mnCadastro.setText("Cadastro");

        mnCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, 0));
        mnCliente.setText("Cliente");
        mnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnClienteActionPerformed(evt);
            }
        });
        mnCadastro.add(mnCliente);

        mnVeiculo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, 0));
        mnVeiculo.setText("Veiculo");
        mnCadastro.add(mnVeiculo);

        mnMarca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        mnMarca.setText("Marcas");
        mnCadastro.add(mnMarca);
        mnCadastro.add(jSeparator1);

        mnSaida.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, 0));
        mnSaida.setText("Saida");
        mnSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaidaActionPerformed(evt);
            }
        });
        mnCadastro.add(mnSaida);

        jMenuBar1.add(mnCadastro);

        mnAluDev.setText("Alguel/Devolução");

        mnAluguel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, 0));
        mnAluguel.setText("Aluguel");
        mnAluDev.add(mnAluguel);

        mnDecolucao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, 0));
        mnDecolucao.setText("Devolução");
        mnAluDev.add(mnDecolucao);

        jMenuBar1.add(mnAluDev);

        mnControle.setText("Controle");

        mnUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, 0));
        mnUsuario.setText("Usuario");
        mnControle.add(mnUsuario);

        jMenuBar1.add(mnControle);

        mnRelatorio.setText("Relatorios");

        mnAlugueis.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, 0));
        mnAlugueis.setText("Alugueis");
        mnAlugueis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAlugueisActionPerformed(evt);
            }
        });
        mnRelatorio.add(mnAlugueis);

        jMenuBar1.add(mnRelatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 897, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(913, 655));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnAlugueisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAlugueisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnAlugueisActionPerformed

    private void mnSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaidaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnSaidaActionPerformed

    private void mnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnClienteActionPerformed
        TelaCliente cliente = new TelaCliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_mnClienteActionPerformed

    public static void main(String args[]) {



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnAluDev;
    private javax.swing.JMenuItem mnAlugueis;
    private javax.swing.JMenuItem mnAluguel;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenuItem mnCliente;
    private javax.swing.JMenu mnControle;
    private javax.swing.JMenuItem mnDecolucao;
    private javax.swing.JMenuItem mnMarca;
    private javax.swing.JMenu mnRelatorio;
    private javax.swing.JMenuItem mnSaida;
    private javax.swing.JMenuItem mnUsuario;
    private javax.swing.JMenuItem mnVeiculo;
    // End of variables declaration//GEN-END:variables
}
