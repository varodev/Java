public class Ganador {
    private static boolean ganador;
    private static Atleta atleta;


    public static boolean getGanador() {
        return ganador;
    }

    public static void setGanador(boolean ganador) {
        Ganador.ganador = ganador;
    }

    public static Atleta getAtleta() {
        return atleta;
    }

    public static void setAtleta(Atleta atleta) {
        Ganador.atleta = atleta;
    }
}
