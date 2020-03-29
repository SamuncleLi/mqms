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
public class MqmsFailureAnalysis implements Serializable {

    private static final long serialVersionUID = 1585109348458L;


    /**
    * 主键
    * 故障解析id
    * isNullAble:0
    */
    private Integer failureAnalysisId;

    /**
    * 
    * isNullAble:1
    */
    private Integer failureTrackId;

    /**
    * 解析人员名称
    * isNullAble:1
    */
    private Integer failureAnalystId;

    /**
    * 解析人员
    * isNullAble:1
    */
    private String failureAnalystName;

    /**
    * 解析人员科室
    * isNullAble:1
    */
    private String failureAnalystDepartment;

    /**
    * 解析人员意见
    * isNullAble:1
    */
    private String failureAnalystComment;

    /**
    * 流程系统id
    * isNullAble:1
    */
    private Long saoId;

    /**
    * 多实例标志
    * isNullAble:1
    */
    private String flag;

    /**
    * 任务名称
    * isNullAble:1
    */
    private String taskName;

    /**
    * taskId
    * isNullAble:1
    */
    private String taskId;

    /**
    * 提交日期
    * isNullAble:1
    */
    private String submitDate;


    public void setFailureAnalysisId(Integer failureAnalysisId){this.failureAnalysisId = failureAnalysisId;}

    public Integer getFailureAnalysisId(){return this.failureAnalysisId;}

    public void setFailureTrackId(Integer failureTrackId){this.failureTrackId = failureTrackId;}

    public Integer getFailureTrackId(){return this.failureTrackId;}

    public void setFailureAnalystId(Integer failureAnalystId){this.failureAnalystId = failureAnalystId;}

    public Integer getFailureAnalystId(){return this.failureAnalystId;}

    public void setFailureAnalystName(String failureAnalystName){this.failureAnalystName = failureAnalystName;}

    public String getFailureAnalystName(){return this.failureAnalystName;}

    public void setFailureAnalystDepartment(String failureAnalystDepartment){this.failureAnalystDepartment = failureAnalystDepartment;}

    public String getFailureAnalystDepartment(){return this.failureAnalystDepartment;}

    public void setFailureAnalystComment(String failureAnalystComment){this.failureAnalystComment = failureAnalystComment;}

    public String getFailureAnalystComment(){return this.failureAnalystComment;}

    public void setSaoId(Long saoId){this.saoId = saoId;}

    public Long getSaoId(){return this.saoId;}

    public void setFlag(String flag){this.flag = flag;}

    public String getFlag(){return this.flag;}

    public void setTaskName(String taskName){this.taskName = taskName;}

    public String getTaskName(){return this.taskName;}

    public void setTaskId(String taskId){this.taskId = taskId;}

    public String getTaskId(){return this.taskId;}

    public void setSubmitDate(String submitDate){this.submitDate = submitDate;}

    public String getSubmitDate(){return this.submitDate;}
    @Override
    public String toString() {
        return "MqmsFailureAnalysis{" +
                "failureAnalysisId='" + failureAnalysisId + '\'' +
                "failureTrackId='" + failureTrackId + '\'' +
                "failureAnalystId='" + failureAnalystId + '\'' +
                "failureAnalystName='" + failureAnalystName + '\'' +
                "failureAnalystDepartment='" + failureAnalystDepartment + '\'' +
                "failureAnalystComment='" + failureAnalystComment + '\'' +
                "saoId='" + saoId + '\'' +
                "flag='" + flag + '\'' +
                "taskName='" + taskName + '\'' +
                "taskId='" + taskId + '\'' +
                "submitDate='" + submitDate + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsFailureAnalysis set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsFailureAnalysis set){
            this.set = set;
            return this;
        }

