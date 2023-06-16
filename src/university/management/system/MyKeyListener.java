package university.management.system;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class MyKeyListener implements KeyListener {

    public static void main(String[] args) {
        // Create a frame and add the key listener
        JFrame frame = new JFrame();
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Called when a key is typed (pressed and released)
                // This method is not usually used for listening to key events
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Called when a key is pressed down
                int keyCode = e.getKeyCode();
                // Perform actions based on the key code
                if (keyCode == KeyEvent.VK_ENTER) {
                    // Handle Enter key press
                    System.out.println("Enter key pressed");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Called when a key is released
                int keyCode = e.getKeyCode();
                // Perform actions based on the key code
                if (keyCode == KeyEvent.VK_ENTER) {
                    // Handle Enter key release
                    System.out.println("Enter key released");
                }
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
