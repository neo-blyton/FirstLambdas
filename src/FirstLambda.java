import java.io.File;
import java.io.FileFilter;

public class FirstLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileFilter filter = new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.getName().endsWith(".java");
			}
		};
		
		FileFilter lambdaFilter = (File pathname) -> pathname.getName().endsWith(".java"); 
		
		File dir = new File("/Volumes/Official/Code/workspace/FirstLambdas/src/");
		File[] files = dir.listFiles(lambdaFilter);
		for(File f : files){
			System.out.println(f);
		}
	}

}
