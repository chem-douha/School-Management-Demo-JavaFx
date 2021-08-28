package model.impl;

import javafx.collections.ObservableList;
import model.dao.ClassDao;
import model.entity.Class;

public class ClassImplementation implements ClassDao {
    @Override
    public ObservableList<Class> getClasses() {
        return null;
    }

    @Override
    public Class getClass(int id) {
        return null;
    }

    @Override
    public ObservableList<String> getClassesNumbers() {
        return null;
    }

    @Override
    public void saveClass(Class classe) {

    }

    @Override
    public void updateClass(Class classe) {

    }

    @Override
    public void deleteClass(Class classe) {

    }
}
