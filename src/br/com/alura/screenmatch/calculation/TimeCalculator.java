package br.com.alura.screenmatch.calculation;

import br.com.alura.screenmatch.models.List;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void include(List list){
        totalTime += list.getDuration();
    }
}
