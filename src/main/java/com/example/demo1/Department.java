package com.example.demo1;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Department {
    private final StringProperty name;
    private final IntegerProperty code;

    public Department(String name, int code) {
        this.name = new SimpleStringProperty(name);
        this.code = new SimpleIntegerProperty(code);
    }

    // Getters and setters for name
    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public StringProperty nameProperty() {
        return name;
    }

    // Getters and setters for code
    public int getCode() {
        return code.get();
    }

    public void setCode(int code) {
        this.code.set(code);
    }

    public IntegerProperty codeProperty() {
        return code;
    }
}
