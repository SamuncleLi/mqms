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

    private static final long serialVersionUID = 1585804780025L;


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

    /**
    * 变速箱保修年限
    * isNullAble:1
    */
    private String tranWarrantyYears;

    /**
    * 变速箱保修里程
    * isNullAble:1
    */
    private String tranWarrantyMillege;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setTranProModel(String tranProModel){this.tranProModel = tranProModel;}

    public String getTranProModel(){return this.tranProModel;}

    public void setTranShortCode(String tranShortCode){this.tranShortCode = tranShortCode;}

    public String getTranShortCode(){return this.tranShortCode;}

    public void setTranWarrantyYears(String tranWarrantyYears){this.tranWarrantyYears = tranWarrantyYears;}

    public String getTranWarrantyYears(){return this.tranWarrantyYears;}

    public void setTranWarrantyMillege(String tranWarrantyMillege){this.tranWarrantyMillege = tranWarrantyMillege;}

    public String getTranWarrantyMillege(){return this.tranWarrantyMillege;}
    @Override
    public String toString() {
        return "MqmsTranProductionDecode{" +
                "id='" + id + '\'' +
                "tranProModel='" + tranProModel + '\'' +
                "tranShortCode='" + tranShortCode + '\'' +
                "tranWarrantyYears='" + tranWarrantyYears + '\'' +
                "tranWarrantyMillege='" + tranWarrantyMillege + '\'' +
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
        private List<String> tranWarrantyYearsList;

        public List<String> getTranWarrantyYearsList(){return this.tranWarrantyYearsList;}


        private List<String> fuzzyTranWarrantyYears;

        public List<String> getFuzzyTranWarrantyYears(){return this.fuzzyTranWarrantyYears;}

        private List<String> rightFuzzyTranWarrantyYears;

        public List<String> getRightFuzzyTranWarrantyYears(){return this.rightFuzzyTranWarrantyYears;}
        private List<String> tranWarrantyMillegeList;

        public List<String> getTranWarrantyMillegeList(){return this.tranWarrantyMillegeList;}


        private List<String> fuzzyTranWarrantyMillege;

        public List<String> getFuzzyTranWarrantyMillege(){return this.fuzzyTranWarrantyMillege;}

        private List<String> rightFuzzyTranWarrantyMillege;

        public List<String> getRightFuzzyTranWarrantyMillege(){return this.rightFuzzyTranWarrantyMillege;}
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

        public QueryBuilder fuzzyTranWarrantyYears (List<String> fuzzyTranWarrantyYears){
            this.fuzzyTranWarrantyYears = fuzzyTranWarrantyYears;
            return this;
        }

        public QueryBuilder fuzzyTranWarrantyYears (String ... fuzzyTranWarrantyYears){
            this.fuzzyTranWarrantyYears = solveNullList(fuzzyTranWarrantyYears);
            return this;
        }

        public QueryBuilder rightFuzzyTranWarrantyYears (List<String> rightFuzzyTranWarrantyYears){
            this.rightFuzzyTranWarrantyYears = rightFuzzyTranWarrantyYears;
            return this;
        }

        public QueryBuilder rightFuzzyTranWarrantyYears (String ... rightFuzzyTranWarrantyYears){
            this.rightFuzzyTranWarrantyYears = solveNullList(rightFuzzyTranWarrantyYears);
            return this;
        }

        public QueryBuilder tranWarrantyYears(String tranWarrantyYears){
            setTranWarrantyYears(tranWarrantyYears);
            return this;
        }

        public QueryBuilder tranWarrantyYearsList(String ... tranWarrantyYears){
            this.tranWarrantyYearsList = solveNullList(tranWarrantyYears);
            return this;
        }

        public QueryBuilder tranWarrantyYearsList(List<String> tranWarrantyYears){
            this.tranWarrantyYearsList = tranWarrantyYears;
            return this;
        }

        public QueryBuilder fetchTranWarrantyYears(){
            setFetchFields("fetchFields","tranWarrantyYears");
            return this;
        }

        public QueryBuilder excludeTranWarrantyYears(){
            setFetchFields("excludeFields","tranWarrantyYears");
            return this;
        }

        public QueryBuilder fuzzyTranWarrantyMillege (List<String> fuzzyTranWarrantyMillege){
            this.fuzzyTranWarrantyMillege = fuzzyTranWarrantyMillege;
            return this;
        }

        public QueryBuilder fuzzyTranWarrantyMillege (String ... fuzzyTranWarrantyMillege){
            this.fuzzyTranWarrantyMillege = solveNullList(fuzzyTranWarrantyMillege);
            return this;
        }

        public QueryBuilder rightFuzzyTranWarrantyMillege (List<String> rightFuzzyTranWarrantyMillege){
            this.rightFuzzyTranWarrantyMillege = rightFuzzyTranWarrantyMillege;
            return this;
        }

        public QueryBuilder rightFuzzyTranWarrantyMillege (String ... rightFuzzyTranWarrantyMillege){
            this.rightFuzzyTranWarrantyMillege = solveNullList(rightFuzzyTranWarrantyMillege);
            return this;
        }

        public QueryBuilder tranWarrantyMillege(String tranWarrantyMillege){
            setTranWarrantyMillege(tranWarrantyMillege);
            return this;
        }

        public QueryBuilder tranWarrantyMillegeList(String ... tranWarrantyMillege){
            this.tranWarrantyMillegeList = solveNullList(tranWarrantyMillege);
            return this;
        }

        public QueryBuilder tranWarrantyMillegeList(List<String> tranWarrantyMillege){
            this.tranWarrantyMillegeList = tranWarrantyMillege;
            return this;
        }

        public QueryBuilder fetchTranWarrantyMillege(){
            setFetchFields("fetchFields","tranWarrantyMillege");
            return this;
        }

        public QueryBuilder excludeTranWarrantyMillege(){
            setFetchFields("excludeFields","tranWarrantyMillege");
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
        private List<String> tranWarrantyYearsList;

        public List<String> getTranWarrantyYearsList(){return this.tranWarrantyYearsList;}


        private List<String> fuzzyTranWarrantyYears;

        public List<String> getFuzzyTranWarrantyYears(){return this.fuzzyTranWarrantyYears;}

        private List<String> rightFuzzyTranWarrantyYears;

        public List<String> getRightFuzzyTranWarrantyYears(){return this.rightFuzzyTranWarrantyYears;}
        private List<String> tranWarrantyMillegeList;

        public List<String> getTranWarrantyMillegeList(){return this.tranWarrantyMillegeList;}


        private List<String> fuzzyTranWarrantyMillege;

        public List<String> getFuzzyTranWarrantyMillege(){return this.fuzzyTranWarrantyMillege;}

        private List<String> rightFuzzyTranWarrantyMillege;

        public List<String> getRightFuzzyTranWarrantyMillege(){return this.rightFuzzyTranWarrantyMillege;}

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

        public ConditionBuilder fuzzyTranWarrantyYears (List<String> fuzzyTranWarrantyYears){
            this.fuzzyTranWarrantyYears = fuzzyTranWarrantyYears;
            return this;
        }

        public ConditionBuilder fuzzyTranWarrantyYears (String ... fuzzyTranWarrantyYears){
            this.fuzzyTranWarrantyYears = solveNullList(fuzzyTranWarrantyYears);
            return this;
        }

        public ConditionBuilder rightFuzzyTranWarrantyYears (List<String> rightFuzzyTranWarrantyYears){
            this.rightFuzzyTranWarrantyYears = rightFuzzyTranWarrantyYears;
            return this;
        }

        public ConditionBuilder rightFuzzyTranWarrantyYears (String ... rightFuzzyTranWarrantyYears){
            this.rightFuzzyTranWarrantyYears = solveNullList(rightFuzzyTranWarrantyYears);
            return this;
        }

        public ConditionBuilder tranWarrantyYearsList(String ... tranWarrantyYears){
            this.tranWarrantyYearsList = solveNullList(tranWarrantyYears);
            return this;
        }

        public ConditionBuilder tranWarrantyYearsList(List<String> tranWarrantyYears){
            this.tranWarrantyYearsList = tranWarrantyYears;
            return this;
        }

        public ConditionBuilder fuzzyTranWarrantyMillege (List<String> fuzzyTranWarrantyMillege){
            this.fuzzyTranWarrantyMillege = fuzzyTranWarrantyMillege;
            return this;
        }

        public ConditionBuilder fuzzyTranWarrantyMillege (String ... fuzzyTranWarrantyMillege){
            this.fuzzyTranWarrantyMillege = solveNullList(fuzzyTranWarrantyMillege);
            return this;
        }

        public ConditionBuilder rightFuzzyTranWarrantyMillege (List<String> rightFuzzyTranWarrantyMillege){
            this.rightFuzzyTranWarrantyMillege = rightFuzzyTranWarrantyMillege;
            return this;
        }

        public ConditionBuilder rightFuzzyTranWarrantyMillege (String ... rightFuzzyTranWarrantyMillege){
            this.rightFuzzyTranWarrantyMillege = solveNullList(rightFuzzyTranWarrantyMillege);
            return this;
        }

        public ConditionBuilder tranWarrantyMillegeList(String ... tranWarrantyMillege){
            this.tranWarrantyMillegeList = solveNullList(tranWarrantyMillege);
            return this;
        }

        public ConditionBuilder tranWarrantyMillegeList(List<String> tranWarrantyMillege){
            this.tranWarrantyMillegeList = tranWarrantyMillege;
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
        public Builder tranWarrantyYears(String tranWarrantyYears){
            this.obj.setTranWarrantyYears(tranWarrantyYears);
            return this;
        }
        public Builder tranWarrantyMillege(String tranWarrantyMillege){
            this.obj.setTranWarrantyMillege(tranWarrantyMillege);
            return this;
        }
        public MqmsTranProductionDecode build(){return obj;}
    }

}
