package S191220168;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import sun.management.ThreadInfoCompositeData;

public class Scene {

    public static void main(String[] args) throws IOException {

        Colour colour = new Colour();
        Random random = new Random();
        //task2
        //Line line = new Line(256);
        // for (int i = 0; i < 256; i++){
        //     line.put(colour.monsters[i], random.arr[i]);
        // }
        
        //task3
        Line[] lines = new Line[16]; 
        Matrix matrix = new Matrix(16);
        for (int i = 0; i < 16; i++){
            lines[i] = new Line(16);
        }
        for (int i = 0; i < 256; i++){
            int row = random.arr[i]/16;
            int rol = random.arr[i]%16;
            lines[row].put(colour.monsters[i], rol);
        }
        matrix.load(lines);
       
        
        Snake theSnake = Snake.getTheSnake();

        Sorter sorter = new BubbleSorter();

        theSnake.setSorter(sorter);

        //task2
        //String log = theSnake.lineUp(line, colour.monsters);

        //task3
        String log = theSnake.matrixUp(matrix, colour.monsters);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result2.txt"));
        writer.write(log);
        writer.flush();
        writer.close();

    }

}
