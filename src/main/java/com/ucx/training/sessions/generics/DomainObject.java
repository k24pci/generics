package com.ucx.training.sessions.generics;

public abstract class DomainObject<T> {
    private T id;

    public DomainObject(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
