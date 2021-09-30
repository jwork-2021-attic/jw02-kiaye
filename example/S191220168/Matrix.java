package S191220168;

import S191220168.Line.Position;

public class Matrix {
    public Line[] lines;

    public Matrix(int length) {
        this.lines = new Line[length];
    }

    public void load(Line[] lines){
        this.lines = lines;
    }
    public void put(Line line, int i) {
        if (this.lines[i] == null) {
            this.lines[i] = new Line(16);
        }
        this.lines[i] = line;
    }

    @Override
    public String toString() {
        String lineString = "\t";
        for (Line l : lines){
            for (Position p : l.positions) {
                lineString += p.linable.toString();
            }
            lineString += "\n";
            lineString += "\t";
        }
        return lineString;
    }

    public Linable[] toArray() {
        int len = 0;
        for (Line l : lines){
            len += l.positions.length;
        }
        Linable[] linables = new Linable[len];
        int count = 0;
        for (int i = 0; i < lines.length; i++){
            for (int j = 0; j < lines[i].positions.length; j++) {
                linables[count] = lines[i].positions[j].linable;
                count++;
            }
        }
        return linables;

    }
}