package pooFicheros;
import java.io.*;
public class EjemploFicherosArrayList {

	public static void main(String[] args) throws IOException {
/*//vamos a introducir los objetos del vector en un ArrayList
        ArrayList<Empleado>emple=new ArrayList<>();
        for(int i=0;i<empleado.length;i++){
        	emple.add(empleado[i]);
        }
        String ruta = "C:\\Users\\Alumno\\Desktop\\pilar\\PROGRAMACION";
		String Nombre = "LISTA.txt";
        File archivo = new File(ruta,Nombre);
		FileWriter fw=new FileWriter(archivo);
		BufferedWriter bw=new BufferedWriter(fw);
		
		//vamos a llevar el contenido del ArrayList a un fichero
        for (Empleado E:emple){
        	bw.write(E.toString());
        	bw.newLine();
        	
        }
        bw.flush();
        String ruta2 = "C:\\Users\\Alumno\\Desktop\\pilar\\PROGRAMACION";
		String Nombre2 = "LISTA2.txt";
        File archivo2 = new File(ruta2,Nombre2);
        FileWriter fw2=new FileWriter(archivo2);
        PrintWriter pw=new PrintWriter(fw2);
        for(int i=0;i<emple.size();i++){
        	pw.println(emple.get(i).getNombre());
        	pw.println(emple.get(i).getEdad());
        	pw.println(emple.get(i).getSalario());
        	
        	
        }
      
        pw.flush();
       pw.close();
        System.out.println("VAMOS A METERLO EN UN ARRAYLIST");
       
//vamos a leer de un fichero y lo vamos a llevar a un ArrayList
        FileReader fr=new FileReader(archivo2);
		
		BufferedReader br = new BufferedReader(fr);
      
        ArrayList<Empleado>emple1=new ArrayList<>();
        String linea="";
     
        linea=br.readLine();
        while (linea !=null){     	
        	Empleado objEmple =new Empleado();
         	//String nombre=linea;
        	objEmple.setNombre(linea);
        	
        		int edad=Integer.parseInt(linea=br.readLine());
       
        		objEmple.setEdad(edad);
        		linea=br.readLine();
        		double salario=Double.parseDouble(linea);
        		objEmple.setSalario(salario);
        		//Empleado objEmple =new Empleado(nombre,edad,salario);
        		emple1.add(objEmple);
       
        		linea=br.readLine();	
        
        	
        	
        	}
        br.close();
        bw.close();
        	
        	for(Empleado e:emple1){
        		System.out.println(e.toString());
        	}*/

	}

}
