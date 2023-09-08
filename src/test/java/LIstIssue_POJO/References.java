package LIstIssue_POJO;

public class References {

    private String _short;
    private String relative;
    private String full;

    /**
     * No args constructor for use in serialization
     *
     */
    public References() {
    }

    /**
     *
     * @param _short
     * @param relative
     * @param full
     */
    public References(String _short, String relative, String full) {
        super();
        this._short = _short;
        this.relative = relative;
        this.full = full;
    }

    public String getShort() {
        return _short;
    }

    public void setShort(String _short) {
        this._short = _short;
    }

    public String getRelative() {
        return relative;
    }

    public void setRelative(String relative) {
        this.relative = relative;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(References.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_short");
        sb.append('=');
        sb.append(((this._short == null)?"<null>":this._short));
        sb.append(',');
        sb.append("relative");
        sb.append('=');
        sb.append(((this.relative == null)?"<null>":this.relative));
        sb.append(',');
        sb.append("full");
        sb.append('=');
        sb.append(((this.full == null)?"<null>":this.full));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
