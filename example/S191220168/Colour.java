package S191220168;

public class Colour {
    Monster[] monsters = new Monster[256];
    Colour(){
        for (int i = 0; i < monsters.length; i++){
            if (i <= 51){
                Monster m = new Monster(255, i*5, 0);
                monsters[i] = m;
            }
            else if (i > 51 && i <=102){
                monsters[i] = new Monster(255 - (i-51)*5, 255, 0);
            }
            else if (i > 102 && i <= 153){
                monsters[i] = new Monster(0, 255, (i-102)*5);
            }
            else if (i > 153 && i <= 204){
                monsters[i] = new Monster(0, 255-(i-153)*5, 255);
            }
            else if (i > 204 && i <= 255){
                monsters[i] = new Monster((i-204)*5, 0, 255);
            }
            monsters[i].setValue(i);
        }

    }

}