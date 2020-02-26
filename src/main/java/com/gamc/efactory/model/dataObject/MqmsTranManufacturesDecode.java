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
public class MqmsTranManufacturesDecode implements Serializable {

    private static final long serialVersionUID = 1582624183612L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 变速箱厂家代码
    * isNullAble:1
    */
    private String tranManufactureModel;

    /**
    * 变速箱厂家
    * isNullAble:1
    */
    private String tranManufacture;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setTranManufactureModel(String tranManufactureModel){this.tranManufactureModel = tranManufactureModel;}

    public String getTranManufactureModel(){return this.tranManufactureModel;}

    public void setTranManufacture(String tranManufacture){this.tranManufacture = tranManufacture;}

    public String getTranManufacture(){return this.tranManufacture;}
    @Override
    public String toString() {
        return "MqmsTranManufacturesDecode{" +
                "id='" + id + '\'' +
                "tranManufactureModel='" + tranManufactureModel + '\'' +
                "tranManufacture='" + tranManufacture + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsTranManufacturesDecode set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsTranManufacturesDecode set){
            this.set = set;
            return this;
        }

        public MqmsTranManufacturesDecode getSet(){
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

    public static class QueryBuilder extends MqmsTranManufacturesDecode{
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

        private List<String> tranManufactureModelList;

        public List<String> getTranManufactureModelList(){return this.tranManufactureModelList;}


        private List<String> fuzzyTranManufactureModel;

        public List<String> getFuzzyTranManufactureModel(){return this.fuzzyTranManufactureModel;}

        private List<String> rightFuzzyTranManufactureModel;

        public List<String> getRightFuzzyTranManufactureModel(){return this.rightFuzzyTranManufactureModel;}
        private List<String> tranManufactureList;

        public List<String> getTranManufactureList(){return this.tranManufactureList;}


        private List<String> fuzzyTranManufacture;

        public List<String> getFuzzyTranManufacture(){return this.fuzzyTranManufacture;}

        private List<String> rightFuzzyTranManufacture;

        public List<String> getRightFuzzyTranManufacture(){return this.rightFuzzyTranManufacture;}
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

        public QueryBuilder fuzzyTranManufactureModel (List<String> fuzzyTranManufactureModel){
            this.fuzzyTranManufactureModel = fuzzyTranManufactureModel;
            return this;
        }

        public QueryBuilder fuzzyTranManufactureModel (String ... fuzzyTranManufactureModel){
            this.fuzzyTranManufactureModel = solveNullList(fuzzyTranManufactureModel);
            return this;
        }

        public QueryBuilder rightFuzzyTranManufactureModel (List<String> rightFuzzyTranManufactureModel){
            this.rightFuzzyTranManufactureModel = rightFuzzyTranManufactureModel;
            return this;
        }

        public QueryBuilder rightFuzzyTranManufactureModel (String ... rightFuzzyTranManufactureModel){
            this.rightFuzzyTranManufactureModel = solveNullList(rightFuzzyTranManufactureModel);
            return this;
        }

        public QueryBuilder tranManufactureModel(String tranManufactureModel){
            setTranManufactureModel(tranManufactureModel);
            return this;
        }

        public QueryBuilder tranManufactureModelList(String ... tranManufactureModel){
            this.tranManufactureModelList = solveNullList(tranManufactureModel);
            return this;
        }

        public QueryBuilder tranManufactureModelList(List<String> tranManufactureModel){
            this.tranManufactureModelList = tranManufactureModel;
            return this;
        }

        public QueryBuilder fetchTranManufactureModel(){
            setFetchFields("fetchFields","tranManufactureModel");
            return this;
        }

        public QueryBuilder excludeTranManufactureModel(){
            setFetchFields("excludeFields","tranManufactureModel");
            return this;
        }

        public QueryBuilder fuzzyTranManufacture (List<String> fuzzyTranManufacture){
            this.fuzzyTranManufacture = fuzzyTranManufacture;
            return this;
        }

        public QueryBuilder fuzzyTranManufacture (String ... fuzzyTranManufacture){
            this.fuzzyTranManufacture = solveNullList(fuzzyTranManufacture);
            return this;
        }

        public QueryBuilder rightFuzzyTranManufacture (List<String> rightFuzzyTranManufacture){
            this.rightFuzzyTranManufacture = rightFuzzyTranManufacture;
            return this;
        }

        public QueryBuilder rightFuzzyTranManufacture (String ... rightFuzzyTranManufacture){
            this.rightFuzzyTranManufacture = solveNullList(rightFuzzyTranManufacture);
            return this;
        }

        public QueryBuilder tranManufacture(String tranManufacture){
            setTranManufacture(tranManufacture);
            return this;
        }

        public QueryBuilder tranManufactureList(String ... tranManufacture){
            this.tranManufactureList = solveNullList(tranManufacture);
            return this;
        }

        public QueryBuilder tranManufactureList(List<String> tranManufacture){
            this.tranManufactureList = tranManufacture;
            return this;
        }

        public QueryBuilder fetchTranManufacture(){
            setFetchFields("fetchFields","tranManufacture");
            return this;
        }

        public QueryBuilder excludeTranManufacture(){
            setFetchFields("excludeFields","tranManufacture");
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

        public MqmsTranManufacturesDecode build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> tranManufactureModelList;

        public List<String> getTranManufactureModelList(){return this.tranManufactureModelList;}


        private List<String> fuzzyTranManufactureModel;

        public List<String> getFuzzyTranManufactureModel(){return this.fuzzyTranManufactureModel;}

        private List<String> rightFuzzyTranManufactureModel;

        public List<String> getRightFuzzyTranManufactureModel(){return this.rightFuzzyTranManufactureModel;}
        private List<String> tranManufactureList;

        public List<String> getTranManufactureList(){return this.tranManufactureList;}


        private List<String> fuzzyTranManufacture;

        public List<String> getFuzzyTranManufacture(){return this.fuzzyTranManufacture;}

        private List<String> rightFuzzyTranManufacture;

        public List<String> getRightFuzzyTranManufacture(){return this.rightFuzzyTranManufacture;}

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

        public ConditionBuilder fuzzyTranManufactureModel (List<String> fuzzyTranManufactureModel){
            this.fuzzyTranManufactureModel = fuzzyTranManufactureModel;
            return this;
        }

        public ConditionBuilder fuzzyTranManufactureModel (String ... fuzzyTranManufactureModel){
            this.fuzzyTranManufactureModel = solveNullList(fuzzyTranManufactureModel);
            return this;
        }

        public ConditionBuilder rightFuzzyTranManufactureModel (List<String> rightFuzzyTranManufactureModel){
            this.rightFuzzyTranManufactureModel = rightFuzzyTranManufactureModel;
            return this;
        }

        public ConditionBuilder rightFuzzyTranManufactureModel (String ... rightFuzzyTranManufactureModel){
            this.rightFuzzyTranManufactureModel = solveNullList(rightFuzzyTranManufactureModel);
            return this;
        }

        public ConditionBuilder tranManufactureModelList(String ... tranManufactureModel){
            this.tranManufactureModelList = solveNullList(tranManufactureModel);
            return this;
        }

        public ConditionBuilder tranManufactureModelList(List<String> tranManufactureModel){
            this.tranManufactureModelList = tranManufactureModel;
            return this;
        }

        public ConditionBuilder fuzzyTranManufacture (List<String> fuzzyTranManufacture){
            this.fuzzyTranManufacture = fuzzyTranManufacture;
            return this;
        }

        public ConditionBuilder fuzzyTranManufacture (String ... fuzzyTranManufacture){
            this.fuzzyTranManufacture = solveNullList(fuzzyTranManufacture);
            return this;
        }

        public ConditionBuilder rightFuzzyTranManufacture (List<String> rightFuzzyTranManufacture){
            this.rightFuzzyTranManufacture = rightFuzzyTranManufacture;
            return this;
        }

        public ConditionBuilder rightFuzzyTranManufacture (String ... rightFuzzyTranManufacture){
            this.rightFuzzyTranManufacture = solveNullList(rightFuzzyTranManufacture);
            return this;
        }

        public ConditionBuilder tranManufactureList(String ... tranManufacture){
            this.tranManufactureList = solveNullList(tranManufacture);
            return this;
        }

        public ConditionBuilder tranManufactureList(List<String> tranManufacture){
            this.tranManufactureList = tranManufacture;
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

        private MqmsTranManufacturesDecode obj;

        public Builder(){
            this.obj = new MqmsTranManufacturesDecode();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder tranManufactureModel(String tranManufactureModel){
            this.obj.setTranManufactureModel(tranManufactureModel);
            return this;
        }
        public Builder tranManufacture(String tranManufacture){
            this.obj.setTranManufacture(tranManufacture);
            return this;
        }
        public MqmsTranManufacturesDecode build(){return obj;}
    }

}
