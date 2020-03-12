package com.gamc.efactory.model.dataObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author lizeh
*/
public class SimpleApplicationObject implements Serializable {

    private static final long serialVersionUID = 1583827148085L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long simpleApplicationObjectId;

    /**
    * 
    * isNullAble:1
    */
    private String processName;

    /**
    * 
    * isNullAble:1
    */
    private String processDefId;

    /**
    * 
    * isNullAble:1
    */
    private String processInstId;

    /**
    * 
    * isNullAble:1
    */
    private String taskId;

    /**
    * 
    * isNullAble:1
    */
    private String taskName;

    /**
    * 
    * isNullAble:1
    */
    private Integer assigneeId;

    /**
    * 
    * isNullAble:1
    */
    private String assigneeName;

    /**
    * 
    * isNullAble:1
    */
    private Integer userId;

    /**
    * 
    * isNullAble:1
    */
    private String userName;

    /**
    * 
    * isNullAble:1
    */
    private Integer applierUserId;

    /**
    * 
    * isNullAble:1
    */
    private String applierUserName;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime applyTime;

    /**
    * 
    * isNullAble:1
    */
    private String formName;

    /**
    * 
    * isNullAble:1
    */
    private Long formId;

    /**
    * 
    * isNullAble:1
    */
    private String simpleReason;

    /**
    * 
    * isNullAble:1
    */
    private String link;

    /**
    * 
    * isNullAble:1
    */
    private String auditorComment;

    /**
    * 
    * isNullAble:1
    */
    private String variables;

    /**
    * 
    * isNullAble:1
    */
    private String processInstTitle;

    /**
    * 
    * isNullAble:1
    */
    private String tbd5;

    /**
    * 
    * isNullAble:1
    */
    private String mobileLink;

    /**
    * 
    * isNullAble:1
    */
    private String formDataUrl;

    /**
    * 
    * isNullAble:1
    */
    private String formData;


    public void setSimpleApplicationObjectId(Long simpleApplicationObjectId){this.simpleApplicationObjectId = simpleApplicationObjectId;}

    public Long getSimpleApplicationObjectId(){return this.simpleApplicationObjectId;}

    public void setProcessName(String processName){this.processName = processName;}

    public String getProcessName(){return this.processName;}

    public void setProcessDefId(String processDefId){this.processDefId = processDefId;}

    public String getProcessDefId(){return this.processDefId;}

    public void setProcessInstId(String processInstId){this.processInstId = processInstId;}

    public String getProcessInstId(){return this.processInstId;}

    public void setTaskId(String taskId){this.taskId = taskId;}

    public String getTaskId(){return this.taskId;}

    public void setTaskName(String taskName){this.taskName = taskName;}

    public String getTaskName(){return this.taskName;}

    public void setAssigneeId(Integer assigneeId){this.assigneeId = assigneeId;}

    public Integer getAssigneeId(){return this.assigneeId;}

    public void setAssigneeName(String assigneeName){this.assigneeName = assigneeName;}

    public String getAssigneeName(){return this.assigneeName;}

    public void setUserId(Integer userId){this.userId = userId;}

    public Integer getUserId(){return this.userId;}

    public void setUserName(String userName){this.userName = userName;}

    public String getUserName(){return this.userName;}

    public void setApplierUserId(Integer applierUserId){this.applierUserId = applierUserId;}

    public Integer getApplierUserId(){return this.applierUserId;}

    public void setApplierUserName(String applierUserName){this.applierUserName = applierUserName;}

    public String getApplierUserName(){return this.applierUserName;}

    public void setApplyTime(java.time.LocalDateTime applyTime){this.applyTime = applyTime;}

    public java.time.LocalDateTime getApplyTime(){return this.applyTime;}

    public void setFormName(String formName){this.formName = formName;}

    public String getFormName(){return this.formName;}

    public void setFormId(Long formId){this.formId = formId;}

    public Long getFormId(){return this.formId;}

    public void setSimpleReason(String simpleReason){this.simpleReason = simpleReason;}

    public String getSimpleReason(){return this.simpleReason;}

    public void setLink(String link){this.link = link;}

    public String getLink(){return this.link;}

    public void setAuditorComment(String auditorComment){this.auditorComment = auditorComment;}

    public String getAuditorComment(){return this.auditorComment;}

    public void setVariables(String variables){this.variables = variables;}

    public String getVariables(){return this.variables;}

    public void setProcessInstTitle(String processInstTitle){this.processInstTitle = processInstTitle;}

    public String getProcessInstTitle(){return this.processInstTitle;}

    public void setTbd5(String tbd5){this.tbd5 = tbd5;}

    public String getTbd5(){return this.tbd5;}

    public void setMobileLink(String mobileLink){this.mobileLink = mobileLink;}

    public String getMobileLink(){return this.mobileLink;}

    public void setFormDataUrl(String formDataUrl){this.formDataUrl = formDataUrl;}

    public String getFormDataUrl(){return this.formDataUrl;}

    public void setFormData(String formData){this.formData = formData;}

