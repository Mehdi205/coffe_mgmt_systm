/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Mehdi KHATTABI
 */
public class OpenPdf {
    public static void openById(String id){
        /*try{
        if ((new File ("C:\\Users\\Mehdi KHATTABI\\Desktop\\"+id+".pdf")).exists()){
            Process p = Runtime 
                    .getRuntime()
                    .exec("C:\\Users\\Mehdi KHATTABI\\Desktop\\"+id+".pdf");
            
        }
        else 
                JOptionPane.showMessageDialog(null, "File not Found !");
                
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }*/
        try {
            File file = new File("C:\\Users\\Mehdi KHATTABI\\Desktop\\Bills\\" + id + ".pdf");
            if (file.exists()) {
                String osName = System.getProperty("os.name").toLowerCase();
                ProcessBuilder processBuilder;
                
                if (osName.contains("win")) {
                    // Ouvrir le fichier PDF sur Windows
                    processBuilder = new ProcessBuilder("cmd.exe", "/C", file.getAbsolutePath());
                } else if (osName.contains("mac")) {
                    // Ouvrir le fichier PDF sur macOS
                    processBuilder = new ProcessBuilder("open", file.getAbsolutePath());
                } else if (osName.contains("nix") || osName.contains("nux") || osName.contains("bsd")) {
                    // Ouvrir le fichier PDF sur Linux/Unix
                    processBuilder = new ProcessBuilder("xdg-open", file.getAbsolutePath());
                } else {
                    throw new UnsupportedOperationException("Système d'exploitation non pris en charge");
                }
                
                processBuilder.start();
            } else {
                JOptionPane.showMessageDialog(null, "Fichier non trouvé !");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }
}
