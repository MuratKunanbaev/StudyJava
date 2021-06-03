package exception;


public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"1", "2", "3"},
                {"4", "5", "6", "7"},
                {"8", "9", "10", "11"},
                {"12", "13", "14", "15"}
        };
        try {
            try {
                int rsl =  new SumOfArrayElements().sumArrayElements(arr);
                System.out.println(rsl);
            } catch (MyArraySizeException e) {
                e.getMessage();
            }
        } catch (MyArrayDataException e) {
            e.getMessage();
        }

    }
}
