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
public class MqmsEngAndTrans implements Serializable {

    private static final long serialVersionUID = 1587307228407L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 发动机或变速箱
    * isNullAble:1
    */
    private String engOrTrans;

    /**
    * 详细类型
    * isNullAble:1
    */
    private String typeDetail;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setEngOrTrans(String engOrTrans){this.engOrTrans = engOrTrans;}

    public String getEngOrTrans(){return this.engOrTrans;}

    public void setTypeDetail(String typeDetail){this.typeDetail = typeDetail;}

    public String getTypeDetail(){return this.typeDetail;}
    @Override
    public String toString() {
        return "MqmsEngAndTrans{" +
                "id='" + id + '\'' +
                "engOrTrans='" + engOrTrans + '\'' +
                "typeDetail='" + typeDetail + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsEngAndTrans set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsEngAndTrans set){
            this.set = set;
            return this;
        }

        public MqmsEngAndTrans getSet(){
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

    public static class QueryBuilder extends MqmsEngAndTrans{
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

        private List<String> engOrTransList;

        public List<String> getEngOrTransList(){return this.engOrTransList;}


        private List<String> fuzzyEngOrTrans;

        public List<String> getFuzzyEngOrTrans(){return this.fuzzyEngOrTrans;}

        private List<String> rightFuzzyEngOrTrans;

        public List<String> getRightFuzzyEngOrTrans(){return this.rightFuzzyEngOrTrans;}
        private List<String> typeDetailList;

        public List<String> getTypeDetailList(){return this.typeDetailList;}


        private List<String> fuzzyTypeDetail;

        public List<String> getFuzzyTypeDetail(){return this.fuzzyTypeDetail;}

        private List<String> rightFuzzyTypeDetail;

        public List<String> getRightFuzzyTypeDetail(){return this.rightFuzzyTypeDetail;}
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

        public QueryBuilder fuzzyEngOrTrans (List<String> fuzzyEngOrTrans){
            this.fuzzyEngOrTrans = fuzzyEngOrTrans;
            return this;
        }

        public QueryBuilder fuzzyEngOrTrans (String ... fuzzyEngOrTrans){
            this.fuzzyEngOrTrans = solveNullList(fuzzyEngOrTrans);
            return this;
        }

        public QueryBuilder rightFuzzyEngOrTrans (List<String> rightFuzzyEngOrTrans){
            this.rightFuzzyEngOrTrans = rightFuzzyEngOrTrans;
            return this;
        }

        public QueryBuilder rightFuzzyEngOrTrans (String ... rightFuzzyEngOrTrans){
            this.rightFuzzyEngOrTrans = solveNullList(rightFuzzyEngOrTrans);
            return this;
        }

        public QueryBuilder engOrTrans(String engOrTrans){
            setEngOrTrans(engOrTrans);
            return this;
        }

        public QueryBuilder engOrTransList(String ... engOrTrans){
            this.engOrTransList = solveNullList(engOrTrans);
            return this;
        }

        public QueryBuilder engOrTransList(List<String> engOrTrans){
            this.engOrTransList = engOrTrans;
            return this;
        }

        public QueryBuilder fetchEngOrTrans(){
            setFetchFields("fetchFields","engOrTrans");
            return this;
        }

        public QueryBuilder excludeEngOrTrans(){
            setFetchFields("excludeFields","engOrTrans");
            return this;
        }

        public QueryBuilder fuzzyTypeDetail (List<String> fuzzyTypeDetail){
            this.fuzzyTypeDetail = fuzzyTypeDetail;
            return this;
        }

        public QueryBuilder fuzzyTypeDetail (String ... fuzzyTypeDetail){
            this.fuzzyTypeDetail = solveNullList(fuzzyTypeDetail);
            return this;
        }

        public QueryBuilder rightFuzzyTypeDetail (List<String> rightFuzzyTypeDetail){
            this.rightFuzzyTypeDetail = rightFuzzyTypeDetail;
            return this;
        }

        public QueryBuilder rightFuzzyTypeDetail (String ... rightFuzzyTypeDetail){
            this.rightFuzzyTypeDetail = solveNullList(rightFuzzyTypeDetail);
            return this;
        }

        public QueryBuilder typeDetail(String typeDetail){
            setTypeDetail(typeDetail);
            return this;
        }

        public QueryBuilder typeDetailList(String ... typeDetail){
            this.typeDetailList = solveNullList(typeDetail);
            return this;
        }

        public QueryBuilder typeDetailList(List<String> typeDetail){
            this.typeDetailList = typeDetail;
            return this;
        }

        public QueryBuilder fetchTypeDetail(){
            setFetchFields("fetchFields","typeDetail");
            return this;
        }

        public QueryBuilder excludeTypeDetail(){
            setFetchFields("excludeFields","typeDetail");
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

        public MqmsEngAndTrans build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> engOrTransList;

        public List<String> getEngOrTransList(){return this.engOrTransList;}


        private List<String> fuzzyEngOrTrans;

        public List<String> getFuzzyEngOrTrans(){return this.fuzzyEngOrTrans;}

        private List<String> rightFuzzyEngOrTrans;

        public List<String> getRightFuzzyEngOrTrans(){return this.rightFuzzyEngOrTrans;}
        private List<String> typeDetailList;

        public List<String> getTypeDetailList(){return this.typeDetailList;}


        private List<String> fuzzyTypeDetail;

        public List<String> getFuzzyTypeDetail(){return this.fuzzyTypeDetail;}

        private List<String> rightFuzzyTypeDetail;

        public List<String> getRightFuzzyTypeDetail(){return this.rightFuzzyTypeDetail;}

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

        public ConditionBuilder fuzzyEngOrTrans (List<String> fuzzyEngOrTrans){
            this.fuzzyEngOrTrans = fuzzyEngOrTrans;
            return this;
        }

        public ConditionBuilder fuzzyEngOrTrans (String ... fuzzyEngOrTrans){
            this.fuzzyEngOrTrans = solveNullList(fuzzyEngOrTrans);
            return this;
        }

        public ConditionBuilder rightFuzzyEngOrTrans (List<String> rightFuzzyEngOrTrans){
            this.rightFuzzyEngOrTrans = rightFuzzyEngOrTrans;
            return this;
        }

        public ConditionBuilder rightFuzzyEngOrTrans (String ... rightFuzzyEngOrTrans){
            this.rightFuzzyEngOrTrans = solveNullList(rightFuzzyEngOrTrans);
            return this;
        }

        public ConditionBuilder engOrTransList(String ... engOrTrans){
            this.engOrTransList = solveNullList(engOrTrans);
            return this;
        }

        public ConditionBuilder engOrTransList(List<String> engOrTrans){
            this.engOrTransList = engOrTrans;
            return this;
        }

        public ConditionBuilder fuzzyTypeDetail (List<String> fuzzyTypeDetail){
            this.fuzzyTypeDetail = fuzzyTypeDetail;
            return this;
        }

        public ConditionBuilder fuzzyTypeDetail (String ... fuzzyTypeDetail){
            this.fuzzyTypeDetail = solveNullList(fuzzyTypeDetail);
            return this;
        }

        public ConditionBuilder rightFuzzyTypeDetail (List<String> rightFuzzyTypeDetail){
            this.rightFuzzyTypeDetail = rightFuzzyTypeDetail;
            return this;
        }

        public ConditionBuilder rightFuzzyTypeDetail (String ... rightFuzzyTypeDetail){
            this.rightFuzzyTypeDetail = solveNullList(rightFuzzyTypeDetail);
            return this;
        }

        public ConditionBuilder typeDetailList(String ... typeDetail){
            this.typeDetailList = solveNullList(typeDetail);
            return this;
        }

        public ConditionBuilder typeDetailList(List<String> typeDetail){
            this.typeDetailList = typeDetail;
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

        private MqmsEngAndTrans obj;

        public Builder(){
            this.obj = new MqmsEngAndTrans();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder engOrTrans(String engOrTrans){
            this.obj.setEngOrTrans(engOrTrans);
            return this;
        }
        public Builder typeDetail(String typeDetail){
            this.obj.setTypeDetail(typeDetail);
            return this;
        }
        public MqmsEngAndTrans build(){return obj;}
    }

}
