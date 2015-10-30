package aplikasi.distro;
import java.sql.*;

public class Koneksi {
Connection Conn = null;
public Koneksi () {
}
public Connection getCon() {
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Conn = DriverManager.getConnection("jdbc:mysql://localhost/distro","root","");
    System.out.println("Berhasil Koneksi");
    }
    catch(ClassNotFoundException | SQLException e) {
        System.out.println("Gagal Koneksi");
    }
return Conn;
}
}