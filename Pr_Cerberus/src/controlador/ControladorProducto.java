package controlador;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import modelo.ProductoDAO;
import vista.Interfaz;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ControladorProducto implements ActionListener {

    // Variables Globales
    private int DocumentoUsuario;
    private String NombreUsuario;
    private String Telefono;
    private String Email;
    private String AreaDeTrabajo;
    private String FotoUsuario;

    // Lista de instancias
    Producto producto = new Producto(DocumentoUsuario, NombreUsuario, Telefono, Email, AreaDeTrabajo, FotoUsuario);
    ProductoDAO productoDAO = new ProductoDAO();
    Interfaz vista = new Interfaz();
    DefaultTableModel modeloTabla = new DefaultTableModel();

    public ControladorProducto(Interfaz _vista) {
        this.vista = _vista;
        vista.setVisible(true);

        AgregarEventos();  // Llamamos a este método para agregar todos los eventos
        listarTabla();  // Llamamos para listar la tabla con los datos actuales
    }

    private void AgregarEventos() {
        // Acciones cuando el botón sea oprimido
        vista.getBtnAgregar().addActionListener(this);
        vista.getBtnActualizar().addActionListener(this);
        vista.getBtnBorrar().addActionListener(this);
        vista.getBtnLimpiar().addActionListener(this);
        vista.getBtnBuscar().addActionListener(this);

        // Agregar MouseListener a la tabla para llenar los campos al hacer clic
        vista.getTblTablaUsuarios().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                llenarCampos(e);  // Llama al método para llenar los campos con los datos de la fila seleccionada
            }
        });
    }

    private void listarTabla() {
        String[] titulos = new String[]{"Documento Usuario", "Nombre Usuario", "Telefono", "Email", "Area de Trabajo", "Foto Usuario"};
        modeloTabla = new DefaultTableModel(titulos, 0);
        List<Producto> listaProductos = productoDAO.listar();
        for (Producto producto : listaProductos) {
            modeloTabla.addRow(new Object[]{
                producto.getDocumentoUsuario(),
                producto.getNombreUsuario(),
                producto.getTelefono(),
                producto.getEmail(),
                producto.getAreaDeTrabajo(),
                producto.getFotoUsuario(),});
        }

        vista.getTblTablaUsuarios().setModel(modeloTabla);
        vista.getTblTablaUsuarios().setPreferredSize(new Dimension(350, modeloTabla.getRowCount() * 16));
    }

    private void llenarCampos(MouseEvent e) {
        JTable target = (JTable) e.getSource();
        int row = target.getSelectedRow();  // Obtener la fila seleccionada

        // Verifica que la fila seleccionada no sea -1 (ninguna fila seleccionada)
        if (row != -1) {
            // Obtener el valor de DocumentoUsuario de la tabla
            DocumentoUsuario = (int) target.getModel().getValueAt(row, 0);

            // Llenar los campos de texto con los valores de la fila seleccionada
            vista.getTxtDocumentoUsuario().setText(String.valueOf(DocumentoUsuario));  // Asegúrate de que se actualiza el campo de DocumentoUsuario
            vista.getTxtNombreUsuario().setText((String) target.getModel().getValueAt(row, 1));
            vista.getTxtTelefono().setText((String) target.getModel().getValueAt(row, 2));
            vista.getTxtEmail().setText((String) target.getModel().getValueAt(row, 3));
            vista.getTxtAreaDeTrabajo().setText((String) target.getModel().getValueAt(row, 4));
            vista.getTxtFotoUsuario().setText((String) target.getModel().getValueAt(row, 5));
        }
    }

    private void limpiarCampos() {
        vista.getTxtDocumentoUsuario().setText("");
        vista.getTxtNombreUsuario().setText("");
        vista.getTxtEmail().setText("");
        vista.getTxtTelefono().setText("");
        vista.getTxtAreaDeTrabajo().setText("");
        vista.getTxtFotoUsuario().setText("");
        vista.getTxtBuscarID().setText("");  // Asegúrate de limpiar también el campo de búsqueda

        // También resetear las variables
        DocumentoUsuario = 0;
        NombreUsuario = "";
        Email = "";
        Telefono = "";
        AreaDeTrabajo = "";
        FotoUsuario = "";
    }

    // Método para realizar la búsqueda de producto por ID
    private boolean buscarProductoPorId() {
        String documentoTexto = vista.getTxtBuscarID().getText().trim();

        // Verificar que el campo no esté vacío y contenga solo números
        if (documentoTexto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un valor en el campo Documento Usuario.");
            return false;  // Retorna false si el campo está vacío
        }

        if (!documentoTexto.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido en el campo Documento Usuario.");
            return false;  // Retorna false si el valor no es un número
        }

        // Proceder con la búsqueda si el valor es válido
        int documentoUsuario = Integer.parseInt(documentoTexto);
        Producto producto = productoDAO.buscarPorId(documentoUsuario);

        if (producto != null) {
            // Si el producto fue encontrado, actualizar los campos con los datos del producto
            vista.getTxtDocumentoUsuario().setText(String.valueOf(producto.getDocumentoUsuario()));
            vista.getTxtNombreUsuario().setText(producto.getNombreUsuario());
            vista.getTxtTelefono().setText(producto.getTelefono());
            vista.getTxtEmail().setText(producto.getEmail());
            vista.getTxtAreaDeTrabajo().setText(producto.getAreaDeTrabajo());
            vista.getTxtFotoUsuario().setText(producto.getFotoUsuario());
            return true;  // Retorna true si el producto fue encontrado
        } else {
            // Si no se encontró el producto
            JOptionPane.showMessageDialog(null, "No se encontró un usuario con el DocumentoUsuario proporcionado.");
            limpiarCampos();  // Limpiar los campos si no se encuentra el producto
            return false;  // Retorna false si no se encontró el producto
        }
    }

    private boolean validarDatos() {
        if ("".equals(vista.getTxtDocumentoUsuario().getText())
                || "".equals(vista.getTxtNombreUsuario().getText())
                || "".equals(vista.getTxtEmail().getText())
                || "".equals(vista.getTxtAreaDeTrabajo().getText())) {
            JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacíos",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean cargarDatos() {
        try {
            String documentoTexto = vista.getTxtDocumentoUsuario().getText().trim();
            String telefonoTexto = vista.getTxtTelefono().getText().trim();

            // Validar que solo contienen dígitos
            if (!documentoTexto.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "El campo Documento de usuario debe contener solo números", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            if (!telefonoTexto.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "El campo Teléfono debe contener solo números", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            // Convertir a enteros después de validar
            DocumentoUsuario = Integer.parseInt(documentoTexto);
            Telefono = vista.getTxtTelefono().getText().trim();
            NombreUsuario = vista.getTxtNombreUsuario().getText().trim();
            Email = vista.getTxtEmail().getText().trim();
            AreaDeTrabajo = vista.getTxtAreaDeTrabajo().getText().trim();
            FotoUsuario = vista.getTxtFotoUsuario().getText().trim();

            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error al cargar los Datos: " + e);
            return false;
        }
    }

    private void agregarProducto() {
        try {
            if (validarDatos()) {
                if (cargarDatos()) {
                    Producto producto = new Producto(DocumentoUsuario, NombreUsuario, Telefono, Email, AreaDeTrabajo, FotoUsuario);
                    productoDAO.Agregar(producto);
                    JOptionPane.showMessageDialog(null, "Registro agregado con éxito");
                    limpiarCampos();
                }
            }
        } catch (Exception e) {
            System.out.println("Error al Agregar(controlador):" + e);
        } finally {
            listarTabla();
        }
    }

    private void actualizarProducto() {
        try {
            if (validarDatos()) {
                if (cargarDatos()) {
                    Producto producto = new Producto(DocumentoUsuario, NombreUsuario, Telefono, Email, AreaDeTrabajo, FotoUsuario);
                    productoDAO.actualizar(producto);
                    JOptionPane.showMessageDialog(null, "Registro Actualizado Exitosamente");
                    limpiarCampos();
                }
            }
        } catch (HeadlessException e) {
            System.out.println("Error al Actualizar (Contr): " + e);
        } finally {
            listarTabla();
        }
    }

    private void borrarProducto() {
        try {
            if (DocumentoUsuario != 0) {
                productoDAO.borrar(DocumentoUsuario);
                JOptionPane.showMessageDialog(null, "Registro Eliminado Exitosamente");
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Debe Seleccionar un usuario de la tabla ",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println("Error al Borrar (Contr): " + e);
        } finally {
            listarTabla();
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == vista.getBtnBuscar()) {
            boolean encontrado = buscarProductoPorId();  // Llama al método de búsqueda y guarda el resultado
            if (!encontrado) {
                System.out.println("No se encontró el producto con el ID proporcionado.");
            }
        }
        if (ae.getSource() == vista.getBtnAgregar()) {
            agregarProducto();
        }
        if (ae.getSource() == vista.getBtnActualizar()) {
            actualizarProducto();
        }
        if (ae.getSource() == vista.getBtnBorrar()) {
            borrarProducto();
        }
        if (ae.getSource() == vista.getBtnLimpiar()) {
            limpiarCampos();
        }
    }

}
