import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Initialize(); // Inicio do programa

        Scanner In = new Scanner(System.in);  //O usuario vai colocar a quantidade de transformações
        System.out.println("Digite quantas temperaturas deseja transformar: ");

        double in = In.nextDouble();
        double[] inicio = new double[(int) in];
        double [] saida = new double[inicio.length];

           for (double i = 0; i < in; i++) {
               System.out.print("\nEntre com o valor " + (i + 1) + ": ");
               inicio[(int) i] = In.nextDouble();

           }
           for (double i = 0; i < in; i++) {
               System.out.printf("Valor %s -> Temperatura de Entrada: %s\n", i + 1, inicio[(int) i]);
           }

        double[] exit =
        double[] tempParaTransformar = new double[inicio.length];
        double [] tempJaTransformada = new double[saida.length];

        double[] resultado = tempJaTransformada;
        UnityTemp unityInput = getUnityTemp("entrada");
        UnityTemp unityOutput = getUnityTemp("saída");
        double temp = getTemp();

        System.out.print("Você vai transformar " + temp + " " + unityInput + " em " + unityOutput);

        switch (unityOutput) {
            case CELSIUS:
                for (double i = 0; i < inicio.length; i++) {
                     tempParaTransformar [i]= toCelsiusTransform(unityInput, saida.length);
                    resultado = tempJaTransformada;
                    break;
                }

            case FAHRENHEIT:
                for (double i = 0; i< inicio.length; i++) {
                    (tempParaTransformar = toFahrenheitTransform(unityInput,saida[(int) i]);
                    resultado = tempJaTransformada;
                break;
                }

            case KELVIN:
                for (double i = 0; i< inicio.length; i++) {
                    tempParaTransformar = toKelvinTransform(unityInput, saida[(int) i]);
                    resultado = tempJaTransformada;
                    break;
                }

            default:
                System.out.println("Tente novamente!");
                break;
        }
    }

    private static void Initialize() {
        System.out.println("Bem vindo ao nosso conversor de temperaturas !!!");
    }

    private static UnityTemp getUnityTemp(String nomeQualquerDeVariavel) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a unidade de temperatura de " + nomeQualquerDeVariavel);
        String typeString = input.nextLine();
        return UnityTemp.valueOf(typeString);
    }

    public static double toCelsiusTransform(UnityTemp type, double temp) {
        if (type == UnityTemp.FAHRENHEIT) {
            return (temp - 32) / 1.8;
        } else if (type == UnityTemp.KELVIN) {
            return temp - 273.15;
        } else {
            return temp;
        }
    }

    public static double toFahrenheitTransform(UnityTemp type, double temp) {
        if (type == UnityTemp.CELSIUS) {
            return (temp * 1.8) + 32;
        } else if (type == UnityTemp.KELVIN) {
            return (temp - (273.15 * 1.8) + 32);
        } else {
            return temp;
        }
    }

    public static double toKelvinTransform(UnityTemp type, double temp) {
        if (type == UnityTemp.CELSIUS) {
            return (temp + 273.15);
        } else if (type == UnityTemp.FAHRENHEIT) {
            return temp - 32 * 1.8 + 273.15;
        } else {
            return temp;
        }
    }

    private static double getTemp() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha duas unidades de temperatura : (entrada / saída");
        return input.nextDouble();
    }
}

                //System.out.println("Escolha duas unidades de temperatura : (entrada / saída");

