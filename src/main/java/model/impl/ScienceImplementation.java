package model.impl;

import javafx.collections.ObservableList;
import model.dao.ScienceDao;

public class ScienceImplementation implements ScienceDao {
    @Override
    public ObservableList<ScienceDao> getSciences() {
        return null;
    }

    @Override
    public ScienceDao getScience(int id) {
        return null;
    }

    @Override
    public ObservableList<String> getSiencesName() {
        return null;
    }

    @Override
    public void saveScience(ScienceDao science) {

    }

    @Override
    public void updateScience(ScienceDao science) {

    }

    @Override
    public void deleteScience(ScienceDao science) {

    }
}
