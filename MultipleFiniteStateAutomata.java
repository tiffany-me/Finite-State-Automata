import java.util.Scanner;
import java.util.Random;
class MultipleFiniteStateAutomata{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        FSA[] machine = new FSA[3];

        System.out.println("[Array of Finite State Automata]");

        for(int i = 0; i < machine.length; i++){
            machine [i] = new FSA(rand.nextInt(4));
            System.out.println("Machine #" + i + " is starting at state " + machine[i].showCurrentState());
        }

        do{
            System.out.println("\nWhat will you do?\n-Check the current status\n-Go to next state\n-End");
            String choice = input.nextLine().toLowerCase();

            switch(choice){
                case "check the current status" -> {
                    System.out.print("Which machine will you look at? ");
                    int num = input.nextInt();
                    while (num > 2 || num < 0) {
                        System.out.print("Invalid number, try again: ");
                        num = input.nextInt();
                    }
                    if (machine[num].isActive()) {
                        System.out.println("\nMachine #" + num + " is active and at state " + machine[num].showCurrentState());
                    } else {
                        System.out.println("\nMachine#" + num + " is deactivated");
                    }
                    input.nextLine();
                }
                case "go to next state" -> {
                    System.out.print("What machine will you advance? ");
                    int num = input.nextInt();
                    while(num > 2 || num < 0){
                        System.out.print("Invalid number, try again: ");
                        num = input.nextInt();
                    }

                    if(machine[num].isActive()){
                        System.out.println("Machine #" + num + " is now at state " + machine[num].goToNextState());
                    }
                    else{
                        System.out.println("\nMachine #" + num + " is not active");
                    }
                    input.nextLine();
                }
                case "end" -> {
                    System.out.print("What machine will you stop? ");
                    int num = input.nextInt();
                    while(num > 2 || num < 0){
                        System.out.print("Invalid number, try again: ");
                        num = input.nextInt();
                    }
                    System.out.println("\nMachine #" + num + " is now deactivated");
                    machine[num].end();
                    input.nextLine();
                }
                default ->{
                    System.out.println("Invalid input.");
                }
            }
        } while(machine[0].isActive() || machine[1].isActive() || machine[2].isActive());
        System.out.print("\nAll machines have been turned off.");
    }
}