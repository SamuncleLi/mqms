package com.gamc.efactory.model.dataObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author wangjian
*/
public class MqmsTranYearDecode implements Serializable {

    private static final long serialVersionUID = 1582624189640L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 变速箱年份代码
    * isNullAble:1
    */
    private String tranProYearCode;

    /**
    * 变速箱生产年份
    * isNullAble:1
    */
    private String tranProYear;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setTranProYearCode(String tranProYearCode){this.tranProYearCode = tranProYearCode;}

    public String getTranProYearCode(){return this.tranProYearCode;}

    public void setTranProYear(String tranProYear){this.tranProYear = tranProYear;}

    public String getTranProYear(){return this.tranProYear;}
    @Override
    public String toString() {
        return "MqmsTranYearDecode{" +
                "id='" + id + '\'' +
                "tranProYearCode='" + tranProYearCode + '\'' +
                "tranProYear='" + tranProYear + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsTranYearDecode set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsTranYearDecode set){
            this.set = set;
            return this;
        }

        public MqmsTranYearDecode getSet(){
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

    public static class QueryBuilder extends MqmsTranYearDecode{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> tranProYearCodeList;

        public List<String> getTranProYearCodeList(){return this.tranProYearCodeList;}


        private List<String> fuzzyTranProYearCode;

        public List<String> getFuzzyTranProYearCode(){return this.fuzzyTranProYearCode;}

        private List<String> rightFuzzyTranProYearCode;

        public List<String> getRightFuzzyTranProYearCode(){return this.rightFuzzyTranProYearCode;}
        private List<String> tranProYearList;

        public List<String> getTranProYearList(){return this.tranProYearList;}


        private List<String> fuzzyTranProYear;

        public List<String> getFuzzyTranProYear(){return this.fuzzyTranProYear;}

        private List<String> rightFuzzyTranProYear;

        public List<String> getRightFuzzyTranProYear(){return this.rightFuzzyTranProYear;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyTranProYearCode (List<String> fuzzyTranProYearCode){
            this.fuzzyTranProYearCode = fuzzyTranProYearCode;
            return this;
        }

        public QueryBuilder fuzzyTranProYearCode (String ... fuzzyTranProYearCode){
            this.fuzzyTranProYearCode = solveNullList(fuzzyTranProYearCode);
            return this;
        }

        public QueryBuilder rightFuzzyTranProYearCode (List<String> rightFuzzyTranProYearCode){
            this.rightFuzzyTranProYearCode = rightFuzzyTranProYearCode;
            return this;
        }

        public QueryBuilder rightFuzzyTranProYearCode (String ... rightFuzzyTranProYearCode){
            this.rightFuzzyTranProYearCode = solveNullList(rightFuzzyTranProYearCode);
            return this;
        }

        public QueryBuilder tranProYearCode(String tranProYearCode){
            setTranProYearCode(tranProYearCode);
            return this;
        }

        public QueryBuilder tranProYearCodeList(String ... tranProYearCode){
            this.tranProYearCodeList = solveNullList(tranProYearCode);
            return this;
        }

        public QueryBuilder tranProYearCodeList(List<String> tranProYearCode){
            this.tranProYearCodeList = tranProYearCode;
            return this;
        }

        public QueryBuilder fetchTranProYearCode(){
            setFetchFields("fetchFields","tranProYearCode");
            return this;
        }

        public QueryBuilder excludeTranProYearCode(){
            setFetchFields("excludeFields","tranProYearCode");
            return this;
        }

        public QueryBuilder fuzzyTranProYear (List<String> fuzzyTranProYear){
            this.fuzzyTranProYear = fuzzyTranProYear;
            return this;
        }

        public QueryBuilder fuzzyTranProYear (String ... fuzzyTranProYear){
            this.fuzzyTranProYear = solveNullList(fuzzyTranProYear);
            return this;
        }

        public QueryBuilder rightFuzzyTranProYear (List<String> rightFuzzyTranProYear){
            this.rightFuzzyTranProYear = rightFuzzyTranProYear;
            return this;
        }

        public QueryBuilder rightFuzzyTranProYear (String ... rightFuzzyTranProYear){
            this.rightFuzzyTranProYear = solveNullList(rightFuzzyTranProYear);
            return this;
        }

        public QueryBuilder tranProYear(String tranProYear){
            setTranProYear(tranProYear);
            return this;
        }

        public QueryBuilder tranProYearList(String ... tranProYear){
            this.tranProYearList = solveNullList(tranProYear);
            return this;
        }

        public QueryBuilder tranProYearList(List<String> tranProYear){
            this.tranProYearList = tranProYear;
            return this;
        }

        public QueryBuilder fetchTranProYear(){
            setFetchFields("fetchFields","tranProYear");
            return this;
        }

        public QueryBuilder excludeTranProYear(){
            setFetchFields("excludeFields","tranProYear");
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

        public MqmsTranYearDecode build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> tranProYearCodeList;

        public List<String> getTranProYearCodeList(){return this.tranProYearCodeList;}


        private List<String> fuzzyTranProYearCode;

        public List<String> getFuzzyTranProYearCode(){return this.fuzzyTranProYearCode;}

        private List<String> rightFuzzyTranProYearCode;

        public List<String> getRightFuzzyTranProYearCode(){return this.rightFuzzyTranProYearCode;}
        private List<String> tranProYearList;

        public List<String> getTranProYearList(){return this.tranProYearList;}


        private List<String> fuzzyTranProYear;

        public List<String> getFuzzyTranProYear(){return this.fuzzyTranProYear;}

        private List<String> rightFuzzyTranProYear;

        public List<String> getRightFuzzyTranProYear(){return this.rightFuzzyTranProYear;}

        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyTranProYearCode (List<String> fuzzyTranProYearCode){
            this.fuzzyTranProYearCode = fuzzyTranProYearCode;
            return this;
        }

        public ConditionBuilder fuzzyTranProYearCode (String ... fuzzyTranProYearCode){
            this.fuzzyTranProYearCode = solveNullList(fuzzyTranProYearCode);
            return this;
        }

        public ConditionBuilder rightFuzzyTranProYearCode (List<String> rightFuzzyTranProYearCode){
            this.rightFuzzyTranProYearCode = rightFuzzyTranProYearCode;
            return this;
        }

        public ConditionBuilder rightFuzzyTranProYearCode (String ... rightFuzzyTranProYearCode){
            this.rightFuzzyTranProYearCode = solveNullList(rightFuzzyTranProYearCode);
            return this;
        }

        public ConditionBuilder tranProYearCodeList(String ... tranProYearCode){
            this.tranProYearCodeList = solveNullList(tranProYearCode);
            return this;
        }

        public ConditionBuilder tranProYearCodeList(List<String> tranProYearCode){
            this.tranProYearCodeList = tranProYearCode;
            return this;
        }

        public ConditionBuilder fuzzyTranProYear (List<String> fuzzyTranProYear){
            this.fuzzyTranProYear = fuzzyTranProYear;
            return this;
        }

        public ConditionBuilder fuzzyTranProYear (String ... fuzzyTranProYear){
            this.fuzzyTranProYear = solveNullList(fuzzyTranProYear);
            return this;
        }

        public ConditionBuilder rightFuzzyTranProYear (List<String> rightFuzzyTranProYear){
            this.rightFuzzyTranProYear = rightFuzzyTranProYear;
            return this;
        }

        public ConditionBuilder rightFuzzyTranProYear (String ... rightFuzzyTranProYear){
            this.rightFuzzyTranProYear = solveNullList(rightFuzzyTranProYear);
            return this;
        }

        public ConditionBuilder tranProYearList(String ... tranProYear){
            this.tranProYearList = solveNullList(tranProYear);
            return this;
        }

        public ConditionBuilder tranProYearList(List<String> tranProYear){
            this.tranProYearList = tranProYear;
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

        private MqmsTranYearDecode obj;

        public Builder(){
            this.obj = new MqmsTranYearDecode();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder tranProYearCode(String tranProYearCode){
            this.obj.setTranProYearCode(tranProYearCode);
            return this;
        }
        public Builder tranProYear(String tranProYear){
            this.obj.setTranProYear(tranProYear);
            return this;
        }
        public MqmsTranYearDecode build(){return obj;}
    }

}
