import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Params {

    @SerializedName("fl")
    @Expose
    private String fl;
    @SerializedName("sort")
    @Expose
    private String sort;
    @SerializedName("indent")
    @Expose
    private String indent;
    @SerializedName("q")
    @Expose
    private String q;
    @SerializedName("core")
    @Expose
    private String core;
    @SerializedName("wt")
    @Expose
    private String wt;
    @SerializedName("rows")
    @Expose
    private String rows;
    @SerializedName("version")
    @Expose
    private String version;

    /**
     * 
     * @return
     *     The fl
     */
    public String getFl() {
        return fl;
    }

    /**
     * 
     * @param fl
     *     The fl
     */
    public void setFl(String fl) {
        this.fl = fl;
    }

    /**
     * 
     * @return
     *     The sort
     */
    public String getSort() {
        return sort;
    }

    /**
     * 
     * @param sort
     *     The sort
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * 
     * @return
     *     The indent
     */
    public String getIndent() {
        return indent;
    }

    /**
     * 
     * @param indent
     *     The indent
     */
    public void setIndent(String indent) {
        this.indent = indent;
    }

    /**
     * 
     * @return
     *     The q
     */
    public String getQ() {
        return q;
    }

    /**
     * 
     * @param q
     *     The q
     */
    public void setQ(String q) {
        this.q = q;
    }

    /**
     * 
     * @return
     *     The core
     */
    public String getCore() {
        return core;
    }

    /**
     * 
     * @param core
     *     The core
     */
    public void setCore(String core) {
        this.core = core;
    }

    /**
     * 
     * @return
     *     The wt
     */
    public String getWt() {
        return wt;
    }

    /**
     * 
     * @param wt
     *     The wt
     */
    public void setWt(String wt) {
        this.wt = wt;
    }

    /**
     * 
     * @return
     *     The rows
     */
    public String getRows() {
        return rows;
    }

    /**
     * 
     * @param rows
     *     The rows
     */
    public void setRows(String rows) {
        this.rows = rows;
    }

    /**
     * 
     * @return
     *     The version
     */
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(String version) {
        this.version = version;
    }

}
