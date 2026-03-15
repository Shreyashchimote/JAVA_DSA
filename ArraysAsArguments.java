public class ArraysAsArguments {
    public static void updates(int marks[]){
        for (int i = 0; i < marks.length; i++) {
            marks[i]=marks[i]+1;

        }


    }
    public static void main(String[] args) {
        int marks[]={92,93,94};
        updates(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+ " ");
        }
    }

}
