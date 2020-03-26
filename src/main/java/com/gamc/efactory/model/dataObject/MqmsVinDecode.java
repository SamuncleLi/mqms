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
public class MqmsVinDecode implements Serializable {

    private static final long serialVersionUID = 1585138536677L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 短码
    * isNullAble:1
    */
    private String vinShortCode;

    /**
    * 简码
    * isNullAble:1
    */
    private String vinSimCode;

    /**
    * 机型
    * isNullAble:1
    */
    private String vinEngShortCode;

    /**
    * 系列号
    * isNullAble:1
    */
    private String vinSeries;

    /**
    * 机型简码
    * isNullAble:1
    */
    private String vinEngType;

    /**
    * 
    * isNullAble:1
    */
    private String vinTransmShortCode;

    /**
    * 车型简码
    * isNullAble:1
    */
    private String vinCarShortCode;

    /**
    * 车型
    * isNullAble:1
    */
    private String vinCarType;

    /**
    * 变速箱类型
    * isNullAble:1
    */
    private String vinTransmType;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setVinShortCode(String vinShortCode){this.vinShortCode = vinShortCode;}

    public String getVinShortCode(){return this.vinShortCode;}

    public void setVinSimCode(String vinSimCode){this.vinSimCode = vinSimCode;}

    public String getVinSimCode(){return this.vinSimCode;}

    public void setVinEngShortCode(String vinEngShortCode){this.vinEngShortCode = vinEngShortCode;}

    public String getVinEngShortCode(){return this.vinEngShortCode;}

    public void setVinSeries(String vinSeries){this.vinSeries = vinSeries;}

    public String getVinSeries(){return this.vinSeries;}

    public void setVinEngType(String vinEngType){this.vinEngType = vinEngType;}

    public String getVinEngType(){return this.vinEngType;}

    public void setVinTransmShortCode(String vinTransmShortCode){this.vinTransmShortCode = vinTransmShortCode;}

    public String getVinTransmShortCode(){return this.vinTransmShortCode;}

    public void setVinCarShortCode(String vinCarShortCode){this.vinCarShortCode = vinCarShortCode;}

    public String getVinCarShortCode(){return this.vinCarShortCode;}

    public void setVinCarType(String vinCarType){this.vinCarType = vinCarType;}

    public String getVinCarType(){return this.vinCarType;}

    public void setVinTransmType(String vinTransmType){this.vinTransmType = vinTransmType;}

    public String getVinTransmType(){return this.vinTransmType;}
    @Override
    public String toString() {
        return "MqmsVinDecode{" +
                "id='" + id + '\'' +
                "vinShortCode='" + vinShortCode + '\'' +
                "vinSimCode='" + vinSimCode + '\'' +
                "vinEngShortCode='" + vinEngShortCode + '\'' +
                "vinSeries='" + vinSeries + '\'' +
                "vinEngType='" + vinEngType + '\'' +
                "vinTransmShortCode='" + vinTransmShortCode + '\'' +
                "vinCarShortCode='" + vinCarShortCode + '\'' +
                "vinCarType='" + vinCarType + '\'' +
                "vinTransmType='" + vinTransmType + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsVinDecode set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsVinDecode set){
            this.set = set;
            return this;
        }

