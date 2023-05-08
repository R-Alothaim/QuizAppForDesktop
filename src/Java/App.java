/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java;

/**
 *
 * @author ralot
 */
public class App {
    public static void main(String[] args) {
              Login p4 = new Login();
        Thread J = new Thread(() -> {
                p4.run();
            
                
            
        });
        J.start();
      
}
}
