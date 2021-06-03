package exception;

public class SumOfArrayElements {
    public int sumArrayElements(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j< arr[i].length; j++) {
                if (arr.length !=4 || arr[i].length != 4) {
                    throw new MyArraySizeException();
                }
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
