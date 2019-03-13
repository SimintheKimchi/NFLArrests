package com.example.nflarrests;

import java.util.List;

public class NFLCrimeResponse {
    private List<NFL> name;
    private List<NFL> arrestCount;

    public NFLCrimeResponse(List<NFL> name, List<NFL> arrestCount) {
        this.name = name;
        this.arrestCount = arrestCount;
    }

    public List<NFL> getName() {
        return name;
    }

    public void setName(List<NFL> name) {
        this.name = name;
    }

    public List<NFL> getArrestCount() {
        return arrestCount;
    }

    public void setArrestCount(List<NFL> arrestCount) {
        this.arrestCount = arrestCount;
    }

    @Override
    public String toString() {
        return "NFLCrimeResponse{" +
                "name=" + name +
                ", arrestCount=" + arrestCount +
                '}';
    }
}
