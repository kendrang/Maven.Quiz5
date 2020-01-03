package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    Character delimiter ;
    StringBuilder sb = new StringBuilder();

    public StringAssembler(Character delimeter) {
        this.delimiter = delimeter;

    }

    public StringAssembler append(String str) {
        return null;
    }

    public String assemble() {

        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
