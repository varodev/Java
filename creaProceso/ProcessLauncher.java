package creaProceso;
public class ProcessLauncher {
    public Process launch(String path) {
        ProcessBuilder processBuilder;
        try {
            processBuilder = new ProcessBuilder(path);
            return processBuilder.start();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
