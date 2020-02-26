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
public class MqmsTranProductionDecode implements Serializable {

    private static final long serialVersionUID = 1582624186927L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 变速箱型号代码
    * isNullAble:1
    */
    private String tranProModel;

    /**
    * 变速箱型号
    * isNullAble:1
    */
    private String tranShortCode;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setTranProModel(String tranProModel){this.tranProModel = tranProModel;}

    public String getTranProModel(){return this.tranProModel;}

    public void setTranShortCode(String tranShortCode){this.tranShortCode = tranShortCode;}

    public String getTranShortCode(){return this.tranShortCode;}
    @Override
    public String toString() {
        return "MqmsTranProductionDecode{" +
                "id='" + id + '\'' +
                "tranProModel='" + tranProModel + '\'' +
                "tranShortCode='" + tranShortCode + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsTranProductionDecode set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsTranProductionDecode set){
            this.set = set;
            return this;
        }

        public MqmsTranProductionDecode getSet(){
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

    public static class QueryBuilder extends MqmsTranProductionDecode{
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

        private List<String> tranProModelList;

        public List<String> getTranProModelList(){return this.tranProModelList;}


        private List<String> fuzzyTranProModel;

        public List<String> getFuzzyTranProModel(){return this.fuzzyTranProModel;}

        private List<String> rightFuzzyTranProModel;

        public List<String> getRightFuzzyTranProModel(){return this.rightFuzzyTranProModel;}
        private List<String> tranShortCodeList;

        public List<String> getTranShortCodeList(){return this.tranShortCodeList;}


        private List<String> fuzzyTranShortCode;

        public List<String> getFuzzyTranShortCode(){return this.fuzzyTranShortCode;}

        private List<String> rightFuzzyTranShortCode;

        public List<String> getRightFuzzyTranShortCode(){return this.rightFuzzyTranShortCode;}
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

        public QueryBuilder fuzzyTranProModel (List<String> fuzzyTranProModel){
            this.fuzzyTranProModel = fuzzyTranProModel;
            return this;
        }

        public QueryBuilder fuzzyTranProModel (String ... fuzzyTranProModel){
            this.fuzzyTranProModel = solveNullList(fuzzyTranProModel);
            return this;
        }

        public QueryBuilder rightFuzzyTranProModel (List<String> rightFuzzyTranProModel){
            this.rightFuzzyTranProModel = rightFuzzyTranProModel;
            return this;
        }

        public QueryBuilder rightFuzzyTranProModel (String ... rightFuzzyTranProModel){
            this.rightFuzzyTranProModel = solveNullList(rightFuzzyTranProModel);
            return this;
        }

        public QueryBuilder tranProModel(String tranProModel){
            setTranProModel(tranProModel);
            return this;
        }

        public QueryBuilder tranProModelList(String ... tranProModel){
            this.tranProModelList = solveNullList(tranProModel);
            return this;
        }

        public QueryBuilder tranProModelList(List<String> tranProModel){
            this.tranProModelList = tranProModel;
            return this;
        }

        public QueryBuilder fetchTranProModel(){
            setFetchFields("fetchFields","tranProModel");
            return this;
        }

        public QueryBuilder excludeTranProModel(){
            setFetchFields("excludeFields","tranProModel");
            return this;
        }

        public QueryBuilder fuzzyTranShortCode (List<String> fuzzyTranShortCode){
            this.fuzzyTranShortCode = fuzzyTranShortCode;
            return this;
        }

        public QueryBuilder fuzzyTranShortCode (String ... fuzzyTranShortCode){
            this.fuzzyTranShortCode = solveNullList(fuzzyTranShortCode);
            return this;
        }

        public QueryBuilder rightFuzzyTranShortCode (List<String> rightFuzzyTranShortCode){
            this.rightFuzzyTranShortCode = rightFuzzyTranShortCode;
            return this;
        }

        public QueryBuilder rightFuzzyTranShortCode (String ... rightFuzzyTranShortCode){
            this.rightFuzzyTranShortCode = solveNullList(rightFuzzyTranShortCode);
            return this;
        }

        public QueryBuilder tranShortCode(String tranShortCode){
            setTranShortCode(tranShortCode);
            return this;
        }

        public QueryBuilder tranShortCodeList(String ... tranShortCode){
            this.tranShortCodeList = solveNullList(tranShortCode);
            return this;
        }

        public QueryBuilder tranShortCodeList(List<String> tranShortCode){
            this.tranShortCodeList = tranShortCode;
            return this;
        }

        public QueryBuilder fetchTranShortCode(){
            setFetchFields("fetchFields","tranShortCode");
            return this;
        }

        public QueryBuilder excludeTranShortCode(){
            setFetchFields("excludeFields","tranShortCode");
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

        public MqmsTranProductionDecode build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> tranProModelList;

        public List<String> getTranProModelList(){return this.tranProModelList;}


        private List<String> fuzzyTranProModel;

        public List<String> getFuzzyTranProModel(){return this.fuzzyTranProModel;}

        private List<String> rightFuzzyTranProModel;

        public List<String> getRightFuzzyTranProModel(){return this.rightFuzzyTranProModel;}
        private List<String> tranShortCodeList;

        public List<String> getTranShortCodeList(){return this.tranShortCodeList;}


        private List<String> fuzzyTranShortCode;

        public List<String> getFuzzyTranShortCode(){return this.fuzzyTranShortCode;}

        private List<String> rightFuzzyTranShortCode;

        public List<String> getRightFuzzyTranShortCode(){return this.rightFuzzyTranShortCode;}

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

        public ConditionBuilder fuzzyTranProModel (List<String> fuzzyTranProModel){
            this.fuzzyTranProModel = fuzzyTranProModel;
            return this;
        }

        public ConditionBuilder fuzzyTranProModel (String ... fuzzyTranProModel){
            this.fuzzyTranProModel = solveNullList(fuzzyTranProModel);
            return this;
        }

        public ConditionBuilder rightFuzzyTranProModel (List<String> rightFuzzyTranProModel){
            this.rightFuzzyTranProModel = rightFuzzyTranProModel;
            return this;
        }

        public ConditionBuilder rightFuzzyTranProModel (String ... rightFuzzyTranProModel){
            this.rightFuzzyTranProModel = solveNullList(rightFuzzyTranProModel);
            return this;
        }

        public ConditionBuilder tranProModelList(String ... tranProModel){
            this.tranProModelList = solveNullList(tranProModel);
            return this;
        }

        public ConditionBuilder tranProModelList(List<String> tranProModel){
            this.tranProModelList = tranProModel;
            return this;
        }

        public ConditionBuilder fuzzyTranShortCode (List<String> fuzzyTranShortCode){
            this.fuzzyTranShortCode = fuzzyTranShortCode;
            return this;
        }

        public ConditionBuilder fuzzyTranShortCode (String ... fuzzyTranShortCode){
            this.fuzzyTranShortCode = solveNullList(fuzzyTranShortCode);
            return this;
        }

        public ConditionBuilder rightFuzzyTranShortCode (List<String> rightFuzzyTranShortCode){
            this.rightFuzzyTranShortCode = rightFuzzyTranShortCode;
            return this;
        }

        public ConditionBuilder rightFuzzyTranShortCode (String ... rightFuzzyTranShortCode){
            this.rightFuzzyTranShortCode = solveNullList(rightFuzzyTranShortCode);
            return this;
        }

        public ConditionBuilder tranShortCodeList(String ... tranShortCode){
            this.tranShortCodeList = solveNullList(tranShortCode);
            return this;
        }

        public ConditionBuilder tranShortCodeList(List<String> tranShortCode){
            this.tranShortCodeList = tranShortCode;
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

        private MqmsTranProductionDecode obj;

        public Builder(){
            this.obj = new MqmsTranProductionDecode();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder tranProModel(String tranProModel){
            this.obj.setTranProModel(tranProModel);
            return this;
        }
        public Builder tranShortCode(String tranShortCode){
            this.obj.setTranShortCode(tranShortCode);
            return this;
        }
        public MqmsTranProductionDecode build(){return obj;}
    }

}
