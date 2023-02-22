package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ModelCheck {
    static public void main(String[] args) {
        System.out.println("test !!");

        String urlStr = "https://dummyjson.com/products/1";
        String filename = "data.json";
        try {
            // Open a connection to the URL
            URL url = new URL(urlStr);
            InputStream in = url.openStream();

            // Create a path to the local file
            Path path = Paths.get(filename);

            // Save the file to the local system
            Files.copy(in, path);

            System.out.println("File saved successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
