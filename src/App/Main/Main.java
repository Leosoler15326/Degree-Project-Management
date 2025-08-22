package App.Main;

import App.DataBase.DataBase;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        try (Connection conn = DataBase.conectar()) {
            if (conn != null) {
                System.out.println("Lista de estudiantes:");

                String sql = "SELECT * FROM estudiante"; 
                try (Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery(sql)) {

                    while (rs.next()) {
                        int id = rs.getInt("id");  
                        String name = rs.getString("name");

                        System.out.println(id + " | " + name);
                    }
                }
                System.out.println("✅ Consulta terminada y conexión cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
