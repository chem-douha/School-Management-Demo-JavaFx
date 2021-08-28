package model.dao;

import javafx.collections.ObservableList;
import model.entity.Class;

public interface ClassDao {

    ObservableList<Class> getClasses();
    Class getClass(int id);
    ObservableList<String> getClassesNumbers();
    void saveClass(Class classe);
    void updateClass(Class classe);
    void deleteClass(Class classe);

}
