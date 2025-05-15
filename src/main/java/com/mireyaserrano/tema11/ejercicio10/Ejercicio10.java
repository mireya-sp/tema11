package com.mireyaserrano.tema11.ejercicio10;

import java.io.*;

public class Ejercicio10 {
    private static final String FILE_PATH = "C:\\Users\\Mireya\\Desktop\\ArchivosProgramacion\\ejercicio10.txt";
    public static void main(String[] args){
        String texto1 = "C:\\Users\\Mireya\\Desktop\\ArchivosProgramacion\\hola.txt";
        String texto2 = "C:\\Users\\Mireya\\Desktop\\ArchivosProgramacion\\Nana.txt";
        concat(texto1, texto2);
    }

    private static void concat(String path1, String path2){
        File read1 = new File(path1);
        File read2 = new File(path2);
        File file = new File(FILE_PATH);
        boolean append = file.exists();
        StringBuilder sb = new StringBuilder();

        try (
                FileReader fileReader = new FileReader(read1);
                FileReader fileReader1 = new FileReader(read2)
        ) {
            char[] texto = new char[1024];
            int cantidad;
            while ( (cantidad = fileReader.read(texto)) >= 0){
                for (int i = 0; i < cantidad; i++) {
                    sb.append(texto[i]);
                }
            }
            while ( (cantidad = fileReader1.read(texto)) >= 0){
                for (int i = 0; i < cantidad; i++) {
                    sb.append(texto[i]);
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("El archivo no existe");
            System.exit(-1);
        }catch (IOException ioe){
            System.out.println("Error de lectura");
            System.exit(-1);
        }

        try (FileWriter fileWriter = new FileWriter(file, append)) {
            fileWriter.write(sb.toString());

        } catch (FileNotFoundException fnfe) {
            System.out.println("El archivo no existe");
            System.exit(-1);
        }catch (IOException ioe){
            System.out.println("Error de lectura");
            System.exit(-1);
        }
    }
}
