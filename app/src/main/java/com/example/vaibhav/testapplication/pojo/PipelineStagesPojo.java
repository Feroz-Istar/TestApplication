package com.example.vaibhav.testapplication.pojo;

import com.github.javafaker.Faker;

import java.io.Serializable;
import java.util.ArrayList;

public class PipelineStagesPojo implements Serializable {
    private Integer id;
    private String name;
    private Integer calls;
    private Integer webinars;
    private Integer emails;
    private Integer meetings;
    private Integer presentations;
    private ArrayList<ManagerTask> tasks = new ArrayList<>();
    private ArrayList<String> taskTypes = new ArrayList<>();

    public PipelineStagesPojo() {
        super();
        // TODO Auto-generated constructor stub
    }

    public PipelineStagesPojo(Integer id, String name, Integer calls, Integer webinars, Integer emails, Integer meetings, Integer presentations, ArrayList<ManagerTask> tasks, ArrayList<String> taskTypes) {
        super();
        this.id = id;
        this.name = name;
        this.calls = calls;
        this.webinars = webinars;
        this.emails = emails;
        this.meetings = meetings;
        this.presentations = presentations;
        this.tasks = tasks;
        this.taskTypes = taskTypes;
    }

    public PipelineStagesPojo(Faker faker, Integer pipelineId, String string) {
        // TODO Auto-generated constructor stub
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCalls() {
        return calls;
    }

    public void setCalls(Integer calls) {
        this.calls = calls;
    }

    public Integer getWebinars() {
        return webinars;
    }

    public void setWebinars(Integer webinars) {
        this.webinars = webinars;
    }

    public Integer getEmails() {
        return emails;
    }

    public void setEmails(Integer emails) {
        this.emails = emails;
    }

    public Integer getMeetings() {
        return meetings;
    }

    public void setMeetings(Integer meetings) {
        this.meetings = meetings;
    }

    public Integer getPresentations() {
        return presentations;
    }

    public void setPresentations(Integer presentations) {
        this.presentations = presentations;
    }

    public ArrayList<ManagerTask> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<ManagerTask> tasks) {
        this.tasks = tasks;
    }

    public ArrayList<String> getTaskTypes() {
        return taskTypes;
    }

    public void setTaskTypes(ArrayList<String> taskTypes) {
        this.taskTypes = taskTypes;
    }



}
