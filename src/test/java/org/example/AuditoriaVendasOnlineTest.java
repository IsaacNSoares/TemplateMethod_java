package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuditoriaVendasOnlineTest {

    @Test
    void deveRetornarConforme() {
        AuditoriaVendasOnline auditoria = new AuditoriaVendasOnline();
        auditoria.setValorSistema(150.0f);
        auditoria.setValorApurado(150.0f); // Diferença de 0.0 (exato)
        assertEquals("Conforme", auditoria.verificarStatus());
    }

    @Test
    void deveRetornarDivergente() {
        AuditoriaVendasOnline auditoria = new AuditoriaVendasOnline();
        auditoria.setValorSistema(150.0f);
        auditoria.setValorApurado(149.9f); // Diferença de 0.1 (não exato)
        assertEquals("Divergente", auditoria.verificarStatus());
    }

    @Test
    void deveRetornarInformacoes() {
        AuditoriaVendasOnline auditoria = new AuditoriaVendasOnline();
        auditoria.setValorSistema(150.0f);
        auditoria.setValorApurado(150.0f);
        auditoria.setLoja("E-commerce");
        auditoria.setCodigo(1);
        assertEquals("AuditoriaOnline{codigo=1, loja='E-commerce', resultado=Conforme}", auditoria.getInfo());
    }
}