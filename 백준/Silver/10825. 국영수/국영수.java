import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static class Student {
        String name;
        int korean, english, math;
        public Student(String name, int korean, int english, int math){
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }

        @Override
        public String toString() {
            return name + " " + korean + " " + english + " " + math;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Student[] students = new Student[num];
        for(int i = 0; i<num;i++){
            String[] input = br.readLine().split(" ");

            String name = input[0];
            int korean = Integer.parseInt(input[1]);
            int english = Integer.parseInt(input[2]);
            int math = Integer.parseInt(input[3]);
            students[i] = new Student(name, korean, english, math);

        }
        Arrays.sort(students, (a,b) -> {
            if(a.korean != b.korean){
                return b.korean - a.korean;
            } else if (a.english != b.english){
                return a.english - b.english;
            } else if (a.math != b.math){
                return b.math - a.math;
            } else{
                return a.name.compareTo(b.name);
            }
        });
        for(Student s : students){
            System.out.println(s.name);
        }



    }
}
