package com.mireyaserrano.tema11;

import java.io.*;

public class WriteBinary {
    private static final String FILE_PATH = "C:\\Users\\Mireya\\Desktop\\ArchivosProgramacion\\datos.bin";
    public static void main(String[] args){
        if (args.length != 1) {
            System.out.println("Debe indicar el número a guardar");
            System.exit(-1);
            //throw new RuntimeException("Debe indicar la ruta del archivo");
        }
        int numero = 0;
        try {
            numero = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Sólo números por favor");
            System.exit(-1);
        }

        File file = new File(FILE_PATH);
        byte b0 = (byte) (numero & 0xFF);
        byte b1 = (byte) ((numero & 0x0000FF00) >> 8);
        byte b2 = (byte) ((numero & 0x00FF0000) >> 16);
        byte b3 = (byte) ((numero & 0xFF000000) >> 24);
        byte[] bytes = {b3, b2, b1, b0};
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(b3);
            fos.write(b2);
            fos.write(b1);
            fos.write(b0);
        } catch (FileNotFoundException fnfe) {
            System.out.println("El archivo no existe");
            System.exit(-1);
        }catch (IOException ioe){
            System.out.println("Error de lectura");
            System.exit(-1);
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            System.out.println(dis.read());
        } catch (FileNotFoundException fnfe) {
            System.out.println("El archivo no existe");
            System.exit(-1);
        }catch (IOException ioe){
            System.out.println("Error de lectura");
            System.exit(-1);
        }
    }
}
