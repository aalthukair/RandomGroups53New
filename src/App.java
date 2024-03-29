import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Good day sir!");
        generateRandomGroups(readStudent(),4);
    }

    public static ArrayList<String> readStudent(){
        ArrayList<String> list = new ArrayList<String>();
        try {
            Scanner sc =new Scanner(new File("Student List.txt"));
            while(sc.hasNextLine()){
                list.add(sc.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }

    public static void generateRandomGroups(ArrayList<String> students,int n){
        Collections.shuffle(students);
        ArrayList<ArrayList<String>> groups = new ArrayList<ArrayList<String>>();
        for(int i = 0;i<n;i++){
            groups.add(new ArrayList<String>());
        }
        for (int i = 0; i< students.size();i++){
            groups.get(i%(n)).add(students.get(i));
        }
        System.out.println(groups);

    }
}


