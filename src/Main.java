public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        Sudoku s = new Sudoku();
        s.displaySudoku();

        if(s.solveSudoku())
        {
            s.displaySudoku();
        }
        else
        {
            System.out.println("Unsuccessful");
        }
    }
}
