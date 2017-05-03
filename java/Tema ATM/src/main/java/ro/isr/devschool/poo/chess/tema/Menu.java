package ro.isr.devschool.poo.chess.tema;

public class Menu {
    private int state;

    public Menu(int state){
        this.state=state;
    }

    public int SwitchMenu(int val){

        switch(val){
            case 1:{
                this.state=1;
                break;
            }
            case 2:{
                this.state=2;
                break;
            }
            case 3:{
                this.state=3;
                break;
            }
            case 4:{
                this.state=4;
                break;
            }
            case 5:{
                this.state=5;
                break;
            }
            default:
                this.state=6;

        }
        return this.state;
    }


    public int getState(){
        return this.state;
    }

}
