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


    public String getUsername() { return username; }
    public int getIntentosFallidos() { return intentosFallidos; }
    public boolean isBloqueado() { return bloqueado; }
    public int getMaxIntentos() { return maxIntentos; }
    public boolean isAccesoExitoso() { return accesoExitoso; }




    public boolean autenticar(String passwordIngresada) {
        if (this.bloqueado) {
            return false; // Si está bloqueado, falla siempre
        }

        if (this.password.equals(passwordIngresada)) {
            this.intentosFallidos = 0; // Reinicia intentos
            this.accesoExitoso = true; // Primer acceso exitoso
            return true;
        } else {
            this.intentosFallidos++; // Incrementa error
            if (this.intentosFallidos >= this.maxIntentos) {
                this.bloqueado = true; // Bloqueo automático
            }
            return false;
        }
    }


    public void reiniciarAcceso() {
        this.intentosFallidos = 0;
        this.bloqueado = false; // Desbloquea la cuenta
    }



    public boolean cambiarPassword(String actual, String nueva) {
        return false;
    }

    public boolean validarPasswordSegura(String nueva) {
        return false;
    }
}
