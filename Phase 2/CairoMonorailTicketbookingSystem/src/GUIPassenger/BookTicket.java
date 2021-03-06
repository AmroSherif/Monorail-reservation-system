/*
 *  Group 9
 *  Author: Amro Sherif 201762 
 */
package GUIPassenger;
import Person.*;
import Station.*;
import UserDefinedExceptions.FindTrainException;
import javax.swing.JOptionPane;

public class BookTicket extends javax.swing.JFrame {
    private Passenger currentPassenger;
    
    public BookTicket(Passenger currentPassenger) {
        initComponents();
        
        this.currentPassenger = currentPassenger;
    }

    private BookTicket() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header1 = new javax.swing.JLabel();
        sourceLabel = new javax.swing.JLabel();
        destinationLabel = new javax.swing.JLabel();
        timeSlotLabel = new javax.swing.JLabel();
        sourceInput = new javax.swing.JTextField();
        destinationInput = new javax.swing.JTextField();
        timeSlotInput = new javax.swing.JTextField();
        showAvailableTicketsButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        header1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        header1.setText("Cairo Monorail Ticket booking System");

        sourceLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        sourceLabel.setText("Source:");

        destinationLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        destinationLabel.setText("Destination:");

        timeSlotLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        timeSlotLabel.setText("Time slot:");

        sourceInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceInputActionPerformed(evt);
            }
        });

        showAvailableTicketsButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        showAvailableTicketsButton.setText("Show available tickets");
        showAvailableTicketsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAvailableTicketsButtonActionPerformed(evt);
            }
        });

        previousButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        previousButton.setText("Previous");
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(header1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sourceLabel)
                                    .addComponent(destinationLabel)
                                    .addComponent(timeSlotLabel))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sourceInput)
                                    .addComponent(destinationInput)
                                    .addComponent(timeSlotInput, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(showAvailableTicketsButton)
                                .addGap(32, 32, 32)
                                .addComponent(previousButton)))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(header1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sourceLabel)
                    .addComponent(sourceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(destinationLabel)
                    .addComponent(destinationInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timeSlotLabel)
                    .addComponent(timeSlotInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showAvailableTicketsButton)
                    .addComponent(previousButton))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sourceInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceInputActionPerformed
        
    }//GEN-LAST:event_sourceInputActionPerformed

    private void showAvailableTicketsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAvailableTicketsButtonActionPerformed
        String source = sourceInput.getText(), destination = destinationInput.getText();
        int timeSlot = Integer.valueOf(timeSlotInput.getText());
        
        try{
            int trainIndex = currentPassenger.findTrain(source, destination, timeSlot);
            //System.out.println("YESSSS");
            new ShowAndBookAvailableTickets(trainIndex, currentPassenger, timeSlot, 1).setVisible(true);
            this.dispose();            
        }
        catch(FindTrainException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_showAvailableTicketsButtonActionPerformed

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        this.dispose();
        new HomePassenger(currentPassenger).setVisible(true);
    }//GEN-LAST:event_previousButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField destinationInput;
    private javax.swing.JLabel destinationLabel;
    private javax.swing.JLabel header1;
    private javax.swing.JButton previousButton;
    private javax.swing.JButton showAvailableTicketsButton;
    private javax.swing.JTextField sourceInput;
    private javax.swing.JLabel sourceLabel;
    private javax.swing.JTextField timeSlotInput;
    private javax.swing.JLabel timeSlotLabel;
    // End of variables declaration//GEN-END:variables
}
