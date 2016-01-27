import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ResponseHeader {

    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("QTime")
    @Expose
    private int QTime;
    @SerializedName("params")
    @Expose
    private Params params;

    /**
     * 
     * @return
     *     The status
     */
    public int getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The QTime
     */
    public int getQTime() {
        return QTime;
    }

    /**
     * 
     * @param QTime
     *     The QTime
     */
    public void setQTime(int QTime) {
        this.QTime = QTime;
    }

    /**
     * 
     * @return
     *     The params
     */
    public Params getParams() {
        return params;
    }

    /**
     * 
     * @param params
     *     The params
     */
    public void setParams(Params params) {
        this.params = params;
    }

}
