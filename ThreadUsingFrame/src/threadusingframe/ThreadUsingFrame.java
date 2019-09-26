/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadusingframe;

/**
 *
 * @author Ashiqul hoque chowdh
 */
public class ThreadUsingFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FrameA frameA =new FrameA();
        frameA.setDefaultCloseOperation(frameA.DISPOSE_ON_CLOSE);
        FrameB frameB = new FrameB();
        frameB.setDefaultCloseOperation(frameB.DISPOSE_ON_CLOSE);
        frameA.setVisible(true);
        frameB.setVisible(true);
        
    }
    
}
