package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
// import java.util.EventListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import compressor_decompressor.compressor;

public class AppFrame extends JFrame implements ActionListener{
    JButton compressButton;
    JButton deCompressButton;

    AppFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        compressButton = new JButton("Press to Compress");
        compressButton.setBounds(300, 200, 200, 30);
        compressButton.addActionListener(this);

        deCompressButton = new JButton("Press to DeCompress");
        deCompressButton.setBounds(300, 300, 200, 30);
        deCompressButton.addActionListener(this);

        this.add(compressButton);
        this.add(deCompressButton);        

        this.setSize(800, 600);
        this.getContentPane().setBackground(Color.CYAN);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == compressButton){
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
                try{
                    compressor.method(file);
                }
                catch(Exception ee){
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
        }
        if (e.getSource() == deCompressButton){
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
                try{
                    compressor.method(file);
                }
                catch(Exception ee){
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
        }        
    }
}
