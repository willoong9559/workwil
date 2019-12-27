package com.wilwork.model;

public class Yuan {

    private String id;
    private String name;
    private boolean sex;

    public Yuan() {
        super();
    }
    public Yuan(String id, String name, boolean sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
