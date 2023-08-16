/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberbucket;

import java.awt.Color;
import number.bucket.EvenBucket.EvenBucket;
import number.bucket.MainForm.MainForm;
import number.bucket.OddBucket.OddBucket;
import number.bucket.PrimeBucket.PrimeBucket;

/**
 *
 * @author shan
 */
public class AppInitializer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        OddBucket oddBucket = new OddBucket();
        oddBucket.setVisible(true);
        
        EvenBucket evenBucketForm = new EvenBucket();
        evenBucketForm.setVisible(true);
        
        PrimeBucket primeBucket = new PrimeBucket();
        primeBucket.setVisible(true);
        
        MainForm mainForm = new MainForm();
        mainForm.setForms(oddBucket,evenBucketForm,primeBucket);
        mainForm.setVisible(true);
        
    }
}