        public MqmsFailureAnalysis getSet(){
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

    public static class QueryBuilder extends MqmsFailureAnalysis{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> failureAnalysisIdList;

        public List<Integer> getFailureAnalysisIdList(){return this.failureAnalysisIdList;}

        private Integer failureAnalysisIdSt;

        private Integer failureAnalysisIdEd;

        public Integer getFailureAnalysisIdSt(){return this.failureAnalysisIdSt;}

        public Integer getFailureAnalysisIdEd(){return this.failureAnalysisIdEd;}

        private List<Integer> failureTrackIdList;

        public List<Integer> getFailureTrackIdList(){return this.failureTrackIdList;}

        private Integer failureTrackIdSt;

        private Integer failureTrackIdEd;

        public Integer getFailureTrackIdSt(){return this.failureTrackIdSt;}

        public Integer getFailureTrackIdEd(){return this.failureTrackIdEd;}

        private List<Integer> failureAnalystIdList;

        public List<Integer> getFailureAnalystIdList(){return this.failureAnalystIdList;}

        private Integer failureAnalystIdSt;

        private Integer failureAnalystIdEd;

        public Integer getFailureAnalystIdSt(){return this.failureAnalystIdSt;}

        public Integer getFailureAnalystIdEd(){return this.failureAnalystIdEd;}

        private List<String> failureAnalystNameList;

        public List<String> getFailureAnalystNameList(){return this.failureAnalystNameList;}


        private List<String> fuzzyFailureAnalystName;

        public List<String> getFuzzyFailureAnalystName(){return this.fuzzyFailureAnalystName;}

        private List<String> rightFuzzyFailureAnalystName;

        public List<String> getRightFuzzyFailureAnalystName(){return this.rightFuzzyFailureAnalystName;}
        private List<String> failureAnalystDepartmentList;

        public List<String> getFailureAnalystDepartmentList(){return this.failureAnalystDepartmentList;}


        private List<String> fuzzyFailureAnalystDepartment;

        public List<String> getFuzzyFailureAnalystDepartment(){return this.fuzzyFailureAnalystDepartment;}

        private List<String> rightFuzzyFailureAnalystDepartment;

        public List<String> getRightFuzzyFailureAnalystDepartment(){return this.rightFuzzyFailureAnalystDepartment;}
        private List<String> failureAnalystCommentList;

        public List<String> getFailureAnalystCommentList(){return this.failureAnalystCommentList;}


        private List<String> fuzzyFailureAnalystComment;

        public List<String> getFuzzyFailureAnalystComment(){return this.fuzzyFailureAnalystComment;}

        private List<String> rightFuzzyFailureAnalystComment;

        public List<String> getRightFuzzyFailureAnalystComment(){return this.rightFuzzyFailureAnalystComment;}
        private List<Long> saoIdList;

        public List<Long> getSaoIdList(){return this.saoIdList;}

        private Long saoIdSt;

        private Long saoIdEd;

        public Long getSaoIdSt(){return this.saoIdSt;}

        public Long getSaoIdEd(){return this.saoIdEd;}

        private List<String> flagList;

        public List<String> getFlagList(){return this.flagList;}


        private List<String> fuzzyFlag;

        public List<String> getFuzzyFlag(){return this.fuzzyFlag;}

        private List<String> rightFuzzyFlag;

        public List<String> getRightFuzzyFlag(){return this.rightFuzzyFlag;}
        private List<String> taskNameList;

        public List<String> getTaskNameList(){return this.taskNameList;}


        private List<String> fuzzyTaskName;

        public List<String> getFuzzyTaskName(){return this.fuzzyTaskName;}

        private List<String> rightFuzzyTaskName;

        public List<String> getRightFuzzyTaskName(){return this.rightFuzzyTaskName;}
        private List<String> taskIdList;

        public List<String> getTaskIdList(){return this.taskIdList;}


        private List<String> fuzzyTaskId;

        public List<String> getFuzzyTaskId(){return this.fuzzyTaskId;}

        private List<String> rightFuzzyTaskId;

        public List<String> getRightFuzzyTaskId(){return this.rightFuzzyTaskId;}
        private List<String> submitDateList;

        public List<String> getSubmitDateList(){return this.submitDateList;}


        private List<String> fuzzySubmitDate;

        public List<String> getFuzzySubmitDate(){return this.fuzzySubmitDate;}

        private List<String> rightFuzzySubmitDate;

        public List<String> getRightFuzzySubmitDate(){return this.rightFuzzySubmitDate;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder failureAnalysisIdBetWeen(Integer failureAnalysisIdSt,Integer failureAnalysisIdEd){
            this.failureAnalysisIdSt = failureAnalysisIdSt;
            this.failureAnalysisIdEd = failureAnalysisIdEd;
            return this;
        }

        public QueryBuilder failureAnalysisIdGreaterEqThan(Integer failureAnalysisIdSt){
            this.failureAnalysisIdSt = failureAnalysisIdSt;
            return this;
        }
        public QueryBuilder failureAnalysisIdLessEqThan(Integer failureAnalysisIdEd){
            this.failureAnalysisIdEd = failureAnalysisIdEd;
            return this;
        }


        public QueryBuilder failureAnalysisId(Integer failureAnalysisId){
            setFailureAnalysisId(failureAnalysisId);
            return this;
        }

        public QueryBuilder failureAnalysisIdList(Integer ... failureAnalysisId){
            this.failureAnalysisIdList = solveNullList(failureAnalysisId);
            return this;
        }

        public QueryBuilder failureAnalysisIdList(List<Integer> failureAnalysisId){
            this.failureAnalysisIdList = failureAnalysisId;
            return this;
        }

        public QueryBuilder fetchFailureAnalysisId(){
            setFetchFields("fetchFields","failureAnalysisId");
            return this;
        }

        public QueryBuilder excludeFailureAnalysisId(){
            setFetchFields("excludeFields","failureAnalysisId");
            return this;
        }

        public QueryBuilder failureTrackIdBetWeen(Integer failureTrackIdSt,Integer failureTrackIdEd){
            this.failureTrackIdSt = failureTrackIdSt;
            this.failureTrackIdEd = failureTrackIdEd;
            return this;
        }

        public QueryBuilder failureTrackIdGreaterEqThan(Integer failureTrackIdSt){
            this.failureTrackIdSt = failureTrackIdSt;
            return this;
        }
        public QueryBuilder failureTrackIdLessEqThan(Integer failureTrackIdEd){
            this.failureTrackIdEd = failureTrackIdEd;
            return this;
        }


        public QueryBuilder failureTrackId(Integer failureTrackId){
            setFailureTrackId(failureTrackId);
            return this;
        }

        public QueryBuilder failureTrackIdList(Integer ... failureTrackId){
            this.failureTrackIdList = solveNullList(failureTrackId);
            return this;
        }

        public QueryBuilder failureTrackIdList(List<Integer> failureTrackId){
            this.failureTrackIdList = failureTrackId;
            return this;
        }

        public QueryBuilder fetchFailureTrackId(){
            setFetchFields("fetchFields","failureTrackId");
            return this;
        }

        public QueryBuilder excludeFailureTrackId(){
            setFetchFields("excludeFields","failureTrackId");
            return this;
        }

        public QueryBuilder failureAnalystIdBetWeen(Integer failureAnalystIdSt,Integer failureAnalystIdEd){
            this.failureAnalystIdSt = failureAnalystIdSt;
            this.failureAnalystIdEd = failureAnalystIdEd;
            return this;
        }

        public QueryBuilder failureAnalystIdGreaterEqThan(Integer failureAnalystIdSt){
            this.failureAnalystIdSt = failureAnalystIdSt;
            return this;
        }
        public QueryBuilder failureAnalystIdLessEqThan(Integer failureAnalystIdEd){
            this.failureAnalystIdEd = failureAnalystIdEd;
            return this;
        }


        public QueryBuilder failureAnalystId(Integer failureAnalystId){
            setFailureAnalystId(failureAnalystId);
            return this;
        }

        public QueryBuilder failureAnalystIdList(Integer ... failureAnalystId){
            this.failureAnalystIdList = solveNullList(failureAnalystId);
            return this;
        }

        public QueryBuilder failureAnalystIdList(List<Integer> failureAnalystId){
            this.failureAnalystIdList = failureAnalystId;
            return this;
        }

        public QueryBuilder fetchFailureAnalystId(){
            setFetchFields("fetchFields","failureAnalystId");
            return this;
        }

        public QueryBuilder excludeFailureAnalystId(){
            setFetchFields("excludeFields","failureAnalystId");
            return this;
        }

        public QueryBuilder fuzzyFailureAnalystName (List<String> fuzzyFailureAnalystName){
            this.fuzzyFailureAnalystName = fuzzyFailureAnalystName;
            return this;
        }

        public QueryBuilder fuzzyFailureAnalystName (String ... fuzzyFailureAnalystName){
            this.fuzzyFailureAnalystName = solveNullList(fuzzyFailureAnalystName);
            return this;
        }

        public QueryBuilder rightFuzzyFailureAnalystName (List<String> rightFuzzyFailureAnalystName){
            this.rightFuzzyFailureAnalystName = rightFuzzyFailureAnalystName;
            return this;
        }

        public QueryBuilder rightFuzzyFailureAnalystName (String ... rightFuzzyFailureAnalystName){
            this.rightFuzzyFailureAnalystName = solveNullList(rightFuzzyFailureAnalystName);
            return this;
        }

        public QueryBuilder failureAnalystName(String failureAnalystName){
            setFailureAnalystName(failureAnalystName);
            return this;
        }

        public QueryBuilder failureAnalystNameList(String ... failureAnalystName){
            this.failureAnalystNameList = solveNullList(failureAnalystName);
            return this;
        }

        public QueryBuilder failureAnalystNameList(List<String> failureAnalystName){
            this.failureAnalystNameList = failureAnalystName;
            return this;
        }

        public QueryBuilder fetchFailureAnalystName(){
            setFetchFields("fetchFields","failureAnalystName");
            return this;
        }

        public QueryBuilder excludeFailureAnalystName(){
            setFetchFields("excludeFields","failureAnalystName");
            return this;
        }

        public QueryBuilder fuzzyFailureAnalystDepartment (List<String> fuzzyFailureAnalystDepartment){
            this.fuzzyFailureAnalystDepartment = fuzzyFailureAnalystDepartment;
            return this;
        }

        public QueryBuilder fuzzyFailureAnalystDepartment (String ... fuzzyFailureAnalystDepartment){
            this.fuzzyFailureAnalystDepartment = solveNullList(fuzzyFailureAnalystDepartment);
            return this;
        }

        public QueryBuilder rightFuzzyFailureAnalystDepartment (List<String> rightFuzzyFailureAnalystDepartment){
            this.rightFuzzyFailureAnalystDepartment = rightFuzzyFailureAnalystDepartment;
            return this;
        }

        public QueryBuilder rightFuzzyFailureAnalystDepartment (String ... rightFuzzyFailureAnalystDepartment){
            this.rightFuzzyFailureAnalystDepartment = solveNullList(rightFuzzyFailureAnalystDepartment);
            return this;
        }

        public QueryBuilder failureAnalystDepartment(String failureAnalystDepartment){
            setFailureAnalystDepartment(failureAnalystDepartment);
            return this;
        }

        public QueryBuilder failureAnalystDepartmentList(String ... failureAnalystDepartment){
            this.failureAnalystDepartmentList = solveNullList(failureAnalystDepartment);
            return this;
        }

        public QueryBuilder failureAnalystDepartmentList(List<String> failureAnalystDepartment){
            this.failureAnalystDepartmentList = failureAnalystDepartment;
            return this;
        }

        public QueryBuilder fetchFailureAnalystDepartment(){
            setFetchFields("fetchFields","failureAnalystDepartment");
            return this;
        }

        public QueryBuilder excludeFailureAnalystDepartment(){
            setFetchFields("excludeFields","failureAnalystDepartment");
            return this;
        }

        public QueryBuilder fuzzyFailureAnalystComment (List<String> fuzzyFailureAnalystComment){
            this.fuzzyFailureAnalystComment = fuzzyFailureAnalystComment;
            return this;
        }

        public QueryBuilder fuzzyFailureAnalystComment (String ... fuzzyFailureAnalystComment){
            this.fuzzyFailureAnalystComment = solveNullList(fuzzyFailureAnalystComment);
            return this;
        }

        public QueryBuilder rightFuzzyFailureAnalystComment (List<String> rightFuzzyFailureAnalystComment){
            this.rightFuzzyFailureAnalystComment = rightFuzzyFailureAnalystComment;
            return this;
        }

        public QueryBuilder rightFuzzyFailureAnalystComment (String ... rightFuzzyFailureAnalystComment){
            this.rightFuzzyFailureAnalystComment = solveNullList(rightFuzzyFailureAnalystComment);
            return this;
        }

        public QueryBuilder failureAnalystComment(String failureAnalystComment){
            setFailureAnalystComment(failureAnalystComment);
            return this;
        }

        public QueryBuilder failureAnalystCommentList(String ... failureAnalystComment){
            this.failureAnalystCommentList = solveNullList(failureAnalystComment);
            return this;
        }

        public QueryBuilder failureAnalystCommentList(List<String> failureAnalystComment){
            this.failureAnalystCommentList = failureAnalystComment;
            return this;
        }

        public QueryBuilder fetchFailureAnalystComment(){
            setFetchFields("fetchFields","failureAnalystComment");
            return this;
        }

        public QueryBuilder excludeFailureAnalystComment(){
            setFetchFields("excludeFields","failureAnalystComment");
            return this;
        }

        public QueryBuilder saoIdBetWeen(Long saoIdSt,Long saoIdEd){
            this.saoIdSt = saoIdSt;
            this.saoIdEd = saoIdEd;
            return this;
        }

        public QueryBuilder saoIdGreaterEqThan(Long saoIdSt){
            this.saoIdSt = saoIdSt;
            return this;
        }
        public QueryBuilder saoIdLessEqThan(Long saoIdEd){
            this.saoIdEd = saoIdEd;
            return this;
        }


        public QueryBuilder saoId(Long saoId){
            setSaoId(saoId);
            return this;
        }

        public QueryBuilder saoIdList(Long ... saoId){
            this.saoIdList = solveNullList(saoId);
            return this;
        }

        public QueryBuilder saoIdList(List<Long> saoId){
            this.saoIdList = saoId;
            return this;
        }

        public QueryBuilder fetchSaoId(){
            setFetchFields("fetchFields","saoId");
            return this;
        }

        public QueryBuilder excludeSaoId(){
            setFetchFields("excludeFields","saoId");
            return this;
        }

        public QueryBuilder fuzzyFlag (List<String> fuzzyFlag){
            this.fuzzyFlag = fuzzyFlag;
            return this;
        }

        public QueryBuilder fuzzyFlag (String ... fuzzyFlag){
            this.fuzzyFlag = solveNullList(fuzzyFlag);
            return this;
        }

        public QueryBuilder rightFuzzyFlag (List<String> rightFuzzyFlag){
            this.rightFuzzyFlag = rightFuzzyFlag;
            return this;
        }

        public QueryBuilder rightFuzzyFlag (String ... rightFuzzyFlag){
            this.rightFuzzyFlag = solveNullList(rightFuzzyFlag);
            return this;
        }

        public QueryBuilder flag(String flag){
            setFlag(flag);
            return this;
        }

        public QueryBuilder flagList(String ... flag){
            this.flagList = solveNullList(flag);
            return this;
        }

        public QueryBuilder flagList(List<String> flag){
            this.flagList = flag;
            return this;
        }

        public QueryBuilder fetchFlag(){
            setFetchFields("fetchFields","flag");
            return this;
        }

        public QueryBuilder excludeFlag(){
            setFetchFields("excludeFields","flag");
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

        public QueryBuilder fuzzySubmitDate (List<String> fuzzySubmitDate){
            this.fuzzySubmitDate = fuzzySubmitDate;
            return this;
        }

        public QueryBuilder fuzzySubmitDate (String ... fuzzySubmitDate){
            this.fuzzySubmitDate = solveNullList(fuzzySubmitDate);
            return this;
        }

        public QueryBuilder rightFuzzySubmitDate (List<String> rightFuzzySubmitDate){
            this.rightFuzzySubmitDate = rightFuzzySubmitDate;
            return this;
        }

        public QueryBuilder rightFuzzySubmitDate (String ... rightFuzzySubmitDate){
            this.rightFuzzySubmitDate = solveNullList(rightFuzzySubmitDate);
            return this;
        }

        public QueryBuilder submitDate(String submitDate){
            setSubmitDate(submitDate);
            return this;
        }

        public QueryBuilder submitDateList(String ... submitDate){
            this.submitDateList = solveNullList(submitDate);
            return this;
        }

        public QueryBuilder submitDateList(List<String> submitDate){
            this.submitDateList = submitDate;
            return this;
        }

        public QueryBuilder fetchSubmitDate(){
            setFetchFields("fetchFields","submitDate");
            return this;
        }

        public QueryBuilder excludeSubmitDate(){
            setFetchFields("excludeFields","submitDate");
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

        public MqmsFailureAnalysis build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> failureAnalysisIdList;

        public List<Integer> getFailureAnalysisIdList(){return this.failureAnalysisIdList;}

        private Integer failureAnalysisIdSt;

        private Integer failureAnalysisIdEd;

        public Integer getFailureAnalysisIdSt(){return this.failureAnalysisIdSt;}

        public Integer getFailureAnalysisIdEd(){return this.failureAnalysisIdEd;}

        private List<Integer> failureTrackIdList;

        public List<Integer> getFailureTrackIdList(){return this.failureTrackIdList;}

        private Integer failureTrackIdSt;

        private Integer failureTrackIdEd;

        public Integer getFailureTrackIdSt(){return this.failureTrackIdSt;}

        public Integer getFailureTrackIdEd(){return this.failureTrackIdEd;}

        private List<Integer> failureAnalystIdList;

        public List<Integer> getFailureAnalystIdList(){return this.failureAnalystIdList;}

        private Integer failureAnalystIdSt;

        private Integer failureAnalystIdEd;

        public Integer getFailureAnalystIdSt(){return this.failureAnalystIdSt;}

        public Integer getFailureAnalystIdEd(){return this.failureAnalystIdEd;}

        private List<String> failureAnalystNameList;

        public List<String> getFailureAnalystNameList(){return this.failureAnalystNameList;}


        private List<String> fuzzyFailureAnalystName;

        public List<String> getFuzzyFailureAnalystName(){return this.fuzzyFailureAnalystName;}

        private List<String> rightFuzzyFailureAnalystName;

        public List<String> getRightFuzzyFailureAnalystName(){return this.rightFuzzyFailureAnalystName;}
        private List<String> failureAnalystDepartmentList;

        public List<String> getFailureAnalystDepartmentList(){return this.failureAnalystDepartmentList;}


        private List<String> fuzzyFailureAnalystDepartment;

        public List<String> getFuzzyFailureAnalystDepartment(){return this.fuzzyFailureAnalystDepartment;}

        private List<String> rightFuzzyFailureAnalystDepartment;

        public List<String> getRightFuzzyFailureAnalystDepartment(){return this.rightFuzzyFailureAnalystDepartment;}
        private List<String> failureAnalystCommentList;

        public List<String> getFailureAnalystCommentList(){return this.failureAnalystCommentList;}


        private List<String> fuzzyFailureAnalystComment;

        public List<String> getFuzzyFailureAnalystComment(){return this.fuzzyFailureAnalystComment;}

        private List<String> rightFuzzyFailureAnalystComment;

        public List<String> getRightFuzzyFailureAnalystComment(){return this.rightFuzzyFailureAnalystComment;}
        private List<Long> saoIdList;

        public List<Long> getSaoIdList(){return this.saoIdList;}

        private Long saoIdSt;

        private Long saoIdEd;

        public Long getSaoIdSt(){return this.saoIdSt;}

        public Long getSaoIdEd(){return this.saoIdEd;}

        private List<String> flagList;

        public List<String> getFlagList(){return this.flagList;}


        private List<String> fuzzyFlag;

        public List<String> getFuzzyFlag(){return this.fuzzyFlag;}

        private List<String> rightFuzzyFlag;

        public List<String> getRightFuzzyFlag(){return this.rightFuzzyFlag;}
        private List<String> taskNameList;

        public List<String> getTaskNameList(){return this.taskNameList;}


        private List<String> fuzzyTaskName;

        public List<String> getFuzzyTaskName(){return this.fuzzyTaskName;}

        private List<String> rightFuzzyTaskName;

        public List<String> getRightFuzzyTaskName(){return this.rightFuzzyTaskName;}
        private List<String> taskIdList;

        public List<String> getTaskIdList(){return this.taskIdList;}


        private List<String> fuzzyTaskId;

        public List<String> getFuzzyTaskId(){return this.fuzzyTaskId;}

        private List<String> rightFuzzyTaskId;

        public List<String> getRightFuzzyTaskId(){return this.rightFuzzyTaskId;}
        private List<String> submitDateList;

        public List<String> getSubmitDateList(){return this.submitDateList;}


        private List<String> fuzzySubmitDate;

        public List<String> getFuzzySubmitDate(){return this.fuzzySubmitDate;}

        private List<String> rightFuzzySubmitDate;

        public List<String> getRightFuzzySubmitDate(){return this.rightFuzzySubmitDate;}

        public ConditionBuilder failureAnalysisIdBetWeen(Integer failureAnalysisIdSt,Integer failureAnalysisIdEd){
            this.failureAnalysisIdSt = failureAnalysisIdSt;
            this.failureAnalysisIdEd = failureAnalysisIdEd;
            return this;
        }

        public ConditionBuilder failureAnalysisIdGreaterEqThan(Integer failureAnalysisIdSt){
            this.failureAnalysisIdSt = failureAnalysisIdSt;
            return this;
        }
        public ConditionBuilder failureAnalysisIdLessEqThan(Integer failureAnalysisIdEd){
            this.failureAnalysisIdEd = failureAnalysisIdEd;
            return this;
        }


        public ConditionBuilder failureAnalysisIdList(Integer ... failureAnalysisId){
            this.failureAnalysisIdList = solveNullList(failureAnalysisId);
            return this;
        }

        public ConditionBuilder failureAnalysisIdList(List<Integer> failureAnalysisId){
            this.failureAnalysisIdList = failureAnalysisId;
            return this;
        }

        public ConditionBuilder failureTrackIdBetWeen(Integer failureTrackIdSt,Integer failureTrackIdEd){
            this.failureTrackIdSt = failureTrackIdSt;
            this.failureTrackIdEd = failureTrackIdEd;
            return this;
        }

        public ConditionBuilder failureTrackIdGreaterEqThan(Integer failureTrackIdSt){
            this.failureTrackIdSt = failureTrackIdSt;
            return this;
        }
        public ConditionBuilder failureTrackIdLessEqThan(Integer failureTrackIdEd){
            this.failureTrackIdEd = failureTrackIdEd;
            return this;
        }


        public ConditionBuilder failureTrackIdList(Integer ... failureTrackId){
            this.failureTrackIdList = solveNullList(failureTrackId);
            return this;
        }

        public ConditionBuilder failureTrackIdList(List<Integer> failureTrackId){
            this.failureTrackIdList = failureTrackId;
            return this;
        }

        public ConditionBuilder failureAnalystIdBetWeen(Integer failureAnalystIdSt,Integer failureAnalystIdEd){
            this.failureAnalystIdSt = failureAnalystIdSt;
            this.failureAnalystIdEd = failureAnalystIdEd;
            return this;
        }

        public ConditionBuilder failureAnalystIdGreaterEqThan(Integer failureAnalystIdSt){
            this.failureAnalystIdSt = failureAnalystIdSt;
            return this;
        }
        public ConditionBuilder failureAnalystIdLessEqThan(Integer failureAnalystIdEd){
            this.failureAnalystIdEd = failureAnalystIdEd;
            return this;
        }


        public ConditionBuilder failureAnalystIdList(Integer ... failureAnalystId){
            this.failureAnalystIdList = solveNullList(failureAnalystId);
            return this;
        }

        public ConditionBuilder failureAnalystIdList(List<Integer> failureAnalystId){
            this.failureAnalystIdList = failureAnalystId;
            return this;
        }

        public ConditionBuilder fuzzyFailureAnalystName (List<String> fuzzyFailureAnalystName){
            this.fuzzyFailureAnalystName = fuzzyFailureAnalystName;
            return this;
        }

        public ConditionBuilder fuzzyFailureAnalystName (String ... fuzzyFailureAnalystName){
            this.fuzzyFailureAnalystName = solveNullList(fuzzyFailureAnalystName);
            return this;
        }

        public ConditionBuilder rightFuzzyFailureAnalystName (List<String> rightFuzzyFailureAnalystName){
            this.rightFuzzyFailureAnalystName = rightFuzzyFailureAnalystName;
            return this;
        }

        public ConditionBuilder rightFuzzyFailureAnalystName (String ... rightFuzzyFailureAnalystName){
            this.rightFuzzyFailureAnalystName = solveNullList(rightFuzzyFailureAnalystName);
            return this;
        }

        public ConditionBuilder failureAnalystNameList(String ... failureAnalystName){
            this.failureAnalystNameList = solveNullList(failureAnalystName);
            return this;
        }

        public ConditionBuilder failureAnalystNameList(List<String> failureAnalystName){
            this.failureAnalystNameList = failureAnalystName;
            return this;
        }

        public ConditionBuilder fuzzyFailureAnalystDepartment (List<String> fuzzyFailureAnalystDepartment){
            this.fuzzyFailureAnalystDepartment = fuzzyFailureAnalystDepartment;
            return this;
        }

        public ConditionBuilder fuzzyFailureAnalystDepartment (String ... fuzzyFailureAnalystDepartment){
            this.fuzzyFailureAnalystDepartment = solveNullList(fuzzyFailureAnalystDepartment);
            return this;
        }

        public ConditionBuilder rightFuzzyFailureAnalystDepartment (List<String> rightFuzzyFailureAnalystDepartment){
            this.rightFuzzyFailureAnalystDepartment = rightFuzzyFailureAnalystDepartment;
            return this;
        }

        public ConditionBuilder rightFuzzyFailureAnalystDepartment (String ... rightFuzzyFailureAnalystDepartment){
            this.rightFuzzyFailureAnalystDepartment = solveNullList(rightFuzzyFailureAnalystDepartment);
            return this;
        }

        public ConditionBuilder failureAnalystDepartmentList(String ... failureAnalystDepartment){
            this.failureAnalystDepartmentList = solveNullList(failureAnalystDepartment);
            return this;
        }

        public ConditionBuilder failureAnalystDepartmentList(List<String> failureAnalystDepartment){
            this.failureAnalystDepartmentList = failureAnalystDepartment;
            return this;
        }

        public ConditionBuilder fuzzyFailureAnalystComment (List<String> fuzzyFailureAnalystComment){
            this.fuzzyFailureAnalystComment = fuzzyFailureAnalystComment;
            return this;
        }

        public ConditionBuilder fuzzyFailureAnalystComment (String ... fuzzyFailureAnalystComment){
            this.fuzzyFailureAnalystComment = solveNullList(fuzzyFailureAnalystComment);
            return this;
        }

        public ConditionBuilder rightFuzzyFailureAnalystComment (List<String> rightFuzzyFailureAnalystComment){
            this.rightFuzzyFailureAnalystComment = rightFuzzyFailureAnalystComment;
            return this;
        }

        public ConditionBuilder rightFuzzyFailureAnalystComment (String ... rightFuzzyFailureAnalystComment){
            this.rightFuzzyFailureAnalystComment = solveNullList(rightFuzzyFailureAnalystComment);
            return this;
        }

        public ConditionBuilder failureAnalystCommentList(String ... failureAnalystComment){
            this.failureAnalystCommentList = solveNullList(failureAnalystComment);
            return this;
        }

        public ConditionBuilder failureAnalystCommentList(List<String> failureAnalystComment){
            this.failureAnalystCommentList = failureAnalystComment;
            return this;
        }

        public ConditionBuilder saoIdBetWeen(Long saoIdSt,Long saoIdEd){
            this.saoIdSt = saoIdSt;
            this.saoIdEd = saoIdEd;
            return this;
        }

        public ConditionBuilder saoIdGreaterEqThan(Long saoIdSt){
            this.saoIdSt = saoIdSt;
            return this;
        }
        public ConditionBuilder saoIdLessEqThan(Long saoIdEd){
            this.saoIdEd = saoIdEd;
            return this;
        }


        public ConditionBuilder saoIdList(Long ... saoId){
            this.saoIdList = solveNullList(saoId);
            return this;
        }

        public ConditionBuilder saoIdList(List<Long> saoId){
            this.saoIdList = saoId;
            return this;
        }

        public ConditionBuilder fuzzyFlag (List<String> fuzzyFlag){
            this.fuzzyFlag = fuzzyFlag;
            return this;
        }

        public ConditionBuilder fuzzyFlag (String ... fuzzyFlag){
            this.fuzzyFlag = solveNullList(fuzzyFlag);
            return this;
        }

        public ConditionBuilder rightFuzzyFlag (List<String> rightFuzzyFlag){
            this.rightFuzzyFlag = rightFuzzyFlag;
            return this;
        }

        public ConditionBuilder rightFuzzyFlag (String ... rightFuzzyFlag){
            this.rightFuzzyFlag = solveNullList(rightFuzzyFlag);
            return this;
        }

        public ConditionBuilder flagList(String ... flag){
            this.flagList = solveNullList(flag);
            return this;
        }

        public ConditionBuilder flagList(List<String> flag){
            this.flagList = flag;
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

        public ConditionBuilder fuzzySubmitDate (List<String> fuzzySubmitDate){
            this.fuzzySubmitDate = fuzzySubmitDate;
            return this;
        }

        public ConditionBuilder fuzzySubmitDate (String ... fuzzySubmitDate){
            this.fuzzySubmitDate = solveNullList(fuzzySubmitDate);
            return this;
        }

        public ConditionBuilder rightFuzzySubmitDate (List<String> rightFuzzySubmitDate){
            this.rightFuzzySubmitDate = rightFuzzySubmitDate;
            return this;
        }

        public ConditionBuilder rightFuzzySubmitDate (String ... rightFuzzySubmitDate){
            this.rightFuzzySubmitDate = solveNullList(rightFuzzySubmitDate);
            return this;
        }

        public ConditionBuilder submitDateList(String ... submitDate){
            this.submitDateList = solveNullList(submitDate);
            return this;
        }

        public ConditionBuilder submitDateList(List<String> submitDate){
            this.submitDateList = submitDate;
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

        private MqmsFailureAnalysis obj;

        public Builder(){
            this.obj = new MqmsFailureAnalysis();
        }

        public Builder failureAnalysisId(Integer failureAnalysisId){
            this.obj.setFailureAnalysisId(failureAnalysisId);
            return this;
        }
        public Builder failureTrackId(Integer failureTrackId){
            this.obj.setFailureTrackId(failureTrackId);
            return this;
        }
        public Builder failureAnalystId(Integer failureAnalystId){
            this.obj.setFailureAnalystId(failureAnalystId);
            return this;
        }
        public Builder failureAnalystName(String failureAnalystName){
            this.obj.setFailureAnalystName(failureAnalystName);
            return this;
        }
        public Builder failureAnalystDepartment(String failureAnalystDepartment){
            this.obj.setFailureAnalystDepartment(failureAnalystDepartment);
            return this;
        }
        public Builder failureAnalystComment(String failureAnalystComment){
            this.obj.setFailureAnalystComment(failureAnalystComment);
            return this;
        }
        public Builder saoId(Long saoId){
            this.obj.setSaoId(saoId);
            return this;
        }
        public Builder flag(String flag){
            this.obj.setFlag(flag);
            return this;
        }
        public Builder taskName(String taskName){
            this.obj.setTaskName(taskName);
            return this;
        }
        public Builder taskId(String taskId){
            this.obj.setTaskId(taskId);
            return this;
        }
        public Builder submitDate(String submitDate){
            this.obj.setSubmitDate(submitDate);
            return this;
        }
        public MqmsFailureAnalysis build(){return obj;}
    }

}
