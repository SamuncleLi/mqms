package com.gamc.efactory.model.dataObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class MqmsEngType implements Serializable {

    private static final long serialVersionUID = 1578469779169L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 
    * isNullAble:1
    */
    private String engType;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setEngType(String engType){this.engType = engType;}

    public String getEngType(){return this.engType;}
    @Override
    public String toString() {
        return "MqmsEngType{" +
                "id='" + id + '\'' +
                "engType='" + engType + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsEngType set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsEngType set){
            this.set = set;
            return this;
        }

        public MqmsEngType getSet(){
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

    public static class QueryBuilder extends MqmsEngType{
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

        private List<String> engTypeList;

        public List<String> getEngTypeList(){return this.engTypeList;}


        private List<String> fuzzyEngType;

        public List<String> getFuzzyEngType(){return this.fuzzyEngType;}

        private List<String> rightFuzzyEngType;

        public List<String> getRightFuzzyEngType(){return this.rightFuzzyEngType;}
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

        public MqmsEngType build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> engTypeList;

        public List<String> getEngTypeList(){return this.engTypeList;}


        private List<String> fuzzyEngType;

        public List<String> getFuzzyEngType(){return this.fuzzyEngType;}

        private List<String> rightFuzzyEngType;

        public List<String> getRightFuzzyEngType(){return this.rightFuzzyEngType;}

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

        private MqmsEngType obj;

        public Builder(){
            this.obj = new MqmsEngType();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder engType(String engType){
            this.obj.setEngType(engType);
            return this;
        }
        public MqmsEngType build(){return obj;}
    }

}
