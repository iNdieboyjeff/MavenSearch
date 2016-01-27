import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Response {

    @SerializedName("numFound")
    @Expose
    private int numFound;
    @SerializedName("start")
    @Expose
    private int start;
    @SerializedName("docs")
    @Expose
    private List<Doc> docs = new ArrayList<Doc>();

    /**
     * 
     * @return
     *     The numFound
     */
    public int getNumFound() {
        return numFound;
    }

    /**
     * 
     * @param numFound
     *     The numFound
     */
    public void setNumFound(int numFound) {
        this.numFound = numFound;
    }

    /**
     * 
     * @return
     *     The start
     */
    public int getStart() {
        return start;
    }

    /**
     * 
     * @param start
     *     The start
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * 
     * @return
     *     The docs
     */
    public List<Doc> getDocs() {
        return docs;
    }

    /**
     * 
     * @param docs
     *     The docs
     */
    public void setDocs(List<Doc> docs) {
        this.docs = docs;
    }

}
