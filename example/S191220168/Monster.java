package S191220168;

import S191220168.Line.Position;

public class Monster implements Linable {
    private int r;
    private int g;
    private int b;

    private int value;
    private Position position;

    Monster(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public void changeRGB(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public void setValue(int value){
        this.value = value;
    }
    // public static Monster getMonsterByRank(int rank) {

    //     for (Monster monster : monster.values()) {
    //         if (monster.rank == rank) {
    //             return monster;
    //         }
    //     }
    //     return null;

    // }

    // public int rank() {
    //     return this.ordinal() + 1;
    // }

    @Override
    public String toString() {
        return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m    " +   String.format("%5s",this.value) + "  \033[0m";
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    public void swapPosition(Monster another) {
        Position p = another.position;
        this.position.setLinable(another);
        p.setLinable(this);
    }

    @Override
    public int getValue() {
        return this.value;
    }


}