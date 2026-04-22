public class UsuarioSeguroAvanzado {
    private String username;
    private String password;
    private int intentosFallidos;
    private boolean bloqueado;
    private int maxIntentos;
    private boolean accesoExitoso;

    public UsuarioSeguroAvanzado(String username, String password, int maxIntentos) {
        this.username = username;
        this.password = password;
        this.intentosFallidos = 0;
        this.bloqueado = false;
        this.accesoExitoso = false;
        this.maxIntentos = (maxIntentos <= 0) ? 3 : maxIntentos;
    }

    // Getters básicos para que el Main compile
    public String getUsername() { return username; }
    public int getIntentosFallidos() { return intentosFallidos; }
    public boolean isBloqueado() { return bloqueado; }
    public int getMaxIntentos() { return maxIntentos; }
    public boolean isAccesoExitoso() { return accesoExitoso; }

    // Métodos "huecos" (stubs) para que el Main no de error
    public boolean autenticar(String passwordIngresada) {
        return false; // Lógica pendiente
    }

    public void reiniciarAcceso() {
        // Lógica pendiente
    }

    public boolean cambiarPassword(String actual, String nueva) {
        return false; // Lógica pendiente
    }

    public boolean validarPasswordSegura(String nueva) {
        return false; // Lógica pendiente
    }
}