        public MqmsVinDecode getSet(){
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

    public static class QueryBuilder extends MqmsVinDecode{
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

        private List<String> vinShortCodeList;

        public List<String> getVinShortCodeList(){return this.vinShortCodeList;}


        private List<String> fuzzyVinShortCode;

        public List<String> getFuzzyVinShortCode(){return this.fuzzyVinShortCode;}

        private List<String> rightFuzzyVinShortCode;

        public List<String> getRightFuzzyVinShortCode(){return this.rightFuzzyVinShortCode;}
        private List<String> vinSimCodeList;

        public List<String> getVinSimCodeList(){return this.vinSimCodeList;}


        private List<String> fuzzyVinSimCode;

        public List<String> getFuzzyVinSimCode(){return this.fuzzyVinSimCode;}

        private List<String> rightFuzzyVinSimCode;

        public List<String> getRightFuzzyVinSimCode(){return this.rightFuzzyVinSimCode;}
        private List<String> vinEngShortCodeList;

        public List<String> getVinEngShortCodeList(){return this.vinEngShortCodeList;}


        private List<String> fuzzyVinEngShortCode;

        public List<String> getFuzzyVinEngShortCode(){return this.fuzzyVinEngShortCode;}

        private List<String> rightFuzzyVinEngShortCode;

        public List<String> getRightFuzzyVinEngShortCode(){return this.rightFuzzyVinEngShortCode;}
        private List<String> vinSeriesList;

        public List<String> getVinSeriesList(){return this.vinSeriesList;}


        private List<String> fuzzyVinSeries;

        public List<String> getFuzzyVinSeries(){return this.fuzzyVinSeries;}

        private List<String> rightFuzzyVinSeries;

        public List<String> getRightFuzzyVinSeries(){return this.rightFuzzyVinSeries;}
        private List<String> vinEngTypeList;

        public List<String> getVinEngTypeList(){return this.vinEngTypeList;}


        private List<String> fuzzyVinEngType;

        public List<String> getFuzzyVinEngType(){return this.fuzzyVinEngType;}

        private List<String> rightFuzzyVinEngType;

        public List<String> getRightFuzzyVinEngType(){return this.rightFuzzyVinEngType;}
        private List<String> vinTransmShortCodeList;

        public List<String> getVinTransmShortCodeList(){return this.vinTransmShortCodeList;}


        private List<String> fuzzyVinTransmShortCode;

        public List<String> getFuzzyVinTransmShortCode(){return this.fuzzyVinTransmShortCode;}

        private List<String> rightFuzzyVinTransmShortCode;

        public List<String> getRightFuzzyVinTransmShortCode(){return this.rightFuzzyVinTransmShortCode;}
        private List<String> vinCarShortCodeList;

        public List<String> getVinCarShortCodeList(){return this.vinCarShortCodeList;}


        private List<String> fuzzyVinCarShortCode;

        public List<String> getFuzzyVinCarShortCode(){return this.fuzzyVinCarShortCode;}

        private List<String> rightFuzzyVinCarShortCode;

        public List<String> getRightFuzzyVinCarShortCode(){return this.rightFuzzyVinCarShortCode;}
        private List<String> vinCarTypeList;

        public List<String> getVinCarTypeList(){return this.vinCarTypeList;}


        private List<String> fuzzyVinCarType;

        public List<String> getFuzzyVinCarType(){return this.fuzzyVinCarType;}

        private List<String> rightFuzzyVinCarType;

        public List<String> getRightFuzzyVinCarType(){return this.rightFuzzyVinCarType;}
        private List<String> vinTransmTypeList;

        public List<String> getVinTransmTypeList(){return this.vinTransmTypeList;}


        private List<String> fuzzyVinTransmType;

        public List<String> getFuzzyVinTransmType(){return this.fuzzyVinTransmType;}

        private List<String> rightFuzzyVinTransmType;

        public List<String> getRightFuzzyVinTransmType(){return this.rightFuzzyVinTransmType;}
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

        public QueryBuilder fuzzyVinShortCode (List<String> fuzzyVinShortCode){
            this.fuzzyVinShortCode = fuzzyVinShortCode;
            return this;
        }

        public QueryBuilder fuzzyVinShortCode (String ... fuzzyVinShortCode){
            this.fuzzyVinShortCode = solveNullList(fuzzyVinShortCode);
            return this;
        }

        public QueryBuilder rightFuzzyVinShortCode (List<String> rightFuzzyVinShortCode){
            this.rightFuzzyVinShortCode = rightFuzzyVinShortCode;
            return this;
        }

        public QueryBuilder rightFuzzyVinShortCode (String ... rightFuzzyVinShortCode){
            this.rightFuzzyVinShortCode = solveNullList(rightFuzzyVinShortCode);
            return this;
        }

        public QueryBuilder vinShortCode(String vinShortCode){
            setVinShortCode(vinShortCode);
            return this;
        }

        public QueryBuilder vinShortCodeList(String ... vinShortCode){
            this.vinShortCodeList = solveNullList(vinShortCode);
            return this;
        }

        public QueryBuilder vinShortCodeList(List<String> vinShortCode){
            this.vinShortCodeList = vinShortCode;
            return this;
        }

        public QueryBuilder fetchVinShortCode(){
            setFetchFields("fetchFields","vinShortCode");
            return this;
        }

        public QueryBuilder excludeVinShortCode(){
            setFetchFields("excludeFields","vinShortCode");
            return this;
        }

        public QueryBuilder fuzzyVinSimCode (List<String> fuzzyVinSimCode){
            this.fuzzyVinSimCode = fuzzyVinSimCode;
            return this;
        }

        public QueryBuilder fuzzyVinSimCode (String ... fuzzyVinSimCode){
            this.fuzzyVinSimCode = solveNullList(fuzzyVinSimCode);
            return this;
        }

        public QueryBuilder rightFuzzyVinSimCode (List<String> rightFuzzyVinSimCode){
            this.rightFuzzyVinSimCode = rightFuzzyVinSimCode;
            return this;
        }

        public QueryBuilder rightFuzzyVinSimCode (String ... rightFuzzyVinSimCode){
            this.rightFuzzyVinSimCode = solveNullList(rightFuzzyVinSimCode);
            return this;
        }

        public QueryBuilder vinSimCode(String vinSimCode){
            setVinSimCode(vinSimCode);
            return this;
        }

        public QueryBuilder vinSimCodeList(String ... vinSimCode){
            this.vinSimCodeList = solveNullList(vinSimCode);
            return this;
        }

        public QueryBuilder vinSimCodeList(List<String> vinSimCode){
            this.vinSimCodeList = vinSimCode;
            return this;
        }

        public QueryBuilder fetchVinSimCode(){
            setFetchFields("fetchFields","vinSimCode");
            return this;
        }

        public QueryBuilder excludeVinSimCode(){
            setFetchFields("excludeFields","vinSimCode");
            return this;
        }

        public QueryBuilder fuzzyVinEngShortCode (List<String> fuzzyVinEngShortCode){
            this.fuzzyVinEngShortCode = fuzzyVinEngShortCode;
            return this;
        }

        public QueryBuilder fuzzyVinEngShortCode (String ... fuzzyVinEngShortCode){
            this.fuzzyVinEngShortCode = solveNullList(fuzzyVinEngShortCode);
            return this;
        }

        public QueryBuilder rightFuzzyVinEngShortCode (List<String> rightFuzzyVinEngShortCode){
            this.rightFuzzyVinEngShortCode = rightFuzzyVinEngShortCode;
            return this;
        }

        public QueryBuilder rightFuzzyVinEngShortCode (String ... rightFuzzyVinEngShortCode){
            this.rightFuzzyVinEngShortCode = solveNullList(rightFuzzyVinEngShortCode);
            return this;
        }

        public QueryBuilder vinEngShortCode(String vinEngShortCode){
            setVinEngShortCode(vinEngShortCode);
            return this;
        }

        public QueryBuilder vinEngShortCodeList(String ... vinEngShortCode){
            this.vinEngShortCodeList = solveNullList(vinEngShortCode);
            return this;
        }

        public QueryBuilder vinEngShortCodeList(List<String> vinEngShortCode){
            this.vinEngShortCodeList = vinEngShortCode;
            return this;
        }

        public QueryBuilder fetchVinEngShortCode(){
            setFetchFields("fetchFields","vinEngShortCode");
            return this;
        }

        public QueryBuilder excludeVinEngShortCode(){
            setFetchFields("excludeFields","vinEngShortCode");
            return this;
        }

        public QueryBuilder fuzzyVinSeries (List<String> fuzzyVinSeries){
            this.fuzzyVinSeries = fuzzyVinSeries;
            return this;
        }

        public QueryBuilder fuzzyVinSeries (String ... fuzzyVinSeries){
            this.fuzzyVinSeries = solveNullList(fuzzyVinSeries);
            return this;
        }

        public QueryBuilder rightFuzzyVinSeries (List<String> rightFuzzyVinSeries){
            this.rightFuzzyVinSeries = rightFuzzyVinSeries;
            return this;
        }

        public QueryBuilder rightFuzzyVinSeries (String ... rightFuzzyVinSeries){
            this.rightFuzzyVinSeries = solveNullList(rightFuzzyVinSeries);
            return this;
        }

        public QueryBuilder vinSeries(String vinSeries){
            setVinSeries(vinSeries);
            return this;
        }

        public QueryBuilder vinSeriesList(String ... vinSeries){
            this.vinSeriesList = solveNullList(vinSeries);
            return this;
        }

        public QueryBuilder vinSeriesList(List<String> vinSeries){
            this.vinSeriesList = vinSeries;
            return this;
        }

        public QueryBuilder fetchVinSeries(){
            setFetchFields("fetchFields","vinSeries");
            return this;
        }

        public QueryBuilder excludeVinSeries(){
            setFetchFields("excludeFields","vinSeries");
            return this;
        }

        public QueryBuilder fuzzyVinEngType (List<String> fuzzyVinEngType){
            this.fuzzyVinEngType = fuzzyVinEngType;
            return this;
        }

        public QueryBuilder fuzzyVinEngType (String ... fuzzyVinEngType){
            this.fuzzyVinEngType = solveNullList(fuzzyVinEngType);
            return this;
        }

        public QueryBuilder rightFuzzyVinEngType (List<String> rightFuzzyVinEngType){
            this.rightFuzzyVinEngType = rightFuzzyVinEngType;
            return this;
        }

        public QueryBuilder rightFuzzyVinEngType (String ... rightFuzzyVinEngType){
            this.rightFuzzyVinEngType = solveNullList(rightFuzzyVinEngType);
            return this;
        }

        public QueryBuilder vinEngType(String vinEngType){
            setVinEngType(vinEngType);
            return this;
        }

        public QueryBuilder vinEngTypeList(String ... vinEngType){
            this.vinEngTypeList = solveNullList(vinEngType);
            return this;
        }

        public QueryBuilder vinEngTypeList(List<String> vinEngType){
            this.vinEngTypeList = vinEngType;
            return this;
        }

        public QueryBuilder fetchVinEngType(){
            setFetchFields("fetchFields","vinEngType");
            return this;
        }

        public QueryBuilder excludeVinEngType(){
            setFetchFields("excludeFields","vinEngType");
            return this;
        }

        public QueryBuilder fuzzyVinTransmShortCode (List<String> fuzzyVinTransmShortCode){
            this.fuzzyVinTransmShortCode = fuzzyVinTransmShortCode;
            return this;
        }

        public QueryBuilder fuzzyVinTransmShortCode (String ... fuzzyVinTransmShortCode){
            this.fuzzyVinTransmShortCode = solveNullList(fuzzyVinTransmShortCode);
            return this;
        }

        public QueryBuilder rightFuzzyVinTransmShortCode (List<String> rightFuzzyVinTransmShortCode){
            this.rightFuzzyVinTransmShortCode = rightFuzzyVinTransmShortCode;
            return this;
        }

        public QueryBuilder rightFuzzyVinTransmShortCode (String ... rightFuzzyVinTransmShortCode){
            this.rightFuzzyVinTransmShortCode = solveNullList(rightFuzzyVinTransmShortCode);
            return this;
        }

        public QueryBuilder vinTransmShortCode(String vinTransmShortCode){
            setVinTransmShortCode(vinTransmShortCode);
            return this;
        }

        public QueryBuilder vinTransmShortCodeList(String ... vinTransmShortCode){
            this.vinTransmShortCodeList = solveNullList(vinTransmShortCode);
            return this;
        }

        public QueryBuilder vinTransmShortCodeList(List<String> vinTransmShortCode){
            this.vinTransmShortCodeList = vinTransmShortCode;
            return this;
        }

        public QueryBuilder fetchVinTransmShortCode(){
            setFetchFields("fetchFields","vinTransmShortCode");
            return this;
        }

        public QueryBuilder excludeVinTransmShortCode(){
            setFetchFields("excludeFields","vinTransmShortCode");
            return this;
        }

        public QueryBuilder fuzzyVinCarShortCode (List<String> fuzzyVinCarShortCode){
            this.fuzzyVinCarShortCode = fuzzyVinCarShortCode;
            return this;
        }

        public QueryBuilder fuzzyVinCarShortCode (String ... fuzzyVinCarShortCode){
            this.fuzzyVinCarShortCode = solveNullList(fuzzyVinCarShortCode);
            return this;
        }

        public QueryBuilder rightFuzzyVinCarShortCode (List<String> rightFuzzyVinCarShortCode){
            this.rightFuzzyVinCarShortCode = rightFuzzyVinCarShortCode;
            return this;
        }

        public QueryBuilder rightFuzzyVinCarShortCode (String ... rightFuzzyVinCarShortCode){
            this.rightFuzzyVinCarShortCode = solveNullList(rightFuzzyVinCarShortCode);
            return this;
        }

        public QueryBuilder vinCarShortCode(String vinCarShortCode){
            setVinCarShortCode(vinCarShortCode);
            return this;
        }

        public QueryBuilder vinCarShortCodeList(String ... vinCarShortCode){
            this.vinCarShortCodeList = solveNullList(vinCarShortCode);
            return this;
        }

        public QueryBuilder vinCarShortCodeList(List<String> vinCarShortCode){
            this.vinCarShortCodeList = vinCarShortCode;
            return this;
        }

        public QueryBuilder fetchVinCarShortCode(){
            setFetchFields("fetchFields","vinCarShortCode");
            return this;
        }

        public QueryBuilder excludeVinCarShortCode(){
            setFetchFields("excludeFields","vinCarShortCode");
            return this;
        }

        public QueryBuilder fuzzyVinCarType (List<String> fuzzyVinCarType){
            this.fuzzyVinCarType = fuzzyVinCarType;
            return this;
        }

        public QueryBuilder fuzzyVinCarType (String ... fuzzyVinCarType){
            this.fuzzyVinCarType = solveNullList(fuzzyVinCarType);
            return this;
        }

        public QueryBuilder rightFuzzyVinCarType (List<String> rightFuzzyVinCarType){
            this.rightFuzzyVinCarType = rightFuzzyVinCarType;
            return this;
        }

        public QueryBuilder rightFuzzyVinCarType (String ... rightFuzzyVinCarType){
            this.rightFuzzyVinCarType = solveNullList(rightFuzzyVinCarType);
            return this;
        }

        public QueryBuilder vinCarType(String vinCarType){
            setVinCarType(vinCarType);
            return this;
        }

        public QueryBuilder vinCarTypeList(String ... vinCarType){
            this.vinCarTypeList = solveNullList(vinCarType);
            return this;
        }

        public QueryBuilder vinCarTypeList(List<String> vinCarType){
            this.vinCarTypeList = vinCarType;
            return this;
        }

        public QueryBuilder fetchVinCarType(){
            setFetchFields("fetchFields","vinCarType");
            return this;
        }

        public QueryBuilder excludeVinCarType(){
            setFetchFields("excludeFields","vinCarType");
            return this;
        }

        public QueryBuilder fuzzyVinTransmType (List<String> fuzzyVinTransmType){
            this.fuzzyVinTransmType = fuzzyVinTransmType;
            return this;
        }

        public QueryBuilder fuzzyVinTransmType (String ... fuzzyVinTransmType){
            this.fuzzyVinTransmType = solveNullList(fuzzyVinTransmType);
            return this;
        }

        public QueryBuilder rightFuzzyVinTransmType (List<String> rightFuzzyVinTransmType){
            this.rightFuzzyVinTransmType = rightFuzzyVinTransmType;
            return this;
        }

        public QueryBuilder rightFuzzyVinTransmType (String ... rightFuzzyVinTransmType){
            this.rightFuzzyVinTransmType = solveNullList(rightFuzzyVinTransmType);
            return this;
        }

        public QueryBuilder vinTransmType(String vinTransmType){
            setVinTransmType(vinTransmType);
            return this;
        }

        public QueryBuilder vinTransmTypeList(String ... vinTransmType){
            this.vinTransmTypeList = solveNullList(vinTransmType);
            return this;
        }

        public QueryBuilder vinTransmTypeList(List<String> vinTransmType){
            this.vinTransmTypeList = vinTransmType;
            return this;
        }

        public QueryBuilder fetchVinTransmType(){
            setFetchFields("fetchFields","vinTransmType");
            return this;
        }

        public QueryBuilder excludeVinTransmType(){
            setFetchFields("excludeFields","vinTransmType");
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

        public MqmsVinDecode build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> vinShortCodeList;

        public List<String> getVinShortCodeList(){return this.vinShortCodeList;}


        private List<String> fuzzyVinShortCode;

        public List<String> getFuzzyVinShortCode(){return this.fuzzyVinShortCode;}

        private List<String> rightFuzzyVinShortCode;

        public List<String> getRightFuzzyVinShortCode(){return this.rightFuzzyVinShortCode;}
        private List<String> vinSimCodeList;

        public List<String> getVinSimCodeList(){return this.vinSimCodeList;}


        private List<String> fuzzyVinSimCode;

        public List<String> getFuzzyVinSimCode(){return this.fuzzyVinSimCode;}

        private List<String> rightFuzzyVinSimCode;

        public List<String> getRightFuzzyVinSimCode(){return this.rightFuzzyVinSimCode;}
        private List<String> vinEngShortCodeList;

        public List<String> getVinEngShortCodeList(){return this.vinEngShortCodeList;}


        private List<String> fuzzyVinEngShortCode;

        public List<String> getFuzzyVinEngShortCode(){return this.fuzzyVinEngShortCode;}

        private List<String> rightFuzzyVinEngShortCode;

        public List<String> getRightFuzzyVinEngShortCode(){return this.rightFuzzyVinEngShortCode;}
        private List<String> vinSeriesList;

        public List<String> getVinSeriesList(){return this.vinSeriesList;}


        private List<String> fuzzyVinSeries;

        public List<String> getFuzzyVinSeries(){return this.fuzzyVinSeries;}

        private List<String> rightFuzzyVinSeries;

        public List<String> getRightFuzzyVinSeries(){return this.rightFuzzyVinSeries;}
        private List<String> vinEngTypeList;

        public List<String> getVinEngTypeList(){return this.vinEngTypeList;}


        private List<String> fuzzyVinEngType;

        public List<String> getFuzzyVinEngType(){return this.fuzzyVinEngType;}

        private List<String> rightFuzzyVinEngType;

        public List<String> getRightFuzzyVinEngType(){return this.rightFuzzyVinEngType;}
        private List<String> vinTransmShortCodeList;

        public List<String> getVinTransmShortCodeList(){return this.vinTransmShortCodeList;}


        private List<String> fuzzyVinTransmShortCode;

        public List<String> getFuzzyVinTransmShortCode(){return this.fuzzyVinTransmShortCode;}

        private List<String> rightFuzzyVinTransmShortCode;

        public List<String> getRightFuzzyVinTransmShortCode(){return this.rightFuzzyVinTransmShortCode;}
        private List<String> vinCarShortCodeList;

        public List<String> getVinCarShortCodeList(){return this.vinCarShortCodeList;}


        private List<String> fuzzyVinCarShortCode;

        public List<String> getFuzzyVinCarShortCode(){return this.fuzzyVinCarShortCode;}

        private List<String> rightFuzzyVinCarShortCode;

        public List<String> getRightFuzzyVinCarShortCode(){return this.rightFuzzyVinCarShortCode;}
        private List<String> vinCarTypeList;

        public List<String> getVinCarTypeList(){return this.vinCarTypeList;}


        private List<String> fuzzyVinCarType;

        public List<String> getFuzzyVinCarType(){return this.fuzzyVinCarType;}

        private List<String> rightFuzzyVinCarType;

        public List<String> getRightFuzzyVinCarType(){return this.rightFuzzyVinCarType;}
        private List<String> vinTransmTypeList;

        public List<String> getVinTransmTypeList(){return this.vinTransmTypeList;}


        private List<String> fuzzyVinTransmType;

        public List<String> getFuzzyVinTransmType(){return this.fuzzyVinTransmType;}

        private List<String> rightFuzzyVinTransmType;

        public List<String> getRightFuzzyVinTransmType(){return this.rightFuzzyVinTransmType;}

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

        public ConditionBuilder fuzzyVinShortCode (List<String> fuzzyVinShortCode){
            this.fuzzyVinShortCode = fuzzyVinShortCode;
            return this;
        }

        public ConditionBuilder fuzzyVinShortCode (String ... fuzzyVinShortCode){
            this.fuzzyVinShortCode = solveNullList(fuzzyVinShortCode);
            return this;
        }

        public ConditionBuilder rightFuzzyVinShortCode (List<String> rightFuzzyVinShortCode){
            this.rightFuzzyVinShortCode = rightFuzzyVinShortCode;
            return this;
        }

        public ConditionBuilder rightFuzzyVinShortCode (String ... rightFuzzyVinShortCode){
            this.rightFuzzyVinShortCode = solveNullList(rightFuzzyVinShortCode);
            return this;
        }

        public ConditionBuilder vinShortCodeList(String ... vinShortCode){
            this.vinShortCodeList = solveNullList(vinShortCode);
            return this;
        }

        public ConditionBuilder vinShortCodeList(List<String> vinShortCode){
            this.vinShortCodeList = vinShortCode;
            return this;
        }

        public ConditionBuilder fuzzyVinSimCode (List<String> fuzzyVinSimCode){
            this.fuzzyVinSimCode = fuzzyVinSimCode;
            return this;
        }

        public ConditionBuilder fuzzyVinSimCode (String ... fuzzyVinSimCode){
            this.fuzzyVinSimCode = solveNullList(fuzzyVinSimCode);
            return this;
        }

        public ConditionBuilder rightFuzzyVinSimCode (List<String> rightFuzzyVinSimCode){
            this.rightFuzzyVinSimCode = rightFuzzyVinSimCode;
            return this;
        }

        public ConditionBuilder rightFuzzyVinSimCode (String ... rightFuzzyVinSimCode){
            this.rightFuzzyVinSimCode = solveNullList(rightFuzzyVinSimCode);
            return this;
        }

        public ConditionBuilder vinSimCodeList(String ... vinSimCode){
            this.vinSimCodeList = solveNullList(vinSimCode);
            return this;
        }

        public ConditionBuilder vinSimCodeList(List<String> vinSimCode){
            this.vinSimCodeList = vinSimCode;
            return this;
        }

        public ConditionBuilder fuzzyVinEngShortCode (List<String> fuzzyVinEngShortCode){
            this.fuzzyVinEngShortCode = fuzzyVinEngShortCode;
            return this;
        }

        public ConditionBuilder fuzzyVinEngShortCode (String ... fuzzyVinEngShortCode){
            this.fuzzyVinEngShortCode = solveNullList(fuzzyVinEngShortCode);
            return this;
        }

        public ConditionBuilder rightFuzzyVinEngShortCode (List<String> rightFuzzyVinEngShortCode){
            this.rightFuzzyVinEngShortCode = rightFuzzyVinEngShortCode;
            return this;
        }

        public ConditionBuilder rightFuzzyVinEngShortCode (String ... rightFuzzyVinEngShortCode){
            this.rightFuzzyVinEngShortCode = solveNullList(rightFuzzyVinEngShortCode);
            return this;
        }

        public ConditionBuilder vinEngShortCodeList(String ... vinEngShortCode){
            this.vinEngShortCodeList = solveNullList(vinEngShortCode);
            return this;
        }

        public ConditionBuilder vinEngShortCodeList(List<String> vinEngShortCode){
            this.vinEngShortCodeList = vinEngShortCode;
            return this;
        }

        public ConditionBuilder fuzzyVinSeries (List<String> fuzzyVinSeries){
            this.fuzzyVinSeries = fuzzyVinSeries;
            return this;
        }

        public ConditionBuilder fuzzyVinSeries (String ... fuzzyVinSeries){
            this.fuzzyVinSeries = solveNullList(fuzzyVinSeries);
            return this;
        }

        public ConditionBuilder rightFuzzyVinSeries (List<String> rightFuzzyVinSeries){
            this.rightFuzzyVinSeries = rightFuzzyVinSeries;
            return this;
        }

        public ConditionBuilder rightFuzzyVinSeries (String ... rightFuzzyVinSeries){
            this.rightFuzzyVinSeries = solveNullList(rightFuzzyVinSeries);
            return this;
        }

        public ConditionBuilder vinSeriesList(String ... vinSeries){
            this.vinSeriesList = solveNullList(vinSeries);
            return this;
        }

        public ConditionBuilder vinSeriesList(List<String> vinSeries){
            this.vinSeriesList = vinSeries;
            return this;
        }

        public ConditionBuilder fuzzyVinEngType (List<String> fuzzyVinEngType){
            this.fuzzyVinEngType = fuzzyVinEngType;
            return this;
        }

        public ConditionBuilder fuzzyVinEngType (String ... fuzzyVinEngType){
            this.fuzzyVinEngType = solveNullList(fuzzyVinEngType);
            return this;
        }

        public ConditionBuilder rightFuzzyVinEngType (List<String> rightFuzzyVinEngType){
            this.rightFuzzyVinEngType = rightFuzzyVinEngType;
            return this;
        }

        public ConditionBuilder rightFuzzyVinEngType (String ... rightFuzzyVinEngType){
            this.rightFuzzyVinEngType = solveNullList(rightFuzzyVinEngType);
            return this;
        }

        public ConditionBuilder vinEngTypeList(String ... vinEngType){
            this.vinEngTypeList = solveNullList(vinEngType);
            return this;
        }

        public ConditionBuilder vinEngTypeList(List<String> vinEngType){
            this.vinEngTypeList = vinEngType;
            return this;
        }

        public ConditionBuilder fuzzyVinTransmShortCode (List<String> fuzzyVinTransmShortCode){
            this.fuzzyVinTransmShortCode = fuzzyVinTransmShortCode;
            return this;
        }

        public ConditionBuilder fuzzyVinTransmShortCode (String ... fuzzyVinTransmShortCode){
            this.fuzzyVinTransmShortCode = solveNullList(fuzzyVinTransmShortCode);
            return this;
        }

        public ConditionBuilder rightFuzzyVinTransmShortCode (List<String> rightFuzzyVinTransmShortCode){
            this.rightFuzzyVinTransmShortCode = rightFuzzyVinTransmShortCode;
            return this;
        }

        public ConditionBuilder rightFuzzyVinTransmShortCode (String ... rightFuzzyVinTransmShortCode){
            this.rightFuzzyVinTransmShortCode = solveNullList(rightFuzzyVinTransmShortCode);
            return this;
        }

        public ConditionBuilder vinTransmShortCodeList(String ... vinTransmShortCode){
            this.vinTransmShortCodeList = solveNullList(vinTransmShortCode);
            return this;
        }

        public ConditionBuilder vinTransmShortCodeList(List<String> vinTransmShortCode){
            this.vinTransmShortCodeList = vinTransmShortCode;
            return this;
        }

        public ConditionBuilder fuzzyVinCarShortCode (List<String> fuzzyVinCarShortCode){
            this.fuzzyVinCarShortCode = fuzzyVinCarShortCode;
            return this;
        }

        public ConditionBuilder fuzzyVinCarShortCode (String ... fuzzyVinCarShortCode){
            this.fuzzyVinCarShortCode = solveNullList(fuzzyVinCarShortCode);
            return this;
        }

        public ConditionBuilder rightFuzzyVinCarShortCode (List<String> rightFuzzyVinCarShortCode){
            this.rightFuzzyVinCarShortCode = rightFuzzyVinCarShortCode;
            return this;
        }

        public ConditionBuilder rightFuzzyVinCarShortCode (String ... rightFuzzyVinCarShortCode){
            this.rightFuzzyVinCarShortCode = solveNullList(rightFuzzyVinCarShortCode);
            return this;
        }

        public ConditionBuilder vinCarShortCodeList(String ... vinCarShortCode){
            this.vinCarShortCodeList = solveNullList(vinCarShortCode);
            return this;
        }

        public ConditionBuilder vinCarShortCodeList(List<String> vinCarShortCode){
            this.vinCarShortCodeList = vinCarShortCode;
            return this;
        }

        public ConditionBuilder fuzzyVinCarType (List<String> fuzzyVinCarType){
            this.fuzzyVinCarType = fuzzyVinCarType;
            return this;
        }

        public ConditionBuilder fuzzyVinCarType (String ... fuzzyVinCarType){
            this.fuzzyVinCarType = solveNullList(fuzzyVinCarType);
            return this;
        }

        public ConditionBuilder rightFuzzyVinCarType (List<String> rightFuzzyVinCarType){
            this.rightFuzzyVinCarType = rightFuzzyVinCarType;
            return this;
        }

        public ConditionBuilder rightFuzzyVinCarType (String ... rightFuzzyVinCarType){
            this.rightFuzzyVinCarType = solveNullList(rightFuzzyVinCarType);
            return this;
        }

        public ConditionBuilder vinCarTypeList(String ... vinCarType){
            this.vinCarTypeList = solveNullList(vinCarType);
            return this;
        }

        public ConditionBuilder vinCarTypeList(List<String> vinCarType){
            this.vinCarTypeList = vinCarType;
            return this;
        }

        public ConditionBuilder fuzzyVinTransmType (List<String> fuzzyVinTransmType){
            this.fuzzyVinTransmType = fuzzyVinTransmType;
            return this;
        }

        public ConditionBuilder fuzzyVinTransmType (String ... fuzzyVinTransmType){
            this.fuzzyVinTransmType = solveNullList(fuzzyVinTransmType);
            return this;
        }

        public ConditionBuilder rightFuzzyVinTransmType (List<String> rightFuzzyVinTransmType){
            this.rightFuzzyVinTransmType = rightFuzzyVinTransmType;
            return this;
        }

        public ConditionBuilder rightFuzzyVinTransmType (String ... rightFuzzyVinTransmType){
            this.rightFuzzyVinTransmType = solveNullList(rightFuzzyVinTransmType);
            return this;
        }

        public ConditionBuilder vinTransmTypeList(String ... vinTransmType){
            this.vinTransmTypeList = solveNullList(vinTransmType);
            return this;
        }

        public ConditionBuilder vinTransmTypeList(List<String> vinTransmType){
            this.vinTransmTypeList = vinTransmType;
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

        private MqmsVinDecode obj;

        public Builder(){
            this.obj = new MqmsVinDecode();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder vinShortCode(String vinShortCode){
            this.obj.setVinShortCode(vinShortCode);
            return this;
        }
        public Builder vinSimCode(String vinSimCode){
            this.obj.setVinSimCode(vinSimCode);
            return this;
        }
        public Builder vinEngShortCode(String vinEngShortCode){
            this.obj.setVinEngShortCode(vinEngShortCode);
            return this;
        }
        public Builder vinSeries(String vinSeries){
            this.obj.setVinSeries(vinSeries);
            return this;
        }
        public Builder vinEngType(String vinEngType){
            this.obj.setVinEngType(vinEngType);
            return this;
        }
        public Builder vinTransmShortCode(String vinTransmShortCode){
            this.obj.setVinTransmShortCode(vinTransmShortCode);
            return this;
        }
        public Builder vinCarShortCode(String vinCarShortCode){
            this.obj.setVinCarShortCode(vinCarShortCode);
            return this;
        }
        public Builder vinCarType(String vinCarType){
            this.obj.setVinCarType(vinCarType);
            return this;
        }
        public Builder vinTransmType(String vinTransmType){
            this.obj.setVinTransmType(vinTransmType);
            return this;
        }
        public MqmsVinDecode build(){return obj;}
    }

}
