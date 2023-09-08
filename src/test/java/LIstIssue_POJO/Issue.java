package LIstIssue_POJO;


import java.util.List;

public class Issue {


    private Integer id;
    private Integer iid;
    private Integer projectId;
    private String title;
    private String description;
    private String state;
    private String createdAt;
    private String updatedAt;
    private Object closedAt;
    private Object closedBy;
    private List<String> labels;
    private Milestone milestone;
    private List<Assignee> assignees;
    private Author author;
    private String type;
    private Assignee__1 assignee;
    private Integer userNotesCount;
    private Integer mergeRequestsCount;
    private Integer upvotes;
    private Integer downvotes;
    private String dueDate;
    private Boolean confidential;
    private Object discussionLocked;
    private String issueType;
    private String webUrl;
    private TimeStats timeStats;
    private TaskCompletionStatus taskCompletionStatus;
    private Integer weight;
    private Integer blockingIssuesCount;
    private Boolean hasTasks;
    private String taskStatus;
    private Links links;
    private References references;
    private String severity;
    private Object movedToId;
    private Object serviceDeskReplyTo;
    private Object epicIid;
    private Object epic;
    private Object iteration;
    private Object healthStatus;

    /**
     * No args constructor for use in serialization
     *
     */
    public Issue() {
    }

    /**
     *
     * @param closedBy
     * @param upvotes
     * @param references
     * @param iid
     * @param dueDate
     * @param description
     * @param assignees
     * @param userNotesCount
     * @param title
     * @param type
     * @param createdAt
     * @param timeStats
     * @param taskCompletionStatus
     * @param hasTasks
     * @param epicIid
     * @param iteration
     * @param links
     * @param id
     * @param state
     * @param blockingIssuesCount
     * @param closedAt
     * @param taskStatus
     * @param updatedAt
     * @param mergeRequestsCount
     * @param confidential
     * @param discussionLocked
     * @param serviceDeskReplyTo
     * @param severity
     * @param author
     * @param weight
     * @param epic
     * @param downvotes
     * @param movedToId
     * @param labels
     * @param issueType
     * @param milestone
     * @param healthStatus
     * @param webUrl
     * @param assignee
     * @param projectId
     */
    public Issue(Integer id, Integer iid, Integer projectId, String title, String description, String state, String createdAt, String updatedAt, Object closedAt, Object closedBy, List<String> labels, Milestone milestone, List<Assignee> assignees, Author author, String type, Assignee__1 assignee, Integer userNotesCount, Integer mergeRequestsCount, Integer upvotes, Integer downvotes, String dueDate, Boolean confidential, Object discussionLocked, String issueType, String webUrl, TimeStats timeStats, TaskCompletionStatus taskCompletionStatus, Integer weight, Integer blockingIssuesCount, Boolean hasTasks, String taskStatus, Links links, References references, String severity, Object movedToId, Object serviceDeskReplyTo, Object epicIid, Object epic, Object iteration, Object healthStatus) {
        super();
        this.id = id;
        this.iid = iid;
        this.projectId = projectId;
        this.title = title;
        this.description = description;
        this.state = state;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.closedAt = closedAt;
        this.closedBy = closedBy;
        this.labels = labels;
        this.milestone = milestone;
        this.assignees = assignees;
        this.author = author;
        this.type = type;
        this.assignee = assignee;
        this.userNotesCount = userNotesCount;
        this.mergeRequestsCount = mergeRequestsCount;
        this.upvotes = upvotes;
        this.downvotes = downvotes;
        this.dueDate = dueDate;
        this.confidential = confidential;
        this.discussionLocked = discussionLocked;
        this.issueType = issueType;
        this.webUrl = webUrl;
        this.timeStats = timeStats;
        this.taskCompletionStatus = taskCompletionStatus;
        this.weight = weight;
        this.blockingIssuesCount = blockingIssuesCount;
        this.hasTasks = hasTasks;
        this.taskStatus = taskStatus;
        this.links = links;
        this.references = references;
        this.severity = severity;
        this.movedToId = movedToId;
        this.serviceDeskReplyTo = serviceDeskReplyTo;
        this.epicIid = epicIid;
        this.epic = epic;
        this.iteration = iteration;
        this.healthStatus = healthStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Object closedAt) {
        this.closedAt = closedAt;
    }

