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
    private List<Integer> status = new ArrayList<>();


    public Unit(Integer dimension){
        this.dimension = dimension;
        for(int i = 0;i < dimension;i ++){
            status.add(1);
        }
    }

    public void reset(Integer value) {
        status.replaceAll(content -> value);
    }

    public void setStatus(List<Integer> status) {
        this.status = status;
    }

    public void setStatus(Integer index, Integer status) {
        this.status.set(index, status);
    }

    public Integer getStatus(int index){
        return this.status.get(index);
    }

    public List<Integer> getStatus(){
        return this.status;
    }
}
