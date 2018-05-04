package com.outlook.kimliao.testlistview;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private int imageID;
    private String description;
    public Teacher(String name, int id, String desc)
    {
        this.name = name;
        this.imageID = id;
        this.description = desc;
    }
    public static List<Teacher> getAllTeachers()
    {
        List<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("陈建香", R.drawable.jianxiang, "主要负责照顾家，做饭，接送琦琦！"));
        teachers.add(new Teacher("廖小勤", R.drawable.xiaoqin, "琦琦的细大姑，每年过年都会过来拜访琦琦奶奶"));
        teachers.add(new Teacher("廖家琦", R.drawable.qiqi, "小名琦琦，在天悦湾幼儿园上学，大（1）班"));
        return teachers;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getImageID()
    {
        return this.imageID;
    }
    public void setImageID(int id)
    {
        this.imageID = id;
    }
    public String getDescription()
    {
        return this.description;
    }
    public void setDescription(String desc)
    {
        this.description = desc;
    }
}
