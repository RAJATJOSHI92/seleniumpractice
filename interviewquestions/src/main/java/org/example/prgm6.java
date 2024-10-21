package org.example;

class Trafficlight {
    String color;
    int duration;

    Trafficlight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }


    public void changecolor(String newcolor) {
        this.color = newcolor;
    }

    public boolean isred() {
        return color.equals("red");

    }

    public boolean isgreen() {
        return color.equals("green");

    }

}

public class prgm6 {
    public static void main(String[] args) {
        Trafficlight light = new Trafficlight("red", 30);
        System.out.println("traffuc light  is green " + light.isgreen());
        System.out.println("traffuc light  is red " + light.isred());
        light.changecolor("yellow");
        System.out.println("traffuc light  is green " + light.isgreen());
        System.out.println("traffuc light  is red " + light.isred());
        System.out.println("duration of loght is " + light.duration);
        light.setDuration(44);
        System.out.println(" New duration of loght is " + light.duration);
    }
}
