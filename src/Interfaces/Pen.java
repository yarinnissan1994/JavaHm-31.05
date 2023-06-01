package Interfaces;

public class Pen extends WritingTools implements I_Erase{
    @Override
    public void erase() {
        System.out.println("erased pen ink from paper!");
    }
}
