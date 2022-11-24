class FSA{
    int state;
    boolean active;

    public FSA(int s){
        if ((s > 3) || (s < 0)){
            System.out.println("This is an invalid state. Starting at state 0");
            state = 0;
        }
        else{
            state = s;
        }
        this.active = true;
    }
    public FSA(){
        this.active = true;
    }

    public int goToNextState(){
        if(state == 3){
            state = 0;
        }
        else{
            state++;
        }
        return state;
    }

    public boolean end(){
        this.active = false;
        return state == 3;
    }

    public int showCurrentState(){
        return state;
    }

    public boolean isActive(){
        return active;
    }
}