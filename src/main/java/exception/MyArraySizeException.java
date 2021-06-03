package exception;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException{
    public MyArraySizeException() {
        printStackTrace();
        System.err.println("The length of the array does not meet the requirements");
    }
}
