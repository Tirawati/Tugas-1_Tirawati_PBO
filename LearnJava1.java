/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tirawati_20210040078_TI21F_PBO
 */import javax.swing.*;
public class LearnJava1 {
    
    public static void main(String[] args) {
        System.out.println("Belajar JAVA");
        System.out.println("Sangat mudah sekali");
        System.out.println("dan sangat menyenangkan");

        
        String input=JOptionPane.showInputDialog( "Anda Sedang belajar apa?");
        JOptionPane.showMessageDialog(null, "Belajar "+input+ " sangat mudah");
    }
}
