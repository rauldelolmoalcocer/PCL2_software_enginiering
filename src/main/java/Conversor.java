/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Rauld
 */

// Programa en Java para convertir un número decimal a hexadecimal y viceversa
// FJBG - Ing. Software - GISI – 2023
import java.io.*;

public class Conversor {
//Número máximo de dígitos hexadecimales: 5.

    static int length = 5;
// Función que convierte un número decimal a hexadecimal.

    static char[] decToHexa(int n) {
// Array de caracteres que almacenan el número hexadecimal.
        char[] hexaDeciNum = {'0', '0', '0', '0', '0'};
// Contador para el array de números hexadecimales.
        int i = 0;
        while (n != 0) {
// Variable temporal para almacenar el resto.
            int temp = 0;
// El resto hexadecimal se almacena en temp.
            temp = n % 16;
// Comprobar si temp < 10.
            if (temp < 10) {
                hexaDeciNum[length - i - 1] = (char) (temp + 48);
            } else {
                hexaDeciNum[length - i - 1] = (char) (temp + 55);
            }
            i++;
            n = n / 16;
        }
// Array de retorno.
        return hexaDeciNum;
    }
// Función que convierte un número hexadecimal a decimal.

    static int hexaToDec(char[] hexadecimal) {
// Variable de retorno. Se inicializa a 0.
        int decimal = 0;
// Contribución de cada dígito hexadecimal al valor de retorno.
// Se inicializa a 0.
        int decitemp = 0;
        for (int i = 0; i < length; i++) {
// Comprobar si el dígito es < 10.
            if (hexadecimal[i] <= '9') {
                decitemp = (((int) hexadecimal[i]) - 48) * ((int) Math.pow(16, 4 - i));
            } else {
                decitemp = (((int) hexadecimal[i]) - 55) * ((int) Math.pow(16, 4 - i));
            }
            decimal += decitemp;
            decitemp = 0;
        }
//Valor decimal de retorno.
        return decimal;
    }


/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
        // TODO code application logic here
        int length = 20;
        // Valor decimal a convertir: 2048
        int n = 2048;
        char[] resultHex = new char[length];
        System.out.print("Resultado hexadecimal: \n");
        resultHex = decToHexa(n);
        for (int j = 0; j < length; j++) {
            System.out.print(resultHex[j]);
        }
//Valor hexadecimal a convertir: 0x04000
        char[] hexad = {'0', '4', '0', '0', '0'};
        int resultDec;
        System.out.print("\nResultado decimal: \n");
        resultDec = hexaToDec(hexad);
        System.out.print(resultDec);
    }
}