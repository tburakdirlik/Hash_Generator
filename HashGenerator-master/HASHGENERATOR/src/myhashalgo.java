
import java.awt.Color;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author tunahan burak dirlik
 */
public class myhashalgo extends javax.swing.JFrame {

    
     //---------------sha-256-----------------
     public static byte[] getSHA(String input) throws NoSuchAlgorithmException 
    {  
        MessageDigest md = MessageDigest.getInstance("SHA-256");  
        return md.digest(input.getBytes(StandardCharsets.UTF_8));  
    } 
    
    public static String toHexString(byte[] hash) 
    {  
        BigInteger number = new BigInteger(1, hash);   
        StringBuilder hexString = new StringBuilder(number.toString(16));  
        while (hexString.length() < 32)  
        {  
            hexString.insert(0, '0');  
        }  
        return hexString.toString();  
    } 
    //-------------------sha1-------------------
    public static String encryptThisString(String input) 
    { 
        try {  
            MessageDigest md = MessageDigest.getInstance("SHA-1");  
            byte[] messageDigest = md.digest(input.getBytes());  
            BigInteger no = new BigInteger(1, messageDigest); 
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
            return hashtext; 
        } 
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    } 
    //--------------------sha384----------------------
public static String sha384(String input) 
    { 
        try { 
            MessageDigest md = MessageDigest.getInstance("SHA-384"); 
            byte[] messageDigest = md.digest(input.getBytes()); 
            BigInteger no = new BigInteger(1, messageDigest); 
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
            return hashtext; 
        } 
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    } 
    //-----------------sha512-------------------------
    
