package com.iteheima.ListToFileDemo2;

public class Student {
    private String name;
    private  int  Chinese;
    private  int Math;
    private  int English;


    public Student(String sid, int chinese, int math, int english) {
        this.name= sid;
        Chinese = chinese;
        Math = math;
        English = english;
    }
    public Student(){};

    public String getName() {
        return name;
    }

    public void setName(String sid) {
        this.name = sid;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }
    public  int getSum(){
        return this.getChinese()+this.getMath()+this.getEnglish();
    }
}
