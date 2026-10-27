package org.example;

public class AuditoriaVendasFisicas extends AuditoriaVendas {

    public String verificarStatus() {
        if (this.calcularDiferenca() <= 10.0f) {
            return "Conforme";
        }
        else {
            return "Divergente";
        }
    }

}