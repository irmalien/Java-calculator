/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Asus
 */
public class GUI extends javax.swing.JPanel {

    String calculationCurrent =  ""; //Current calculation 
    String calculationPrevious =  ""; //Previous calculation
    String labelAString =  ""; //Main label in string format 
    String labelBString =  ""; //Secondary label in string format
    Logic calculationLogic = new Logic();
    
    public GUI() {
        initComponents();
        LabelA.setText("0");
        LabelB.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelA = new javax.swing.JLabel();
        Button_equals = new javax.swing.JButton();
        Button_PlusMinus = new javax.swing.JButton();
        Button_dot = new javax.swing.JButton();
        Button_0 = new javax.swing.JButton();
        Button_minus = new javax.swing.JButton();
        Button_3 = new javax.swing.JButton();
        Button_2 = new javax.swing.JButton();
        Button_1 = new javax.swing.JButton();
        Button_add = new javax.swing.JButton();
        Button_multiply = new javax.swing.JButton();
        Button_9 = new javax.swing.JButton();
        Button_6 = new javax.swing.JButton();
        Button_5 = new javax.swing.JButton();
        Button_8 = new javax.swing.JButton();
        Button_7 = new javax.swing.JButton();
        Button_4 = new javax.swing.JButton();
        Button_divide = new javax.swing.JButton();
        Button_CE = new javax.swing.JButton();
        Button_C = new javax.swing.JButton();
        Button_squareRoot = new javax.swing.JButton();
        LabelB = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(320, 568));

        LabelA.setBackground(new java.awt.Color(153, 153, 153));
        LabelA.setFont(new java.awt.Font("Roboto Light", 0, 48)); // NOI18N
        LabelA.setForeground(new java.awt.Color(51, 51, 51));
        LabelA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelA.setText("2950");
        LabelA.setMaximumSize(new java.awt.Dimension(999, 999));
        LabelA.setPreferredSize(new java.awt.Dimension(80, 80));

