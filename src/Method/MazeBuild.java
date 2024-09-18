package Method;

import entity.MazeMap;

import java.util.List;

public class MazeBuild {
    protected MazeMap m2;

    public MazeBuild(MazeMap m){
        this.m2 = m;
    }

    public MazeBuild(String name, Integer dimension, List<Integer> length){
        this.m2 = new MazeMap(name, dimension, length);
    }

    public void buildMap(){

    }
}
