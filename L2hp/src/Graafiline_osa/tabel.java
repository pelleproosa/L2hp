package Graafiline_osa;




import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import javax.swing.JTextField;

import layout.TableLayout;

public class tabel {

    public static void start(String args[]) {
    	
        JFrame frame = new JFrame(MAIN.GLOBAL.aknanimi);
        frame.setSize((MAIN.GLOBAL.width), (MAIN.GLOBAL.height));
        frame.setLayout(new TableLayout(MAIN.GLOBAL.size));
        String[] label=MAIN.GLOBAL.label;
        
        JButton button[] = new JButton[label.length];
        for (int i = 0; i < label.length; i++) {
            button[i] = new JButton(label[i]);
        }
        
        JLabel label1;
        label1 = new JLabel(MAIN.GLOBAL.lbl1string);
        

        final JTextField yourInputField; 
        yourInputField = new JTextField(16);
        
         
        
        final JTextField MinuOutput = new JTextField("", 8);
        MinuOutput.setEditable(false);
        MinuOutput.setBackground(Color.BLACK);
        MinuOutput.setForeground(Color.WHITE);
        
        
        
        
        
        frame.add(yourInputField, MAIN.GLOBAL.inputlockation_1);     
        frame.add(MinuOutput, MAIN.GLOBAL.outputlockation_1);
        frame.add(label1, MAIN.GLOBAL.lbllockation_1);
        frame.add(button[0], MAIN.GLOBAL.btnlockation_1);
        frame.add(button[1], MAIN.GLOBAL.btnlockation_2);
        frame.add(button[2], MAIN.GLOBAL.btnlockation_3);
        frame.add(button[3], MAIN.GLOBAL.btnlockation_4);
        
        
        
        yourInputField.addActionListener(
        	    new ActionListener() {
        	        public void actionPerformed(ActionEvent e) {
        	            String str=yourInputField.getText();
        	            MinuOutput.setText(str);
        	        }
        	    }
        	);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}