package com.example.sajing_finalexam;

import java.text.DecimalFormat;

public class Data {
    private double weight;
    private double height;
    private String bmiString;
    private double bmi;
    private String status;

    DecimalFormat decimalFormat=new DecimalFormat("##.##");
    public Data(double weight, double height){
        this.weight=weight;
        this.height=height;
        bmi=weight/(height*height);
        this.bmiString= decimalFormat.format(bmi);
    }
    public String checkStatus(double bmi){
        if (bmi<18){
            status="Underweight";
            return status;
        }
        else if (bmi<=24.9) {
            status="Normal";
            return status;
        }
        else if (bmi<=29.9){
            status="Overweight";
            return status;
        }
        else  {
            status="Obese";
            return status;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getBmiString() {
        return bmiString;
    }

    public void setBmiString(String bmiString) {
        this.bmiString = bmiString;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
