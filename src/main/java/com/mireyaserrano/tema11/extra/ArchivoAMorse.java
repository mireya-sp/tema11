package com.mireyaserrano.tema11.extra;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ArchivoAMorse {
    private static Map<Character, String> map = new HashMap<>();
    public static void main(String[]args){
        llenarMapa();
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
                    texto[i] = Character.toLowerCase(texto[i]);
                    System.out.print(map.get(texto[i]) + " ");
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

    private static void llenarMapa(){
        map.put('a', "._");
        map.put('b', "_...");
        map.put('c', "_._.");
        map.put('d', "_..");
        map.put('e', ".");
        map.put('f', ".._.");
        map.put('g', "__.");
        map.put('h', "....");
        map.put('i', "..");
        map.put('j', ".___");
        map.put('k', "_._");
        map.put('l', "._..");
        map.put('m', "__");
        map.put('n', "_.");
        map.put('o', "___");
        map.put('p', ".__.");
        map.put('q', "__._");
        map.put('r', "._.");
        map.put('s', "...");
        map.put('t', "_");
        map.put('u', ".._");
        map.put('v', "..._");
        map.put('w', ".__");
        map.put('x', "_.._");
        map.put('y', "_.__");
        map.put('z', "__..");
        map.put('.', "._._._");
        map.put(',', "__..__");
        map.put('0', "_____");
        map.put('1', ".___");
        map.put('2', "..___");
        map.put('3', "...__");
        map.put('4', "...._");
        map.put('5', ".....");
        map.put('6', "_....");
        map.put('7', "__...");
        map.put('8', "___..");
        map.put('9', "____.");
        map.put(' ', "   ");
    }
}
