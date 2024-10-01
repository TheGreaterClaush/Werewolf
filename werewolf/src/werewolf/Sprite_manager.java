package werewolf;

public class Sprite_manager {
	public static int[][] Current_sprite;
	public static void runSpriteMaker() {
		Current_sprite = Sprite_declare.make_new_canvas();
	}
	public static int ASK(int X, int Y){
		return Current_sprite[X][Y];
	}
	public static void SET(int X, int Y, int A) {
		Current_sprite[X][Y] = A; 
		return;
	}
}
