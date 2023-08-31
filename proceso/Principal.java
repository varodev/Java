package ev3.ejercicios.proceso;

public class Principal {

	public static void main(String[] args) {

		System.out.println("contadorProcesos = " + ProcesoInformatico.getContadorProcesos());
		
		ProcesoInformatico proceso1 = new ProcesoInformatico("proceso1", "proceso1");
		
		System.out.println("Creado proceso1");
		System.out.println("contadorProcesos = " + ProcesoInformatico.getContadorProcesos());
		
		ProcesoInformatico proceso2 = new ProcesoInformatico("proceso2", "proceso2");
		
		System.out.println("Creado proceso2");
		System.out.println("contadorProcesos = " + ProcesoInformatico.getContadorProcesos());
		
		ProcesoInformatico proceso3 = new ProcesoInformatico("proceso3", "proceso3");
		
		System.out.println("Creado proceso3");
		System.out.println("contadorProcesos = " + ProcesoInformatico.getContadorProcesos());
		
		ProcesoInformatico proceso4 = new ProcesoInformatico("proceso4", "proceso4");
		
		System.out.println("Creado proceso4");
		System.out.println("contadorProcesos = " + ProcesoInformatico.getContadorProcesos());
//		System.out.println("contadorProcesos = " + proceso1.getContadorProcesos());
//		System.out.println("contadorProcesos = " + proceso2.getContadorProcesos());
//		System.out.println("contadorProcesos = " + proceso3.getContadorProcesos());
//		System.out.println("contadorProcesos = " + proceso4.getContadorProcesos());
		
		ProcesoInformatico proceso5 = new ProcesoInformatico("proceso5", "proceso5");
		
		System.out.println("Creado proceso5");
		System.out.println("contadorProcesos = " + ProcesoInformatico.getContadorProcesos());
//		System.out.println("contadorProcesos = " + proceso1.getContadorProcesos());
//		System.out.println("contadorProcesos = " + proceso2.getContadorProcesos());
//		System.out.println("contadorProcesos = " + proceso3.getContadorProcesos());
//		System.out.println("contadorProcesos = " + proceso4.getContadorProcesos());
//		System.out.println("contadorProcesos = " + proceso5.getContadorProcesos());

		
		System.out.println();
		System.out.println();
		
		
		System.out.println("El próximo id será " + ProcesoInformatico.proximoId());
		ProcesoInformatico procesoX = new ProcesoInformatico("procesoX", "procesoX");
		System.out.println("El id del procesoX es " + procesoX.getPid());
		
		System.out.println();
		System.out.println("About:");
		ProcesoInformatico.plataforma();
	}

}
