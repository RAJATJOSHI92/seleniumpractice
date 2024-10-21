package org.example;

class Dog {
    private String name;
    private String breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}


public class prgm2 {
    public static void main(String[] args) {
        Dog d = new Dog("garce", "labra");
        Dog d1 = new Dog("tommy", "rotwiller");

        System.out.println(d.getName() + " " + d.getBreed());
        System.out.println(d1.getName() + " " + d1.getBreed());
        d.setName("new grace");
        d.setBreed("new labra");
        d1.setName("new tommy");
        d1.setBreed("new rotwiller");
        System.out.println(d.getName() + " " + d.getBreed());
        System.out.println(d1.getName() + " " + d1.getBreed());

    }
}