    public Object getClosedBy() {
        return closedBy;
    }

    public void setClosedBy(Object closedBy) {
        this.closedBy = closedBy;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public Milestone getMilestone() {
        return milestone;
    }

    public void setMilestone(Milestone milestone) {
        this.milestone = milestone;
    }

    public List<Assignee> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<Assignee> assignees) {
        this.assignees = assignees;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Assignee__1 getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee__1 assignee) {
        this.assignee = assignee;
    }

    public Integer getUserNotesCount() {
        return userNotesCount;
    }

    public void setUserNotesCount(Integer userNotesCount) {
        this.userNotesCount = userNotesCount;
    }

    public Integer getMergeRequestsCount() {
        return mergeRequestsCount;
    }

    public void setMergeRequestsCount(Integer mergeRequestsCount) {
        this.mergeRequestsCount = mergeRequestsCount;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(Integer upvotes) {
        this.upvotes = upvotes;
    }

    public Integer getDownvotes() {
        return downvotes;
    }

    public void setDownvotes(Integer downvotes) {
        this.downvotes = downvotes;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public Boolean getConfidential() {
        return confidential;
    }

    public void setConfidential(Boolean confidential) {
        this.confidential = confidential;
    }

    public Object getDiscussionLocked() {
        return discussionLocked;
    }

    public void setDiscussionLocked(Object discussionLocked) {
        this.discussionLocked = discussionLocked;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public TimeStats getTimeStats() {
        return timeStats;
    }

    public void setTimeStats(TimeStats timeStats) {
        this.timeStats = timeStats;
    }

    public TaskCompletionStatus getTaskCompletionStatus() {
        return taskCompletionStatus;
    }

    public void setTaskCompletionStatus(TaskCompletionStatus taskCompletionStatus) {
        this.taskCompletionStatus = taskCompletionStatus;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getBlockingIssuesCount() {
        return blockingIssuesCount;
    }

    public void setBlockingIssuesCount(Integer blockingIssuesCount) {
        this.blockingIssuesCount = blockingIssuesCount;
    }

    public Boolean getHasTasks() {
        return hasTasks;
    }

    public void setHasTasks(Boolean hasTasks) {
        this.hasTasks = hasTasks;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public References getReferences() {
        return references;
    }

    public void setReferences(References references) {
        this.references = references;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Object getMovedToId() {
        return movedToId;
    }

    public void setMovedToId(Object movedToId) {
        this.movedToId = movedToId;
    }

    public Object getServiceDeskReplyTo() {
        return serviceDeskReplyTo;
    }

    public void setServiceDeskReplyTo(Object serviceDeskReplyTo) {
        this.serviceDeskReplyTo = serviceDeskReplyTo;
    }

    public Object getEpicIid() {
        return epicIid;
    }

    public void setEpicIid(Object epicIid) {
        this.epicIid = epicIid;
    }

    public Object getEpic() {
        return epic;
    }

    public void setEpic(Object epic) {
        this.epic = epic;
    }

    public Object getIteration() {
        return iteration;
    }

    public void setIteration(Object iteration) {
        this.iteration = iteration;
    }

    public Object getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(Object healthStatus) {
        this.healthStatus = healthStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Issue.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("iid");
        sb.append('=');
        sb.append(((this.iid == null)?"<null>":this.iid));
        sb.append(',');
        sb.append("projectId");
        sb.append('=');
        sb.append(((this.projectId == null)?"<null>":this.projectId));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("closedAt");
        sb.append('=');
        sb.append(((this.closedAt == null)?"<null>":this.closedAt));
        sb.append(',');
        sb.append("closedBy");
        sb.append('=');
        sb.append(((this.closedBy == null)?"<null>":this.closedBy));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null)?"<null>":this.labels));
        sb.append(',');
        sb.append("milestone");
        sb.append('=');
        sb.append(((this.milestone == null)?"<null>":this.milestone));
        sb.append(',');
        sb.append("assignees");
        sb.append('=');
        sb.append(((this.assignees == null)?"<null>":this.assignees));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("assignee");
        sb.append('=');
        sb.append(((this.assignee == null)?"<null>":this.assignee));
        sb.append(',');
        sb.append("userNotesCount");
        sb.append('=');
        sb.append(((this.userNotesCount == null)?"<null>":this.userNotesCount));
        sb.append(',');
        sb.append("mergeRequestsCount");
        sb.append('=');
        sb.append(((this.mergeRequestsCount == null)?"<null>":this.mergeRequestsCount));
        sb.append(',');
        sb.append("upvotes");
        sb.append('=');
        sb.append(((this.upvotes == null)?"<null>":this.upvotes));
        sb.append(',');
        sb.append("downvotes");
        sb.append('=');
        sb.append(((this.downvotes == null)?"<null>":this.downvotes));
        sb.append(',');
        sb.append("dueDate");
        sb.append('=');
        sb.append(((this.dueDate == null)?"<null>":this.dueDate));
        sb.append(',');
        sb.append("confidential");
        sb.append('=');
        sb.append(((this.confidential == null)?"<null>":this.confidential));
        sb.append(',');
        sb.append("discussionLocked");
        sb.append('=');
        sb.append(((this.discussionLocked == null)?"<null>":this.discussionLocked));
        sb.append(',');
        sb.append("issueType");
        sb.append('=');
        sb.append(((this.issueType == null)?"<null>":this.issueType));
        sb.append(',');
        sb.append("webUrl");
        sb.append('=');
        sb.append(((this.webUrl == null)?"<null>":this.webUrl));
        sb.append(',');
        sb.append("timeStats");
        sb.append('=');
        sb.append(((this.timeStats == null)?"<null>":this.timeStats));
        sb.append(',');
        sb.append("taskCompletionStatus");
        sb.append('=');
        sb.append(((this.taskCompletionStatus == null)?"<null>":this.taskCompletionStatus));
        sb.append(',');
        sb.append("weight");
        sb.append('=');
        sb.append(((this.weight == null)?"<null>":this.weight));
        sb.append(',');
        sb.append("blockingIssuesCount");
        sb.append('=');
        sb.append(((this.blockingIssuesCount == null)?"<null>":this.blockingIssuesCount));
        sb.append(',');
        sb.append("hasTasks");
        sb.append('=');
        sb.append(((this.hasTasks == null)?"<null>":this.hasTasks));
        sb.append(',');
        sb.append("taskStatus");
        sb.append('=');
        sb.append(((this.taskStatus == null)?"<null>":this.taskStatus));
        sb.append(',');
        sb.append("links");
        sb.append('=');
        sb.append(((this.links == null)?"<null>":this.links));
        sb.append(',');
        sb.append("references");
        sb.append('=');
        sb.append(((this.references == null)?"<null>":this.references));
        sb.append(',');
        sb.append("severity");
        sb.append('=');
        sb.append(((this.severity == null)?"<null>":this.severity));
        sb.append(',');
        sb.append("movedToId");
        sb.append('=');
        sb.append(((this.movedToId == null)?"<null>":this.movedToId));
        sb.append(',');
        sb.append("serviceDeskReplyTo");
        sb.append('=');
        sb.append(((this.serviceDeskReplyTo == null)?"<null>":this.serviceDeskReplyTo));
        sb.append(',');
        sb.append("epicIid");
        sb.append('=');
        sb.append(((this.epicIid == null)?"<null>":this.epicIid));
        sb.append(',');
        sb.append("epic");
        sb.append('=');
        sb.append(((this.epic == null)?"<null>":this.epic));
        sb.append(',');
        sb.append("iteration");
        sb.append('=');
        sb.append(((this.iteration == null)?"<null>":this.iteration));
        sb.append(',');
        sb.append("healthStatus");
        sb.append('=');
        sb.append(((this.healthStatus == null)?"<null>":this.healthStatus));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
