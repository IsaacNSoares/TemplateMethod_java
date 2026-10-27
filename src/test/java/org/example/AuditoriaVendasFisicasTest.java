package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuditoriaVendasFisicasTest {

    @Test
    void deveRetornarConforme() {
        AuditoriaVendasFisicas auditoria = new AuditoriaVendasFisicas();
        auditoria.setValorSistema(100.0f);
        auditoria.setValorApurado(90.0f); // Diferença exata de 10.0 (limite)
        assertEquals("Conforme", auditoria.verificarStatus());
    }

    @Test
    void deveRetornarDivergente() {
        AuditoriaVendasFisicas auditoria = new AuditoriaVendasFisicas();
        auditoria.setValorSistema(100.0f);
        auditoria.setValorApurado(89.9f); // Diferença de 10.1 (passou do limite)
        assertEquals("Divergente", auditoria.verificarStatus());
    }

    @Test
    void deveRetornarInformacoes() {
        AuditoriaVendasFisicas auditoria = new AuditoriaVendasFisicas();
        auditoria.setValorSistema(100.0f);
        auditoria.setValorApurado(89.9f);
        auditoria.setLoja("Loja Centro");
        auditoria.setCodigo(2);
        assertEquals("Auditoria{codigo=2, loja='Loja Centro', resultado=Divergente}", auditoria.getInfo());
    }
}