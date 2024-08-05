import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            String programName = scanner.nextLine();
            if(programName.isEmpty()){
                break;
            }
            int programRunTime = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(programName, programRunTime));
        }

        System.out.println("Program's maximum duration?");
        int maxDuration = Integer.valueOf(scanner.nextLine());

        for(TelevisionProgram program : programs){
            if(program.getDuration() <= maxDuration ){
                System.out.println(program);
            }
        }
        scanner.close();
    }
}
