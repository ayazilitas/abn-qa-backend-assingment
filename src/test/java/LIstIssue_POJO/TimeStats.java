package LIstIssue_POJO;

public class TimeStats {


    private Integer timeEstimate;
    private Integer totalTimeSpent;
    private Object humanTimeEstimate;
    private Object humanTotalTimeSpent;

    /**
     * No args constructor for use in serialization
     *
     */
    public TimeStats() {
    }

    /**
     *
     * @param humanTimeEstimate
     * @param totalTimeSpent
     * @param humanTotalTimeSpent
     * @param timeEstimate
     */
    public TimeStats(Integer timeEstimate, Integer totalTimeSpent, Object humanTimeEstimate, Object humanTotalTimeSpent) {
        super();
        this.timeEstimate = timeEstimate;
        this.totalTimeSpent = totalTimeSpent;
        this.humanTimeEstimate = humanTimeEstimate;
        this.humanTotalTimeSpent = humanTotalTimeSpent;
    }

    public Integer getTimeEstimate() {
        return timeEstimate;
    }

    public void setTimeEstimate(Integer timeEstimate) {
        this.timeEstimate = timeEstimate;
    }

    public Integer getTotalTimeSpent() {
        return totalTimeSpent;
    }

    public void setTotalTimeSpent(Integer totalTimeSpent) {
        this.totalTimeSpent = totalTimeSpent;
    }

    public Object getHumanTimeEstimate() {
        return humanTimeEstimate;
    }

    public void setHumanTimeEstimate(Object humanTimeEstimate) {
        this.humanTimeEstimate = humanTimeEstimate;
    }

    public Object getHumanTotalTimeSpent() {
        return humanTotalTimeSpent;
    }

    public void setHumanTotalTimeSpent(Object humanTotalTimeSpent) {
        this.humanTotalTimeSpent = humanTotalTimeSpent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TimeStats.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timeEstimate");
        sb.append('=');
        sb.append(((this.timeEstimate == null)?"<null>":this.timeEstimate));
        sb.append(',');
        sb.append("totalTimeSpent");
        sb.append('=');
        sb.append(((this.totalTimeSpent == null)?"<null>":this.totalTimeSpent));
        sb.append(',');
        sb.append("humanTimeEstimate");
        sb.append('=');
        sb.append(((this.humanTimeEstimate == null)?"<null>":this.humanTimeEstimate));
        sb.append(',');
        sb.append("humanTotalTimeSpent");
        sb.append('=');
        sb.append(((this.humanTotalTimeSpent == null)?"<null>":this.humanTotalTimeSpent));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
