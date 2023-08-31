package creaProceso;

/*deber�s crear una versi�n de la clase CreaProceso.ProcessLauncher que permita recibir en el m�todo launch una lista variable de par�metros, de forma que se pueda, por ejemplo,
 * crear un proceso de Acrobat Reader que abra un fichero determinado.*/
public class ProcessLaunch {
	public Process launch(String path, String path2) {
		ProcessBuilder processBuilder;
		try {
			processBuilder = new ProcessBuilder(path, path2);//ruta del ejecutable + nombre del ejecutable.exe, busca en C:
			return processBuilder.start();
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}