    public String getFormData(){return this.formData;}
    @Override
    public String toString() {
        return "SimpleApplicationObject{" +
                "simpleApplicationObjectId='" + simpleApplicationObjectId + '\'' +
                "processName='" + processName + '\'' +
                "processDefId='" + processDefId + '\'' +
                "processInstId='" + processInstId + '\'' +
                "taskId='" + taskId + '\'' +
                "taskName='" + taskName + '\'' +
                "assigneeId='" + assigneeId + '\'' +
                "assigneeName='" + assigneeName + '\'' +
                "userId='" + userId + '\'' +
                "userName='" + userName + '\'' +
                "applierUserId='" + applierUserId + '\'' +
                "applierUserName='" + applierUserName + '\'' +
                "applyTime='" + applyTime + '\'' +
                "formName='" + formName + '\'' +
                "formId='" + formId + '\'' +
                "simpleReason='" + simpleReason + '\'' +
                "link='" + link + '\'' +
                "auditorComment='" + auditorComment + '\'' +
                "variables='" + variables + '\'' +
                "processInstTitle='" + processInstTitle + '\'' +
                "tbd5='" + tbd5 + '\'' +
                "mobileLink='" + mobileLink + '\'' +
                "formDataUrl='" + formDataUrl + '\'' +
                "formData='" + formData + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private SimpleApplicationObject set;

        private ConditionBuilder where;

        public UpdateBuilder set(SimpleApplicationObject set){
            this.set = set;
            return this;
        }

        public SimpleApplicationObject getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends SimpleApplicationObject{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Long> simpleApplicationObjectIdList;

        public List<Long> getSimpleApplicationObjectIdList(){return this.simpleApplicationObjectIdList;}

        private Long simpleApplicationObjectIdSt;

        private Long simpleApplicationObjectIdEd;

        public Long getSimpleApplicationObjectIdSt(){return this.simpleApplicationObjectIdSt;}

        public Long getSimpleApplicationObjectIdEd(){return this.simpleApplicationObjectIdEd;}

        private List<String> processNameList;

        public List<String> getProcessNameList(){return this.processNameList;}


        private List<String> fuzzyProcessName;

        public List<String> getFuzzyProcessName(){return this.fuzzyProcessName;}

        private List<String> rightFuzzyProcessName;

        public List<String> getRightFuzzyProcessName(){return this.rightFuzzyProcessName;}
        private List<String> processDefIdList;

        public List<String> getProcessDefIdList(){return this.processDefIdList;}


        private List<String> fuzzyProcessDefId;

        public List<String> getFuzzyProcessDefId(){return this.fuzzyProcessDefId;}

        private List<String> rightFuzzyProcessDefId;

        public List<String> getRightFuzzyProcessDefId(){return this.rightFuzzyProcessDefId;}
        private List<String> processInstIdList;

        public List<String> getProcessInstIdList(){return this.processInstIdList;}


        private List<String> fuzzyProcessInstId;

        public List<String> getFuzzyProcessInstId(){return this.fuzzyProcessInstId;}

        private List<String> rightFuzzyProcessInstId;

        public List<String> getRightFuzzyProcessInstId(){return this.rightFuzzyProcessInstId;}
        private List<String> taskIdList;

        public List<String> getTaskIdList(){return this.taskIdList;}


        private List<String> fuzzyTaskId;

        public List<String> getFuzzyTaskId(){return this.fuzzyTaskId;}

        private List<String> rightFuzzyTaskId;

        public List<String> getRightFuzzyTaskId(){return this.rightFuzzyTaskId;}
        private List<String> taskNameList;

        public List<String> getTaskNameList(){return this.taskNameList;}


        private List<String> fuzzyTaskName;

        public List<String> getFuzzyTaskName(){return this.fuzzyTaskName;}

        private List<String> rightFuzzyTaskName;

        public List<String> getRightFuzzyTaskName(){return this.rightFuzzyTaskName;}
        private List<Integer> assigneeIdList;

        public List<Integer> getAssigneeIdList(){return this.assigneeIdList;}

        private Integer assigneeIdSt;

        private Integer assigneeIdEd;

        public Integer getAssigneeIdSt(){return this.assigneeIdSt;}

        public Integer getAssigneeIdEd(){return this.assigneeIdEd;}

        private List<String> assigneeNameList;

        public List<String> getAssigneeNameList(){return this.assigneeNameList;}


        private List<String> fuzzyAssigneeName;

        public List<String> getFuzzyAssigneeName(){return this.fuzzyAssigneeName;}

        private List<String> rightFuzzyAssigneeName;

        public List<String> getRightFuzzyAssigneeName(){return this.rightFuzzyAssigneeName;}
        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<String> userNameList;

        public List<String> getUserNameList(){return this.userNameList;}


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName(){return this.fuzzyUserName;}

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName(){return this.rightFuzzyUserName;}
        private List<Integer> applierUserIdList;

        public List<Integer> getApplierUserIdList(){return this.applierUserIdList;}

        private Integer applierUserIdSt;

        private Integer applierUserIdEd;

        public Integer getApplierUserIdSt(){return this.applierUserIdSt;}

        public Integer getApplierUserIdEd(){return this.applierUserIdEd;}

        private List<String> applierUserNameList;

        public List<String> getApplierUserNameList(){return this.applierUserNameList;}


        private List<String> fuzzyApplierUserName;

        public List<String> getFuzzyApplierUserName(){return this.fuzzyApplierUserName;}

        private List<String> rightFuzzyApplierUserName;

        public List<String> getRightFuzzyApplierUserName(){return this.rightFuzzyApplierUserName;}
        private List<java.time.LocalDateTime> applyTimeList;

        public List<java.time.LocalDateTime> getApplyTimeList(){return this.applyTimeList;}

        private java.time.LocalDateTime applyTimeSt;

        private java.time.LocalDateTime applyTimeEd;

        public java.time.LocalDateTime getApplyTimeSt(){return this.applyTimeSt;}

        public java.time.LocalDateTime getApplyTimeEd(){return this.applyTimeEd;}

        private List<String> formNameList;

        public List<String> getFormNameList(){return this.formNameList;}


        private List<String> fuzzyFormName;

        public List<String> getFuzzyFormName(){return this.fuzzyFormName;}

        private List<String> rightFuzzyFormName;

        public List<String> getRightFuzzyFormName(){return this.rightFuzzyFormName;}
        private List<Long> formIdList;

        public List<Long> getFormIdList(){return this.formIdList;}

        private Long formIdSt;

        private Long formIdEd;

        public Long getFormIdSt(){return this.formIdSt;}

        public Long getFormIdEd(){return this.formIdEd;}

        private List<String> simpleReasonList;

        public List<String> getSimpleReasonList(){return this.simpleReasonList;}


        private List<String> fuzzySimpleReason;

        public List<String> getFuzzySimpleReason(){return this.fuzzySimpleReason;}

        private List<String> rightFuzzySimpleReason;

        public List<String> getRightFuzzySimpleReason(){return this.rightFuzzySimpleReason;}
        private List<String> linkList;

        public List<String> getLinkList(){return this.linkList;}


        private List<String> fuzzyLink;

        public List<String> getFuzzyLink(){return this.fuzzyLink;}

        private List<String> rightFuzzyLink;

        public List<String> getRightFuzzyLink(){return this.rightFuzzyLink;}
        private List<String> auditorCommentList;

        public List<String> getAuditorCommentList(){return this.auditorCommentList;}


        private List<String> fuzzyAuditorComment;

        public List<String> getFuzzyAuditorComment(){return this.fuzzyAuditorComment;}

        private List<String> rightFuzzyAuditorComment;

        public List<String> getRightFuzzyAuditorComment(){return this.rightFuzzyAuditorComment;}
        private List<String> variablesList;

        public List<String> getVariablesList(){return this.variablesList;}


        private List<String> fuzzyVariables;

        public List<String> getFuzzyVariables(){return this.fuzzyVariables;}

        private List<String> rightFuzzyVariables;

        public List<String> getRightFuzzyVariables(){return this.rightFuzzyVariables;}
        private List<String> processInstTitleList;

        public List<String> getProcessInstTitleList(){return this.processInstTitleList;}


        private List<String> fuzzyProcessInstTitle;

        public List<String> getFuzzyProcessInstTitle(){return this.fuzzyProcessInstTitle;}

        private List<String> rightFuzzyProcessInstTitle;

        public List<String> getRightFuzzyProcessInstTitle(){return this.rightFuzzyProcessInstTitle;}
        private List<String> tbd5List;

        public List<String> getTbd5List(){return this.tbd5List;}


        private List<String> fuzzyTbd5;

        public List<String> getFuzzyTbd5(){return this.fuzzyTbd5;}

        private List<String> rightFuzzyTbd5;

        public List<String> getRightFuzzyTbd5(){return this.rightFuzzyTbd5;}
        private List<String> mobileLinkList;

        public List<String> getMobileLinkList(){return this.mobileLinkList;}


        private List<String> fuzzyMobileLink;

        public List<String> getFuzzyMobileLink(){return this.fuzzyMobileLink;}

        private List<String> rightFuzzyMobileLink;

        public List<String> getRightFuzzyMobileLink(){return this.rightFuzzyMobileLink;}
        private List<String> formDataUrlList;

        public List<String> getFormDataUrlList(){return this.formDataUrlList;}


        private List<String> fuzzyFormDataUrl;

        public List<String> getFuzzyFormDataUrl(){return this.fuzzyFormDataUrl;}

        private List<String> rightFuzzyFormDataUrl;

        public List<String> getRightFuzzyFormDataUrl(){return this.rightFuzzyFormDataUrl;}
        private List<String> formDataList;

        public List<String> getFormDataList(){return this.formDataList;}


        private List<String> fuzzyFormData;

        public List<String> getFuzzyFormData(){return this.fuzzyFormData;}

        private List<String> rightFuzzyFormData;

        public List<String> getRightFuzzyFormData(){return this.rightFuzzyFormData;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder simpleApplicationObjectIdBetWeen(Long simpleApplicationObjectIdSt,Long simpleApplicationObjectIdEd){
            this.simpleApplicationObjectIdSt = simpleApplicationObjectIdSt;
            this.simpleApplicationObjectIdEd = simpleApplicationObjectIdEd;
            return this;
        }

        public QueryBuilder simpleApplicationObjectIdGreaterEqThan(Long simpleApplicationObjectIdSt){
            this.simpleApplicationObjectIdSt = simpleApplicationObjectIdSt;
            return this;
        }
        public QueryBuilder simpleApplicationObjectIdLessEqThan(Long simpleApplicationObjectIdEd){
            this.simpleApplicationObjectIdEd = simpleApplicationObjectIdEd;
            return this;
        }


        public QueryBuilder simpleApplicationObjectId(Long simpleApplicationObjectId){
            setSimpleApplicationObjectId(simpleApplicationObjectId);
            return this;
        }

        public QueryBuilder simpleApplicationObjectIdList(Long ... simpleApplicationObjectId){
            this.simpleApplicationObjectIdList = solveNullList(simpleApplicationObjectId);
            return this;
        }

        public QueryBuilder simpleApplicationObjectIdList(List<Long> simpleApplicationObjectId){
            this.simpleApplicationObjectIdList = simpleApplicationObjectId;
            return this;
        }

        public QueryBuilder fetchSimpleApplicationObjectId(){
            setFetchFields("fetchFields","simpleApplicationObjectId");
            return this;
        }

        public QueryBuilder excludeSimpleApplicationObjectId(){
            setFetchFields("excludeFields","simpleApplicationObjectId");
            return this;
        }

        public QueryBuilder fuzzyProcessName (List<String> fuzzyProcessName){
            this.fuzzyProcessName = fuzzyProcessName;
            return this;
        }

        public QueryBuilder fuzzyProcessName (String ... fuzzyProcessName){
            this.fuzzyProcessName = solveNullList(fuzzyProcessName);
            return this;
        }

        public QueryBuilder rightFuzzyProcessName (List<String> rightFuzzyProcessName){
            this.rightFuzzyProcessName = rightFuzzyProcessName;
            return this;
        }

        public QueryBuilder rightFuzzyProcessName (String ... rightFuzzyProcessName){
            this.rightFuzzyProcessName = solveNullList(rightFuzzyProcessName);
            return this;
        }

        public QueryBuilder processName(String processName){
            setProcessName(processName);
            return this;
        }

        public QueryBuilder processNameList(String ... processName){
            this.processNameList = solveNullList(processName);
            return this;
        }

        public QueryBuilder processNameList(List<String> processName){
            this.processNameList = processName;
            return this;
        }

        public QueryBuilder fetchProcessName(){
            setFetchFields("fetchFields","processName");
            return this;
        }

        public QueryBuilder excludeProcessName(){
            setFetchFields("excludeFields","processName");
            return this;
        }

        public QueryBuilder fuzzyProcessDefId (List<String> fuzzyProcessDefId){
            this.fuzzyProcessDefId = fuzzyProcessDefId;
            return this;
        }

        public QueryBuilder fuzzyProcessDefId (String ... fuzzyProcessDefId){
            this.fuzzyProcessDefId = solveNullList(fuzzyProcessDefId);
            return this;
        }

        public QueryBuilder rightFuzzyProcessDefId (List<String> rightFuzzyProcessDefId){
            this.rightFuzzyProcessDefId = rightFuzzyProcessDefId;
            return this;
        }

        public QueryBuilder rightFuzzyProcessDefId (String ... rightFuzzyProcessDefId){
            this.rightFuzzyProcessDefId = solveNullList(rightFuzzyProcessDefId);
            return this;
        }

        public QueryBuilder processDefId(String processDefId){
            setProcessDefId(processDefId);
            return this;
        }

        public QueryBuilder processDefIdList(String ... processDefId){
            this.processDefIdList = solveNullList(processDefId);
            return this;
        }

        public QueryBuilder processDefIdList(List<String> processDefId){
            this.processDefIdList = processDefId;
            return this;
        }

        public QueryBuilder fetchProcessDefId(){
            setFetchFields("fetchFields","processDefId");
            return this;
        }

        public QueryBuilder excludeProcessDefId(){
            setFetchFields("excludeFields","processDefId");
            return this;
        }

        public QueryBuilder fuzzyProcessInstId (List<String> fuzzyProcessInstId){
            this.fuzzyProcessInstId = fuzzyProcessInstId;
            return this;
        }

        public QueryBuilder fuzzyProcessInstId (String ... fuzzyProcessInstId){
            this.fuzzyProcessInstId = solveNullList(fuzzyProcessInstId);
            return this;
        }

        public QueryBuilder rightFuzzyProcessInstId (List<String> rightFuzzyProcessInstId){
            this.rightFuzzyProcessInstId = rightFuzzyProcessInstId;
            return this;
        }

        public QueryBuilder rightFuzzyProcessInstId (String ... rightFuzzyProcessInstId){
            this.rightFuzzyProcessInstId = solveNullList(rightFuzzyProcessInstId);
            return this;
        }

        public QueryBuilder processInstId(String processInstId){
            setProcessInstId(processInstId);
            return this;
        }

        public QueryBuilder processInstIdList(String ... processInstId){
            this.processInstIdList = solveNullList(processInstId);
            return this;
        }

        public QueryBuilder processInstIdList(List<String> processInstId){
            this.processInstIdList = processInstId;
            return this;
        }

        public QueryBuilder fetchProcessInstId(){
            setFetchFields("fetchFields","processInstId");
            return this;
        }

        public QueryBuilder excludeProcessInstId(){
            setFetchFields("excludeFields","processInstId");
            return this;
        }

        public QueryBuilder fuzzyTaskId (List<String> fuzzyTaskId){
            this.fuzzyTaskId = fuzzyTaskId;
            return this;
        }

        public QueryBuilder fuzzyTaskId (String ... fuzzyTaskId){
            this.fuzzyTaskId = solveNullList(fuzzyTaskId);
            return this;
        }

        public QueryBuilder rightFuzzyTaskId (List<String> rightFuzzyTaskId){
            this.rightFuzzyTaskId = rightFuzzyTaskId;
            return this;
        }

        public QueryBuilder rightFuzzyTaskId (String ... rightFuzzyTaskId){
            this.rightFuzzyTaskId = solveNullList(rightFuzzyTaskId);
            return this;
        }

        public QueryBuilder taskId(String taskId){
            setTaskId(taskId);
            return this;
        }

        public QueryBuilder taskIdList(String ... taskId){
            this.taskIdList = solveNullList(taskId);
            return this;
        }

        public QueryBuilder taskIdList(List<String> taskId){
            this.taskIdList = taskId;
            return this;
        }

        public QueryBuilder fetchTaskId(){
            setFetchFields("fetchFields","taskId");
            return this;
        }

        public QueryBuilder excludeTaskId(){
            setFetchFields("excludeFields","taskId");
            return this;
        }

        public QueryBuilder fuzzyTaskName (List<String> fuzzyTaskName){
            this.fuzzyTaskName = fuzzyTaskName;
            return this;
        }

        public QueryBuilder fuzzyTaskName (String ... fuzzyTaskName){
            this.fuzzyTaskName = solveNullList(fuzzyTaskName);
            return this;
        }

        public QueryBuilder rightFuzzyTaskName (List<String> rightFuzzyTaskName){
            this.rightFuzzyTaskName = rightFuzzyTaskName;
            return this;
        }

        public QueryBuilder rightFuzzyTaskName (String ... rightFuzzyTaskName){
            this.rightFuzzyTaskName = solveNullList(rightFuzzyTaskName);
            return this;
        }

        public QueryBuilder taskName(String taskName){
            setTaskName(taskName);
            return this;
        }

        public QueryBuilder taskNameList(String ... taskName){
            this.taskNameList = solveNullList(taskName);
            return this;
        }

        public QueryBuilder taskNameList(List<String> taskName){
            this.taskNameList = taskName;
            return this;
        }

        public QueryBuilder fetchTaskName(){
            setFetchFields("fetchFields","taskName");
            return this;
        }

        public QueryBuilder excludeTaskName(){
            setFetchFields("excludeFields","taskName");
            return this;
        }

        public QueryBuilder assigneeIdBetWeen(Integer assigneeIdSt,Integer assigneeIdEd){
            this.assigneeIdSt = assigneeIdSt;
            this.assigneeIdEd = assigneeIdEd;
            return this;
        }

        public QueryBuilder assigneeIdGreaterEqThan(Integer assigneeIdSt){
            this.assigneeIdSt = assigneeIdSt;
            return this;
        }
        public QueryBuilder assigneeIdLessEqThan(Integer assigneeIdEd){
            this.assigneeIdEd = assigneeIdEd;
            return this;
        }


        public QueryBuilder assigneeId(Integer assigneeId){
            setAssigneeId(assigneeId);
            return this;
        }

        public QueryBuilder assigneeIdList(Integer ... assigneeId){
            this.assigneeIdList = solveNullList(assigneeId);
            return this;
        }

        public QueryBuilder assigneeIdList(List<Integer> assigneeId){
            this.assigneeIdList = assigneeId;
            return this;
        }

        public QueryBuilder fetchAssigneeId(){
            setFetchFields("fetchFields","assigneeId");
            return this;
        }

        public QueryBuilder excludeAssigneeId(){
            setFetchFields("excludeFields","assigneeId");
            return this;
        }

        public QueryBuilder fuzzyAssigneeName (List<String> fuzzyAssigneeName){
            this.fuzzyAssigneeName = fuzzyAssigneeName;
            return this;
        }

        public QueryBuilder fuzzyAssigneeName (String ... fuzzyAssigneeName){
            this.fuzzyAssigneeName = solveNullList(fuzzyAssigneeName);
            return this;
        }

        public QueryBuilder rightFuzzyAssigneeName (List<String> rightFuzzyAssigneeName){
            this.rightFuzzyAssigneeName = rightFuzzyAssigneeName;
            return this;
        }

        public QueryBuilder rightFuzzyAssigneeName (String ... rightFuzzyAssigneeName){
            this.rightFuzzyAssigneeName = solveNullList(rightFuzzyAssigneeName);
            return this;
        }

        public QueryBuilder assigneeName(String assigneeName){
            setAssigneeName(assigneeName);
            return this;
        }

        public QueryBuilder assigneeNameList(String ... assigneeName){
            this.assigneeNameList = solveNullList(assigneeName);
            return this;
        }

        public QueryBuilder assigneeNameList(List<String> assigneeName){
            this.assigneeNameList = assigneeName;
            return this;
        }

        public QueryBuilder fetchAssigneeName(){
            setFetchFields("fetchFields","assigneeName");
            return this;
        }

        public QueryBuilder excludeAssigneeName(){
            setFetchFields("excludeFields","assigneeName");
            return this;
        }

        public QueryBuilder userIdBetWeen(Integer userIdSt,Integer userIdEd){
            this.userIdSt = userIdSt;
            this.userIdEd = userIdEd;
            return this;
        }

        public QueryBuilder userIdGreaterEqThan(Integer userIdSt){
            this.userIdSt = userIdSt;
            return this;
        }
        public QueryBuilder userIdLessEqThan(Integer userIdEd){
            this.userIdEd = userIdEd;
            return this;
        }


        public QueryBuilder userId(Integer userId){
            setUserId(userId);
            return this;
        }

        public QueryBuilder userIdList(Integer ... userId){
            this.userIdList = solveNullList(userId);
            return this;
        }

        public QueryBuilder userIdList(List<Integer> userId){
            this.userIdList = userId;
            return this;
        }

        public QueryBuilder fetchUserId(){
            setFetchFields("fetchFields","userId");
            return this;
        }

        public QueryBuilder excludeUserId(){
            setFetchFields("excludeFields","userId");
            return this;
        }

        public QueryBuilder fuzzyUserName (List<String> fuzzyUserName){
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public QueryBuilder fuzzyUserName (String ... fuzzyUserName){
            this.fuzzyUserName = solveNullList(fuzzyUserName);
            return this;
        }

        public QueryBuilder rightFuzzyUserName (List<String> rightFuzzyUserName){
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public QueryBuilder rightFuzzyUserName (String ... rightFuzzyUserName){
            this.rightFuzzyUserName = solveNullList(rightFuzzyUserName);
            return this;
        }

        public QueryBuilder userName(String userName){
            setUserName(userName);
            return this;
        }

        public QueryBuilder userNameList(String ... userName){
            this.userNameList = solveNullList(userName);
            return this;
        }

        public QueryBuilder userNameList(List<String> userName){
            this.userNameList = userName;
            return this;
        }

        public QueryBuilder fetchUserName(){
            setFetchFields("fetchFields","userName");
            return this;
        }

        public QueryBuilder excludeUserName(){
            setFetchFields("excludeFields","userName");
            return this;
        }

        public QueryBuilder applierUserIdBetWeen(Integer applierUserIdSt,Integer applierUserIdEd){
            this.applierUserIdSt = applierUserIdSt;
            this.applierUserIdEd = applierUserIdEd;
            return this;
        }

        public QueryBuilder applierUserIdGreaterEqThan(Integer applierUserIdSt){
            this.applierUserIdSt = applierUserIdSt;
            return this;
        }
        public QueryBuilder applierUserIdLessEqThan(Integer applierUserIdEd){
            this.applierUserIdEd = applierUserIdEd;
            return this;
        }


        public QueryBuilder applierUserId(Integer applierUserId){
            setApplierUserId(applierUserId);
            return this;
        }

        public QueryBuilder applierUserIdList(Integer ... applierUserId){
            this.applierUserIdList = solveNullList(applierUserId);
            return this;
        }

        public QueryBuilder applierUserIdList(List<Integer> applierUserId){
            this.applierUserIdList = applierUserId;
            return this;
        }

        public QueryBuilder fetchApplierUserId(){
            setFetchFields("fetchFields","applierUserId");
            return this;
        }

        public QueryBuilder excludeApplierUserId(){
            setFetchFields("excludeFields","applierUserId");
            return this;
        }

        public QueryBuilder fuzzyApplierUserName (List<String> fuzzyApplierUserName){
            this.fuzzyApplierUserName = fuzzyApplierUserName;
            return this;
        }

        public QueryBuilder fuzzyApplierUserName (String ... fuzzyApplierUserName){
            this.fuzzyApplierUserName = solveNullList(fuzzyApplierUserName);
            return this;
        }

        public QueryBuilder rightFuzzyApplierUserName (List<String> rightFuzzyApplierUserName){
            this.rightFuzzyApplierUserName = rightFuzzyApplierUserName;
            return this;
        }

        public QueryBuilder rightFuzzyApplierUserName (String ... rightFuzzyApplierUserName){
            this.rightFuzzyApplierUserName = solveNullList(rightFuzzyApplierUserName);
            return this;
        }

        public QueryBuilder applierUserName(String applierUserName){
            setApplierUserName(applierUserName);
            return this;
        }

        public QueryBuilder applierUserNameList(String ... applierUserName){
            this.applierUserNameList = solveNullList(applierUserName);
            return this;
        }

        public QueryBuilder applierUserNameList(List<String> applierUserName){
            this.applierUserNameList = applierUserName;
            return this;
        }

        public QueryBuilder fetchApplierUserName(){
            setFetchFields("fetchFields","applierUserName");
            return this;
        }

        public QueryBuilder excludeApplierUserName(){
            setFetchFields("excludeFields","applierUserName");
            return this;
        }

        public QueryBuilder applyTimeBetWeen(java.time.LocalDateTime applyTimeSt,java.time.LocalDateTime applyTimeEd){
            this.applyTimeSt = applyTimeSt;
            this.applyTimeEd = applyTimeEd;
            return this;
        }

        public QueryBuilder applyTimeGreaterEqThan(java.time.LocalDateTime applyTimeSt){
            this.applyTimeSt = applyTimeSt;
            return this;
        }
        public QueryBuilder applyTimeLessEqThan(java.time.LocalDateTime applyTimeEd){
            this.applyTimeEd = applyTimeEd;
            return this;
        }


        public QueryBuilder applyTime(java.time.LocalDateTime applyTime){
            setApplyTime(applyTime);
            return this;
        }

        public QueryBuilder applyTimeList(java.time.LocalDateTime ... applyTime){
            this.applyTimeList = solveNullList(applyTime);
            return this;
        }

        public QueryBuilder applyTimeList(List<java.time.LocalDateTime> applyTime){
            this.applyTimeList = applyTime;
            return this;
        }

        public QueryBuilder fetchApplyTime(){
            setFetchFields("fetchFields","applyTime");
            return this;
        }

        public QueryBuilder excludeApplyTime(){
            setFetchFields("excludeFields","applyTime");
            return this;
        }

        public QueryBuilder fuzzyFormName (List<String> fuzzyFormName){
            this.fuzzyFormName = fuzzyFormName;
            return this;
        }

        public QueryBuilder fuzzyFormName (String ... fuzzyFormName){
            this.fuzzyFormName = solveNullList(fuzzyFormName);
            return this;
        }

        public QueryBuilder rightFuzzyFormName (List<String> rightFuzzyFormName){
            this.rightFuzzyFormName = rightFuzzyFormName;
            return this;
        }

        public QueryBuilder rightFuzzyFormName (String ... rightFuzzyFormName){
            this.rightFuzzyFormName = solveNullList(rightFuzzyFormName);
            return this;
        }

        public QueryBuilder formName(String formName){
            setFormName(formName);
            return this;
        }

        public QueryBuilder formNameList(String ... formName){
            this.formNameList = solveNullList(formName);
            return this;
        }

        public QueryBuilder formNameList(List<String> formName){
            this.formNameList = formName;
            return this;
        }

        public QueryBuilder fetchFormName(){
            setFetchFields("fetchFields","formName");
            return this;
        }

        public QueryBuilder excludeFormName(){
            setFetchFields("excludeFields","formName");
            return this;
        }

        public QueryBuilder formIdBetWeen(Long formIdSt,Long formIdEd){
            this.formIdSt = formIdSt;
            this.formIdEd = formIdEd;
            return this;
        }

        public QueryBuilder formIdGreaterEqThan(Long formIdSt){
            this.formIdSt = formIdSt;
            return this;
        }
        public QueryBuilder formIdLessEqThan(Long formIdEd){
            this.formIdEd = formIdEd;
            return this;
        }


        public QueryBuilder formId(Long formId){
            setFormId(formId);
            return this;
        }

        public QueryBuilder formIdList(Long ... formId){
            this.formIdList = solveNullList(formId);
            return this;
        }

        public QueryBuilder formIdList(List<Long> formId){
            this.formIdList = formId;
            return this;
        }

        public QueryBuilder fetchFormId(){
            setFetchFields("fetchFields","formId");
            return this;
        }

        public QueryBuilder excludeFormId(){
            setFetchFields("excludeFields","formId");
            return this;
        }

        public QueryBuilder fuzzySimpleReason (List<String> fuzzySimpleReason){
            this.fuzzySimpleReason = fuzzySimpleReason;
            return this;
        }

        public QueryBuilder fuzzySimpleReason (String ... fuzzySimpleReason){
            this.fuzzySimpleReason = solveNullList(fuzzySimpleReason);
            return this;
        }

        public QueryBuilder rightFuzzySimpleReason (List<String> rightFuzzySimpleReason){
            this.rightFuzzySimpleReason = rightFuzzySimpleReason;
            return this;
        }

        public QueryBuilder rightFuzzySimpleReason (String ... rightFuzzySimpleReason){
            this.rightFuzzySimpleReason = solveNullList(rightFuzzySimpleReason);
            return this;
        }

        public QueryBuilder simpleReason(String simpleReason){
            setSimpleReason(simpleReason);
            return this;
        }

        public QueryBuilder simpleReasonList(String ... simpleReason){
            this.simpleReasonList = solveNullList(simpleReason);
            return this;
        }

        public QueryBuilder simpleReasonList(List<String> simpleReason){
            this.simpleReasonList = simpleReason;
            return this;
        }

        public QueryBuilder fetchSimpleReason(){
            setFetchFields("fetchFields","simpleReason");
            return this;
        }

        public QueryBuilder excludeSimpleReason(){
            setFetchFields("excludeFields","simpleReason");
            return this;
        }

        public QueryBuilder fuzzyLink (List<String> fuzzyLink){
            this.fuzzyLink = fuzzyLink;
            return this;
        }

        public QueryBuilder fuzzyLink (String ... fuzzyLink){
            this.fuzzyLink = solveNullList(fuzzyLink);
            return this;
        }

        public QueryBuilder rightFuzzyLink (List<String> rightFuzzyLink){
            this.rightFuzzyLink = rightFuzzyLink;
            return this;
        }

        public QueryBuilder rightFuzzyLink (String ... rightFuzzyLink){
            this.rightFuzzyLink = solveNullList(rightFuzzyLink);
            return this;
        }

        public QueryBuilder link(String link){
            setLink(link);
            return this;
        }

        public QueryBuilder linkList(String ... link){
            this.linkList = solveNullList(link);
            return this;
        }

        public QueryBuilder linkList(List<String> link){
            this.linkList = link;
            return this;
        }

        public QueryBuilder fetchLink(){
            setFetchFields("fetchFields","link");
            return this;
        }

        public QueryBuilder excludeLink(){
            setFetchFields("excludeFields","link");
            return this;
        }

        public QueryBuilder fuzzyAuditorComment (List<String> fuzzyAuditorComment){
            this.fuzzyAuditorComment = fuzzyAuditorComment;
            return this;
        }

        public QueryBuilder fuzzyAuditorComment (String ... fuzzyAuditorComment){
            this.fuzzyAuditorComment = solveNullList(fuzzyAuditorComment);
            return this;
        }

        public QueryBuilder rightFuzzyAuditorComment (List<String> rightFuzzyAuditorComment){
            this.rightFuzzyAuditorComment = rightFuzzyAuditorComment;
            return this;
        }

        public QueryBuilder rightFuzzyAuditorComment (String ... rightFuzzyAuditorComment){
            this.rightFuzzyAuditorComment = solveNullList(rightFuzzyAuditorComment);
            return this;
        }

        public QueryBuilder auditorComment(String auditorComment){
            setAuditorComment(auditorComment);
            return this;
        }

        public QueryBuilder auditorCommentList(String ... auditorComment){
            this.auditorCommentList = solveNullList(auditorComment);
            return this;
        }

        public QueryBuilder auditorCommentList(List<String> auditorComment){
            this.auditorCommentList = auditorComment;
            return this;
        }

        public QueryBuilder fetchAuditorComment(){
            setFetchFields("fetchFields","auditorComment");
            return this;
        }

        public QueryBuilder excludeAuditorComment(){
            setFetchFields("excludeFields","auditorComment");
            return this;
        }

        public QueryBuilder fuzzyVariables (List<String> fuzzyVariables){
            this.fuzzyVariables = fuzzyVariables;
            return this;
        }

        public QueryBuilder fuzzyVariables (String ... fuzzyVariables){
            this.fuzzyVariables = solveNullList(fuzzyVariables);
            return this;
        }

        public QueryBuilder rightFuzzyVariables (List<String> rightFuzzyVariables){
            this.rightFuzzyVariables = rightFuzzyVariables;
            return this;
        }

        public QueryBuilder rightFuzzyVariables (String ... rightFuzzyVariables){
            this.rightFuzzyVariables = solveNullList(rightFuzzyVariables);
            return this;
        }

        public QueryBuilder variables(String variables){
            setVariables(variables);
            return this;
        }

        public QueryBuilder variablesList(String ... variables){
            this.variablesList = solveNullList(variables);
            return this;
        }

        public QueryBuilder variablesList(List<String> variables){
            this.variablesList = variables;
            return this;
        }

        public QueryBuilder fetchVariables(){
            setFetchFields("fetchFields","variables");
            return this;
        }

        public QueryBuilder excludeVariables(){
            setFetchFields("excludeFields","variables");
            return this;
        }

        public QueryBuilder fuzzyProcessInstTitle (List<String> fuzzyProcessInstTitle){
            this.fuzzyProcessInstTitle = fuzzyProcessInstTitle;
            return this;
        }

        public QueryBuilder fuzzyProcessInstTitle (String ... fuzzyProcessInstTitle){
            this.fuzzyProcessInstTitle = solveNullList(fuzzyProcessInstTitle);
            return this;
        }

        public QueryBuilder rightFuzzyProcessInstTitle (List<String> rightFuzzyProcessInstTitle){
            this.rightFuzzyProcessInstTitle = rightFuzzyProcessInstTitle;
            return this;
        }

        public QueryBuilder rightFuzzyProcessInstTitle (String ... rightFuzzyProcessInstTitle){
            this.rightFuzzyProcessInstTitle = solveNullList(rightFuzzyProcessInstTitle);
            return this;
        }

        public QueryBuilder processInstTitle(String processInstTitle){
            setProcessInstTitle(processInstTitle);
            return this;
        }

        public QueryBuilder processInstTitleList(String ... processInstTitle){
            this.processInstTitleList = solveNullList(processInstTitle);
            return this;
        }

        public QueryBuilder processInstTitleList(List<String> processInstTitle){
            this.processInstTitleList = processInstTitle;
            return this;
        }

        public QueryBuilder fetchProcessInstTitle(){
            setFetchFields("fetchFields","processInstTitle");
            return this;
        }

        public QueryBuilder excludeProcessInstTitle(){
            setFetchFields("excludeFields","processInstTitle");
            return this;
        }

        public QueryBuilder fuzzyTbd5 (List<String> fuzzyTbd5){
            this.fuzzyTbd5 = fuzzyTbd5;
            return this;
        }

        public QueryBuilder fuzzyTbd5 (String ... fuzzyTbd5){
            this.fuzzyTbd5 = solveNullList(fuzzyTbd5);
            return this;
        }

        public QueryBuilder rightFuzzyTbd5 (List<String> rightFuzzyTbd5){
            this.rightFuzzyTbd5 = rightFuzzyTbd5;
            return this;
        }

        public QueryBuilder rightFuzzyTbd5 (String ... rightFuzzyTbd5){
            this.rightFuzzyTbd5 = solveNullList(rightFuzzyTbd5);
            return this;
        }

        public QueryBuilder tbd5(String tbd5){
            setTbd5(tbd5);
            return this;
        }

        public QueryBuilder tbd5List(String ... tbd5){
            this.tbd5List = solveNullList(tbd5);
            return this;
        }

        public QueryBuilder tbd5List(List<String> tbd5){
            this.tbd5List = tbd5;
            return this;
        }

        public QueryBuilder fetchTbd5(){
            setFetchFields("fetchFields","tbd5");
            return this;
        }

        public QueryBuilder excludeTbd5(){
            setFetchFields("excludeFields","tbd5");
            return this;
        }

        public QueryBuilder fuzzyMobileLink (List<String> fuzzyMobileLink){
            this.fuzzyMobileLink = fuzzyMobileLink;
            return this;
        }

        public QueryBuilder fuzzyMobileLink (String ... fuzzyMobileLink){
            this.fuzzyMobileLink = solveNullList(fuzzyMobileLink);
            return this;
        }

        public QueryBuilder rightFuzzyMobileLink (List<String> rightFuzzyMobileLink){
            this.rightFuzzyMobileLink = rightFuzzyMobileLink;
            return this;
        }

        public QueryBuilder rightFuzzyMobileLink (String ... rightFuzzyMobileLink){
            this.rightFuzzyMobileLink = solveNullList(rightFuzzyMobileLink);
            return this;
        }

        public QueryBuilder mobileLink(String mobileLink){
            setMobileLink(mobileLink);
            return this;
        }

        public QueryBuilder mobileLinkList(String ... mobileLink){
            this.mobileLinkList = solveNullList(mobileLink);
            return this;
        }

        public QueryBuilder mobileLinkList(List<String> mobileLink){
            this.mobileLinkList = mobileLink;
            return this;
        }

        public QueryBuilder fetchMobileLink(){
            setFetchFields("fetchFields","mobileLink");
            return this;
        }

        public QueryBuilder excludeMobileLink(){
            setFetchFields("excludeFields","mobileLink");
            return this;
        }

        public QueryBuilder fuzzyFormDataUrl (List<String> fuzzyFormDataUrl){
            this.fuzzyFormDataUrl = fuzzyFormDataUrl;
            return this;
        }

        public QueryBuilder fuzzyFormDataUrl (String ... fuzzyFormDataUrl){
            this.fuzzyFormDataUrl = solveNullList(fuzzyFormDataUrl);
            return this;
        }

        public QueryBuilder rightFuzzyFormDataUrl (List<String> rightFuzzyFormDataUrl){
            this.rightFuzzyFormDataUrl = rightFuzzyFormDataUrl;
            return this;
        }

        public QueryBuilder rightFuzzyFormDataUrl (String ... rightFuzzyFormDataUrl){
            this.rightFuzzyFormDataUrl = solveNullList(rightFuzzyFormDataUrl);
            return this;
        }

        public QueryBuilder formDataUrl(String formDataUrl){
            setFormDataUrl(formDataUrl);
            return this;
        }

        public QueryBuilder formDataUrlList(String ... formDataUrl){
            this.formDataUrlList = solveNullList(formDataUrl);
            return this;
        }

        public QueryBuilder formDataUrlList(List<String> formDataUrl){
            this.formDataUrlList = formDataUrl;
            return this;
        }

        public QueryBuilder fetchFormDataUrl(){
            setFetchFields("fetchFields","formDataUrl");
            return this;
        }

        public QueryBuilder excludeFormDataUrl(){
            setFetchFields("excludeFields","formDataUrl");
            return this;
        }

        public QueryBuilder fuzzyFormData (List<String> fuzzyFormData){
            this.fuzzyFormData = fuzzyFormData;
            return this;
        }

        public QueryBuilder fuzzyFormData (String ... fuzzyFormData){
            this.fuzzyFormData = solveNullList(fuzzyFormData);
            return this;
        }

        public QueryBuilder rightFuzzyFormData (List<String> rightFuzzyFormData){
            this.rightFuzzyFormData = rightFuzzyFormData;
            return this;
        }

        public QueryBuilder rightFuzzyFormData (String ... rightFuzzyFormData){
            this.rightFuzzyFormData = solveNullList(rightFuzzyFormData);
            return this;
        }

        public QueryBuilder formData(String formData){
            setFormData(formData);
            return this;
        }

        public QueryBuilder formDataList(String ... formData){
            this.formDataList = solveNullList(formData);
            return this;
        }

        public QueryBuilder formDataList(List<String> formData){
            this.formDataList = formData;
            return this;
        }

        public QueryBuilder fetchFormData(){
            setFetchFields("fetchFields","formData");
            return this;
        }

        public QueryBuilder excludeFormData(){
            setFetchFields("excludeFields","formData");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public SimpleApplicationObject build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> simpleApplicationObjectIdList;

        public List<Long> getSimpleApplicationObjectIdList(){return this.simpleApplicationObjectIdList;}

        private Long simpleApplicationObjectIdSt;

        private Long simpleApplicationObjectIdEd;

        public Long getSimpleApplicationObjectIdSt(){return this.simpleApplicationObjectIdSt;}

        public Long getSimpleApplicationObjectIdEd(){return this.simpleApplicationObjectIdEd;}

        private List<String> processNameList;

        public List<String> getProcessNameList(){return this.processNameList;}


        private List<String> fuzzyProcessName;

        public List<String> getFuzzyProcessName(){return this.fuzzyProcessName;}

        private List<String> rightFuzzyProcessName;

        public List<String> getRightFuzzyProcessName(){return this.rightFuzzyProcessName;}
        private List<String> processDefIdList;

        public List<String> getProcessDefIdList(){return this.processDefIdList;}


        private List<String> fuzzyProcessDefId;

        public List<String> getFuzzyProcessDefId(){return this.fuzzyProcessDefId;}

        private List<String> rightFuzzyProcessDefId;

        public List<String> getRightFuzzyProcessDefId(){return this.rightFuzzyProcessDefId;}
        private List<String> processInstIdList;

        public List<String> getProcessInstIdList(){return this.processInstIdList;}


        private List<String> fuzzyProcessInstId;

        public List<String> getFuzzyProcessInstId(){return this.fuzzyProcessInstId;}

        private List<String> rightFuzzyProcessInstId;

        public List<String> getRightFuzzyProcessInstId(){return this.rightFuzzyProcessInstId;}
        private List<String> taskIdList;

        public List<String> getTaskIdList(){return this.taskIdList;}


        private List<String> fuzzyTaskId;

        public List<String> getFuzzyTaskId(){return this.fuzzyTaskId;}

        private List<String> rightFuzzyTaskId;

        public List<String> getRightFuzzyTaskId(){return this.rightFuzzyTaskId;}
        private List<String> taskNameList;

        public List<String> getTaskNameList(){return this.taskNameList;}


        private List<String> fuzzyTaskName;

        public List<String> getFuzzyTaskName(){return this.fuzzyTaskName;}

        private List<String> rightFuzzyTaskName;

        public List<String> getRightFuzzyTaskName(){return this.rightFuzzyTaskName;}
        private List<Integer> assigneeIdList;

        public List<Integer> getAssigneeIdList(){return this.assigneeIdList;}

        private Integer assigneeIdSt;

        private Integer assigneeIdEd;

        public Integer getAssigneeIdSt(){return this.assigneeIdSt;}

        public Integer getAssigneeIdEd(){return this.assigneeIdEd;}

        private List<String> assigneeNameList;

        public List<String> getAssigneeNameList(){return this.assigneeNameList;}


        private List<String> fuzzyAssigneeName;

        public List<String> getFuzzyAssigneeName(){return this.fuzzyAssigneeName;}

        private List<String> rightFuzzyAssigneeName;

        public List<String> getRightFuzzyAssigneeName(){return this.rightFuzzyAssigneeName;}
        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<String> userNameList;

        public List<String> getUserNameList(){return this.userNameList;}


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName(){return this.fuzzyUserName;}

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName(){return this.rightFuzzyUserName;}
        private List<Integer> applierUserIdList;

        public List<Integer> getApplierUserIdList(){return this.applierUserIdList;}

        private Integer applierUserIdSt;

        private Integer applierUserIdEd;

        public Integer getApplierUserIdSt(){return this.applierUserIdSt;}

        public Integer getApplierUserIdEd(){return this.applierUserIdEd;}

        private List<String> applierUserNameList;

        public List<String> getApplierUserNameList(){return this.applierUserNameList;}


        private List<String> fuzzyApplierUserName;

        public List<String> getFuzzyApplierUserName(){return this.fuzzyApplierUserName;}

        private List<String> rightFuzzyApplierUserName;

        public List<String> getRightFuzzyApplierUserName(){return this.rightFuzzyApplierUserName;}
        private List<java.time.LocalDateTime> applyTimeList;

        public List<java.time.LocalDateTime> getApplyTimeList(){return this.applyTimeList;}

        private java.time.LocalDateTime applyTimeSt;

        private java.time.LocalDateTime applyTimeEd;

        public java.time.LocalDateTime getApplyTimeSt(){return this.applyTimeSt;}

        public java.time.LocalDateTime getApplyTimeEd(){return this.applyTimeEd;}

        private List<String> formNameList;

        public List<String> getFormNameList(){return this.formNameList;}


        private List<String> fuzzyFormName;

        public List<String> getFuzzyFormName(){return this.fuzzyFormName;}

        private List<String> rightFuzzyFormName;

        public List<String> getRightFuzzyFormName(){return this.rightFuzzyFormName;}
        private List<Long> formIdList;

        public List<Long> getFormIdList(){return this.formIdList;}

        private Long formIdSt;

        private Long formIdEd;

        public Long getFormIdSt(){return this.formIdSt;}

        public Long getFormIdEd(){return this.formIdEd;}

        private List<String> simpleReasonList;

        public List<String> getSimpleReasonList(){return this.simpleReasonList;}


        private List<String> fuzzySimpleReason;

        public List<String> getFuzzySimpleReason(){return this.fuzzySimpleReason;}

        private List<String> rightFuzzySimpleReason;

        public List<String> getRightFuzzySimpleReason(){return this.rightFuzzySimpleReason;}
        private List<String> linkList;

        public List<String> getLinkList(){return this.linkList;}


        private List<String> fuzzyLink;

        public List<String> getFuzzyLink(){return this.fuzzyLink;}

        private List<String> rightFuzzyLink;

        public List<String> getRightFuzzyLink(){return this.rightFuzzyLink;}
        private List<String> auditorCommentList;

        public List<String> getAuditorCommentList(){return this.auditorCommentList;}


        private List<String> fuzzyAuditorComment;

        public List<String> getFuzzyAuditorComment(){return this.fuzzyAuditorComment;}

        private List<String> rightFuzzyAuditorComment;

        public List<String> getRightFuzzyAuditorComment(){return this.rightFuzzyAuditorComment;}
        private List<String> variablesList;

        public List<String> getVariablesList(){return this.variablesList;}


        private List<String> fuzzyVariables;

        public List<String> getFuzzyVariables(){return this.fuzzyVariables;}

        private List<String> rightFuzzyVariables;

        public List<String> getRightFuzzyVariables(){return this.rightFuzzyVariables;}
        private List<String> processInstTitleList;

        public List<String> getProcessInstTitleList(){return this.processInstTitleList;}


        private List<String> fuzzyProcessInstTitle;

        public List<String> getFuzzyProcessInstTitle(){return this.fuzzyProcessInstTitle;}

        private List<String> rightFuzzyProcessInstTitle;

        public List<String> getRightFuzzyProcessInstTitle(){return this.rightFuzzyProcessInstTitle;}
        private List<String> tbd5List;

        public List<String> getTbd5List(){return this.tbd5List;}


        private List<String> fuzzyTbd5;

        public List<String> getFuzzyTbd5(){return this.fuzzyTbd5;}

        private List<String> rightFuzzyTbd5;

        public List<String> getRightFuzzyTbd5(){return this.rightFuzzyTbd5;}
        private List<String> mobileLinkList;

        public List<String> getMobileLinkList(){return this.mobileLinkList;}


        private List<String> fuzzyMobileLink;

        public List<String> getFuzzyMobileLink(){return this.fuzzyMobileLink;}

        private List<String> rightFuzzyMobileLink;

        public List<String> getRightFuzzyMobileLink(){return this.rightFuzzyMobileLink;}
        private List<String> formDataUrlList;

        public List<String> getFormDataUrlList(){return this.formDataUrlList;}


        private List<String> fuzzyFormDataUrl;

        public List<String> getFuzzyFormDataUrl(){return this.fuzzyFormDataUrl;}

        private List<String> rightFuzzyFormDataUrl;

        public List<String> getRightFuzzyFormDataUrl(){return this.rightFuzzyFormDataUrl;}
        private List<String> formDataList;

        public List<String> getFormDataList(){return this.formDataList;}


        private List<String> fuzzyFormData;

        public List<String> getFuzzyFormData(){return this.fuzzyFormData;}

        private List<String> rightFuzzyFormData;

        public List<String> getRightFuzzyFormData(){return this.rightFuzzyFormData;}

        public ConditionBuilder simpleApplicationObjectIdBetWeen(Long simpleApplicationObjectIdSt,Long simpleApplicationObjectIdEd){
            this.simpleApplicationObjectIdSt = simpleApplicationObjectIdSt;
            this.simpleApplicationObjectIdEd = simpleApplicationObjectIdEd;
            return this;
        }

        public ConditionBuilder simpleApplicationObjectIdGreaterEqThan(Long simpleApplicationObjectIdSt){
            this.simpleApplicationObjectIdSt = simpleApplicationObjectIdSt;
            return this;
        }
        public ConditionBuilder simpleApplicationObjectIdLessEqThan(Long simpleApplicationObjectIdEd){
            this.simpleApplicationObjectIdEd = simpleApplicationObjectIdEd;
            return this;
        }


        public ConditionBuilder simpleApplicationObjectIdList(Long ... simpleApplicationObjectId){
            this.simpleApplicationObjectIdList = solveNullList(simpleApplicationObjectId);
            return this;
        }

        public ConditionBuilder simpleApplicationObjectIdList(List<Long> simpleApplicationObjectId){
            this.simpleApplicationObjectIdList = simpleApplicationObjectId;
            return this;
        }

        public ConditionBuilder fuzzyProcessName (List<String> fuzzyProcessName){
            this.fuzzyProcessName = fuzzyProcessName;
            return this;
        }

        public ConditionBuilder fuzzyProcessName (String ... fuzzyProcessName){
            this.fuzzyProcessName = solveNullList(fuzzyProcessName);
            return this;
        }

        public ConditionBuilder rightFuzzyProcessName (List<String> rightFuzzyProcessName){
            this.rightFuzzyProcessName = rightFuzzyProcessName;
            return this;
        }

        public ConditionBuilder rightFuzzyProcessName (String ... rightFuzzyProcessName){
            this.rightFuzzyProcessName = solveNullList(rightFuzzyProcessName);
            return this;
        }

        public ConditionBuilder processNameList(String ... processName){
            this.processNameList = solveNullList(processName);
            return this;
        }

        public ConditionBuilder processNameList(List<String> processName){
            this.processNameList = processName;
            return this;
        }

        public ConditionBuilder fuzzyProcessDefId (List<String> fuzzyProcessDefId){
            this.fuzzyProcessDefId = fuzzyProcessDefId;
            return this;
        }

        public ConditionBuilder fuzzyProcessDefId (String ... fuzzyProcessDefId){
            this.fuzzyProcessDefId = solveNullList(fuzzyProcessDefId);
            return this;
        }

        public ConditionBuilder rightFuzzyProcessDefId (List<String> rightFuzzyProcessDefId){
            this.rightFuzzyProcessDefId = rightFuzzyProcessDefId;
            return this;
        }

        public ConditionBuilder rightFuzzyProcessDefId (String ... rightFuzzyProcessDefId){
            this.rightFuzzyProcessDefId = solveNullList(rightFuzzyProcessDefId);
            return this;
        }

        public ConditionBuilder processDefIdList(String ... processDefId){
            this.processDefIdList = solveNullList(processDefId);
            return this;
        }

        public ConditionBuilder processDefIdList(List<String> processDefId){
            this.processDefIdList = processDefId;
            return this;
        }

        public ConditionBuilder fuzzyProcessInstId (List<String> fuzzyProcessInstId){
            this.fuzzyProcessInstId = fuzzyProcessInstId;
            return this;
        }

        public ConditionBuilder fuzzyProcessInstId (String ... fuzzyProcessInstId){
            this.fuzzyProcessInstId = solveNullList(fuzzyProcessInstId);
            return this;
        }

        public ConditionBuilder rightFuzzyProcessInstId (List<String> rightFuzzyProcessInstId){
            this.rightFuzzyProcessInstId = rightFuzzyProcessInstId;
            return this;
        }

        public ConditionBuilder rightFuzzyProcessInstId (String ... rightFuzzyProcessInstId){
            this.rightFuzzyProcessInstId = solveNullList(rightFuzzyProcessInstId);
            return this;
        }

        public ConditionBuilder processInstIdList(String ... processInstId){
            this.processInstIdList = solveNullList(processInstId);
            return this;
        }

        public ConditionBuilder processInstIdList(List<String> processInstId){
            this.processInstIdList = processInstId;
            return this;
        }

        public ConditionBuilder fuzzyTaskId (List<String> fuzzyTaskId){
            this.fuzzyTaskId = fuzzyTaskId;
            return this;
        }

        public ConditionBuilder fuzzyTaskId (String ... fuzzyTaskId){
            this.fuzzyTaskId = solveNullList(fuzzyTaskId);
            return this;
        }

        public ConditionBuilder rightFuzzyTaskId (List<String> rightFuzzyTaskId){
            this.rightFuzzyTaskId = rightFuzzyTaskId;
            return this;
        }

        public ConditionBuilder rightFuzzyTaskId (String ... rightFuzzyTaskId){
            this.rightFuzzyTaskId = solveNullList(rightFuzzyTaskId);
            return this;
        }

        public ConditionBuilder taskIdList(String ... taskId){
            this.taskIdList = solveNullList(taskId);
            return this;
        }

        public ConditionBuilder taskIdList(List<String> taskId){
            this.taskIdList = taskId;
            return this;
        }

        public ConditionBuilder fuzzyTaskName (List<String> fuzzyTaskName){
            this.fuzzyTaskName = fuzzyTaskName;
            return this;
        }

        public ConditionBuilder fuzzyTaskName (String ... fuzzyTaskName){
            this.fuzzyTaskName = solveNullList(fuzzyTaskName);
            return this;
        }

        public ConditionBuilder rightFuzzyTaskName (List<String> rightFuzzyTaskName){
            this.rightFuzzyTaskName = rightFuzzyTaskName;
            return this;
        }

        public ConditionBuilder rightFuzzyTaskName (String ... rightFuzzyTaskName){
            this.rightFuzzyTaskName = solveNullList(rightFuzzyTaskName);
            return this;
        }

        public ConditionBuilder taskNameList(String ... taskName){
            this.taskNameList = solveNullList(taskName);
            return this;
        }

        public ConditionBuilder taskNameList(List<String> taskName){
            this.taskNameList = taskName;
            return this;
        }

        public ConditionBuilder assigneeIdBetWeen(Integer assigneeIdSt,Integer assigneeIdEd){
            this.assigneeIdSt = assigneeIdSt;
            this.assigneeIdEd = assigneeIdEd;
            return this;
        }

        public ConditionBuilder assigneeIdGreaterEqThan(Integer assigneeIdSt){
            this.assigneeIdSt = assigneeIdSt;
            return this;
        }
        public ConditionBuilder assigneeIdLessEqThan(Integer assigneeIdEd){
            this.assigneeIdEd = assigneeIdEd;
            return this;
        }


        public ConditionBuilder assigneeIdList(Integer ... assigneeId){
            this.assigneeIdList = solveNullList(assigneeId);
            return this;
        }

        public ConditionBuilder assigneeIdList(List<Integer> assigneeId){
            this.assigneeIdList = assigneeId;
            return this;
        }

        public ConditionBuilder fuzzyAssigneeName (List<String> fuzzyAssigneeName){
            this.fuzzyAssigneeName = fuzzyAssigneeName;
            return this;
        }

        public ConditionBuilder fuzzyAssigneeName (String ... fuzzyAssigneeName){
            this.fuzzyAssigneeName = solveNullList(fuzzyAssigneeName);
            return this;
        }

        public ConditionBuilder rightFuzzyAssigneeName (List<String> rightFuzzyAssigneeName){
            this.rightFuzzyAssigneeName = rightFuzzyAssigneeName;
            return this;
        }

        public ConditionBuilder rightFuzzyAssigneeName (String ... rightFuzzyAssigneeName){
            this.rightFuzzyAssigneeName = solveNullList(rightFuzzyAssigneeName);
            return this;
        }

        public ConditionBuilder assigneeNameList(String ... assigneeName){
            this.assigneeNameList = solveNullList(assigneeName);
            return this;
        }

        public ConditionBuilder assigneeNameList(List<String> assigneeName){
            this.assigneeNameList = assigneeName;
            return this;
        }

        public ConditionBuilder userIdBetWeen(Integer userIdSt,Integer userIdEd){
            this.userIdSt = userIdSt;
            this.userIdEd = userIdEd;
            return this;
        }

        public ConditionBuilder userIdGreaterEqThan(Integer userIdSt){
            this.userIdSt = userIdSt;
            return this;
        }
        public ConditionBuilder userIdLessEqThan(Integer userIdEd){
            this.userIdEd = userIdEd;
            return this;
        }


        public ConditionBuilder userIdList(Integer ... userId){
            this.userIdList = solveNullList(userId);
            return this;
        }

        public ConditionBuilder userIdList(List<Integer> userId){
            this.userIdList = userId;
            return this;
        }

        public ConditionBuilder fuzzyUserName (List<String> fuzzyUserName){
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public ConditionBuilder fuzzyUserName (String ... fuzzyUserName){
            this.fuzzyUserName = solveNullList(fuzzyUserName);
            return this;
        }

        public ConditionBuilder rightFuzzyUserName (List<String> rightFuzzyUserName){
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public ConditionBuilder rightFuzzyUserName (String ... rightFuzzyUserName){
            this.rightFuzzyUserName = solveNullList(rightFuzzyUserName);
            return this;
        }

        public ConditionBuilder userNameList(String ... userName){
            this.userNameList = solveNullList(userName);
            return this;
        }

        public ConditionBuilder userNameList(List<String> userName){
            this.userNameList = userName;
            return this;
        }

        public ConditionBuilder applierUserIdBetWeen(Integer applierUserIdSt,Integer applierUserIdEd){
            this.applierUserIdSt = applierUserIdSt;
            this.applierUserIdEd = applierUserIdEd;
            return this;
        }

        public ConditionBuilder applierUserIdGreaterEqThan(Integer applierUserIdSt){
            this.applierUserIdSt = applierUserIdSt;
            return this;
        }
        public ConditionBuilder applierUserIdLessEqThan(Integer applierUserIdEd){
            this.applierUserIdEd = applierUserIdEd;
            return this;
        }


        public ConditionBuilder applierUserIdList(Integer ... applierUserId){
            this.applierUserIdList = solveNullList(applierUserId);
            return this;
        }

        public ConditionBuilder applierUserIdList(List<Integer> applierUserId){
            this.applierUserIdList = applierUserId;
            return this;
        }

        public ConditionBuilder fuzzyApplierUserName (List<String> fuzzyApplierUserName){
            this.fuzzyApplierUserName = fuzzyApplierUserName;
            return this;
        }

        public ConditionBuilder fuzzyApplierUserName (String ... fuzzyApplierUserName){
            this.fuzzyApplierUserName = solveNullList(fuzzyApplierUserName);
            return this;
        }

        public ConditionBuilder rightFuzzyApplierUserName (List<String> rightFuzzyApplierUserName){
            this.rightFuzzyApplierUserName = rightFuzzyApplierUserName;
            return this;
        }

        public ConditionBuilder rightFuzzyApplierUserName (String ... rightFuzzyApplierUserName){
            this.rightFuzzyApplierUserName = solveNullList(rightFuzzyApplierUserName);
            return this;
        }

        public ConditionBuilder applierUserNameList(String ... applierUserName){
            this.applierUserNameList = solveNullList(applierUserName);
            return this;
        }

        public ConditionBuilder applierUserNameList(List<String> applierUserName){
            this.applierUserNameList = applierUserName;
            return this;
        }

        public ConditionBuilder applyTimeBetWeen(java.time.LocalDateTime applyTimeSt,java.time.LocalDateTime applyTimeEd){
            this.applyTimeSt = applyTimeSt;
            this.applyTimeEd = applyTimeEd;
            return this;
        }

        public ConditionBuilder applyTimeGreaterEqThan(java.time.LocalDateTime applyTimeSt){
            this.applyTimeSt = applyTimeSt;
            return this;
        }
        public ConditionBuilder applyTimeLessEqThan(java.time.LocalDateTime applyTimeEd){
            this.applyTimeEd = applyTimeEd;
            return this;
        }


        public ConditionBuilder applyTimeList(java.time.LocalDateTime ... applyTime){
            this.applyTimeList = solveNullList(applyTime);
            return this;
        }

        public ConditionBuilder applyTimeList(List<java.time.LocalDateTime> applyTime){
            this.applyTimeList = applyTime;
            return this;
        }

        public ConditionBuilder fuzzyFormName (List<String> fuzzyFormName){
            this.fuzzyFormName = fuzzyFormName;
            return this;
        }

        public ConditionBuilder fuzzyFormName (String ... fuzzyFormName){
            this.fuzzyFormName = solveNullList(fuzzyFormName);
            return this;
        }

        public ConditionBuilder rightFuzzyFormName (List<String> rightFuzzyFormName){
            this.rightFuzzyFormName = rightFuzzyFormName;
            return this;
        }

        public ConditionBuilder rightFuzzyFormName (String ... rightFuzzyFormName){
            this.rightFuzzyFormName = solveNullList(rightFuzzyFormName);
            return this;
        }

        public ConditionBuilder formNameList(String ... formName){
            this.formNameList = solveNullList(formName);
            return this;
        }

        public ConditionBuilder formNameList(List<String> formName){
            this.formNameList = formName;
            return this;
        }

        public ConditionBuilder formIdBetWeen(Long formIdSt,Long formIdEd){
            this.formIdSt = formIdSt;
            this.formIdEd = formIdEd;
            return this;
        }

        public ConditionBuilder formIdGreaterEqThan(Long formIdSt){
            this.formIdSt = formIdSt;
            return this;
        }
        public ConditionBuilder formIdLessEqThan(Long formIdEd){
            this.formIdEd = formIdEd;
            return this;
        }


        public ConditionBuilder formIdList(Long ... formId){
            this.formIdList = solveNullList(formId);
            return this;
        }

        public ConditionBuilder formIdList(List<Long> formId){
            this.formIdList = formId;
            return this;
        }

        public ConditionBuilder fuzzySimpleReason (List<String> fuzzySimpleReason){
            this.fuzzySimpleReason = fuzzySimpleReason;
            return this;
        }

        public ConditionBuilder fuzzySimpleReason (String ... fuzzySimpleReason){
            this.fuzzySimpleReason = solveNullList(fuzzySimpleReason);
            return this;
        }

        public ConditionBuilder rightFuzzySimpleReason (List<String> rightFuzzySimpleReason){
            this.rightFuzzySimpleReason = rightFuzzySimpleReason;
            return this;
        }

        public ConditionBuilder rightFuzzySimpleReason (String ... rightFuzzySimpleReason){
            this.rightFuzzySimpleReason = solveNullList(rightFuzzySimpleReason);
            return this;
        }

        public ConditionBuilder simpleReasonList(String ... simpleReason){
            this.simpleReasonList = solveNullList(simpleReason);
            return this;
        }

        public ConditionBuilder simpleReasonList(List<String> simpleReason){
            this.simpleReasonList = simpleReason;
            return this;
        }

        public ConditionBuilder fuzzyLink (List<String> fuzzyLink){
            this.fuzzyLink = fuzzyLink;
            return this;
        }

        public ConditionBuilder fuzzyLink (String ... fuzzyLink){
            this.fuzzyLink = solveNullList(fuzzyLink);
            return this;
        }

        public ConditionBuilder rightFuzzyLink (List<String> rightFuzzyLink){
            this.rightFuzzyLink = rightFuzzyLink;
            return this;
        }

        public ConditionBuilder rightFuzzyLink (String ... rightFuzzyLink){
            this.rightFuzzyLink = solveNullList(rightFuzzyLink);
            return this;
        }

        public ConditionBuilder linkList(String ... link){
            this.linkList = solveNullList(link);
            return this;
        }

        public ConditionBuilder linkList(List<String> link){
            this.linkList = link;
            return this;
        }

        public ConditionBuilder fuzzyAuditorComment (List<String> fuzzyAuditorComment){
            this.fuzzyAuditorComment = fuzzyAuditorComment;
            return this;
        }

        public ConditionBuilder fuzzyAuditorComment (String ... fuzzyAuditorComment){
            this.fuzzyAuditorComment = solveNullList(fuzzyAuditorComment);
            return this;
        }

        public ConditionBuilder rightFuzzyAuditorComment (List<String> rightFuzzyAuditorComment){
            this.rightFuzzyAuditorComment = rightFuzzyAuditorComment;
            return this;
        }

        public ConditionBuilder rightFuzzyAuditorComment (String ... rightFuzzyAuditorComment){
            this.rightFuzzyAuditorComment = solveNullList(rightFuzzyAuditorComment);
            return this;
        }

        public ConditionBuilder auditorCommentList(String ... auditorComment){
            this.auditorCommentList = solveNullList(auditorComment);
            return this;
        }

        public ConditionBuilder auditorCommentList(List<String> auditorComment){
            this.auditorCommentList = auditorComment;
            return this;
        }

        public ConditionBuilder fuzzyVariables (List<String> fuzzyVariables){
            this.fuzzyVariables = fuzzyVariables;
            return this;
        }

        public ConditionBuilder fuzzyVariables (String ... fuzzyVariables){
            this.fuzzyVariables = solveNullList(fuzzyVariables);
            return this;
        }

        public ConditionBuilder rightFuzzyVariables (List<String> rightFuzzyVariables){
            this.rightFuzzyVariables = rightFuzzyVariables;
            return this;
        }

        public ConditionBuilder rightFuzzyVariables (String ... rightFuzzyVariables){
            this.rightFuzzyVariables = solveNullList(rightFuzzyVariables);
            return this;
        }

        public ConditionBuilder variablesList(String ... variables){
            this.variablesList = solveNullList(variables);
            return this;
        }

        public ConditionBuilder variablesList(List<String> variables){
            this.variablesList = variables;
            return this;
        }

        public ConditionBuilder fuzzyProcessInstTitle (List<String> fuzzyProcessInstTitle){
            this.fuzzyProcessInstTitle = fuzzyProcessInstTitle;
            return this;
        }

        public ConditionBuilder fuzzyProcessInstTitle (String ... fuzzyProcessInstTitle){
            this.fuzzyProcessInstTitle = solveNullList(fuzzyProcessInstTitle);
            return this;
        }

        public ConditionBuilder rightFuzzyProcessInstTitle (List<String> rightFuzzyProcessInstTitle){
            this.rightFuzzyProcessInstTitle = rightFuzzyProcessInstTitle;
            return this;
        }

        public ConditionBuilder rightFuzzyProcessInstTitle (String ... rightFuzzyProcessInstTitle){
            this.rightFuzzyProcessInstTitle = solveNullList(rightFuzzyProcessInstTitle);
            return this;
        }

        public ConditionBuilder processInstTitleList(String ... processInstTitle){
            this.processInstTitleList = solveNullList(processInstTitle);
            return this;
        }

        public ConditionBuilder processInstTitleList(List<String> processInstTitle){
            this.processInstTitleList = processInstTitle;
            return this;
        }

        public ConditionBuilder fuzzyTbd5 (List<String> fuzzyTbd5){
            this.fuzzyTbd5 = fuzzyTbd5;
            return this;
        }

        public ConditionBuilder fuzzyTbd5 (String ... fuzzyTbd5){
            this.fuzzyTbd5 = solveNullList(fuzzyTbd5);
            return this;
        }

        public ConditionBuilder rightFuzzyTbd5 (List<String> rightFuzzyTbd5){
            this.rightFuzzyTbd5 = rightFuzzyTbd5;
            return this;
        }

        public ConditionBuilder rightFuzzyTbd5 (String ... rightFuzzyTbd5){
            this.rightFuzzyTbd5 = solveNullList(rightFuzzyTbd5);
            return this;
        }

        public ConditionBuilder tbd5List(String ... tbd5){
            this.tbd5List = solveNullList(tbd5);
            return this;
        }

        public ConditionBuilder tbd5List(List<String> tbd5){
            this.tbd5List = tbd5;
            return this;
        }

        public ConditionBuilder fuzzyMobileLink (List<String> fuzzyMobileLink){
            this.fuzzyMobileLink = fuzzyMobileLink;
            return this;
        }

        public ConditionBuilder fuzzyMobileLink (String ... fuzzyMobileLink){
            this.fuzzyMobileLink = solveNullList(fuzzyMobileLink);
            return this;
        }

        public ConditionBuilder rightFuzzyMobileLink (List<String> rightFuzzyMobileLink){
            this.rightFuzzyMobileLink = rightFuzzyMobileLink;
            return this;
        }

        public ConditionBuilder rightFuzzyMobileLink (String ... rightFuzzyMobileLink){
            this.rightFuzzyMobileLink = solveNullList(rightFuzzyMobileLink);
            return this;
        }

        public ConditionBuilder mobileLinkList(String ... mobileLink){
            this.mobileLinkList = solveNullList(mobileLink);
            return this;
        }

        public ConditionBuilder mobileLinkList(List<String> mobileLink){
            this.mobileLinkList = mobileLink;
            return this;
        }

        public ConditionBuilder fuzzyFormDataUrl (List<String> fuzzyFormDataUrl){
            this.fuzzyFormDataUrl = fuzzyFormDataUrl;
            return this;
        }

        public ConditionBuilder fuzzyFormDataUrl (String ... fuzzyFormDataUrl){
            this.fuzzyFormDataUrl = solveNullList(fuzzyFormDataUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyFormDataUrl (List<String> rightFuzzyFormDataUrl){
            this.rightFuzzyFormDataUrl = rightFuzzyFormDataUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyFormDataUrl (String ... rightFuzzyFormDataUrl){
            this.rightFuzzyFormDataUrl = solveNullList(rightFuzzyFormDataUrl);
            return this;
        }

        public ConditionBuilder formDataUrlList(String ... formDataUrl){
            this.formDataUrlList = solveNullList(formDataUrl);
            return this;
        }

        public ConditionBuilder formDataUrlList(List<String> formDataUrl){
            this.formDataUrlList = formDataUrl;
            return this;
        }

        public ConditionBuilder fuzzyFormData (List<String> fuzzyFormData){
            this.fuzzyFormData = fuzzyFormData;
            return this;
        }

        public ConditionBuilder fuzzyFormData (String ... fuzzyFormData){
            this.fuzzyFormData = solveNullList(fuzzyFormData);
            return this;
        }

        public ConditionBuilder rightFuzzyFormData (List<String> rightFuzzyFormData){
            this.rightFuzzyFormData = rightFuzzyFormData;
            return this;
        }

        public ConditionBuilder rightFuzzyFormData (String ... rightFuzzyFormData){
            this.rightFuzzyFormData = solveNullList(rightFuzzyFormData);
            return this;
        }

        public ConditionBuilder formDataList(String ... formData){
            this.formDataList = solveNullList(formData);
            return this;
        }

        public ConditionBuilder formDataList(List<String> formData){
            this.formDataList = formData;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private SimpleApplicationObject obj;

        public Builder(){
            this.obj = new SimpleApplicationObject();
        }

        public Builder simpleApplicationObjectId(Long simpleApplicationObjectId){
            this.obj.setSimpleApplicationObjectId(simpleApplicationObjectId);
            return this;
        }
        public Builder processName(String processName){
            this.obj.setProcessName(processName);
            return this;
        }
        public Builder processDefId(String processDefId){
            this.obj.setProcessDefId(processDefId);
            return this;
        }
        public Builder processInstId(String processInstId){
            this.obj.setProcessInstId(processInstId);
            return this;
        }
        public Builder taskId(String taskId){
            this.obj.setTaskId(taskId);
            return this;
        }
        public Builder taskName(String taskName){
            this.obj.setTaskName(taskName);
            return this;
        }
        public Builder assigneeId(Integer assigneeId){
            this.obj.setAssigneeId(assigneeId);
            return this;
        }
        public Builder assigneeName(String assigneeName){
            this.obj.setAssigneeName(assigneeName);
            return this;
        }
        public Builder userId(Integer userId){
            this.obj.setUserId(userId);
            return this;
        }
        public Builder userName(String userName){
            this.obj.setUserName(userName);
            return this;
        }
        public Builder applierUserId(Integer applierUserId){
            this.obj.setApplierUserId(applierUserId);
            return this;
        }
        public Builder applierUserName(String applierUserName){
            this.obj.setApplierUserName(applierUserName);
            return this;
        }
        public Builder applyTime(java.time.LocalDateTime applyTime){
            this.obj.setApplyTime(applyTime);
            return this;
        }
        public Builder formName(String formName){
            this.obj.setFormName(formName);
            return this;
        }
        public Builder formId(Long formId){
            this.obj.setFormId(formId);
            return this;
        }
        public Builder simpleReason(String simpleReason){
            this.obj.setSimpleReason(simpleReason);
            return this;
        }
        public Builder link(String link){
            this.obj.setLink(link);
            return this;
        }
        public Builder auditorComment(String auditorComment){
            this.obj.setAuditorComment(auditorComment);
            return this;
        }
        public Builder variables(String variables){
            this.obj.setVariables(variables);
            return this;
        }
        public Builder processInstTitle(String processInstTitle){
            this.obj.setProcessInstTitle(processInstTitle);
            return this;
        }
        public Builder tbd5(String tbd5){
            this.obj.setTbd5(tbd5);
            return this;
        }
        public Builder mobileLink(String mobileLink){
            this.obj.setMobileLink(mobileLink);
            return this;
        }
        public Builder formDataUrl(String formDataUrl){
            this.obj.setFormDataUrl(formDataUrl);
            return this;
        }
        public Builder formData(String formData){
            this.obj.setFormData(formData);
            return this;
        }
        public SimpleApplicationObject build(){return obj;}
    }

}
