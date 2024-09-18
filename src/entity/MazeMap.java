package entity;

import java.util.ArrayList;
import java.util.List;

public class MazeMap {
    static final int WALL = 1;
    static final int ROAD = 0;

    /**
     * 迷宫名称
     */
    private String name;

    /**
     * 迷宫维度
     */
    private Integer dimension;

    /**
     * 迷宫各纬度的长度
     */
    private List<Integer> length = new ArrayList<>();

    /**
     * 迷宫各单元格状态存储
     */
    private List<Unit> database = new ArrayList<>();

    /**
     * 创建新的迷宫数据，默认全部为墙
     * @param name
     * @param dimension
     * @param length
     */
    public MazeMap(String name, Integer dimension, List<Integer> length){
        this.name = name;
        this.dimension = dimension;
        this.length = length;
        length.forEach(value -> {
            for(int i = 0;i < value;i ++){
                database.add(new Unit(dimension));
            }
        });
    }

    public void setDimension(Integer dimension) {
        this.dimension = dimension;
    }

    public Integer getDimension() {
        return this.dimension;
    }

    public void setLength(List<Integer> length) {
        this.length = length;
    }

    public List<Integer> getLength() {
        return this.length;
    }

    public void setDatabase(List<Unit> databases) {
        this.database = databases;
    }

    public List<Unit> getDatabases() {
        return this.database;
    }
}
