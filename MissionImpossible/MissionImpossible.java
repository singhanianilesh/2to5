import java.io.File;
import java.io.IOException;
import java.util.Map.Entry;
/*
 * Welcome Mr. Hunt , This program will self destruct use caution. 
 */

public class MissionImpossible {

	public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
		for (final Entry<String, String> entry : System.getenv().entrySet()) {
			if (entry.getKey().startsWith("JAVA_MAIN_CLASS")) {
				String className = entry.getValue();
				Class<?> c = Class.forName(className);
				String path = c.getProtectionDomain().getCodeSource().getLocation().getFile();
				File file = new File(path + c.getName() + ".class");
				file.deleteOnExit();
			}
		}
	}
}
