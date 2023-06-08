package org.example.persistencia;

import org.example.modelo.SistemaSolar;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SistemaSolarDAO implements InterfazDAO {

    public SistemaSolarDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {

        String sqlInsert = "INSERT INTO tierra(ubicacion,numero,grande,cercano,imagen) VALUES(?,?,?,?,?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("tierra.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1, ((SistemaSolar) obj).getUbicacion());
        pstm.setInt(2, ((SistemaSolar) obj).getNumero());
        pstm.setString(3, ((SistemaSolar) obj).getPlaneetaGrande());
        pstm.setString(4, ((SistemaSolar) obj).getPlanetaCercano());
        pstm.setString(5, ((SistemaSolar) obj).getImagen());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE tierra SET ubicacion = ?, numero = ?, grande = ?,cercano = ?,imagen= ? WHERE id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("tierra.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1, ((SistemaSolar) obj).getUbicacion());
        pstm.setInt(2, ((SistemaSolar) obj).getNumero());
        pstm.setString(3, ((SistemaSolar) obj).getPlaneetaGrande());
        pstm.setString(4, ((SistemaSolar) obj).getPlanetaCercano());
        pstm.setString(5, ((SistemaSolar) obj).getImagen());
        pstm.setInt(6, ((SistemaSolar) obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM tierra WHERE id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("tierra.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM tierra";
        ArrayList<SistemaSolar> resultado = new ArrayList<>();

            Statement stm = ConexionSingleton.getInstance("tierra.db").getConnection().createStatement();
            ResultSet rst = stm.executeQuery(sql);
            while (rst.next()) {
                resultado.add(new SistemaSolar(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getString(4), rst.getString(5), rst.getString(6)));
            }
        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM tierra WHERE id = ?; ";
        SistemaSolar sistemaSolar = null;

        PreparedStatement pstm = ConexionSingleton.getInstance("tierra.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()) {
            sistemaSolar = new SistemaSolar(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getString(4), rst.getString(5), rst.getString(6));

            return sistemaSolar;
        }
        return null;
    }
}
