package io;

import java.io.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * Created by Nick on 9/9/2016.
 * � ,.'"?!;:<>()[]^&*\/
 */
public class Files {

    private String[] fileContent;
    
    

    public void createNewPathAndWriteFile(String path, String content) {
        try {

            File file = new File(path);

            // if file does'nt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String[] readFilesForFolder(final File folder) {
        int counter = 0;
        fileContent = new String[folder.listFiles().length];

        for (final File fileEntry : folder.listFiles()) {

            String full_text = " ", line;

            if (fileEntry.isDirectory()) {
                readFilesForFolder(fileEntry);
            } else {
                //System.out.println("Reading " + fileEntry.getName() + "...");
                try {
                    FileReader reader = new FileReader(folder + "/" + fileEntry.getName());
                    BufferedReader bufferedReader = new BufferedReader(reader);
                    int counting = 0;
                    while ((line = bufferedReader.readLine()) != null) {
                        full_text += line;

                    }
                    fileContent[counter] = full_text;
                    counter++;

                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return clean(fileContent);
    }

    public int countFilesInFolder(final File folder) {
        return folder.listFiles().length;
    }

    public String[] getPathNamesOfFiles(File directory) {
        String[] pathNames = new String[20];
        int counter = 0;
        File[] filesList = directory.listFiles();
        for (File f : filesList) {
            if (f.isDirectory()) {
                getPathNamesOfFiles(f);
            }
            if (f.isFile()) {
                try {
                    System.out.println("\t" + f.getCanonicalFile());
                    pathNames[counter] = f.getCanonicalPath();
                    counter++;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return clean(pathNames);
    }

    public String[] getFileNames(File directory) {
        String[] fileNames = new String[10];
        int counter = 0;
        File[] filesList = directory.listFiles();
        for (File f : filesList) {
            if (f.isDirectory()) {
                getPathNamesOfFiles(f);
            }
            if (f.isFile()) {
                
                    fileNames[counter] = f.getName();
                    counter++;
                
            }
        }

        return clean(fileNames);
    }

    public void clearText() {
        try {
            String filename = "Data(U).txt";

            PrintWriter writer = new PrintWriter(filename, "UTF-8");
            writer.println(" ");
            writer.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public static String[] clean(final String[] v) {
        List<String> list = new ArrayList<String>(Arrays.asList(v));
        list.removeAll(Collections.singleton(null));
        return list.toArray(new String[list.size()]);
    }

    public String readFile(String path) {
        String text = "";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                //System.out.println(sCurrentLine);
                text = text + sCurrentLine + " " ;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

}
