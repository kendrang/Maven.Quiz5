package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    Integer id = 0 ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(Double studyTime) {
        this.studyTime = studyTime;
    }

    Double studyTime = 0.0;

    public Student() {
        this(null);
        this.studyTime = 0.0;
    }

    public Student(Integer id) {
        this.id = id;
        this.studyTime = 0.0;
    }

    public void learn(Double amountOfHours) {
        this.studyTime += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return studyTime;
    }
}
