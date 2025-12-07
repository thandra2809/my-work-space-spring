package com.techgeeni.learn_spring_boot;

public class Course {
    private final long id;
    private final String name;
    private final String author;

    public Course(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }

}
