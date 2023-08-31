package sumaConcurrente;

public class Adder {//¿Dónde está el código de los procesos que queremos lanzar?
    private final int startNumber;
    private final int endNumber;
    private final String processName;

    public Adder (int startNumber, int endNumber, String processName){
        this.startNumber = startNumber;
        this.endNumber = endNumber;
        this.processName = processName;
    }
    public int add(){
        int result=0;
        for(int i=startNumber;i<endNumber;i++){
            result+=i;
            System.out.println(String.format("process %s %d", this.processName, result));
        }
        return result;
    }

    public static void main(String[] args) {
        int startNumber = Integer.parseInt(args[0]);//¿Y si quiero pasarle parámetros a la clase?
        int endNumber = Integer.parseInt(args[1]);
        String processName= args[2];
        Adder adder = new Adder(startNumber, endNumber, processName);
        adder.add();
    }
}
