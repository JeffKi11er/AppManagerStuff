package com.example.appmanagerstuff.mangager;

import com.example.appmanagerstuff.stuff_model.Time;

import java.util.ArrayList;

public class EngineManager {
    private static EngineManager engineManager;
    private ArrayList<Time>times = new ArrayList<>();
    public EngineManager() {
    }
    public static EngineManager getInstance(){
        if (engineManager==null){
            engineManager = new EngineManager();
        }
        return engineManager;
    }
    public void addTimeDecision(Time time){
        times.add(time);
    }
}
