import UI.UIMenu;

public class Main {
    public static void main(String[] args) {

        Maestro maestro = new Maestro("Yahir Zapata", "yahirzapatae@gmail.com", "Informatica");
        maestro.mostrarNombre();
        maestro.mostrarID();
        maestro.mostrarEspecialidad();
        UIMenu.mostrarMenu();
    }
}