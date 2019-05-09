package org.primefaces.test;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "testView")
@ViewScoped
public class TestView implements Serializable {

    private String testString;


    private Boolean testBoolean1 = true;

    private Boolean testBoolean2 = true;

    private Boolean testBoolean3 = true;



    @PostConstruct
    public void init() {
        testString = "Welcome to PrimeFaces!!!";
    }


    public void submit() {
        // do nothing
        System.out.println("submit");

    }


    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public Boolean getTestBoolean1() {
        return testBoolean1;
    }

    public void setTestBoolean1(Boolean testBoolean1) {
        System.out.println("setTestBoolean1");
        this.testBoolean1 = testBoolean1;
    }

    public Boolean getTestBoolean2() {
        return testBoolean2;
    }

    public void setTestBoolean2(Boolean testBoolean2) {
        System.out.println("setTestBoolean2");
        this.testBoolean2 = testBoolean2;
    }

    public Boolean getTestBoolean3() {
        return testBoolean3;
    }

    public void setTestBoolean3(Boolean testBoolean3) {
        System.out.println("setTestBoolean3");
        this.testBoolean3 = testBoolean3;
    }
}
