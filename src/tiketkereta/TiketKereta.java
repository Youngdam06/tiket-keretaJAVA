/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiketkereta;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Adam
 */
public class TiketKereta {
    public static java.sql.Connection getKoneksi() {
        Connection konn = null;
        String url = "jdbc:mysql://localhost:3306/tiket_kereta";
        String user = "root";
        String password = "";
        try {
            konn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return konn;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try {
            Connection c = TiketKereta.getKoneksi();
            System.out.println(String.format("berhasil terkoneksi ke %s " , c.getCatalog()));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
