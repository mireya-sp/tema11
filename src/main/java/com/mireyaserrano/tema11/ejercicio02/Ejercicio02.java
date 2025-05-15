package com.mireyaserrano.tema11.ejercicio02;

import java.io.File;
import java.util.Arrays;

public class Ejercicio02    {
    private static final String FILE_PATH = "C:\\Users\\Mireya\\Desktop\\ArchivosProgramacion";
    public static void main(String[] args) {
        File file = new File(FILE_PATH);
        System.out.println(Arrays.toString(file.list()));
    }
}
