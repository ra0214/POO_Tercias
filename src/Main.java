import models.SecuenciaAritmetica;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        short size;
        short[] array;
        SecuenciaAritmetica objeto;
        System.out.println("App - Sucecion Aritmética");
        System.out.print("Ingresa el tamaño del arreglo: ");
        size = keyboard.nextShort();
        array = new short[size];
        for (short i=0;i< array.length;i++){
            System.out.print("Array["+1+"]: ");
            array[i] = keyboard.nextShort();
        }
        objeto = new SecuenciaAritmetica();
        objeto.initData(size);
        objeto.setData(array);
        objeto.run();
        System.out.println("Total: " + objeto.getCount());
    }
}