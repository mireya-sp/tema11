package com.mireyaserrano.tema11.ejercicio01;

import java.io.File;
import java.util.Arrays;

public class Ejercicio01 {
    private static final String FILE_PATH = "C:\\Users\\Mireya\\Desktop\\ArchivosProgramacion";
    public static void main(String[] args) {
        File file = new File(FILE_PATH);
        if (file.isDirectory()){
            System.out.println("Se trata de un directorio");
        }else {
            System.out.println("Esto no es un directorio pisha");
        }
    }
}
