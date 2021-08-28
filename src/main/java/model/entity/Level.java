package model.entity;

import javafx.collections.ObservableList;

public class Level {

    int id;
    String name;
    ObservableList<Science> sciences;

    public Level() {
    }

    public Level(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Level(int id, String name, ObservableList<Science> sciences) {
        this.id = id;
        this.name = name;
        this.sciences = sciences;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObservableList<Science> getSciences() {
        return sciences;
    }

    public void setSciences(ObservableList<Science> sciences) {
        this.sciences = sciences;
    }
}
