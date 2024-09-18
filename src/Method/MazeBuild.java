package Method;

import entity.MazeMap;
import entity.Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MazeBuild {
    protected MazeMap m2;
    protected List<Unit> database;

    public MazeBuild(MazeMap m){
        this.m2 = m;
    }

    public MazeBuild(String name, Integer dimension, List<Integer> length){
        this.m2 = new MazeMap(name, dimension, length);
    }

    // 采用递归回溯法生成
    public void buildMap(){
        Stack<Integer> mapStack = new Stack<>();
        int index = 0;
        database = m2.getDatabases();
        mapStack.push(index);
        Unit loc = database.get(index);
        loc.visit();
        database.set(index, loc);
        while (!mapStack.isEmpty()){
            Unit now = database.get(mapStack.peek());   // 获取栈顶元素

        }
    }
}
