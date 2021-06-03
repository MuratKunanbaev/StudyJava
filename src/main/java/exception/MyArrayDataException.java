package exception;

public class MyArrayDataException  extends NumberFormatException{

    public MyArrayDataException(int i, int j) {
        printStackTrace();
        System.err.println("Error in row: " + i + " column: " + j);
    }
}
