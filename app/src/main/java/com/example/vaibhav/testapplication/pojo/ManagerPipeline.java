package com.example.vaibhav.testapplication.pojo;


import com.github.javafaker.Faker;

import java.io.Serializable;
import java.util.ArrayList;

public class ManagerPipeline implements Serializable {
    private Integer id;
    private String name;
    private ArrayList<PipelineStagesPojo> stages = new ArrayList<>();

    public ManagerPipeline() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ManagerPipeline(Faker faker, Integer pipelineId) {
        String stagesItem[] = { "Lead In", "Cold Call", "Demo", "Proposal", "Contract", "Closure" };
        this.id = faker.number().randomDigitNotZero();
        this.name = "Product Pipeline";
        for (int i = 0; i < stagesItem.length; i++) {
            stages.add(new PipelineStagesPojo(faker, pipelineId, stagesItem[i]));
        }
    }

    public ManagerPipeline(Integer id, String name, ArrayList<PipelineStagesPojo> pipelineStages) {
        super();
        this.id = id;
        this.name = name;
        this.stages = pipelineStages;
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

    public ArrayList<PipelineStagesPojo> getPipelineStages() {
        return stages;
    }

    public void setPipelineStages(ArrayList<PipelineStagesPojo> pipelineStages) {
        this.stages = pipelineStages;
    }

}
