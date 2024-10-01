package werewolf;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Scribe {
	public static String CurrrentWorkingDir = System.getProperty("user.dir");
	public static String CurrentProject;
	public static Path Workpath;
	public static FileReader reader; 
	public static void StartProject (String Project){
		Sprite_manager.runSpriteMaker();
	}
	public static void ChangeProject (String Project) {
		CurrentProject = Project;
		Workpath = Paths.get(CurrrentWorkingDir, Project);
		if (Files.notExists(Workpath)) {
			Scribe.StartProject(Project);
		}
		else {
			
		}
	}
	public static void StoreAs (int[][] layer, int layer_index, String Project_name) {
		
	}
}
