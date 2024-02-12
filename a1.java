
public class a1 {

    public static void update(int marks[]) {
        // outer loop
        for (int i = 0; i < marks.length; i++) {
            // update
            marks[i] = marks[i] + 1;

        }
    }

    public static void main(String[] args) {
        int marks[] = { 90, 99, 89 };

        // call function
        update(marks);
        // print our marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }

}
