package org.example;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Person> people = new ArrayList<>();
    public static void main(String[] args) {
        Person person0 = new Person("Alex","Test",88);
        Gson gson = new Gson();
        String json = gson.toJson(person0);
        System.out.println("Serializable object" + json);
        Person deserializedJosh = gson.fromJson(json,Person.class);
        System.out.println("Deserializable object" + deserializedJosh);

    }
}