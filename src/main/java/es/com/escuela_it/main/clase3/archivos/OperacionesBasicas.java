package es.com.escuela_it.main.clase3.archivos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OperacionesBasicas {

	public static void main(String[] args) throws IOException {

		Path archivo = Paths.get("c:" + File.separator + "data" + File.separator + "rename.txt");

		Files.deleteIfExists(archivo);

	}

}
