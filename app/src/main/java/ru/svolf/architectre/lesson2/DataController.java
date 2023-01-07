package ru.svolf.architectre.lesson2;

import androidx.lifecycle.MutableLiveData;

public class DataController {
    private static DataController instance;
    private final MutableLiveData<Integer> liveData = new MutableLiveData<>();

    public static DataController getInstance() {
        if (instance == null){
            instance = new DataController();
        }
        return instance;
    }

    public MutableLiveData<Integer> getData(){
        return liveData;
    }
}
