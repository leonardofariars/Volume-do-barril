/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barril;

import javax.swing.JFrame;

/**
 *
 * @author Xavier
 */
public class Principal {
    
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Exercício de Programação");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        InterfaceBarril janela = new InterfaceBarril();
	
        frame.setContentPane(janela);
                
        frame.setResizable(false);
        frame.pack(); //tem o mesmo efeito que: frame.setSize(frame.getPreferredSize());
        frame.setVisible(true);
    }
}
