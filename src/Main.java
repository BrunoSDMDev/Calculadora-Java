import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor 1: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite o valor 2: ");
        double valor2 = scanner.nextDouble();

        Calculadora calculadora = new Calculadora(valor1, valor2);
        System.out.println(calculadora.getValor1() + " + " + calculadora.getValor2() + " = " + calculadora.somar());
        System.out.println(calculadora.getValor1() + " - " + calculadora.getValor2() + " = " + calculadora.subtrair());
        System.out.println(calculadora.getValor1() + " * " + calculadora.getValor2() + " = " + calculadora.multiplicar());
        System.out.println(calculadora.getValor1() + " / " + calculadora.getValor2() + " = " + calculadora.dividir());


    }
}