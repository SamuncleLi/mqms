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
public class MqmsFailureReport implements Serializable {

    private static final long serialVersionUID = 1582708666494L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer failureReportId;

    /**
    * 质量反馈单单号
    * isNullAble:1
    */
    private String voucherCode;

    /**
    * 发动机型号
    * isNullAble:1
    */
    private String engType;

    /**
    * 发生时间
    * isNullAble:1
    */
    private String happenDate;

    /**
    * eng整理
    * isNullAble:1
    */
    private String engArrange;


    public void setFailureReportId(Integer failureReportId){this.failureReportId = failureReportId;}

    public Integer getFailureReportId(){return this.failureReportId;}

    public void setVoucherCode(String voucherCode){this.voucherCode = voucherCode;}

    public String getVoucherCode(){return this.voucherCode;}

    public void setEngType(String engType){this.engType = engType;}

    public String getEngType(){return this.engType;}

    public void setHappenDate(String happenDate){this.happenDate = happenDate;}

    public String getHappenDate(){return this.happenDate;}

    public void setEngArrange(String engArrange){this.engArrange = engArrange;}

    public String getEngArrange(){return this.engArrange;}
    @Override
    public String toString() {
        return "MqmsFailureReport{" +
                "failureReportId='" + failureReportId + '\'' +
                "voucherCode='" + voucherCode + '\'' +
                "engType='" + engType + '\'' +
                "happenDate='" + happenDate + '\'' +
                "engArrange='" + engArrange + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsFailureReport set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsFailureReport set){
            this.set = set;
            return this;
        }

