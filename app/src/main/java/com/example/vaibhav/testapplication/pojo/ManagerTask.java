package com.example.vaibhav.testapplication.pojo;

import com.github.javafaker.Faker;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class  ManagerTask implements Serializable {
    private Integer id;
    private String taskType;
    private String contactPersonImage;
    private String companyName;
    private String contactPersonName;
    private String status;
    private String startTime;
    private String duration;
    private Float rating;
    private Float customerTalk;
    private Float salesMemberTalk;
    private String startDate;
    private String endDate;
    private String actorName;
    private String actorprofileImage;
    private String name;
    private String description;
    private String leadHealthColor = LeadHealthColor.yellow.toString();

    public ManagerTask() {
        super();
    }

    public ManagerTask(Faker faker) {
        SimpleDateFormat formatTime = new SimpleDateFormat("HH:mm:a");
        this.id = faker.number().randomDigit();
        long stdate = new Date().getTime() - (long) faker.number().numberBetween(1, 100) * 24 * 60 * 60 * 1000;
        Date sDate = new Date(stdate);
        this.taskType = new String[] { "Sales Call", "Sales Presentation", "Sales Webinar" }[new Random().nextInt(2)];
        this.contactPersonImage = faker.internet().avatar();
        this.companyName = faker.company().name();
        this.contactPersonName = faker.name().fullName();
        this.status = new String[] { "SCHEDULED", "ONGOING", "COMPLETED" }[new Random().nextInt(3)];
        ;
        this.startTime = formatTime.format(faker.date().between(sDate, new Date()));
        ;
        this.duration = faker.number().randomDigit() + " Min " + faker.number().randomDigit() + " Sec";
        this.rating = (float) faker.number().randomDouble(1, 0, 5);
    }

    public ManagerTask(Integer id, String taskType, String contactPersonImage, String companyName,
                       String contactPersonName, String status, String startTime, String duration, Float rating,
                       Float customerTalk, Float salesMemberTalk, String startDate, String endDate) {
        super();
        this.id = id;
        this.taskType = taskType;
        this.contactPersonImage = contactPersonImage;
        this.companyName = companyName;
        this.contactPersonName = contactPersonName;
        this.status = status;
        this.startTime = startTime;
        this.duration = duration;
        this.rating = rating;
        this.customerTalk = customerTalk;
        this.salesMemberTalk = salesMemberTalk;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getContactPersonImage() {
        return contactPersonImage;
    }

    public void setContactPersonImage(String contactPersonImage) {
        this.contactPersonImage = contactPersonImage;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Float getCustomerTalk() {
        return customerTalk;
    }

    public void setCustomerTalk(Float customerTalk) {
        this.customerTalk = customerTalk;
    }

    public Float getSalesMemberTalk() {
        return salesMemberTalk;
    }

    public void setSalesMemberTalk(Float salesMemberTalk) {
        this.salesMemberTalk = salesMemberTalk;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getActorprofileImage() {
        return actorprofileImage;
    }

    public void setActorprofileImage(String actorprofileImage) {
        this.actorprofileImage = actorprofileImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLeadHealthColor() {
        return leadHealthColor;
    }

    public void setLeadHealthColor(String leadHealthColor) {
        this.leadHealthColor = leadHealthColor;
    }


    public enum LeadHealthColor {
        green, yellow, red
    }

}
