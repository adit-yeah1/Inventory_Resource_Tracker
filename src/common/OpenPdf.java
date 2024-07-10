/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import com.sun.source.tree.TryTree;
import dao.InventoryUtil;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class OpenPdf {
    public static void OpenById(String id){
        try {
            if(new File(InventoryUtil.billPath+id+".pdf").exists()){
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll, FileProtocolHandler "+InventoryUtil.billPath+""+id+".pdf");
            }else{
                JOptionPane.showMessageDialog(null, "File doesn't exist");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
