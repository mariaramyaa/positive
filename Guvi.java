package ramyajavaproject;
import java.util.Scanner;
public class Guvi {
public static void main(String arg[]) {
	Scanner input = new Scanner(System.in);
    System.out.print("Enter sales figure you want to find: ");
    int target = input.nextInt();
    int index = -1;
    for (int i=0; i<search.length; i++){
        if (search[i] == target){
            index=i;
            System.out.printf("Sales figure found at branch %d\n",index+1);

        }
    }
    if (index == -1){
        System.out.println("Sales figure not found");
    }
