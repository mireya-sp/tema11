package com.mireyaserrano.tema11;

import java.io.File;

public class Cat {
    public static void main(String[] args){
        if (args.length != 1) {
            System.out.println("Debe indicar la ruta del archivo");
            System.exit(-1);
            //throw new RuntimeException("Debe indicar la ruta del archivo");
        }
        String rutaArchivo = args[0];
        File file = new File(rutaArchivo);
        if (file.exists()){
            System.out.println("El archivo existe");
        }else {
            System.out.println("EL archivo no existe");
        }
    }
}
