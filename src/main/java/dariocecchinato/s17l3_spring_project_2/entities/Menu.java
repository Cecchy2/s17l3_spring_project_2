package dariocecchinato.s17l3_spring_project_2.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<MenuData> datas;

    public Menu() {
        this.datas = new ArrayList<>();
    }

    public void addData(MenuData data){
        this.datas.add(data);
    }
    public List<MenuData> getDatas() {
        return datas;
    }


    @Override
    public String toString() {
        return "Menu" + datas;
    }
}
