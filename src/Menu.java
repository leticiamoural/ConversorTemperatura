import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void iniciarMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("______________________________");
        System.out.println("# CONVERSOR DE TEMPERATURAS #");
        System.out.println("______________________________");
        System.out.println("\nInsira a quantidade de temperaturas a serem convertidas:");
        Integer quantidadeTemperaturas = input.nextInt();


        System.out.println("\nAgora selecione a operação que deseja realizar: ");
        System.out.println("1 - De CELSIUS para FAHRENHEIT\n" +
                           "2 - De KELVIN para FAHRENHEIT\n"  +
                           "3 - De CELSIUS para KELVIN\n" +
                           "4 - De FAHRENHEIT para KELVIN\n"  +
                           "5 - De FAHRENHEIT para CELSIUS\n" +
                           "6 - De KELVIN para CELSIUS");


        Integer escolhaDaOperacao = input.nextInt();
        if(escolhaDaOperacao > 6) {
            throw new InputMismatchException("Opção inválida. Reiniciar o programa.");
        }
        Temperatura.converteTodasAsTemperaturas(quantidadeTemperaturas,escolhaDaOperacao);

    }

}
