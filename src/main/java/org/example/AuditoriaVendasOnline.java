package org.example;

public class AuditoriaVendasOnline extends AuditoriaVendas {

    public String verificarStatus() {
        if (this.calcularDiferenca() == 0.0f) {
            return "Conforme";
        }
        else {
            return "Divergente";
        }
    }

    @Override
    public String getTipo() {
        return "AuditoriaOnline";
    }
}