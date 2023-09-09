package LIstIssue_POJO;

public class Links {

    private String self;
    private String notes;
    private String awardEmoji;
    private String project;
    private Object closedAsDuplicateOf;

    /**
     * No args constructor for use in serialization
     *
     */
    public Links() {
    }

    /**
     *
     * @param notes
     * @param self
     * @param awardEmoji
     * @param project
     * @param closedAsDuplicateOf
     */
    public Links(String self, String notes, String awardEmoji, String project, Object closedAsDuplicateOf) {
        super();
        this.self = self;
        this.notes = notes;
        this.awardEmoji = awardEmoji;
        this.project = project;
        this.closedAsDuplicateOf = closedAsDuplicateOf;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getAwardEmoji() {
        return awardEmoji;
    }

    public void setAwardEmoji(String awardEmoji) {
        this.awardEmoji = awardEmoji;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Object getClosedAsDuplicateOf() {
        return closedAsDuplicateOf;
    }

    public void setClosedAsDuplicateOf(Object closedAsDuplicateOf) {
        this.closedAsDuplicateOf = closedAsDuplicateOf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Links.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("self");
        sb.append('=');
        sb.append(((this.self == null)?"<null>":this.self));
        sb.append(',');
        sb.append("notes");
        sb.append('=');
        sb.append(((this.notes == null)?"<null>":this.notes));
        sb.append(',');
        sb.append("awardEmoji");
        sb.append('=');
        sb.append(((this.awardEmoji == null)?"<null>":this.awardEmoji));
        sb.append(',');
        sb.append("project");
        sb.append('=');
        sb.append(((this.project == null)?"<null>":this.project));
        sb.append(',');
        sb.append("closedAsDuplicateOf");
        sb.append('=');
        sb.append(((this.closedAsDuplicateOf == null)?"<null>":this.closedAsDuplicateOf));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
