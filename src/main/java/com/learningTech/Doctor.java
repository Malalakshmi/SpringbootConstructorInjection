package com.learningTech;


public class Doctor implements Staff{
    public String getQualification() {
        return qualification;
    }

    public Doctor(String qualification) {
        this.qualification = qualification;
    }

    private String qualification;

    @Override
    public void assist() {
        System.out.println("Doctor assisting");
    }
}