        Button_equals.setBackground(new java.awt.Color(255, 153, 51));
        Button_equals.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        Button_equals.setForeground(new java.awt.Color(255, 255, 255));
        Button_equals.setText("=");
        Button_equals.setMaximumSize(new java.awt.Dimension(57, 27));
        Button_equals.setMinimumSize(new java.awt.Dimension(57, 27));
        Button_equals.setPreferredSize(new java.awt.Dimension(80, 80));
        Button_equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_equalsActionPerformed(evt);
            }
        });

        Button_PlusMinus.setBackground(new java.awt.Color(204, 204, 204));
        Button_PlusMinus.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        Button_PlusMinus.setForeground(new java.awt.Color(51, 51, 51));
        Button_PlusMinus.setText("+/-");
        Button_PlusMinus.setBorder(null);
        Button_PlusMinus.setBorderPainted(false);
        Button_PlusMinus.setMaximumSize(new java.awt.Dimension(57, 27));
        Button_PlusMinus.setMinimumSize(new java.awt.Dimension(57, 27));
        Button_PlusMinus.setPreferredSize(new java.awt.Dimension(80, 80));
        Button_PlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PlusMinusActionPerformed(evt);
            }
        });

        Button_dot.setBackground(new java.awt.Color(204, 204, 204));
        Button_dot.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        Button_dot.setForeground(new java.awt.Color(51, 51, 51));
        Button_dot.setText(".");
        Button_dot.setBorder(null);
        Button_dot.setBorderPainted(false);
        Button_dot.setMaximumSize(new java.awt.Dimension(57, 27));
        Button_dot.setMinimumSize(new java.awt.Dimension(57, 27));
        Button_dot.setPreferredSize(new java.awt.Dimension(80, 80));
        Button_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_dotActionPerformed(evt);
            }
        });

        Button_0.setBackground(new java.awt.Color(204, 204, 204));
        Button_0.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        Button_0.setForeground(new java.awt.Color(51, 51, 51));
        Button_0.setText("0");
        Button_0.setBorder(null);
        Button_0.setBorderPainted(false);
        Button_0.setMaximumSize(new java.awt.Dimension(57, 27));
        Button_0.setMinimumSize(new java.awt.Dimension(57, 27));
        Button_0.setPreferredSize(new java.awt.Dimension(80, 80));
        Button_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_0ActionPerformed(evt);
            }
        });

        Button_minus.setBackground(new java.awt.Color(200, 200, 200));
        Button_minus.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        Button_minus.setForeground(new java.awt.Color(153, 153, 153));
        Button_minus.setText("-");
        Button_minus.setBorder(null);
        Button_minus.setBorderPainted(false);
        Button_minus.setMaximumSize(new java.awt.Dimension(57, 27));
        Button_minus.setMinimumSize(new java.awt.Dimension(57, 27));
        Button_minus.setPreferredSize(new java.awt.Dimension(80, 80));
        Button_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_minusActionPerformed(evt);
            }
        });

        Button_3.setBackground(new java.awt.Color(204, 204, 204));
        Button_3.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        Button_3.setForeground(new java.awt.Color(51, 51, 51));
        Button_3.setText("3");
        Button_3.setBorder(null);
        Button_3.setBorderPainted(false);
        Button_3.setMaximumSize(new java.awt.Dimension(57, 27));
        Button_3.setMinimumSize(new java.awt.Dimension(57, 27));
        Button_3.setPreferredSize(new java.awt.Dimension(80, 80));
        Button_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_3ActionPerformed(evt);
            }
        });

        Button_2.setBackground(new java.awt.Color(204, 204, 204));
        Button_2.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        Button_2.setForeground(new java.awt.Color(51, 51, 51));
        Button_2.setText("2");
        Button_2.setBorder(null);
        Button_2.setBorderPainted(false);
        Button_2.setMaximumSize(new java.awt.Dimension(57, 27));
        Button_2.setMinimumSize(new java.awt.Dimension(57, 27));
        Button_2.setPreferredSize(new java.awt.Dimension(80, 80));
        Button_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_2ActionPerformed(evt);
            }
        });

        Button_1.setBackground(new java.awt.Color(204, 204, 204));
        Button_1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        Button_1.setForeground(new java.awt.Color(51, 51, 51));
        Button_1.setText("1");
        Button_1.setBorder(null);
        Button_1.setBorderPainted(false);
        Button_1.setMaximumSize(new java.awt.Dimension(57, 27));
        Button_1.setMinimumSize(new java.awt.Dimension(57, 27));
        Button_1.setPreferredSize(new java.awt.Dimension(80, 80));
        Button_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_1ActionPerformed(evt);
            }
        });

        Button_add.setBackground(new java.awt.Color(200, 200, 200));
        Button_add.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        Button_add.setForeground(new java.awt.Color(153, 153, 153));
        Button_add.setText("+");
        Button_add.setBorder(null);
        Button_add.setBorderPainted(false);
        Button_add.setMaximumSize(new java.awt.Dimension(57, 27));
        Button_add.setMinimumSize(new java.awt.Dimension(57, 27));
        Button_add.setPreferredSize(new java.awt.Dimension(80, 80));
        Button_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_addActionPerformed(evt);
            }
        });

        Button_multiply.setBackground(new java.awt.Color(200, 200, 200));
        Button_multiply.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        Button_multiply.setForeground(new java.awt.Color(153, 153, 153));
        Button_multiply.setText("x");
        Button_multiply.setBorder(null);
        Button_multiply.setBorderPainted(false);
        Button_multiply.setMaximumSize(new java.awt.Dimension(57, 27));
        Button_multiply.setMinimumSize(new java.awt.Dimension(57, 27));
        Button_multiply.setPreferredSize(new java.awt.Dimension(80, 80));
        Button_multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_multiplyActionPerformed(evt);
            }
        });

        Button_9.setBackground(new java.awt.Color(204, 204, 204));
        Button_9.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        Button_9.setForeground(new java.awt.Color(51, 51, 51));
        Button_9.setText("9");
        Button_9.setBorder(null);
        Button_9.setBorderPainted(false);
        Button_9.setMaximumSize(new java.awt.Dimension(57, 27));
        Button_9.setMinimumSize(new java.awt.Dimension(57, 27));
        Button_9.setPreferredSize(new java.awt.Dimension(80, 80));
        Button_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_9ActionPerformed(evt);
            }
        });

        Button_6.setBackground(new java.awt.Color(204, 204, 204));
        Button_6.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        Button_6.setForeground(new java.awt.Color(51, 51, 51));
        Button_6.setText("6");
        Button_6.setBorder(null);
        Button_6.setBorderPainted(false);
        Button_6.setMaximumSize(new java.awt.Dimension(57, 27));
        Button_6.setMinimumSize(new java.awt.Dimension(57, 27));
        Button_6.setPreferredSize(new java.awt.Dimension(80, 80));
        Button_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_6ActionPerformed(evt);
            }
        });

        Button_5.setBackground(new java.awt.Color(204, 204, 204));
        Button_5.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        Button_5.setForeground(new java.awt.Color(51, 51, 51));
        Button_5.setText("5");
        Button_5.setBorder(null);
        Button_5.setBorderPainted(false);
        Button_5.setMaximumSize(new java.awt.Dimension(57, 27));
        Button_5.setMinimumSize(new java.awt.Dimension(57, 27));
        Button_5.setPreferredSize(new java.awt.Dimension(80, 80));
        Button_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_5ActionPerformed(evt);
            }
        });

        Button_8.setBackground(new java.awt.Color(204, 204, 204));
        Button_8.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        Button_8.setForeground(new java.awt.Color(51, 51, 51));
        Button_8.setText("8");
        Button_8.setBorder(null);
        Button_8.setBorderPainted(false);
        Button_8.setMaximumSize(new java.awt.Dimension(57, 27));
        Button_8.setMinimumSize(new java.awt.Dimension(57, 27));
        Button_8.setPreferredSize(new java.awt.Dimension(80, 80));
        Button_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_8ActionPerformed(evt);
            }
        });

        Button_7.setBackground(new java.awt.Color(204, 204, 204));
        Button_7.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        Button_7.setForeground(new java.awt.Color(51, 51, 51));
        Button_7.setText("7");
        Button_7.setBorder(null);
        Button_7.setBorderPainted(false);
        Button_7.setMaximumSize(new java.awt.Dimension(57, 27));
        Button_7.setMinimumSize(new java.awt.Dimension(57, 27));
        Button_7.setPreferredSize(new java.awt.Dimension(80, 80));
        Button_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_7ActionPerformed(evt);
            }
        });
        Button_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Button_7KeyPressed(evt);
            }
        });

        Button_4.setBackground(new java.awt.Color(204, 204, 204));
        Button_4.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        Button_4.setForeground(new java.awt.Color(51, 51, 51));
        Button_4.setText("4");
        Button_4.setBorder(null);
        Button_4.setBorderPainted(false);
        Button_4.setMaximumSize(new java.awt.Dimension(57, 27));
        Button_4.setMinimumSize(new java.awt.Dimension(57, 27));
        Button_4.setPreferredSize(new java.awt.Dimension(80, 80));
        Button_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_4ActionPerformed(evt);
            }
        });

        Button_divide.setBackground(new java.awt.Color(200, 200, 200));
        Button_divide.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        Button_divide.setForeground(new java.awt.Color(153, 153, 153));
        Button_divide.setText("÷");
        Button_divide.setToolTipText("");
        Button_divide.setBorder(null);
        Button_divide.setBorderPainted(false);
        Button_divide.setMaximumSize(new java.awt.Dimension(57, 27));
        Button_divide.setMinimumSize(new java.awt.Dimension(57, 27));
        Button_divide.setPreferredSize(new java.awt.Dimension(80, 80));
        Button_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_divideActionPerformed(evt);
            }
        });

        Button_CE.setBackground(new java.awt.Color(200, 200, 200));
        Button_CE.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        Button_CE.setForeground(new java.awt.Color(255, 153, 51));
        Button_CE.setText("CE");
        Button_CE.setBorder(null);
        Button_CE.setBorderPainted(false);
        Button_CE.setMaximumSize(new java.awt.Dimension(57, 27));
        Button_CE.setMinimumSize(new java.awt.Dimension(57, 27));
        Button_CE.setPreferredSize(new java.awt.Dimension(80, 80));
        Button_CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CEActionPerformed(evt);
            }
        });

        Button_C.setBackground(new java.awt.Color(200, 200, 200));
        Button_C.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        Button_C.setForeground(new java.awt.Color(255, 153, 51));
        Button_C.setText("C");
        Button_C.setBorder(null);
        Button_C.setBorderPainted(false);
        Button_C.setMaximumSize(new java.awt.Dimension(57, 27));
        Button_C.setMinimumSize(new java.awt.Dimension(57, 27));
        Button_C.setPreferredSize(new java.awt.Dimension(80, 80));
        Button_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CActionPerformed(evt);
            }
        });

        Button_squareRoot.setBackground(new java.awt.Color(200, 200, 200));
        Button_squareRoot.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        Button_squareRoot.setForeground(new java.awt.Color(153, 153, 153));
        Button_squareRoot.setText("x2");
        Button_squareRoot.setBorder(null);
        Button_squareRoot.setBorderPainted(false);
        Button_squareRoot.setMaximumSize(new java.awt.Dimension(57, 27));
        Button_squareRoot.setMinimumSize(new java.awt.Dimension(57, 27));
        Button_squareRoot.setPreferredSize(new java.awt.Dimension(80, 80));
        Button_squareRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_squareRootActionPerformed(evt);
            }
        });

        LabelB.setBackground(new java.awt.Color(153, 153, 153));
        LabelB.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        LabelB.setForeground(new java.awt.Color(153, 153, 153));
        LabelB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelB.setText("30+20-15+");
        LabelB.setMaximumSize(new java.awt.Dimension(999, 999));
        LabelB.setPreferredSize(new java.awt.Dimension(80, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Button_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Button_dot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Button_PlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Button_equals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Button_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Button_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Button_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Button_minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Button_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Button_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Button_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Button_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Button_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Button_CE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_squareRoot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(Button_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelB, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelA, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addComponent(Button_divide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(LabelB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_divide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_CE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_squareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_equals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_PlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_dot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Button_equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_equalsActionPerformed
        // Read fields and save result as variables:
        labelAString = LabelA.getText();
        labelBString = LabelB.getText();
        
        // If LabelA contains anything but number   
        if (labelAString.equals("+") || 
            labelAString.equals("-") || 
            labelAString.equals("x") || 
            labelAString.equals("^") || 
            labelAString.equals("/") || 
            labelAString.equals("%")){
            LabelA.setText(labelBString);
            LabelB.setText(""); //TODO Do I need this?
            calculationCurrent = "";
        }
        // If LabelB is empty (i.e. first calculation)
        else if (labelBString.equals("")){
            LabelA.setText(labelAString);
            calculationCurrent = "";
        }
        // Perform calculation and read result
        else{
            double num1Int = Double.valueOf(labelBString);
            double num2Int = Double.valueOf(labelAString);
            LabelA.setText(calculationLogic.calculate(calculationCurrent, num1Int, num2Int));
            LabelB.setText("");
            calculationCurrent = "";
        }
    }//GEN-LAST:event_Button_equalsActionPerformed

    private void PressNumber(String numberVariable){
        //If LabelA contains anything but number, if so remove and write number.
        labelAString = LabelA.getText();
        if(labelAString.equals("0") || 
           labelAString.equals("+") || 
           labelAString.equals("-") || 
           labelAString.equals("x") || 
           labelAString.equals("^") || 
           labelAString.equals("/") ||
           labelAString.equals("%")){
        labelAString = ""; 
        }
        //If number in label is with decimal point
        if(numberVariable.equals(".")&& labelAString.contains(numberVariable)){
            //Decimal point already is in number and do nothing
        }
        else
            //Add decimal point after number
        LabelA.setText(labelAString + numberVariable);
        }
    
    private void PressCalculate (String calculationVariable){        
        labelAString = LabelA.getText();
        labelBString = LabelB.getText();
        boolean repeatedCalculation = false;
        
        if (labelAString.equals("0") || 
            labelAString.equals("+") || 
            labelAString.equals("-") || 
            labelAString.equals("x") || 
            labelAString.equals("^") || 
            labelAString.equals("/") || 
            labelAString.equals("%")){
            LabelA.setText("");
            calculationPrevious = calculationVariable;
            calculationCurrent = calculationVariable;
            repeatedCalculation = true;
        }
        else {
        calculationPrevious = calculationCurrent; //saglabājam pagājušo matematisko funkciju
        calculationCurrent = calculationVariable; //jaunā aprēķina funkcija, kas tiek iedarbināta
        }
        
        //If Field1 equals nothing, then just save number from Field1 to Num1
        if(labelBString.equals(""))
            LabelB.setText(labelAString);
        
        else if(repeatedCalculation == true){
            
        }

        else{
            double num1Int = Double.valueOf(labelBString); // pagājušo skaitļu summa
            double num2Int = Double.valueOf(labelAString); //jaunais skaitlis
            LabelB.setText(calculationLogic.calculate(calculationPrevious, num1Int, num2Int));           
        }
        LabelA.setText(calculationCurrent);
        //reģistrē funkciju 
    }
    
    
    private void Button_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_0ActionPerformed
        PressNumber("0");
    }//GEN-LAST:event_Button_0ActionPerformed

    private void Button_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_minusActionPerformed
        PressCalculate("-");
    }//GEN-LAST:event_Button_minusActionPerformed

    private void Button_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_3ActionPerformed
        PressNumber("3");
    }//GEN-LAST:event_Button_3ActionPerformed

    private void Button_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_2ActionPerformed
        PressNumber("2");
    }//GEN-LAST:event_Button_2ActionPerformed

    private void Button_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_1ActionPerformed
        PressNumber("1");
    }//GEN-LAST:event_Button_1ActionPerformed

    private void Button_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_addActionPerformed
        PressCalculate("+");
    }//GEN-LAST:event_Button_addActionPerformed

    private void Button_multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_multiplyActionPerformed
        PressCalculate("x");
    }//GEN-LAST:event_Button_multiplyActionPerformed

    private void Button_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_9ActionPerformed
        PressNumber("9");
    }//GEN-LAST:event_Button_9ActionPerformed

    private void Button_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_6ActionPerformed
        PressNumber("6");
    }//GEN-LAST:event_Button_6ActionPerformed

    private void Button_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_5ActionPerformed
        PressNumber("5");
    }//GEN-LAST:event_Button_5ActionPerformed

    private void Button_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_8ActionPerformed
        PressNumber("8");
    }//GEN-LAST:event_Button_8ActionPerformed

    private void Button_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_7ActionPerformed
        PressNumber("7");
    }//GEN-LAST:event_Button_7ActionPerformed

    private void Button_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_4ActionPerformed
        PressNumber("4");
    }//GEN-LAST:event_Button_4ActionPerformed

    private void Button_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_divideActionPerformed
        PressCalculate("/");
    }//GEN-LAST:event_Button_divideActionPerformed

    private void Button_CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CEActionPerformed
            LabelA.setText("0");
    }//GEN-LAST:event_Button_CEActionPerformed

    private void Button_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CActionPerformed
            LabelA.setText("0");
            LabelB.setText("");
    }//GEN-LAST:event_Button_CActionPerformed

    private void Button_PlusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PlusMinusActionPerformed
        labelAString = LabelA.getText();
        
        if (labelAString.equals("0") || 
            labelAString.equals("+") || 
            labelAString.equals("-") || 
            labelAString.equals("x") || 
            labelAString.equals("^") || 
            labelAString.equals("/") || 
            labelAString.equals("%")){
        }
        else {
            if (labelAString.charAt(0) == '-'){
                labelAString = labelAString.replace("-","");
                LabelA.setText(labelAString);
            }
            else{
                LabelA.setText("-" + labelAString);
            }
                
        }
        
    }//GEN-LAST:event_Button_PlusMinusActionPerformed

    private void Button_squareRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_squareRootActionPerformed
        PressCalculate("^");
    }//GEN-LAST:event_Button_squareRootActionPerformed

    private void Button_7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Button_7KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_7KeyPressed

    private void Button_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_dotActionPerformed
        PressNumber(".");
    }//GEN-LAST:event_Button_dotActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_0;
    private javax.swing.JButton Button_1;
    private javax.swing.JButton Button_2;
    private javax.swing.JButton Button_3;
    private javax.swing.JButton Button_4;
    private javax.swing.JButton Button_5;
    private javax.swing.JButton Button_6;
    private javax.swing.JButton Button_7;
    private javax.swing.JButton Button_8;
    private javax.swing.JButton Button_9;
    private javax.swing.JButton Button_C;
    private javax.swing.JButton Button_CE;
    private javax.swing.JButton Button_PlusMinus;
    private javax.swing.JButton Button_add;
    private javax.swing.JButton Button_divide;
    private javax.swing.JButton Button_dot;
    private javax.swing.JButton Button_equals;
    private javax.swing.JButton Button_minus;
    private javax.swing.JButton Button_multiply;
    private javax.swing.JButton Button_squareRoot;
    private javax.swing.JLabel LabelA;
    private javax.swing.JLabel LabelB;
    // End of variables declaration//GEN-END:variables
}