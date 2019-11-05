package com.ucx.training.sessions.generics;

public class FileUpload extends DomainObject<String> {
    private String name;

    public FileUpload(String id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("%s %s",this.getId(), this.getName());
    }
}
