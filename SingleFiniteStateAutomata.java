import java.util.Scanner;
class SingleFiniteStateAutomata{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("[Finite State Automata]\nWhat state do you want to start at? ");
        FSA s = new FSA(input.nextInt());
        System.out.println(input.nextLine());

        while(true){
            System.out.println("What will you do?\n-Go to next state\n-End");
            String choice = input.nextLine().toLowerCase();

            if(choice.equals("go to next state")){
                System.out.println(s.goToNextState());
            }
            else if(choice.equals("end")){
                if(s.end()){
                    break;
                }
                else{
                    System.out.println("\nYou can't stop here; you can only stop at state 3.");
                }
            }
            else{
                System.out.println("\nInvalid command");
            }
            System.out.println();
        }
        System.out.print("\nThe machine has shut down.");
    }
}