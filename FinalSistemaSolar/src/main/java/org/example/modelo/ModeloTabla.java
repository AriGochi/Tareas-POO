package org.example.modelo;

import org.example.persistencia.SistemaSolarDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTabla implements TableModel {

    public static final int COLUMNS = 6;
    private ArrayList<SistemaSolar> datos;
    private SistemaSolarDAO sdao;

    public ModeloTabla() {
        sdao = new SistemaSolarDAO();
        datos = new ArrayList<>();
    }

    public ModeloTabla(ArrayList<SistemaSolar> datos) {
        this.datos = datos;
        sdao = new SistemaSolarDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex) {
            case 0:
                return "Id";
            case 1:
                return "Ubicacion";
            case 2:
                return "Numero";
            case 3:
                return "PlanetaGrande";
            case 4:
                return "PlanetaCercano";
            case 5:
                return "Imagen";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch (rowIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return Integer.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int colIndex) {
        SistemaSolar tmp = datos.get(rowIndex);
        switch (colIndex) {
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getUbicacion();
            case 2:
                return tmp.getNumero();
            case 3:
                return tmp.getPlaneetaGrande();
            case 4:
                return tmp.getPlanetaCercano();
            case 5:
                return tmp.getImagen();
        }

        return null;
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int colIndex) {
        switch (colIndex) {
            case 0:
                //datos.get(rowIndex).setId();
                break;
            case 1:
                datos.get(rowIndex).setUbicacion((String) o);
                break;
            case 2:
                datos.get(rowIndex).setNumero((Integer) o);
                break;
            case 3:
                datos.get(rowIndex).setPlaneetaGrande((String) o);
                break;
            case 4:
                datos.get(rowIndex).setPlanetaCercano((String) o);
                break;
            case 5:
                datos.get(rowIndex).setImagen((String) o);
                break;
            default:
                System.out.println("No se modifica nada");
        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void CargarDatos() {
        try {
            ArrayList<SistemaSolar> tirar = sdao.obtenerTodo();
            System.out.println(tirar);

            datos = sdao.obtenerTodo();

        } catch (SQLException sqle) {

            System.out.println(sqle);
        }

    }

    public boolean agregarDatos(SistemaSolar sistemaSolar) {

        boolean resultado = false;
        try {
            if (sdao.insertar(sistemaSolar)) {
                datos.add(sistemaSolar);
                resultado = true;

            } else {
                resultado = false;
            }


        } catch (SQLException saqle) {
            System.out.println(saqle.getMessage());
        }
        return resultado;
    }

    public SistemaSolar getSistemaIndex(int index) {
        return datos.get(index);
    }

    public boolean actualizarNatacion(SistemaSolar sistemaSolar) {
        boolean resultado = true;
        try {
            if (sdao.update(sistemaSolar)) {
                datos.add(sistemaSolar);
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    public boolean eliminarNatacion(String id) {
        boolean resultado = false;
        try {
            if (sdao.delete(id)) {
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
}