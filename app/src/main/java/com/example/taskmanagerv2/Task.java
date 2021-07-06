package com.example.taskmanagerv2;

public class Task {
    private String id,title,description;
    public Task(String id,String title,String description){
        this.id = id;
        this.title = title;
        this.description=description;
    }

    public String getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }
}
