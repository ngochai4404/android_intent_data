package com.hai.bai2.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Hai on 03/07/2018.
 */

public class Student implements Parcelable{
    private String name;
    private String country;
    private String birthday;
    private String sex;
    private String classRoom;
    private String course;

    public Student() {
    }

    protected Student(Parcel in) {
        name = in.readString();
        country = in.readString();
        birthday = in.readString();
        sex = in.readString();
        classRoom = in.readString();
        course = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(country);
        parcel.writeString(birthday);
        parcel.writeString(sex);
        parcel.writeString(classRoom);
        parcel.writeString(course);
    }
}
