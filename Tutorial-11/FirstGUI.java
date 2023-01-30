import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
// import javax.swing.border.Border;

public class FirstGUI {
    
    private JButton add, min, mul, div;
    private JLabel numL1, numL2;
    private JTextField numT1, numT2;
    private JTextArea outpuTextArea;
    private JPanel northPanel, southPanel, centerPanel;
    private JFrame jf;

    public FirstGUI() {
        jf = new JFrame("Simple Calculator");

        // north panel
        northPanel= new JPanel();
        numL1 = new JLabel("First number");
        numL2 = new JLabel("Second number");
        numT1 = new JTextField("100", 10);
        numT2 = new JTextField("20",10);
        northPanel.add(numL1);
        northPanel.add(numT1);
        northPanel.add(numL2);
        northPanel.add(numT2);
        jf.add(northPanel, BorderLayout.NORTH);

        // center panel
        centerPanel= new JPanel();
        outpuTextArea = new JTextArea("Results will appear here \n100.0 + 20.0 = 120.0 \n100.0 - 20.0 = 80.0 \n100.0 * 20.0 = 2000.0 \n100.0 / 20.0 = 5.0");
        outpuTextArea.setColumns(30);
        outpuTextArea.setRows(5);
        JScrollPane scroll = new JScrollPane(outpuTextArea);
        centerPanel.add(scroll);
        jf.add(centerPanel, BorderLayout.CENTER);

        // souths panel
        southPanel = new JPanel();
        add  = new JButton("Plus");
        min = new JButton("Minus");
        mul = new JButton("Times");
        div = new JButton("Divides");
        southPanel.add(add);
        southPanel.add(min);
        southPanel.add(mul);
        southPanel.add(div);
        jf.add(southPanel, BorderLayout.SOUTH);

        jf.setSize(500, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
