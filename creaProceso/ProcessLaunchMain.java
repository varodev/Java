package creaProceso;

public class ProcessLaunchMain {
	public static void main(String[] args) {//Crear un proceso en Java que lance un programa externo,
		String path = "C:\\Program Files (x86)\\Notepad++\\notepad++.exe";
		String path2 = "C:\\Program Files (x86)\\Notepad++\\notepad++.exe\\readme.txt";

		ProcessLaunch processLauncher = new ProcessLaunch();
        Process process = processLauncher.launch(path,path2);
        System.out.printf("Lanzado el proceso %s", process);
	}

}
