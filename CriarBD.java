public class CriarBD {
    static String driverJDBC = "org.postgresql.Driver";
    public static void main(String[] args) {
        try {
            System.out.println("Carregando driver JDBC...");
            Class. forName (driverJDBC);
            System.out.println("Driver carregado!");
        } catch (Exception e) {
            System.out.printf("Falha no carregamento! %c", e);
        }
    }
}
