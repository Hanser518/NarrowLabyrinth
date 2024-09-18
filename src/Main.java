import Method.MazeBuild;
import entity.MazeMap;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Narrow Labyrinth!");
        // 创建一个3纬、5*5*5的初始迷宫
        List<Integer> len = new ArrayList<>();
        len.add(5);
        len.add(5);
        len.add(5);
        MazeMap m1 = new MazeMap("Maze1", 3, len);
        MazeBuild mb;
        // 输入现有的MazeMap对象
        mb = new MazeBuild(m1);
        // 创建新的MazeMap对象
        mb = new MazeBuild("Maze1", 3, len);
        // 调用方法生成迷宫内容
        mb.buildMap();
    }
}