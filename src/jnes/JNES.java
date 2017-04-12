package jnes;

public class JNES {

    public static void main(String[] args) {
        // Testing if disassemble arg is being used, and a path argument exists
        if(args.length >= 2 && args[0].equals("-dis")){
            Disassembler.disassemble(args[1]);
        }
    }   
}
