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

    private static final long serialVersionUID = 1583454529425L;


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
    @Override
    public String toString() {
        return "MqmsFailureAnalysis{" +
                "failureAnalysisId='" + failureAnalysisId + '\'' +
                "failureTrackId='" + failureTrackId + '\'' +
                "failureAnalystId='" + failureAnalystId + '\'' +
                "failureAnalystName='" + failureAnalystName + '\'' +
                "failureAnalystDepartment='" + failureAnalystDepartment + '\'' +
                "failureAnalystComment='" + failureAnalystComment + '\'' +
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
        public MqmsFailureAnalysis build(){return obj;}
    }

}
