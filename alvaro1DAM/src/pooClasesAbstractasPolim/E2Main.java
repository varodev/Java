package pooClasesAbstractasPolim;

public class E2Main {

	public static void main(String[] args) {
		E2Operario ope = new E2Operario("jose");
		E2Directivo dir = new E2Directivo("Manuel");
		E2Oficial ofi = new E2Oficial ("Alvaro");
		E2Tecnico tec = new E2Tecnico ("Antonio");
				
		System.out.println(ope.toString());
		System.out.println(dir.toString());
		System.out.println(ofi.toString());
		System.out.println(tec.toString());

	}

}
