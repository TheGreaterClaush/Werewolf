package werewolf;

import javax.swing.JOptionPane;

public class Sprite_declare {
	public static int CanvX;
	public static int CanvY;
	private static int[] filling_cursor = new int[2];
	
	public static int[][] make_new_canvas() {
		CanvX = Integer.parseInt(JOptionPane.showInputDialog("mind telling how wide is the srite"));
		CanvY = Integer.parseInt(JOptionPane.showInputDialog("mind telling how tall is the srite"));
		int[][] Sprite = new int[CanvX][CanvY];
		// 0 = x
		// 1 = y
		while (filling_cursor[1] != CanvY) {
			while (filling_cursor[0] != CanvX) {
				Sprite  [filling_cursor[0]][filling_cursor[1]] = 0;
				filling_cursor[0] = filling_cursor[0] + 1;
			}
			filling_cursor[1] = filling_cursor[1] + 1;
			filling_cursor[0] = 0;
		}
		return Sprite;
	}
	public static <C> int ask (int X, int Y, int[][] A) {
		int C = A[X][Y];
		return C;
	}
}
