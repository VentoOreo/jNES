package jnes;
import java.io.FileInputStream;
import java.util.ArrayList;

public class Disassembler {
    public static void disassemble(String path){
        // Create a new ArrayList of Strings to store hex in
        ArrayList<String> rombytes = new ArrayList<>();
        // Using a FileInputStream to read roms one byte at a time
        try(FileInputStream rom = new FileInputStream(new java.io.File(path))){
            int readbyte = rom.read();
            // FileInputStream.read() returns -1 if end of file is reached
            while(readbyte != -1){
                // FileInputStream.read() returns the byte as an 8-bit int, so Integer.toHexString() is used
                // to read the bytes as hex to easily convert to assembly instructions later on
                rombytes.add(Integer.toHexString(readbyte));
                readbyte = rom.read();
            }
        }catch(Exception e){
            System.out.println("Caught exception " + e +". Terminating program.");
            System.exit(0);
        }
    }
}
