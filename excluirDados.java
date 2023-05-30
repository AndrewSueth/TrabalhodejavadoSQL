import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class excluirDados{
    public static void main(String[] args){
        String SQLexcluirDados = "DELETE from pessoa";
        String driver = "jdbc:postgresql://127.0.0.1:5432/Trab de Java";
        Statement st = null;
        Connection conn = null;

        try{
            conn = DriverManager.getConnection(driver, "postgres", "2107");

            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

            System.out.println("Excluindo dados da Tabela...");

            st = conn.createStatement();
            st.executeUpdate(SQLexcluirDados);

            System.out.println("Dados Excluídos!");
        } catch (SQLException e){
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }finally{
            try {
                if (st != null){
                    st.close();
                }

                if (conn != null){
                    conn.close();
                }
            }catch (SQLException e){
                System.err.format("Error closing resources: %s\n%s", e.getSQLState(), e.getMessage());
            }
        }
    }
}
