package werewolf;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Panel_Canvas extends JPanel {
	Panel_Canvas(){
		this.setPreferredSize(new Dimension (500, 500));
	}
	public void paint(Graphics G) {
		Graphics2D G2D = (Graphics2D) G;
		int[][] Sprite = Sprite_manager.getMeDaSprite();
		while (true) {
			
		}
	}
}
