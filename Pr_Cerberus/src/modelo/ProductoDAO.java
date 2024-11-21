package modelo;

import controlador.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {

    ConexionBD conexion = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    // Método para listar todos los registros
    public List<Producto> listar() {
        String sql = "SELECT * FROM usuarios";
        List<Producto> lista = new ArrayList<>();

        try {
            con = conexion.ConectarBaseDeDatos();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Producto producto = new Producto();
                producto.setDocumentoUsuario(rs.getInt("DocumentoUsuario"));
                producto.setNombreUsuario(rs.getString("NombreUsuario"));
                producto.setTelefono(rs.getString("Telefono"));
                producto.setEmail(rs.getString("Email"));
                producto.setAreaDeTrabajo(rs.getString("AreaDeTrabajo"));
                producto.setFotoUsuario(rs.getString("FotoUsuario"));
                lista.add(producto);
            }

        } catch (SQLException e) {
            System.err.println("Error al listar: " + e);
        } finally {
            cerrarRecursos();
        }

        return lista;
    }

    // Método para agregar un producto
    public void agregar(Producto producto) {
        String sql = "INSERT INTO usuarios (DocumentoUsuario, NombreUsuario, Telefono, Email, AreaDeTrabajo, FotoUsuario) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            con = conexion.ConectarBaseDeDatos();
            ps = con.prepareStatement(sql);
            ps.setInt(1, producto.getDocumentoUsuario());
            ps.setString(2, producto.getNombreUsuario());
            ps.setString(3, producto.getTelefono());
            ps.setString(4, producto.getEmail());
            ps.setString(5, producto.getAreaDeTrabajo());
            ps.setString(6, producto.getFotoUsuario());
            int filasInsertadas = ps.executeUpdate();

            if (filasInsertadas > 0) {
                System.out.println("Producto agregado con éxito.");
            } else {
                System.out.println("No se pudo agregar el producto.");
            }

        } catch (SQLException e) {
            System.err.println("Error al agregar producto: " + e);
        } finally {
            cerrarRecursos();
        }
    }

    // Método para actualizar un producto
    public void actualizar(Producto producto) {
        String sql = "UPDATE usuarios SET NombreUsuario=?, Telefono=?, Email=?, AreaDeTrabajo=?, FotoUsuario=? WHERE DocumentoUsuario=?";

        try {
            con = conexion.ConectarBaseDeDatos();
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombreUsuario());
            ps.setString(2, producto.getTelefono());
            ps.setString(3, producto.getEmail());
            ps.setString(4, producto.getAreaDeTrabajo());
            ps.setString(5, producto.getFotoUsuario());
            ps.setInt(6, producto.getDocumentoUsuario());
            int filasActualizadas = ps.executeUpdate();

            if (filasActualizadas > 0) {
                System.out.println("Producto actualizado con éxito.");
            } else {
                System.out.println("No se encontró el producto con DocumentoUsuario: " + producto.getDocumentoUsuario());
            }

        } catch (SQLException e) {
            System.err.println("Error al actualizar producto: " + e);
        } finally {
            cerrarRecursos();
        }
    }

    // Método para borrar un producto
    public void borrar(int id) {
        String sql = "DELETE FROM usuarios WHERE DocumentoUsuario = ?";

        try {
            con = conexion.ConectarBaseDeDatos();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int filasEliminadas = ps.executeUpdate();

            if (filasEliminadas > 0) {
                System.out.println("Producto eliminado con éxito.");
            } else {
                System.out.println("No se encontró el producto con DocumentoUsuario: " + id);
            }

        } catch (SQLException e) {
            System.err.println("Error al borrar producto: " + e);
        } finally {
            cerrarRecursos();
        }
    }

    // Método para buscar un producto por su ID
    public Producto buscarPorId(int id) {
        String sql = "SELECT * FROM usuarios WHERE DocumentoUsuario = ?";
        Producto producto = null;

        try {
            con = conexion.ConectarBaseDeDatos();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                producto = new Producto(
                        rs.getInt("DocumentoUsuario"),
                        rs.getString("NombreUsuario"),
                        rs.getString("Telefono"),
                        rs.getString("Email"),
                        rs.getString("AreaDeTrabajo"),
                        rs.getString("FotoUsuario")
                );
            }

        } catch (SQLException e) {
            System.err.println("Error al buscar producto por ID: " + e);
        } finally {
            cerrarRecursos();
        }

        return producto;
    }

    // Método para cerrar recursos (conexión, statement, resultset)
    private void cerrarRecursos() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar recursos: " + e);
        }
    }

    public void Agregar(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void borrar(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
