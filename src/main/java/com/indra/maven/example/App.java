package com.indra.maven.example;

public class App
{

    private final String message = "Pruebas de Maven sobre Jenkins.!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}