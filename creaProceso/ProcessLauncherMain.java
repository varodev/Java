package creaProceso;
public class ProcessLauncherMain {//Crear un proceso en Java que lance un programa externo.
    public static void main(String[] args) {
        String path = "C:\\Program Files (x86)\\Notepad++\\notepad++.exe";
        ProcessLauncher processLauncher = new ProcessLauncher();
        Process process = processLauncher.launch(path);
        System.out.printf("Lanzado el proceso %s", process);
    }
}


