package entity;

import java.io.Serializable;

// 学生类包含：1.学生信息；2：学生证信息
public class Student implements Serializable {
    // 1.学生信息
    private int stuNo;
    private String stuName;
    private int stuAge;
    private String graName;
    private boolean stuSex;
    // 2.学生证信息
    private StudentCard card;

    private Address address;    // 家庭、学校

    public Student() {
    }

    public Student(int stuNo, String stuName, int stuAge, String graName) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.graName = graName;
    }

    public Student(int stuNo, String stuName, int stuAge, String graName, boolean stuSex) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.graName = graName;
        this.stuSex = stuSex;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getGraName() {
        return graName;
    }

    public void setGraName(String graName) {
        this.graName = graName;
    }

    public boolean isStuSex() {
        return stuSex;
    }

    public void setStuSex(boolean stuSex) {
        this.stuSex = stuSex;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public StudentCard getCard() {
        return card;
    }

    public void setCard(StudentCard card) {
        this.card = card;
    }

    @Override
    public String toString() {
//        return this.stuNo + "-" + this.stuName + "-" + this.stuAge + "-" + this.graName + "-性别：" + this.stuSex;
        return this.stuNo + "-" + this.stuName + "-" + this.stuAge + "-" + this.card.getCardId() + "-" + this.card.getCardInfo();

    }
}
