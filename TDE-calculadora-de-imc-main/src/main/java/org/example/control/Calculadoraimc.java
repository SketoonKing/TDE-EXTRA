package org.example.control;

public class Calculadoraimc {

    public static String calcularImc(double peso, double altura, int idade, String sexo) {
            double imc = peso / (altura * altura);

            imc = Math.round(imc * 10.0) / 10.0;

            if (idade < 18) {
                return calcularimcCriancas(imc, idade, sexo);
            } else if (idade >= 65) {
                return calcularimcIdosos(imc, sexo);
            } else {
                return calcularimcAdultos(imc);
            }
        }
        private static String calcularimcAdultos(double imc) {
            if (imc < 16) {
                return "Baixo peso muito grave";
            } else if (imc < 17) {
                return "Baixo peso grave";
            } else if (imc < 18.5) {
                return "Baixo peso";
            } else if (imc < 25) {
                return "Peso normal";
            } else if (imc < 30) {
                return "Sobrepeso";
            } else if (imc < 35) {
                return "Obesidade grau I";
            } else if (imc < 40) {
                return "Obesidade grau II";
            } else {
                return "Obesidade grau III (obesidade mórbida)";
            }
        }
        private static String calcularimcIdosos(double imc, String sexo) {
            if ("feminino".equalsIgnoreCase(sexo)) {
                if (imc < 21.9) {
                    return "Baixo peso";
                } else if (imc <= 27) {
                    return "Peso normal";
                } else if (imc <= 32) {
                    return "Sobrepeso";
                } else if (imc <= 37) {
                    return "Obesidade grau I";
                } else if (imc <= 41.9) {
                    return "Obesidade grau II";
                } else {
                    return "Obesidade grau III (obesidade mórbida)";
                }
            } else if ("masculino".equalsIgnoreCase(sexo)) {
                if (imc < 21.9) {
                    return "Baixo peso";
                } else if (imc <= 27) {
                    return "Peso normal";
                } else if (imc <= 30) {
                    return "Sobrepeso";
                } else if (imc <= 35) {
                    return "Obesidade grau I";
                } else if (imc <= 39.9) {
                    return "Obesidade grau II";
                } else {
                    return "Obesidade grau III (obesidade mórbida)";
                }
            } else {
                throw new IllegalArgumentException("Sexo inválido para idosos");
            }
        }
    private static String calcularimcCriancas(double imc, int idade, String sexo) {
        if (idade < 2 || idade > 12 || idade % 2 != 0) {
            throw new IllegalArgumentException("Idade inválida para crianças");
        }
        if ("masculino".equalsIgnoreCase(sexo)) {
            return avaliarPercentil(imc, idade,
                    new double[][] {
                            {14.0, 16.5, 18.0, 19.5},
                            {13.5, 15.5, 17.0, 18.5},
                            {13.5, 15.2, 17.0, 19.0},
                            {14.0, 16.0, 18.5, 20.0},
                            {14.5, 17.0, 20.0, 22.0},
                            {15.0, 18.0, 21.5, 23.5}
                    }
            );
        }
        if ("feminino".equalsIgnoreCase(sexo)) {
            return avaliarPercentil(imc, idade,
                    new double[][] {
                            {14.2, 16.2, 17.8, 19.2},
                            {13.7, 15.3, 17.0, 18.3},
                            {13.8, 15.1, 16.8, 18.5},
                            {14.3, 15.9, 18.3, 19.8},
                            {14.8, 16.8, 19.5, 21.0},
                            {15.3, 17.8, 21.0, 22.5}
                    }
            );
        }

        throw new IllegalArgumentException("Sexo inválido para crianças");
    }
    private static String avaliarPercentil(double imc, int idade, double[][] tabelas) {
        int indiceIdade = (idade / 2) - 1;
        double[] percentis = tabelas[indiceIdade];

        if (imc < percentis[0]) {
            return "Baixo peso";
        } else if (imc < percentis[1]) {
            return "Peso normal";
        } else if (imc < percentis[2]) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    }