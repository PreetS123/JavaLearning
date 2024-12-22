package collectionFramework.learnSets;

import java.util.Objects;

public class Students {
     int rollNo;
     String name;

    public Students(String name, int rollno) {
        this.name=name;
        this.rollNo= rollno;
    }

    @Override
    public String toString() {
        return "{" +
                "name: "+ this.name+
                ", rollNo: " + this.rollNo+
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return rollNo == students.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }
}