    public static String sha512(String input) 
    { 
        try { 
            // getInstance() method is called with algorithm SHA-512 
            MessageDigest md = MessageDigest.getInstance("SHA-512"); 
  
            // digest() method is called 
            // to calculate message digest of the input string 
            // returned as array of byte 
            byte[] messageDigest = md.digest(input.getBytes()); 
  
            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest); 
            // Convert message digest into hex value 
            String hashtext = no.toString(16); 
            // Add preceding 0s to make it 32 bit 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
            // return the HashText 
            return hashtext; 
        } 
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    } 
  
    // ----------------------------------sha224--------------------------------
     public static String sha224(String input) 
    { 
        try { 
            MessageDigest md = MessageDigest.getInstance("SHA-224"); 
            byte[] messageDigest = md.digest(input.getBytes()); 
            BigInteger no = new BigInteger(1, messageDigest); 
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
            return hashtext; 
        } 
  
        // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    } 
    //---------------------------------MD2----------------------------------------
    
  
     public static String md2(String input) 
    { 
        try { 
            MessageDigest md = MessageDigest.getInstance("MD2"); 
            byte[] messageDigest = md.digest(input.getBytes()); 
            BigInteger no = new BigInteger(1, messageDigest); 
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
            return hashtext; 
        } 
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    } 
    //-------------------------------------------------------------------------
    
    public static String getMd5(String input) 
    { 
        try { 
            MessageDigest md = MessageDigest.getInstance("MD5"); 
            byte[] messageDigest = md.digest(input.getBytes()); 
            BigInteger no = new BigInteger(1, messageDigest); 
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
            return hashtext; 
        }  

        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    } 
  
    

    
    public myhashalgo() {
        initComponents();
         this.getContentPane().setBackground(Color.black);
         input.setForeground(Color.white);
         md2.setForeground(Color.white);
         MD5.setForeground(Color.white);
         sha1.setForeground(Color.white);
         sha224.setForeground(Color.white);
         sha256.setForeground(Color.white);
         md5.setForeground(Color.white);
         sha512.setForeground(Color.white);
         info.setForeground(Color.white);
         hash.setForeground(Color.black);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        sha224output = new javax.swing.JTextField();
        input = new javax.swing.JLabel();
        sha1 = new javax.swing.JLabel();
        sha224 = new javax.swing.JLabel();
        sha256 = new javax.swing.JLabel();
        md5 = new javax.swing.JLabel();
        hash = new javax.swing.JButton();
        inputtext = new javax.swing.JTextField();
        sha1output = new javax.swing.JTextField();
        sha256output = new javax.swing.JTextField();
        sha512output = new javax.swing.JTextField();
        sha512 = new javax.swing.JLabel();
        sha384output1 = new javax.swing.JTextField();
        md2 = new javax.swing.JLabel();
        md2output = new javax.swing.JTextField();
        MD5 = new javax.swing.JLabel();
        md5output = new javax.swing.JTextField();
        info = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 51));
        sha224output.setBackground(new java.awt.Color(255, 255, 255));
        sha224output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sha224outputActionPerformed(evt);
            }
        });

        input.setText("INPUT");
        sha1.setText("SHA-1");
        sha224.setText("SHA-224");
        sha256.setText("SHA-256");
        md5.setText("SHA-384");
        hash.setForeground(new java.awt.Color(0, 0, 0));
        hash.setText("HASH");
        hash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hashActionPerformed(evt);
            }
        });

        inputtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputtextActionPerformed(evt);
            }
        });

        sha1output.setBackground(new java.awt.Color(255, 255, 255));
        sha1output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sha1outputActionPerformed(evt);
            }
        });

        sha256output.setBackground(new java.awt.Color(255, 255, 255));
        sha256output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sha256outputActionPerformed(evt);
            }
        });

        sha512output.setBackground(new java.awt.Color(255, 255, 255));
        sha512output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sha512outputActionPerformed(evt);
            }
        });

        sha512.setText("SHA-512");

        sha384output1.setBackground(new java.awt.Color(255, 255, 255));
        sha384output1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sha384output1ActionPerformed(evt);
            }
        });

        md2.setText("MD-2");

        md2output.setBackground(new java.awt.Color(255, 255, 255));
        md2output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                md2outputActionPerformed(evt);
            }
        });

        MD5.setText("MD-5");

        md5output.setBackground(new java.awt.Color(255, 255, 255));
        md5output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                md5outputActionPerformed(evt);
            }
        });

        info.setText("HAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHA    USE ONLY ENGLISH CHARACTERS    HAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sha1)
                    .addComponent(sha224)
                    .addComponent(sha256)
                    .addComponent(md5)
                    .addComponent(sha512)
                    .addComponent(md2)
                    .addComponent(MD5))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                    .addComponent(hash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(md2output, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(md5output)
                    .addComponent(sha1output)
                    .addComponent(sha224output)
                    .addComponent(sha256output)
                    .addComponent(sha384output1)
                    .addComponent(sha512output)
                    .addComponent(inputtext))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(hash)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input)
                    .addComponent(inputtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(md2)
                    .addComponent(md2output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MD5)
                    .addComponent(md5output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sha1)
                    .addComponent(sha1output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sha224)
                    .addComponent(sha224output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sha256)
                    .addComponent(sha256output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(md5)
                    .addComponent(sha384output1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sha512)
                    .addComponent(sha512output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(info)
                .addGap(107, 107, 107))
        );

        pack();
    }// </editor-fold>                        

    private void sha224outputActionPerformed(java.awt.event.ActionEvent evt) {                                             
    }                                            

    private void hashActionPerformed(java.awt.event.ActionEvent evt) {                                     
    String x=inputtext.getText();
         try {
             sha1output.setText(encryptThisString(x));
             sha224output.setText(sha224(x));
             sha256output.setText(toHexString(getSHA(x)));
             sha384output1.setText(sha384(x));
             sha512output.setText(sha512(x));
             
             md2output.setText(md2(x));
             md5output.setText(getMd5(x));
         } catch (NoSuchAlgorithmException ex) {
             Logger.getLogger(myhashalgo.class.getName()).log(Level.SEVERE, null, ex);
         }
         
        
    }                                    

    private void inputtextActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void sha1outputActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void sha256outputActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void sha512outputActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void sha384output1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void md2outputActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void md5outputActionPerformed(java.awt.event.ActionEvent evt) {                                          
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
            java.util.logging.Logger.getLogger(myhashalgo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myhashalgo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myhashalgo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myhashalgo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myhashalgo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel MD5;
    private javax.swing.JButton hash;
    private javax.swing.JLabel info;
    private javax.swing.JLabel input;
    private javax.swing.JTextField inputtext;
    private javax.swing.JLabel md2;
    private javax.swing.JTextField md2output;
    private javax.swing.JLabel md5;
    private javax.swing.JTextField md5output;
    private javax.swing.JLabel sha1;
    private javax.swing.JTextField sha1output;
    private javax.swing.JLabel sha224;
    private javax.swing.JTextField sha224output;
    private javax.swing.JLabel sha256;
    private javax.swing.JTextField sha256output;
    private javax.swing.JTextField sha384output1;
    private javax.swing.JLabel sha512;
    private javax.swing.JTextField sha512output;
               
}
