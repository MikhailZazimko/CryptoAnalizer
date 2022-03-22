package ru.javarush.zazimko.cryptoanalizer.View;

import ru.javarush.zazimko.cryptoanalizer.BruteForce;
import ru.javarush.zazimko.cryptoanalizer.Decoder;
import ru.javarush.zazimko.cryptoanalizer.Encoder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingForm extends JFrame{
    private JPanel mainPanel;
    private JPanel top;
    private JPanel left;
    private JPanel right;
    private JPanel bottom;
    private JPanel center;
    private JLabel mainMessage;
    private JTextField decodeSourcePath;
    private JLabel labelPath1;
    private JButton decoder;
    private JTextField encodeSourcePath;
    private JButton encoder;
    private JLabel labelPath2;
    private JTextField bruteForceSourcePath;
    private JButton bruteForce;
    private JLabel labelPath3;
    private JTextField fieldKey;
    private JLabel labelKey;
    private JTextField decodePath;
    private JLabel labelPathDest1;
    private JLabel labelEncodePath;
    private JLabel labelBruteForcePath;
    private JTextField encodePath;
    private JTextField bruteForcePath;

    public SwingForm() throws HeadlessException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        this.setBounds(width/4,height/4,width/2,height/2);
        this.add(mainPanel);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        decoder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String decodePathText = decodeSourcePath.getText();
                String pathText = decodePath.getText();
                int key = Integer.parseInt(fieldKey.getText());
                if (decodePathText.isEmpty()){
JOptionPane.showMessageDialog(mainPanel, "Файл не указан. Будет обработан файл из папки по-умолчанию!","ATTENSION !",JOptionPane.ERROR_MESSAGE);
                    Decoder.decode(null,key,null);
                }else{
                    Decoder.decode(decodePathText,key,pathText);
                }
            }
        });
        encoder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String encodeSourcePathText = encodeSourcePath.getText();
                String encodePathText = encodePath.getText();

                int key = Integer.parseInt(fieldKey.getText());
                if (encodeSourcePathText.isEmpty()){
                    JOptionPane.showMessageDialog(mainPanel, "Файл не указан. Будет обработан файл из папки по-умолчанию!","ATTENSION !",JOptionPane.ERROR_MESSAGE);
                    Encoder.encode(null,key,null);
                }else{
                    Encoder.encode(encodeSourcePathText,key,encodePathText);
                }
            }
        });
        bruteForce.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bruteForceSourcePathText = bruteForceSourcePath.getText();
                String bruteForcePathText = bruteForcePath.getText();
                if(bruteForceSourcePathText.isEmpty()){
                    JOptionPane.showMessageDialog(mainPanel, "Файл не указан. Будет обработан файл из папки по-умолчанию!","ATTENSION !",JOptionPane.ERROR_MESSAGE);
                    BruteForce bruteForce = new BruteForce();
                    bruteForce.decode(null,null);
                }else{
                    BruteForce.decode(bruteForceSourcePathText,bruteForcePathText);
                }
            }
        });
    }
}
