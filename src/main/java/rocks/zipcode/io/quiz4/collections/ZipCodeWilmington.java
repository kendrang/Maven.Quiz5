package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    ArrayList<Student> zipclass = new ArrayList<>();

    public void enroll(Student student) {
        zipclass.add(student);
    }

    public Boolean isEnrolled(Student student) {
        if (zipclass.contains(student)){
            return true;
        }
        return false;
    }

    public void lecture(double numberOfHours) {
        for (Student s : zipclass){
            s.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> result = new HashMap<>();
        for(Student s : zipclass){
            result.put(s, s.studyTime);
        }
        return result;
    }
}
