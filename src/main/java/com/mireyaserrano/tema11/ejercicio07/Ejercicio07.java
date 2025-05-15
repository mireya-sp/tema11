package com.mireyaserrano.tema11.ejercicio07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio07 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Debe indicar la ruta del archivo");
            System.exit(-1);
            //throw new RuntimeException("Debe indicar la ruta del archivo");
        }
        String rutaArchivo = args[0];
        File file = new File(rutaArchivo);
        try (FileReader fileReader = new FileReader(file)) {
            int caracter;
            char[] texto = new char[1024];
            int cantidad;
            while ( (cantidad = fileReader.read(texto)) >= 0){
                for (int i = 0; i < cantidad; i++) {
                    System.out.print(texto[i]);
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("El archivo no existe");
            System.exit(-1);
        }catch (IOException ioe){
            System.out.println("Error de lectura");
            System.exit(-1);
        }
    }
}
