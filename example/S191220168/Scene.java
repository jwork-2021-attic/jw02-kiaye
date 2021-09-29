package S191220168;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import sun.management.ThreadInfoCompositeData;

public class Scene {

    public static void main(String[] args) throws IOException {

        Line line = new Line(256);
        Colour colour = new Colour();
        Random random = new Random();
        for (int i = 0; i < 256; i++){
            line.put(colour.monsters[i], random.arr[i]);
        }
       
        Snake theSnake = Snake.getTheSnake();

        Sorter sorter = new BubbleSorter();

        theSnake.setSorter(sorter);

        String log = theSnake.lineUp(line, colour.monsters);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result2.txt"));
        writer.write(log);
        writer.flush();
        writer.close();

    }

}
