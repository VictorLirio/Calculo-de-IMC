
import java.util.Scanner;

class CalculoIMC {
    public static String classificarIMC(double imc) {
        if (imc < 16.0) {
            return "Magreza grave, procure um medico!";
        }
        else if (imc == 16.0 || imc < 17.0) {
            return "Magreza moderada";
        }
        else if (imc == 17.0 || imc < 18.5) {
            return "Magreza leve";
        }
        else if (imc == 18.5 || imc < 25.0) {
            return "Saudável";
        }
        else if (imc == 25.0 || imc < 30.0) {
            return "Sobrepeso";
        }
        else if (imc == 30.0 || imc < 35.0) {
            return "Obesidade Grau I";
        }
        else if (imc == 35.0 || imc < 40.0) {
            return "Obesidade Grau II, procure um medico!";
        }
        else {
            return "Obesidade Grau III, procure um medico!";
        }
    }

    public static double calcularPeso(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void programaIMC(String versao) {
        double peso, altura, imc;
        Scanner pScan = new Scanner(System.in);
        Scanner aScan = new Scanner(System.in);

        System.out.println("===========================");
        System.out.printf("Cálculo do IMC - Versão %s\n", versao);
        System.out.println("===========================");

        System.out.print("Insira o seu peso: ");
        peso = Double.parseDouble(pScan.nextLine());

        System.out.print("Insira a sua altura: ");
        altura = Double.parseDouble(aScan.nextLine());

        imc = calcularPeso(peso, altura);

        System.out.printf("\nSeu índice de massa corporal é: %.2f kg\n", imc);
        System.out.printf("Status: %s.\n", classificarIMC(imc));
    }

    public static void main(String[] args) {
        String versao = "1.0";
        programaIMC(versao);
    }
}

