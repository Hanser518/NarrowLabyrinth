package entity;

import java.util.ArrayList;
import java.util.List;

public class Unit {

    /**
     * 单元格维度数
     */
    private Integer dimension;

    /**
     * 单元格状态列表
     */
    private List<Integer> kinds = new ArrayList<>();

    /**
     * 当前单元格访问状态
     */
    private boolean visited = false;


    public Unit(Integer dimension){
        this.dimension = dimension;
        for(int i = 0;i < dimension;i ++){
            kinds.add(1);
        }
    }

    public void reset(Integer value) {
        kinds.replaceAll(content -> value);
    }

    public void setKinds(List<Integer> kinds) {
        this.kinds = kinds;
    }

    public void setStatus(Integer index, Integer status) {
        this.kinds.set(index, status);
    }

    public Integer getStatus(int index){
        return this.kinds.get(index);
    }

    public List<Integer> getKinds(){
        return this.kinds;
    }

    public void resetVisit(){
        this.visited = false;
    }

    public void visit(){
        this.visited = true;
    }

    public boolean getVisit(){
        return visited;
    }
}
