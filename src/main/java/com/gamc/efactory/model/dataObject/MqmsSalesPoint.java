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
public class MqmsSalesPoint implements Serializable {

    private static final long serialVersionUID = 1583220067859L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 销售点名称
    * isNullAble:1
    */
    private String salesPointName;

    /**
    * 销售区域
    * isNullAble:1
    */
    private String salesPointArea;

    /**
    * 销售点代码
    * isNullAble:1
    */
    private String salesPointCode;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setSalesPointName(String salesPointName){this.salesPointName = salesPointName;}

    public String getSalesPointName(){return this.salesPointName;}

    public void setSalesPointArea(String salesPointArea){this.salesPointArea = salesPointArea;}

    public String getSalesPointArea(){return this.salesPointArea;}

    public void setSalesPointCode(String salesPointCode){this.salesPointCode = salesPointCode;}

    public String getSalesPointCode(){return this.salesPointCode;}
    @Override
    public String toString() {
        return "MqmsSalesPoint{" +
                "id='" + id + '\'' +
                "salesPointName='" + salesPointName + '\'' +
                "salesPointArea='" + salesPointArea + '\'' +
                "salesPointCode='" + salesPointCode + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsSalesPoint set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsSalesPoint set){
            this.set = set;
            return this;
        }

        public MqmsSalesPoint getSet(){
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

    public static class QueryBuilder extends MqmsSalesPoint{
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

        private List<String> salesPointNameList;

        public List<String> getSalesPointNameList(){return this.salesPointNameList;}


        private List<String> fuzzySalesPointName;

        public List<String> getFuzzySalesPointName(){return this.fuzzySalesPointName;}

        private List<String> rightFuzzySalesPointName;

        public List<String> getRightFuzzySalesPointName(){return this.rightFuzzySalesPointName;}
        private List<String> salesPointAreaList;

        public List<String> getSalesPointAreaList(){return this.salesPointAreaList;}


        private List<String> fuzzySalesPointArea;

        public List<String> getFuzzySalesPointArea(){return this.fuzzySalesPointArea;}

        private List<String> rightFuzzySalesPointArea;

        public List<String> getRightFuzzySalesPointArea(){return this.rightFuzzySalesPointArea;}
        private List<String> salesPointCodeList;

        public List<String> getSalesPointCodeList(){return this.salesPointCodeList;}


        private List<String> fuzzySalesPointCode;

        public List<String> getFuzzySalesPointCode(){return this.fuzzySalesPointCode;}

        private List<String> rightFuzzySalesPointCode;

        public List<String> getRightFuzzySalesPointCode(){return this.rightFuzzySalesPointCode;}
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

        public QueryBuilder fuzzySalesPointName (List<String> fuzzySalesPointName){
            this.fuzzySalesPointName = fuzzySalesPointName;
            return this;
        }

        public QueryBuilder fuzzySalesPointName (String ... fuzzySalesPointName){
            this.fuzzySalesPointName = solveNullList(fuzzySalesPointName);
            return this;
        }

        public QueryBuilder rightFuzzySalesPointName (List<String> rightFuzzySalesPointName){
            this.rightFuzzySalesPointName = rightFuzzySalesPointName;
            return this;
        }

        public QueryBuilder rightFuzzySalesPointName (String ... rightFuzzySalesPointName){
            this.rightFuzzySalesPointName = solveNullList(rightFuzzySalesPointName);
            return this;
        }

        public QueryBuilder salesPointName(String salesPointName){
            setSalesPointName(salesPointName);
            return this;
        }

        public QueryBuilder salesPointNameList(String ... salesPointName){
            this.salesPointNameList = solveNullList(salesPointName);
            return this;
        }

        public QueryBuilder salesPointNameList(List<String> salesPointName){
            this.salesPointNameList = salesPointName;
            return this;
        }

        public QueryBuilder fetchSalesPointName(){
            setFetchFields("fetchFields","salesPointName");
            return this;
        }

        public QueryBuilder excludeSalesPointName(){
            setFetchFields("excludeFields","salesPointName");
            return this;
        }

        public QueryBuilder fuzzySalesPointArea (List<String> fuzzySalesPointArea){
            this.fuzzySalesPointArea = fuzzySalesPointArea;
            return this;
        }

        public QueryBuilder fuzzySalesPointArea (String ... fuzzySalesPointArea){
            this.fuzzySalesPointArea = solveNullList(fuzzySalesPointArea);
            return this;
        }

        public QueryBuilder rightFuzzySalesPointArea (List<String> rightFuzzySalesPointArea){
            this.rightFuzzySalesPointArea = rightFuzzySalesPointArea;
            return this;
        }

        public QueryBuilder rightFuzzySalesPointArea (String ... rightFuzzySalesPointArea){
            this.rightFuzzySalesPointArea = solveNullList(rightFuzzySalesPointArea);
            return this;
        }

        public QueryBuilder salesPointArea(String salesPointArea){
            setSalesPointArea(salesPointArea);
            return this;
        }

        public QueryBuilder salesPointAreaList(String ... salesPointArea){
            this.salesPointAreaList = solveNullList(salesPointArea);
            return this;
        }

        public QueryBuilder salesPointAreaList(List<String> salesPointArea){
            this.salesPointAreaList = salesPointArea;
            return this;
        }

        public QueryBuilder fetchSalesPointArea(){
            setFetchFields("fetchFields","salesPointArea");
            return this;
        }

        public QueryBuilder excludeSalesPointArea(){
            setFetchFields("excludeFields","salesPointArea");
            return this;
        }

        public QueryBuilder fuzzySalesPointCode (List<String> fuzzySalesPointCode){
            this.fuzzySalesPointCode = fuzzySalesPointCode;
            return this;
        }

        public QueryBuilder fuzzySalesPointCode (String ... fuzzySalesPointCode){
            this.fuzzySalesPointCode = solveNullList(fuzzySalesPointCode);
            return this;
        }

        public QueryBuilder rightFuzzySalesPointCode (List<String> rightFuzzySalesPointCode){
            this.rightFuzzySalesPointCode = rightFuzzySalesPointCode;
            return this;
        }

        public QueryBuilder rightFuzzySalesPointCode (String ... rightFuzzySalesPointCode){
            this.rightFuzzySalesPointCode = solveNullList(rightFuzzySalesPointCode);
            return this;
        }

        public QueryBuilder salesPointCode(String salesPointCode){
            setSalesPointCode(salesPointCode);
            return this;
        }

        public QueryBuilder salesPointCodeList(String ... salesPointCode){
            this.salesPointCodeList = solveNullList(salesPointCode);
            return this;
        }

        public QueryBuilder salesPointCodeList(List<String> salesPointCode){
            this.salesPointCodeList = salesPointCode;
            return this;
        }

        public QueryBuilder fetchSalesPointCode(){
            setFetchFields("fetchFields","salesPointCode");
            return this;
        }

        public QueryBuilder excludeSalesPointCode(){
            setFetchFields("excludeFields","salesPointCode");
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

        public MqmsSalesPoint build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> salesPointNameList;

        public List<String> getSalesPointNameList(){return this.salesPointNameList;}


        private List<String> fuzzySalesPointName;

        public List<String> getFuzzySalesPointName(){return this.fuzzySalesPointName;}

        private List<String> rightFuzzySalesPointName;

        public List<String> getRightFuzzySalesPointName(){return this.rightFuzzySalesPointName;}
        private List<String> salesPointAreaList;

        public List<String> getSalesPointAreaList(){return this.salesPointAreaList;}


        private List<String> fuzzySalesPointArea;

        public List<String> getFuzzySalesPointArea(){return this.fuzzySalesPointArea;}

        private List<String> rightFuzzySalesPointArea;

        public List<String> getRightFuzzySalesPointArea(){return this.rightFuzzySalesPointArea;}
        private List<String> salesPointCodeList;

        public List<String> getSalesPointCodeList(){return this.salesPointCodeList;}


        private List<String> fuzzySalesPointCode;

        public List<String> getFuzzySalesPointCode(){return this.fuzzySalesPointCode;}

        private List<String> rightFuzzySalesPointCode;

        public List<String> getRightFuzzySalesPointCode(){return this.rightFuzzySalesPointCode;}

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

        public ConditionBuilder fuzzySalesPointName (List<String> fuzzySalesPointName){
            this.fuzzySalesPointName = fuzzySalesPointName;
            return this;
        }

        public ConditionBuilder fuzzySalesPointName (String ... fuzzySalesPointName){
            this.fuzzySalesPointName = solveNullList(fuzzySalesPointName);
            return this;
        }

        public ConditionBuilder rightFuzzySalesPointName (List<String> rightFuzzySalesPointName){
            this.rightFuzzySalesPointName = rightFuzzySalesPointName;
            return this;
        }

        public ConditionBuilder rightFuzzySalesPointName (String ... rightFuzzySalesPointName){
            this.rightFuzzySalesPointName = solveNullList(rightFuzzySalesPointName);
            return this;
        }

        public ConditionBuilder salesPointNameList(String ... salesPointName){
            this.salesPointNameList = solveNullList(salesPointName);
            return this;
        }

        public ConditionBuilder salesPointNameList(List<String> salesPointName){
            this.salesPointNameList = salesPointName;
            return this;
        }

        public ConditionBuilder fuzzySalesPointArea (List<String> fuzzySalesPointArea){
            this.fuzzySalesPointArea = fuzzySalesPointArea;
            return this;
        }

        public ConditionBuilder fuzzySalesPointArea (String ... fuzzySalesPointArea){
            this.fuzzySalesPointArea = solveNullList(fuzzySalesPointArea);
            return this;
        }

        public ConditionBuilder rightFuzzySalesPointArea (List<String> rightFuzzySalesPointArea){
            this.rightFuzzySalesPointArea = rightFuzzySalesPointArea;
            return this;
        }

        public ConditionBuilder rightFuzzySalesPointArea (String ... rightFuzzySalesPointArea){
            this.rightFuzzySalesPointArea = solveNullList(rightFuzzySalesPointArea);
            return this;
        }

        public ConditionBuilder salesPointAreaList(String ... salesPointArea){
            this.salesPointAreaList = solveNullList(salesPointArea);
            return this;
        }

        public ConditionBuilder salesPointAreaList(List<String> salesPointArea){
            this.salesPointAreaList = salesPointArea;
            return this;
        }

        public ConditionBuilder fuzzySalesPointCode (List<String> fuzzySalesPointCode){
            this.fuzzySalesPointCode = fuzzySalesPointCode;
            return this;
        }

        public ConditionBuilder fuzzySalesPointCode (String ... fuzzySalesPointCode){
            this.fuzzySalesPointCode = solveNullList(fuzzySalesPointCode);
            return this;
        }

        public ConditionBuilder rightFuzzySalesPointCode (List<String> rightFuzzySalesPointCode){
            this.rightFuzzySalesPointCode = rightFuzzySalesPointCode;
            return this;
        }

        public ConditionBuilder rightFuzzySalesPointCode (String ... rightFuzzySalesPointCode){
            this.rightFuzzySalesPointCode = solveNullList(rightFuzzySalesPointCode);
            return this;
        }

        public ConditionBuilder salesPointCodeList(String ... salesPointCode){
            this.salesPointCodeList = solveNullList(salesPointCode);
            return this;
        }

        public ConditionBuilder salesPointCodeList(List<String> salesPointCode){
            this.salesPointCodeList = salesPointCode;
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

        private MqmsSalesPoint obj;

        public Builder(){
            this.obj = new MqmsSalesPoint();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder salesPointName(String salesPointName){
            this.obj.setSalesPointName(salesPointName);
            return this;
        }
        public Builder salesPointArea(String salesPointArea){
            this.obj.setSalesPointArea(salesPointArea);
            return this;
        }
        public Builder salesPointCode(String salesPointCode){
            this.obj.setSalesPointCode(salesPointCode);
            return this;
        }
        public MqmsSalesPoint build(){return obj;}
    }

}
