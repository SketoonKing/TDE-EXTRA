package org.example.tests;

import org.example.control.Calculadoraimc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Calculadora_Imc_Testes {

    Calculadoraimc calcImc;

    @Before
    public void setup() {
        calcImc = new Calculadoraimc();
    }


    @Test
    public void testeAdultoBaixoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", calcImc.calcularImc(49.0, 1.735, 20, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveInferior() {
        Assert.assertEquals("Baixo peso grave", calcImc.calcularImc(35.0, 1.73, 20, "feminino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveSuperior() {
        Assert.assertEquals("Baixo peso grave", calcImc.calcularImc(38.0,
                1.52, 64, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(51.9, 1.70, 25,
                "feminino"));
    }

    @Test
    public void testeAdultoPesoNormalInferior() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(63.9, 1.72, 30
                , "masculino"));
    }

    @Test
    public void testeAdultoPesoNormalSuperior() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(68.8, 1.75, 40, "feminino"));
    }

    @Test
    public void testeAdultoSobrepesoInferior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(81.3, 1.70, 35,
                "masculino"));
    }

    @Test
    public void testeAdultoSobrepesoSuperior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(86.4, 1.72, 30, "feminino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIInferior() {
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(100.1,
                1.75, 40, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauISuperior() {
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(101.0, 1.70, 50, "feminino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIIInferior() {
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(115.2,
                1.75, 55, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIISuperior() {
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(115.2, 1.70, 35, "feminino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIIIInferior() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calcImc.calcularImc(131.0, 1.75, 45, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIIISuperior() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calcImc.calcularImc(140.1, 1.70, 60, "feminino"));
    }


    @Test
    public void testeIdosoMasculinoBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(50.1, 1.75, 70, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoPesoNormalInferior() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(70.2, 1.75, 72, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoPesoNormalSuperior() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(80.1, 1.75, 75, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoSobrepesoInferior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(85.4, 1.75, 78, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoSobrepesoSuperior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(91.0, 1.75, 80, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauIInferior() {
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(95.1, 1.75, 82, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauISuperior() {
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(100.1, 1.75, 85, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauIIInferior() {
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(115.1,
                1.75, 88, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauIISuperior() {
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(110.2, 1.75, 90, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)",
                calcImc.calcularImc(130.4, 1.75, 92, "masculino"));
    }

    @Test
    public void testeIdosoFemininoBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(50.2, 1.64, 70, "feminino"));
    }

    @Test
    public void testeIdosoFemininoPesoNormalInferior() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(60.2, 1.64, 72, "feminino"));
    }

    @Test
    public void testeIdosoFemininoPesoNormalSuperior() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(71.0, 1.64, 75
                , "feminino"));
    }

    @Test
    public void testeIdosoFemininoSobrepesoInferior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(80.2, 1.64, 78, "feminino"));
    }

    @Test
    public void testeIdosoFemininoSobrepesoSuperior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(85.1, 1.64, 80, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauIInferior() {
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(91.0, 1.64, 82, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauISuperior() {
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(95.0, 1.64, 85, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauIIInferior() {
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(101.1, 1.64, 88, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauIISuperior() {
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(105.1, 1.64, 90, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calcImc.calcularImc(105.1, 1.55, 70, "feminino"));
    }




    @Test
    public void testeCriança2AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(10.2, 0.85, 2, "masculino"));
    }

    @Test
    public void testeCriança2AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(11.5, 0.85, 2,
                "feminino"));
    }

    @Test
    public void testeCriança2AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(11.9, 0.85, 2,
                "masculino"));
    }

    @Test
    public void testeCriança2AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(20.0, 0.85, 2, "masculino"));
    }



    @Test
    public void testeCriança4AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(12.9, 1.05, 4, "masculino"));
    }

    @Test
    public void testeCriança4AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(15.5, 1.05, 4, "masculino"));
    }

    @Test
    public void testeCriança4AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(18.8, 1.05, 4, "feminino"));
    }

    @Test
    public void testeCriança4AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(24.7, 1.05, 4,
                "masculino"));
    }



    @Test
    public void testeCriança6AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(14.6, 1.10, 6, "masculino"));
    }

    @Test
    public void testeCriança6AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(17.7, 1.10, 6, "masculino"));
    }

    @Test
    public void testeCriança6AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(18.4, 1.10, 6, "masculino"));
    }

    @Test
    public void testeCriança6AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(26.0, 1.10, 6,
                "masculino"));
    }



    @Test
    public void testeCriança8AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(15.4, 1.30, 8, "masculino"));
    }

    @Test
    public void testeCriança8AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(26.4, 1.30, 8,
                "masculino"));
    }

    @Test
    public void testeCriança8AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(30.9, 1.30, 8,
                "masculino"));
    }

    @Test
    public void testeCriança8AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(34.5, 1.30, 8,
                "masculino"));
    }



    @Test
    public void testeCriança10AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(17.9, 1.40, 10, "masculino"));
    }

    @Test
    public void testeCriança10AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(29.9, 1.40, 10
                , "masculino"));
    }

    @Test
    public void testeCriança10AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(37.3, 1.40, 10,
                "masculino"));
    }

    @Test
    public void testeCriança10AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(43.1, 1.40, 10,
                "masculino"));
    }


    @Test
    public void testeCriança12AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(18.9, 1.50, 12, "masculino"));
    }

    @Test
    public void testeCriança12AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(35.9, 1.50, 12
                , "masculino"));
    }

    @Test
    public void testeCriança12AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(39.3, 1.40, 12,
                "feminino"));
    }

    @Test
    public void testeCriança12AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(54.0, 1.50, 12,
                "masculino"));
    }



    @Test
    public void testeMenina2AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(10.3, 0.85, 2, "feminino"));
    }

    @Test
    public void testeMenina2AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(11.9, 0.85, 2,
                "feminino"));
    }

    @Test
    public void testeMenina2AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(12.6, 0.85, 2,
                "feminino"));
    }

    @Test
    public void testeMenina2AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(20, 0.85, 2, "feminino"));
    }



    @Test
    public void testeMenina4AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(13.8, 1.05, 4, "feminino"));
    }

    @Test
    public void testeMenina4AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(16.1, 1.05, 4,
                "feminino"));
    }

    @Test
    public void testeMenina4AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(17.1, 1.05, 4, "feminino"));
    }

    @Test
    public void testeMenina4AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(20.2, 1.05, 4,
                "feminino"));
    }



    @Test
    public void testeMenina6AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(14.1, 1.10, 6, "feminino"));
    }

    @Test
    public void testeMenina6AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(18.5, 1.10, 6,
                "feminino"));
    }

    @Test
    public void testeMenina6AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(20.3, 1.10, 6,
                "feminino"));
    }

    @Test
    public void testeMenina6AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(20.6, 1.10, 6,
                "feminino"));
    }



    @Test
    public void testeMenina8AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(14.4, 1.30, 8, "feminino"));
    }

    @Test
    public void testeMenina8AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(24.7, 1.30, 8,
                "feminino"));
    }

    @Test
    public void testeMenina8AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(30.6, 1.30, 8,
                "feminino"));
    }

    @Test
    public void testeMenina8AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(35.9, 1.30, 8,
                "feminino"));
    }



    @Test
    public void testeMenina10AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(16.9, 1.40, 10, "feminino"));
    }

    @Test
    public void testeMenina10AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(32.2, 1.40, 10,
                "feminino"));
    }

    @Test
    public void testeMenina10AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(35.4, 1.40, 10,
                "feminino"));
    }

    @Test
    public void testeMenina10AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(42.2, 1.40, 10,
                "feminino"));
    }



    @Test
    public void testeMenina12AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(18.1, 1.50, 12, "feminino"));
    }

    @Test
    public void testeMenina12AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(35.1, 1.50, 12,
                "feminino"));
    }

    @Test
    public void testeMenina12AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(43.4, 1.50, 12,
                "feminino"));
    }

    @Test
    public void testeMenina12AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(50.2, 1.50, 12,
                "feminino"));
    }
}