package TestMain;
public class TestMain {
    public static void main(String[] args) {

        TestUIMenu.mostrarMenu();
        TestMaestro maestro = new TestMaestro("Yahir Zapata", "yahirzapatae@gmail.com", "Informatica");
        maestro.mostrarNombre();
        maestro.mostrarID();
        maestro.mostrarEspecialidad();


    }
}