# Finite-State-Automata
A finite-state machine or finite-state automaton is a mathematical model of computation. It is an abstract machine that can be exactly one of a finite number of states at any given time.

# Single-Finite-State-Automata
In computer architecture (a class you might take in the future) we teach a concept called “Finite State Automata”. Also known as “State Machines”, these models show different states of a system and how you can move from one to other. We are going to simulate one using objects.

You will create a FSA class with one attribute: int state. The valid states are shown in the diagram above. It should also have the following methods:
- overloaded constructor : Takes in one integer for the state attribute. If the state is not one of the values shown, it should be initialized to 0 and the constructor should print out “This is an invalid state. Starting at state 0”
- int goToNextState(): Takes in no parameters and advances the state variable to the next state based on the diagram above. It should then return the state variable. It should not print anything.
- bool/Boolean end(): Takes in no parameters. It returns TRUE if the state is currently 3, and returns FALSE otherwise.

You will then create a separate class (and file). In its main method, you should do the following:
- Prompt the user to enter a state
- Create a new FSA object using the overloaded constructor
- Create a loop and prompt the user with two choices:
  1. “Go to next state” – This should call the goToNextState() function on the FSA object and print the current state based on the value returned from the function
  2. “End” – This should call the end() function. If the returned value is TRUE, end the loop and program. Otherwise, tell the user they can only end the program at state 3.
  
  # Multiple-Finite-State-Automata
Custom classes share many of the same properties as the other datatypes we’ve covered in class. They can be used to make arrays like you can do with ints or strings. We will practice doing this in this assignment.

You will reuse the FSA class from the Single Finite State Automata You will add one new attribute to it, a boolean called “active” that is set to true when constructed. You will also add two new function to it:
- int showCurrentState(): Takes in no parameters and returns the value of the state variable. It should not print anything.
- bool/Boolean isActive(): Takes in no parameters. It returns TRUE if the FSA object’s active value is TRUE, and returns FALSE otherwise.

You will also create another driver class. This program should do the following:
- Create an array of FSA objects (size 3)
- Use a loop to initialize the array by creating new FSA objects and storing them in each index. You will use a random number generator to pick a random starting state for each FSA object.
- Print the initial state of each FSA object.
- Create a loop and prompt the user with three choices:
  1. “Show current state” – This should display the current state and active status of the FSA object at that index.
  2. “Go to next state” – This should check if the FSA object at that index is active. If so, call the goToNextState() function on the FSA object and print the current state based on the value returned from the function. Otherwise, it should inform the user that the machine is no longer active.
  3. “End” – This should call the end() function for the FSA object at that index. If the returned value is TRUE, set the “active” value of the machine at that index to false. Otherwise, tell the user they can only end the FSA object at state 3.
- After each command, the program should automatically check the status of each FSA object. If they are all inactive, the loop and program should automatically end.
