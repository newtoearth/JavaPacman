package pacman.infra;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Keyboard class.
 * 
 * @author pc
 */
public class Keyboard extends KeyAdapter {
    
    public static boolean[] keyPressed = new boolean[256];

    @Override
    public void keyPressed(KeyEvent e) {
        keyPressed[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keyPressed[e.getKeyCode()] = false;
    }
    
}
