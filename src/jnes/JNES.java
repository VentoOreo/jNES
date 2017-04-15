package jnes;

public class JNES {

    public static void main(String[] args) {
        // Disassemble the ROM specified in the command line args
        Disassembler.disassemble(args[0]);
    }   
}
