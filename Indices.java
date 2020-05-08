
/**
 * Write a description of interface Indices here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Indices
{
    /**
     * An example of a method header - replace this comment with your own
     *
     * @param  y a sample parameter for a method
     * @return   the result produced by sampleMethod
     */
    public void getLines(String filename);

    public long addToIndex(int count);

    public long addToIndex();

    public long printAll(String filename);
}
