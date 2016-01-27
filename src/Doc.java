import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Doc {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("g")
    @Expose
    private String g;
    @SerializedName("a")
    @Expose
    private String a;
    @SerializedName("v")
    @Expose
    private String v;
    @SerializedName("p")
    @Expose
    private String p;
    @SerializedName("timestamp")
    @Expose
    private int timestamp;
    @SerializedName("tags")
    @Expose
    private List<String> tags = new ArrayList<String>();
    @SerializedName("ec")
    @Expose
    private List<String> ec = new ArrayList<String>();

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The g
     */
    public String getG() {
        return g;
    }

    /**
     * 
     * @param g
     *     The g
     */
    public void setG(String g) {
        this.g = g;
    }

    /**
     * 
     * @return
     *     The a
     */
    public String getA() {
        return a;
    }

    /**
     * 
     * @param a
     *     The a
     */
    public void setA(String a) {
        this.a = a;
    }

    /**
     * 
     * @return
     *     The v
     */
    public String getV() {
        return v;
    }

    /**
     * 
     * @param v
     *     The v
     */
    public void setV(String v) {
        this.v = v;
    }

    /**
     * 
     * @return
     *     The p
     */
    public String getP() {
        return p;
    }

    /**
     * 
     * @param p
     *     The p
     */
    public void setP(String p) {
        this.p = p;
    }

    /**
     * 
     * @return
     *     The timestamp
     */
    public int getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * @param timestamp
     *     The timestamp
     */
    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 
     * @return
     *     The tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The ec
     */
    public List<String> getEc() {
        return ec;
    }

    /**
     * 
     * @param ec
     *     The ec
     */
    public void setEc(List<String> ec) {
        this.ec = ec;
    }

}
