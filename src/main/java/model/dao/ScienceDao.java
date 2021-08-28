package model.dao;

import javafx.collections.ObservableList;


public interface ScienceDao {

    ObservableList<ScienceDao> getSciences();
    ScienceDao getScience(int id);
    ObservableList<String> getSiencesName();
    void saveScience(ScienceDao science);
    void updateScience(ScienceDao science);
    void deleteScience(ScienceDao science);
}
