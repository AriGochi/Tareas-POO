import java.sql.SQLException;
import java.sql.Statement;

public class DemoLibroDB {
    public DemoLibroDB(){

    }
    public  void interStatement(){
String elTitulo ="Arrancame la vida";
String elAutor = "Angeles matreta";
try {
    Statement stm = ConexionSingleton.getInstance("LibosDB.db").getConnection().createStatement();

    String sqlInsert = "INSERT INTO libros(titulo.autor) VALUES('"+ elTitulo+"',´"+elAutor+"')";
int rowCount= stm.executeUpdate(sqlInsert);
    System.out.println("Se insertaron" + rowCount + "registros");

}catch (SQLException sqle){
    System.out.println("Error al conectar"+ sqle.getMessage());
}
    }
    public void insertPreparedStatemt(){

    }
}
