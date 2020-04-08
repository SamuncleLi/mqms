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
public class MqmsCarTypeInfor implements Serializable {

    private static final long serialVersionUID = 1586227621142L;


    /**
    * 主键
    * id
    * isNullAble:0
    */
    private Integer id;

    /**
    * 车型
    * isNullAble:1
    */
    private String carType;

    /**
    * 生产起始
    * isNullAble:1
    */
    private String manufactureDate;

    /**
    * 车型改进信息
    * isNullAble:1
    */
    private String specificType;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setCarType(String carType){this.carType = carType;}

    public String getCarType(){return this.carType;}

    public void setManufactureDate(String manufactureDate){this.manufactureDate = manufactureDate;}

    public String getManufactureDate(){return this.manufactureDate;}

    public void setSpecificType(String specificType){this.specificType = specificType;}

    public String getSpecificType(){return this.specificType;}
    @Override
    public String toString() {
        return "MqmsCarTypeInfor{" +
                "id='" + id + '\'' +
                "carType='" + carType + '\'' +
                "manufactureDate='" + manufactureDate + '\'' +
                "specificType='" + specificType + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsCarTypeInfor set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsCarTypeInfor set){
            this.set = set;
            return this;
        }

        public MqmsCarTypeInfor getSet(){
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

    public static class QueryBuilder extends MqmsCarTypeInfor{
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

        private List<String> carTypeList;

        public List<String> getCarTypeList(){return this.carTypeList;}


        private List<String> fuzzyCarType;

        public List<String> getFuzzyCarType(){return this.fuzzyCarType;}

        private List<String> rightFuzzyCarType;

        public List<String> getRightFuzzyCarType(){return this.rightFuzzyCarType;}
        private List<String> manufactureDateList;

        public List<String> getManufactureDateList(){return this.manufactureDateList;}


        private List<String> fuzzyManufactureDate;

        public List<String> getFuzzyManufactureDate(){return this.fuzzyManufactureDate;}

        private List<String> rightFuzzyManufactureDate;

        public List<String> getRightFuzzyManufactureDate(){return this.rightFuzzyManufactureDate;}
        private List<String> specificTypeList;

        public List<String> getSpecificTypeList(){return this.specificTypeList;}


        private List<String> fuzzySpecificType;

        public List<String> getFuzzySpecificType(){return this.fuzzySpecificType;}

        private List<String> rightFuzzySpecificType;

        public List<String> getRightFuzzySpecificType(){return this.rightFuzzySpecificType;}
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

        public QueryBuilder fuzzyCarType (List<String> fuzzyCarType){
            this.fuzzyCarType = fuzzyCarType;
            return this;
        }

        public QueryBuilder fuzzyCarType (String ... fuzzyCarType){
            this.fuzzyCarType = solveNullList(fuzzyCarType);
            return this;
        }

        public QueryBuilder rightFuzzyCarType (List<String> rightFuzzyCarType){
            this.rightFuzzyCarType = rightFuzzyCarType;
            return this;
        }

        public QueryBuilder rightFuzzyCarType (String ... rightFuzzyCarType){
            this.rightFuzzyCarType = solveNullList(rightFuzzyCarType);
            return this;
        }

        public QueryBuilder carType(String carType){
            setCarType(carType);
            return this;
        }

        public QueryBuilder carTypeList(String ... carType){
            this.carTypeList = solveNullList(carType);
            return this;
        }

        public QueryBuilder carTypeList(List<String> carType){
            this.carTypeList = carType;
            return this;
        }

        public QueryBuilder fetchCarType(){
            setFetchFields("fetchFields","carType");
            return this;
        }

        public QueryBuilder excludeCarType(){
            setFetchFields("excludeFields","carType");
            return this;
        }

        public QueryBuilder fuzzyManufactureDate (List<String> fuzzyManufactureDate){
            this.fuzzyManufactureDate = fuzzyManufactureDate;
            return this;
        }

        public QueryBuilder fuzzyManufactureDate (String ... fuzzyManufactureDate){
            this.fuzzyManufactureDate = solveNullList(fuzzyManufactureDate);
            return this;
        }

        public QueryBuilder rightFuzzyManufactureDate (List<String> rightFuzzyManufactureDate){
            this.rightFuzzyManufactureDate = rightFuzzyManufactureDate;
            return this;
        }

        public QueryBuilder rightFuzzyManufactureDate (String ... rightFuzzyManufactureDate){
            this.rightFuzzyManufactureDate = solveNullList(rightFuzzyManufactureDate);
            return this;
        }

        public QueryBuilder manufactureDate(String manufactureDate){
            setManufactureDate(manufactureDate);
            return this;
        }

        public QueryBuilder manufactureDateList(String ... manufactureDate){
            this.manufactureDateList = solveNullList(manufactureDate);
            return this;
        }

        public QueryBuilder manufactureDateList(List<String> manufactureDate){
            this.manufactureDateList = manufactureDate;
            return this;
        }

        public QueryBuilder fetchManufactureDate(){
            setFetchFields("fetchFields","manufactureDate");
            return this;
        }

        public QueryBuilder excludeManufactureDate(){
            setFetchFields("excludeFields","manufactureDate");
            return this;
        }

        public QueryBuilder fuzzySpecificType (List<String> fuzzySpecificType){
            this.fuzzySpecificType = fuzzySpecificType;
            return this;
        }

        public QueryBuilder fuzzySpecificType (String ... fuzzySpecificType){
            this.fuzzySpecificType = solveNullList(fuzzySpecificType);
            return this;
        }

        public QueryBuilder rightFuzzySpecificType (List<String> rightFuzzySpecificType){
            this.rightFuzzySpecificType = rightFuzzySpecificType;
            return this;
        }

        public QueryBuilder rightFuzzySpecificType (String ... rightFuzzySpecificType){
            this.rightFuzzySpecificType = solveNullList(rightFuzzySpecificType);
            return this;
        }

        public QueryBuilder specificType(String specificType){
            setSpecificType(specificType);
            return this;
        }

        public QueryBuilder specificTypeList(String ... specificType){
            this.specificTypeList = solveNullList(specificType);
            return this;
        }

        public QueryBuilder specificTypeList(List<String> specificType){
            this.specificTypeList = specificType;
            return this;
        }

        public QueryBuilder fetchSpecificType(){
            setFetchFields("fetchFields","specificType");
            return this;
        }

        public QueryBuilder excludeSpecificType(){
            setFetchFields("excludeFields","specificType");
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

        public MqmsCarTypeInfor build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> carTypeList;

        public List<String> getCarTypeList(){return this.carTypeList;}


        private List<String> fuzzyCarType;

        public List<String> getFuzzyCarType(){return this.fuzzyCarType;}

        private List<String> rightFuzzyCarType;

        public List<String> getRightFuzzyCarType(){return this.rightFuzzyCarType;}
        private List<String> manufactureDateList;

        public List<String> getManufactureDateList(){return this.manufactureDateList;}


        private List<String> fuzzyManufactureDate;

        public List<String> getFuzzyManufactureDate(){return this.fuzzyManufactureDate;}

        private List<String> rightFuzzyManufactureDate;

        public List<String> getRightFuzzyManufactureDate(){return this.rightFuzzyManufactureDate;}
        private List<String> specificTypeList;

        public List<String> getSpecificTypeList(){return this.specificTypeList;}


        private List<String> fuzzySpecificType;

        public List<String> getFuzzySpecificType(){return this.fuzzySpecificType;}

        private List<String> rightFuzzySpecificType;

        public List<String> getRightFuzzySpecificType(){return this.rightFuzzySpecificType;}

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

        public ConditionBuilder fuzzyCarType (List<String> fuzzyCarType){
            this.fuzzyCarType = fuzzyCarType;
            return this;
        }

        public ConditionBuilder fuzzyCarType (String ... fuzzyCarType){
            this.fuzzyCarType = solveNullList(fuzzyCarType);
            return this;
        }

        public ConditionBuilder rightFuzzyCarType (List<String> rightFuzzyCarType){
            this.rightFuzzyCarType = rightFuzzyCarType;
            return this;
        }

        public ConditionBuilder rightFuzzyCarType (String ... rightFuzzyCarType){
            this.rightFuzzyCarType = solveNullList(rightFuzzyCarType);
            return this;
        }

        public ConditionBuilder carTypeList(String ... carType){
            this.carTypeList = solveNullList(carType);
            return this;
        }

        public ConditionBuilder carTypeList(List<String> carType){
            this.carTypeList = carType;
            return this;
        }

        public ConditionBuilder fuzzyManufactureDate (List<String> fuzzyManufactureDate){
            this.fuzzyManufactureDate = fuzzyManufactureDate;
            return this;
        }

        public ConditionBuilder fuzzyManufactureDate (String ... fuzzyManufactureDate){
            this.fuzzyManufactureDate = solveNullList(fuzzyManufactureDate);
            return this;
        }

        public ConditionBuilder rightFuzzyManufactureDate (List<String> rightFuzzyManufactureDate){
            this.rightFuzzyManufactureDate = rightFuzzyManufactureDate;
            return this;
        }

        public ConditionBuilder rightFuzzyManufactureDate (String ... rightFuzzyManufactureDate){
            this.rightFuzzyManufactureDate = solveNullList(rightFuzzyManufactureDate);
            return this;
        }

        public ConditionBuilder manufactureDateList(String ... manufactureDate){
            this.manufactureDateList = solveNullList(manufactureDate);
            return this;
        }

        public ConditionBuilder manufactureDateList(List<String> manufactureDate){
            this.manufactureDateList = manufactureDate;
            return this;
        }

        public ConditionBuilder fuzzySpecificType (List<String> fuzzySpecificType){
            this.fuzzySpecificType = fuzzySpecificType;
            return this;
        }

        public ConditionBuilder fuzzySpecificType (String ... fuzzySpecificType){
            this.fuzzySpecificType = solveNullList(fuzzySpecificType);
            return this;
        }

        public ConditionBuilder rightFuzzySpecificType (List<String> rightFuzzySpecificType){
            this.rightFuzzySpecificType = rightFuzzySpecificType;
            return this;
        }

        public ConditionBuilder rightFuzzySpecificType (String ... rightFuzzySpecificType){
            this.rightFuzzySpecificType = solveNullList(rightFuzzySpecificType);
            return this;
        }

        public ConditionBuilder specificTypeList(String ... specificType){
            this.specificTypeList = solveNullList(specificType);
            return this;
        }

        public ConditionBuilder specificTypeList(List<String> specificType){
            this.specificTypeList = specificType;
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

        private MqmsCarTypeInfor obj;

        public Builder(){
            this.obj = new MqmsCarTypeInfor();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder carType(String carType){
            this.obj.setCarType(carType);
            return this;
        }
        public Builder manufactureDate(String manufactureDate){
            this.obj.setManufactureDate(manufactureDate);
            return this;
        }
        public Builder specificType(String specificType){
            this.obj.setSpecificType(specificType);
            return this;
        }
        public MqmsCarTypeInfor build(){return obj;}
    }

}
