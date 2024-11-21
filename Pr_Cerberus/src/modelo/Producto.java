package modelo;

public class Producto {

    private int DocumentoUsuario;
    private String NombreUsuario;
    private String Telefono;
    private String Email;
    private String AreaDeTrabajo;
    private String FotoUsuario;
    private String tipoAccion;

    // Constructor con parámetros
    public Producto(int DocumentoUsuario, String NombreUsuario, String Telefono, String Email, String AreaDeTrabajo, String FotoUsuario) {
        this.DocumentoUsuario = DocumentoUsuario;
        this.NombreUsuario = NombreUsuario;
        this.Telefono = Telefono;
        this.Email = Email;
        this.AreaDeTrabajo = AreaDeTrabajo;
        this.FotoUsuario = FotoUsuario;

    }

    // Constructor vacío (si lo necesitas, puedes inicializar con valores predeterminados)
    public Producto() {
        this.DocumentoUsuario = 0;
        this.NombreUsuario = "";
        this.Telefono = "";
        this.Email = "";
        this.AreaDeTrabajo = "";
        this.FotoUsuario = "";
    }

    // Getters y setters
    public int getDocumentoUsuario() {
        return DocumentoUsuario;
    }

    public void setDocumentoUsuario(int DocumentoUsuario) {
        this.DocumentoUsuario = DocumentoUsuario;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAreaDeTrabajo() {
        return AreaDeTrabajo;
    }

    public void setAreaDeTrabajo(String AreaDeTrabajo) {
        this.AreaDeTrabajo = AreaDeTrabajo;
    }

    public String getFotoUsuario() {
        return FotoUsuario;
    }

    public void setFotoUsuario(String FotoUsuario) {
        this.FotoUsuario = FotoUsuario;
    }

} // fin clase Producto
