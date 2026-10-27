package org.example;

public abstract class AuditoriaVendas {

    private int codigo;
    protected String loja;
    private float valorSistema;
    private float valorApurado;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public float getValorSistema() {
        return valorSistema;
    }

    public void setValorSistema(float valorSistema) {
        this.valorSistema = valorSistema;
    }

    public float getValorApurado() {
        return valorApurado;
    }

    public void setValorApurado(float valorApurado) {
        this.valorApurado = valorApurado;
    }

    public float calcularDiferenca() {
        return Math.abs(this.valorSistema - this.valorApurado);
    }

    public abstract String verificarStatus();

    public String getTipo() {
        return "Auditoria";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "codigo=" + this.codigo +
                ", loja='" + this.loja + '\'' +
                ", resultado=" + this.verificarStatus() +
                '}';
    }
}