        public MqmsFailureReport getSet(){
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

    public static class QueryBuilder extends MqmsFailureReport{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> failureReportIdList;

        public List<Integer> getFailureReportIdList(){return this.failureReportIdList;}

        private Integer failureReportIdSt;

        private Integer failureReportIdEd;

        public Integer getFailureReportIdSt(){return this.failureReportIdSt;}

        public Integer getFailureReportIdEd(){return this.failureReportIdEd;}

        private List<String> voucherCodeList;

        public List<String> getVoucherCodeList(){return this.voucherCodeList;}


        private List<String> fuzzyVoucherCode;

        public List<String> getFuzzyVoucherCode(){return this.fuzzyVoucherCode;}

        private List<String> rightFuzzyVoucherCode;

        public List<String> getRightFuzzyVoucherCode(){return this.rightFuzzyVoucherCode;}
        private List<String> engTypeList;

        public List<String> getEngTypeList(){return this.engTypeList;}


        private List<String> fuzzyEngType;

        public List<String> getFuzzyEngType(){return this.fuzzyEngType;}

        private List<String> rightFuzzyEngType;

        public List<String> getRightFuzzyEngType(){return this.rightFuzzyEngType;}
        private List<String> happenDateList;

        public List<String> getHappenDateList(){return this.happenDateList;}


        private List<String> fuzzyHappenDate;

        public List<String> getFuzzyHappenDate(){return this.fuzzyHappenDate;}

        private List<String> rightFuzzyHappenDate;

        public List<String> getRightFuzzyHappenDate(){return this.rightFuzzyHappenDate;}
        private List<String> engArrangeList;

        public List<String> getEngArrangeList(){return this.engArrangeList;}


        private List<String> fuzzyEngArrange;

        public List<String> getFuzzyEngArrange(){return this.fuzzyEngArrange;}

        private List<String> rightFuzzyEngArrange;

        public List<String> getRightFuzzyEngArrange(){return this.rightFuzzyEngArrange;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder failureReportIdBetWeen(Integer failureReportIdSt,Integer failureReportIdEd){
            this.failureReportIdSt = failureReportIdSt;
            this.failureReportIdEd = failureReportIdEd;
            return this;
        }

        public QueryBuilder failureReportIdGreaterEqThan(Integer failureReportIdSt){
            this.failureReportIdSt = failureReportIdSt;
            return this;
        }
        public QueryBuilder failureReportIdLessEqThan(Integer failureReportIdEd){
            this.failureReportIdEd = failureReportIdEd;
            return this;
        }


        public QueryBuilder failureReportId(Integer failureReportId){
            setFailureReportId(failureReportId);
            return this;
        }

        public QueryBuilder failureReportIdList(Integer ... failureReportId){
            this.failureReportIdList = solveNullList(failureReportId);
            return this;
        }

        public QueryBuilder failureReportIdList(List<Integer> failureReportId){
            this.failureReportIdList = failureReportId;
            return this;
        }

        public QueryBuilder fetchFailureReportId(){
            setFetchFields("fetchFields","failureReportId");
            return this;
        }

        public QueryBuilder excludeFailureReportId(){
            setFetchFields("excludeFields","failureReportId");
            return this;
        }

        public QueryBuilder fuzzyVoucherCode (List<String> fuzzyVoucherCode){
            this.fuzzyVoucherCode = fuzzyVoucherCode;
            return this;
        }

        public QueryBuilder fuzzyVoucherCode (String ... fuzzyVoucherCode){
            this.fuzzyVoucherCode = solveNullList(fuzzyVoucherCode);
            return this;
        }

        public QueryBuilder rightFuzzyVoucherCode (List<String> rightFuzzyVoucherCode){
            this.rightFuzzyVoucherCode = rightFuzzyVoucherCode;
            return this;
        }

        public QueryBuilder rightFuzzyVoucherCode (String ... rightFuzzyVoucherCode){
            this.rightFuzzyVoucherCode = solveNullList(rightFuzzyVoucherCode);
            return this;
        }

        public QueryBuilder voucherCode(String voucherCode){
            setVoucherCode(voucherCode);
            return this;
        }

        public QueryBuilder voucherCodeList(String ... voucherCode){
            this.voucherCodeList = solveNullList(voucherCode);
            return this;
        }

        public QueryBuilder voucherCodeList(List<String> voucherCode){
            this.voucherCodeList = voucherCode;
            return this;
        }

        public QueryBuilder fetchVoucherCode(){
            setFetchFields("fetchFields","voucherCode");
            return this;
        }

        public QueryBuilder excludeVoucherCode(){
            setFetchFields("excludeFields","voucherCode");
            return this;
        }

        public QueryBuilder fuzzyEngType (List<String> fuzzyEngType){
            this.fuzzyEngType = fuzzyEngType;
            return this;
        }

        public QueryBuilder fuzzyEngType (String ... fuzzyEngType){
            this.fuzzyEngType = solveNullList(fuzzyEngType);
            return this;
        }

        public QueryBuilder rightFuzzyEngType (List<String> rightFuzzyEngType){
            this.rightFuzzyEngType = rightFuzzyEngType;
            return this;
        }

        public QueryBuilder rightFuzzyEngType (String ... rightFuzzyEngType){
            this.rightFuzzyEngType = solveNullList(rightFuzzyEngType);
            return this;
        }

        public QueryBuilder engType(String engType){
            setEngType(engType);
            return this;
        }

        public QueryBuilder engTypeList(String ... engType){
            this.engTypeList = solveNullList(engType);
            return this;
        }

        public QueryBuilder engTypeList(List<String> engType){
            this.engTypeList = engType;
            return this;
        }

        public QueryBuilder fetchEngType(){
            setFetchFields("fetchFields","engType");
            return this;
        }

        public QueryBuilder excludeEngType(){
            setFetchFields("excludeFields","engType");
            return this;
        }

        public QueryBuilder fuzzyHappenDate (List<String> fuzzyHappenDate){
            this.fuzzyHappenDate = fuzzyHappenDate;
            return this;
        }

        public QueryBuilder fuzzyHappenDate (String ... fuzzyHappenDate){
            this.fuzzyHappenDate = solveNullList(fuzzyHappenDate);
            return this;
        }

        public QueryBuilder rightFuzzyHappenDate (List<String> rightFuzzyHappenDate){
            this.rightFuzzyHappenDate = rightFuzzyHappenDate;
            return this;
        }

        public QueryBuilder rightFuzzyHappenDate (String ... rightFuzzyHappenDate){
            this.rightFuzzyHappenDate = solveNullList(rightFuzzyHappenDate);
            return this;
        }

        public QueryBuilder happenDate(String happenDate){
            setHappenDate(happenDate);
            return this;
        }

        public QueryBuilder happenDateList(String ... happenDate){
            this.happenDateList = solveNullList(happenDate);
            return this;
        }

        public QueryBuilder happenDateList(List<String> happenDate){
            this.happenDateList = happenDate;
            return this;
        }

        public QueryBuilder fetchHappenDate(){
            setFetchFields("fetchFields","happenDate");
            return this;
        }

        public QueryBuilder excludeHappenDate(){
            setFetchFields("excludeFields","happenDate");
            return this;
        }

        public QueryBuilder fuzzyEngArrange (List<String> fuzzyEngArrange){
            this.fuzzyEngArrange = fuzzyEngArrange;
            return this;
        }

        public QueryBuilder fuzzyEngArrange (String ... fuzzyEngArrange){
            this.fuzzyEngArrange = solveNullList(fuzzyEngArrange);
            return this;
        }

        public QueryBuilder rightFuzzyEngArrange (List<String> rightFuzzyEngArrange){
            this.rightFuzzyEngArrange = rightFuzzyEngArrange;
            return this;
        }

        public QueryBuilder rightFuzzyEngArrange (String ... rightFuzzyEngArrange){
            this.rightFuzzyEngArrange = solveNullList(rightFuzzyEngArrange);
            return this;
        }

        public QueryBuilder engArrange(String engArrange){
            setEngArrange(engArrange);
            return this;
        }

        public QueryBuilder engArrangeList(String ... engArrange){
            this.engArrangeList = solveNullList(engArrange);
            return this;
        }

        public QueryBuilder engArrangeList(List<String> engArrange){
            this.engArrangeList = engArrange;
            return this;
        }

        public QueryBuilder fetchEngArrange(){
            setFetchFields("fetchFields","engArrange");
            return this;
        }

        public QueryBuilder excludeEngArrange(){
            setFetchFields("excludeFields","engArrange");
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

        public MqmsFailureReport build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> failureReportIdList;

        public List<Integer> getFailureReportIdList(){return this.failureReportIdList;}

        private Integer failureReportIdSt;

        private Integer failureReportIdEd;

        public Integer getFailureReportIdSt(){return this.failureReportIdSt;}

        public Integer getFailureReportIdEd(){return this.failureReportIdEd;}

        private List<String> voucherCodeList;

        public List<String> getVoucherCodeList(){return this.voucherCodeList;}


        private List<String> fuzzyVoucherCode;

        public List<String> getFuzzyVoucherCode(){return this.fuzzyVoucherCode;}

        private List<String> rightFuzzyVoucherCode;

        public List<String> getRightFuzzyVoucherCode(){return this.rightFuzzyVoucherCode;}
        private List<String> engTypeList;

        public List<String> getEngTypeList(){return this.engTypeList;}


        private List<String> fuzzyEngType;

        public List<String> getFuzzyEngType(){return this.fuzzyEngType;}

        private List<String> rightFuzzyEngType;

        public List<String> getRightFuzzyEngType(){return this.rightFuzzyEngType;}
        private List<String> happenDateList;

        public List<String> getHappenDateList(){return this.happenDateList;}


        private List<String> fuzzyHappenDate;

        public List<String> getFuzzyHappenDate(){return this.fuzzyHappenDate;}

        private List<String> rightFuzzyHappenDate;

        public List<String> getRightFuzzyHappenDate(){return this.rightFuzzyHappenDate;}
        private List<String> engArrangeList;

        public List<String> getEngArrangeList(){return this.engArrangeList;}


        private List<String> fuzzyEngArrange;

        public List<String> getFuzzyEngArrange(){return this.fuzzyEngArrange;}

        private List<String> rightFuzzyEngArrange;

        public List<String> getRightFuzzyEngArrange(){return this.rightFuzzyEngArrange;}

        public ConditionBuilder failureReportIdBetWeen(Integer failureReportIdSt,Integer failureReportIdEd){
            this.failureReportIdSt = failureReportIdSt;
            this.failureReportIdEd = failureReportIdEd;
            return this;
        }

        public ConditionBuilder failureReportIdGreaterEqThan(Integer failureReportIdSt){
            this.failureReportIdSt = failureReportIdSt;
            return this;
        }
        public ConditionBuilder failureReportIdLessEqThan(Integer failureReportIdEd){
            this.failureReportIdEd = failureReportIdEd;
            return this;
        }


        public ConditionBuilder failureReportIdList(Integer ... failureReportId){
            this.failureReportIdList = solveNullList(failureReportId);
            return this;
        }

        public ConditionBuilder failureReportIdList(List<Integer> failureReportId){
            this.failureReportIdList = failureReportId;
            return this;
        }

        public ConditionBuilder fuzzyVoucherCode (List<String> fuzzyVoucherCode){
            this.fuzzyVoucherCode = fuzzyVoucherCode;
            return this;
        }

        public ConditionBuilder fuzzyVoucherCode (String ... fuzzyVoucherCode){
            this.fuzzyVoucherCode = solveNullList(fuzzyVoucherCode);
            return this;
        }

        public ConditionBuilder rightFuzzyVoucherCode (List<String> rightFuzzyVoucherCode){
            this.rightFuzzyVoucherCode = rightFuzzyVoucherCode;
            return this;
        }

        public ConditionBuilder rightFuzzyVoucherCode (String ... rightFuzzyVoucherCode){
            this.rightFuzzyVoucherCode = solveNullList(rightFuzzyVoucherCode);
            return this;
        }

        public ConditionBuilder voucherCodeList(String ... voucherCode){
            this.voucherCodeList = solveNullList(voucherCode);
            return this;
        }

        public ConditionBuilder voucherCodeList(List<String> voucherCode){
            this.voucherCodeList = voucherCode;
            return this;
        }

        public ConditionBuilder fuzzyEngType (List<String> fuzzyEngType){
            this.fuzzyEngType = fuzzyEngType;
            return this;
        }

        public ConditionBuilder fuzzyEngType (String ... fuzzyEngType){
            this.fuzzyEngType = solveNullList(fuzzyEngType);
            return this;
        }

        public ConditionBuilder rightFuzzyEngType (List<String> rightFuzzyEngType){
            this.rightFuzzyEngType = rightFuzzyEngType;
            return this;
        }

        public ConditionBuilder rightFuzzyEngType (String ... rightFuzzyEngType){
            this.rightFuzzyEngType = solveNullList(rightFuzzyEngType);
            return this;
        }

        public ConditionBuilder engTypeList(String ... engType){
            this.engTypeList = solveNullList(engType);
            return this;
        }

        public ConditionBuilder engTypeList(List<String> engType){
            this.engTypeList = engType;
            return this;
        }

        public ConditionBuilder fuzzyHappenDate (List<String> fuzzyHappenDate){
            this.fuzzyHappenDate = fuzzyHappenDate;
            return this;
        }

        public ConditionBuilder fuzzyHappenDate (String ... fuzzyHappenDate){
            this.fuzzyHappenDate = solveNullList(fuzzyHappenDate);
            return this;
        }

        public ConditionBuilder rightFuzzyHappenDate (List<String> rightFuzzyHappenDate){
            this.rightFuzzyHappenDate = rightFuzzyHappenDate;
            return this;
        }

        public ConditionBuilder rightFuzzyHappenDate (String ... rightFuzzyHappenDate){
            this.rightFuzzyHappenDate = solveNullList(rightFuzzyHappenDate);
            return this;
        }

        public ConditionBuilder happenDateList(String ... happenDate){
            this.happenDateList = solveNullList(happenDate);
            return this;
        }

        public ConditionBuilder happenDateList(List<String> happenDate){
            this.happenDateList = happenDate;
            return this;
        }

        public ConditionBuilder fuzzyEngArrange (List<String> fuzzyEngArrange){
            this.fuzzyEngArrange = fuzzyEngArrange;
            return this;
        }

        public ConditionBuilder fuzzyEngArrange (String ... fuzzyEngArrange){
            this.fuzzyEngArrange = solveNullList(fuzzyEngArrange);
            return this;
        }

        public ConditionBuilder rightFuzzyEngArrange (List<String> rightFuzzyEngArrange){
            this.rightFuzzyEngArrange = rightFuzzyEngArrange;
            return this;
        }

        public ConditionBuilder rightFuzzyEngArrange (String ... rightFuzzyEngArrange){
            this.rightFuzzyEngArrange = solveNullList(rightFuzzyEngArrange);
            return this;
        }

        public ConditionBuilder engArrangeList(String ... engArrange){
            this.engArrangeList = solveNullList(engArrange);
            return this;
        }

        public ConditionBuilder engArrangeList(List<String> engArrange){
            this.engArrangeList = engArrange;
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

        private MqmsFailureReport obj;

        public Builder(){
            this.obj = new MqmsFailureReport();
        }

        public Builder failureReportId(Integer failureReportId){
            this.obj.setFailureReportId(failureReportId);
            return this;
        }
        public Builder voucherCode(String voucherCode){
            this.obj.setVoucherCode(voucherCode);
            return this;
        }
        public Builder engType(String engType){
            this.obj.setEngType(engType);
            return this;
        }
        public Builder happenDate(String happenDate){
            this.obj.setHappenDate(happenDate);
            return this;
        }
        public Builder engArrange(String engArrange){
            this.obj.setEngArrange(engArrange);
            return this;
        }
        public MqmsFailureReport build(){return obj;}
    }

}
