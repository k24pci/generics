package com.ucx.training.sessions.generics;

public class Customer extends DomainObject<Integer> {
    private String name;

    public Customer(Integer id, String name) {
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
        return String.format("%d %s",this.getId(), this.getName());
    }
}
