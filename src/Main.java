public class Main {
    public static void main(String[] args) {
        DigitalHouseManager dg1 = new DigitalHouseManager();

        dg1.registrarCurso("FullStack", 4, 5);
        dg1.registrarCurso("FullStack2", 6, 5);
        dg1.registrarCurso("FullStack", 2, 5);

        dg1.registrarProfessorAdjunto("Jose","Bastiao",1,0);
    }
}
