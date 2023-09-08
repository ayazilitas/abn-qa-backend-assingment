package LIstIssue_POJO;

public class TaskCompletionStatus {



    private Integer count;
    private Integer completedCount;

    /**
     * No args constructor for use in serialization
     *
     */
    public TaskCompletionStatus() {
    }

    /**
     *
     * @param count
     * @param completedCount
     */
    public TaskCompletionStatus(Integer count, Integer completedCount) {
        super();
        this.count = count;
        this.completedCount = completedCount;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCompletedCount() {
        return completedCount;
    }

    public void setCompletedCount(Integer completedCount) {
        this.completedCount = completedCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TaskCompletionStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("completedCount");
        sb.append('=');
        sb.append(((this.completedCount == null)?"<null>":this.completedCount));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
