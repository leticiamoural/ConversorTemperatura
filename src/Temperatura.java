import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temperatura {

    public static List<Double> temperaturasEscolhidasIniciais = new ArrayList<>();
    public static List<Double> temperaturasEscolhidasConvertidas = new ArrayList<>();


    // SAO DUAS PRA CADA CONVERSÃO
    //1 - C > F
    //2 - K > F
    //3 - C > K
    //4 - F > K
    //5 - F > C
    //6 - K > C

//NO MENU: CAPTURAR QUANTIDADE DE TEMPERATURA E UNIDADEDEMEDIDA
    public static void converteTodasAsTemperaturas(Integer quantidadeTemperatura, Integer escolha) {
        Scanner input = new Scanner(System.in);

        double[] temperaturasIniciais = new double[quantidadeTemperatura];


        switch(escolha) {
            case 1:
                for (int i = 0; i < quantidadeTemperatura; i++) {
                    System.out.print("Digite a temperatura #" + (i+1) + " : ");
                    temperaturasIniciais[i] = input.nextDouble();
                    temperaturasEscolhidasIniciais.add(temperaturasIniciais[i]);

                    double valorEmFahrenheit = converteCelsiusToFahrenheit(temperaturasIniciais[i]);
                    temperaturasEscolhidasConvertidas.add(valorEmFahrenheit);
                    System.out.printf("O valor desta temperatura em Fahrenheit é %.2f\n", valorEmFahrenheit);
                }

                System.out.printf("\nA media das temperaturas iniciais é de: %.2f\n", calculaMediaTemperaturas(temperaturasEscolhidasIniciais));
                System.out.printf("A media das temperaturas convertidas é de: %.2f\n", calculaMediaTemperaturas(temperaturasEscolhidasConvertidas));
                break;

            case 2:
                for (int i = 0; i < quantidadeTemperatura; i++) {
                    System.out.print("Digite a temperatura #" + (i+1) + " : ");
                    temperaturasIniciais[i] = input.nextDouble();
                    temperaturasEscolhidasIniciais.add(temperaturasIniciais[i]);

                    double valorEmFahrenheit = converteKelvinToFahrenheit(temperaturasIniciais[i]);
                    temperaturasEscolhidasConvertidas.add(valorEmFahrenheit);
                    System.out.printf("O valor desta temperatura em Fahrenheit é %.2f\n", valorEmFahrenheit);
                }
                System.out.printf("\n"+ "A media das temperaturas iniciais é de: %.2f\n", calculaMediaTemperaturas(temperaturasEscolhidasIniciais));
                System.out.printf("A media das temperaturas convertidas é de: %.2f\n", calculaMediaTemperaturas(temperaturasEscolhidasConvertidas));
                break;

            case 3:
                for (int i = 0; i < quantidadeTemperatura; i++) {
                    System.out.print("Digite a temperatura #" + (i+1) + " : ");
                    temperaturasIniciais[i] = input.nextDouble();
                    temperaturasEscolhidasIniciais.add(temperaturasIniciais[i]);

                    double valorEmKelvin = converteCelsiusToKelvin(temperaturasIniciais[i]);
                    temperaturasEscolhidasConvertidas.add(valorEmKelvin);
                    System.out.printf("O valor desta temperatura em Kelvin é %.2f\n", valorEmKelvin);
                }
                System.out.printf("\nA media das temperaturas iniciais é de: %.2f\n", calculaMediaTemperaturas(temperaturasEscolhidasIniciais));
                System.out.printf("A media das temperaturas convertidas é de: %.2f\n", calculaMediaTemperaturas(temperaturasEscolhidasConvertidas));
                break;

            case 4:
                for (int i = 0; i < quantidadeTemperatura; i++) {
                    System.out.print("Digite a temperatura #" + (i+1) + " : ");
                    temperaturasIniciais[i] = input.nextDouble();
                    temperaturasEscolhidasIniciais.add(temperaturasIniciais[i]);

                    double valorEmKelvin = converteFahrenheitToKelvin(temperaturasIniciais[i]);
                    temperaturasEscolhidasConvertidas.add(valorEmKelvin);
                    System.out.printf("O valor desta temperatura em Kelvin é %.2f\n", valorEmKelvin);
                }
                System.out.printf("\nA media das temperaturas iniciais é de: %.2f\n", calculaMediaTemperaturas(temperaturasEscolhidasIniciais));
                System.out.printf("A media das temperaturas convertidas é de: %.2f\n", calculaMediaTemperaturas(temperaturasEscolhidasConvertidas));
                break;

            case 5:
                for (int i = 0; i < quantidadeTemperatura; i++) {
                    System.out.print("Digite a temperatura #" + (i+1) + " : ");
                    temperaturasIniciais[i] = input.nextDouble();
                    temperaturasEscolhidasIniciais.add(temperaturasIniciais[i]);

                    double valorEmCelsius = converteFahrenheitToCelsius(temperaturasIniciais[i]);
                    temperaturasEscolhidasConvertidas.add(valorEmCelsius);
                    System.out.printf("O valor desta temperatura em Celsius é %.2f\n", valorEmCelsius);
                    System.out.println(temperaturasIniciais.length);
                }
                System.out.printf("\nA media das temperaturas iniciais é de: %.2f\n", calculaMediaTemperaturas(temperaturasEscolhidasIniciais));
                System.out.printf("A media das temperaturas convertidas é de: %.2f\n", calculaMediaTemperaturas(temperaturasEscolhidasConvertidas));
                break;

            case 6:
                for (int i = 0; i < quantidadeTemperatura; i++) {
                    System.out.print("Digite a temperatura #" + (i+1) + " : ");
                    temperaturasIniciais[i] = input.nextDouble();
                    temperaturasEscolhidasIniciais.add(temperaturasIniciais[i]);

                    double valorEmCelsius = converteKelvinToCelsius(temperaturasIniciais[i]);
                    temperaturasEscolhidasConvertidas.add(valorEmCelsius);
                    System.out.printf("O valor desta temperatura em Celsius é %.2f\n", valorEmCelsius);
                }
                System.out.printf("\nA media das temperaturas iniciais é de: %.2f\n", calculaMediaTemperaturas(temperaturasEscolhidasIniciais));
                System.out.printf("A media das temperaturas convertidas é de: %.2f\n", calculaMediaTemperaturas(temperaturasEscolhidasConvertidas));
        }
    }

    //recebe uma lista e retorna um double
    public static Double calculaMediaTemperaturas(List<Double> temperaturas) {
        Double media;
        Double soma = 0.0;
        for(int i = 0; i < temperaturas.size(); i++) {
            soma += temperaturas.get(i);
        }
        media = soma / temperaturas.size();
        return media;
    }
    private static double converteFahrenheitToKelvin(double Fahrenheit) {
        return ((Fahrenheit-32) * (5.0/9.0)) + 273.15;
    }
    private static double converteKelvinToFahrenheit(double Kelvin) {

        return ((9.0/5.0) * (Kelvin - 273.15)) + 32;
    }

    private static double converteCelsiusToKelvin(double Celsius) {

        return Celsius + 273.15;
    }

    private static double converteKelvinToCelsius(double Kelvin) {

        return Kelvin - 273.15;
    }

    private static double converteFahrenheitToCelsius(double Fahrenheint) {

        return (Fahrenheint-32)*(5.0/9.0);
    }
    private static double converteCelsiusToFahrenheit(double Celsius) {

        return (Celsius*(9.0/5.0)) + 32.0;
    }
}
