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
public class MqmsFailureTrack implements Serializable {

    private static final long serialVersionUID = 1582506465148L;


    /**
    * 
    * isNullAble:1
    */
    private Integer failureTrackId;

    /**
    * 
    * isNullAble:1
    */
    private String voucherCode;

    /**
    * 流程系统id
    * isNullAble:1
    */
    private Integer saoId;

    /**
    * 不良追踪负责人id
    * isNullAble:1
    */
    private Integer trackBeginerId;

    /**
    * 不良追踪负责人工号
    * isNullAble:1
    */
    private String trackBeginerNo;

    /**
    * 不良追踪负责人姓名
    * isNullAble:1
    */
    private String trackBeginerName;

    /**
    * 是否装车测试
    * isNullAble:1
    */
    private String carTestSymbol;

    /**
    * 故障再现者id
    * isNullAble:1
    */
    private Integer failureReappearPersonId;

    /**
    * 故障再现者姓名
    * isNullAble:1
    */
    private String failureReappearPersonName;

    /**
    * 是否故障再现
    * isNullAble:1
    */
    private String failureReappearSymbol;


    public void setFailureTrackId(Integer failureTrackId){this.failureTrackId = failureTrackId;}

    public Integer getFailureTrackId(){return this.failureTrackId;}

    public void setVoucherCode(String voucherCode){this.voucherCode = voucherCode;}

    public String getVoucherCode(){return this.voucherCode;}

    public void setSaoId(Integer saoId){this.saoId = saoId;}

    public Integer getSaoId(){return this.saoId;}

    public void setTrackBeginerId(Integer trackBeginerId){this.trackBeginerId = trackBeginerId;}

    public Integer getTrackBeginerId(){return this.trackBeginerId;}

    public void setTrackBeginerNo(String trackBeginerNo){this.trackBeginerNo = trackBeginerNo;}

    public String getTrackBeginerNo(){return this.trackBeginerNo;}

    public void setTrackBeginerName(String trackBeginerName){this.trackBeginerName = trackBeginerName;}

    public String getTrackBeginerName(){return this.trackBeginerName;}

    public void setCarTestSymbol(String carTestSymbol){this.carTestSymbol = carTestSymbol;}

    public String getCarTestSymbol(){return this.carTestSymbol;}

    public void setFailureReappearPersonId(Integer failureReappearPersonId){this.failureReappearPersonId = failureReappearPersonId;}

    public Integer getFailureReappearPersonId(){return this.failureReappearPersonId;}

    public void setFailureReappearPersonName(String failureReappearPersonName){this.failureReappearPersonName = failureReappearPersonName;}

    public String getFailureReappearPersonName(){return this.failureReappearPersonName;}

    public void setFailureReappearSymbol(String failureReappearSymbol){this.failureReappearSymbol = failureReappearSymbol;}

    public String getFailureReappearSymbol(){return this.failureReappearSymbol;}
    @Override
    public String toString() {
        return "MqmsFailureTrack{" +
                "failureTrackId='" + failureTrackId + '\'' +
                "voucherCode='" + voucherCode + '\'' +
                "saoId='" + saoId + '\'' +
                "trackBeginerId='" + trackBeginerId + '\'' +
                "trackBeginerNo='" + trackBeginerNo + '\'' +
                "trackBeginerName='" + trackBeginerName + '\'' +
                "carTestSymbol='" + carTestSymbol + '\'' +
                "failureReappearPersonId='" + failureReappearPersonId + '\'' +
                "failureReappearPersonName='" + failureReappearPersonName + '\'' +
                "failureReappearSymbol='" + failureReappearSymbol + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsFailureTrack set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsFailureTrack set){
            this.set = set;
            return this;
        }

        public MqmsFailureTrack getSet(){
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

    public static class QueryBuilder extends MqmsFailureTrack{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> failureTrackIdList;

        public List<Integer> getFailureTrackIdList(){return this.failureTrackIdList;}

        private Integer failureTrackIdSt;

        private Integer failureTrackIdEd;

        public Integer getFailureTrackIdSt(){return this.failureTrackIdSt;}

        public Integer getFailureTrackIdEd(){return this.failureTrackIdEd;}

        private List<String> voucherCodeList;

        public List<String> getVoucherCodeList(){return this.voucherCodeList;}


        private List<String> fuzzyVoucherCode;

        public List<String> getFuzzyVoucherCode(){return this.fuzzyVoucherCode;}

        private List<String> rightFuzzyVoucherCode;

        public List<String> getRightFuzzyVoucherCode(){return this.rightFuzzyVoucherCode;}
        private List<Integer> saoIdList;

        public List<Integer> getSaoIdList(){return this.saoIdList;}

        private Integer saoIdSt;

        private Integer saoIdEd;

        public Integer getSaoIdSt(){return this.saoIdSt;}

        public Integer getSaoIdEd(){return this.saoIdEd;}

        private List<Integer> trackBeginerIdList;

        public List<Integer> getTrackBeginerIdList(){return this.trackBeginerIdList;}

        private Integer trackBeginerIdSt;

        private Integer trackBeginerIdEd;

        public Integer getTrackBeginerIdSt(){return this.trackBeginerIdSt;}

        public Integer getTrackBeginerIdEd(){return this.trackBeginerIdEd;}

        private List<String> trackBeginerNoList;

        public List<String> getTrackBeginerNoList(){return this.trackBeginerNoList;}


        private List<String> fuzzyTrackBeginerNo;

        public List<String> getFuzzyTrackBeginerNo(){return this.fuzzyTrackBeginerNo;}

        private List<String> rightFuzzyTrackBeginerNo;

        public List<String> getRightFuzzyTrackBeginerNo(){return this.rightFuzzyTrackBeginerNo;}
        private List<String> trackBeginerNameList;

        public List<String> getTrackBeginerNameList(){return this.trackBeginerNameList;}


        private List<String> fuzzyTrackBeginerName;

        public List<String> getFuzzyTrackBeginerName(){return this.fuzzyTrackBeginerName;}

        private List<String> rightFuzzyTrackBeginerName;

        public List<String> getRightFuzzyTrackBeginerName(){return this.rightFuzzyTrackBeginerName;}
        private List<String> carTestSymbolList;

        public List<String> getCarTestSymbolList(){return this.carTestSymbolList;}


        private List<String> fuzzyCarTestSymbol;

        public List<String> getFuzzyCarTestSymbol(){return this.fuzzyCarTestSymbol;}

        private List<String> rightFuzzyCarTestSymbol;

        public List<String> getRightFuzzyCarTestSymbol(){return this.rightFuzzyCarTestSymbol;}
        private List<Integer> failureReappearPersonIdList;

        public List<Integer> getFailureReappearPersonIdList(){return this.failureReappearPersonIdList;}

        private Integer failureReappearPersonIdSt;

        private Integer failureReappearPersonIdEd;

        public Integer getFailureReappearPersonIdSt(){return this.failureReappearPersonIdSt;}

        public Integer getFailureReappearPersonIdEd(){return this.failureReappearPersonIdEd;}

        private List<String> failureReappearPersonNameList;

        public List<String> getFailureReappearPersonNameList(){return this.failureReappearPersonNameList;}


        private List<String> fuzzyFailureReappearPersonName;

        public List<String> getFuzzyFailureReappearPersonName(){return this.fuzzyFailureReappearPersonName;}

        private List<String> rightFuzzyFailureReappearPersonName;

        public List<String> getRightFuzzyFailureReappearPersonName(){return this.rightFuzzyFailureReappearPersonName;}
        private List<String> failureReappearSymbolList;

        public List<String> getFailureReappearSymbolList(){return this.failureReappearSymbolList;}


        private List<String> fuzzyFailureReappearSymbol;

        public List<String> getFuzzyFailureReappearSymbol(){return this.fuzzyFailureReappearSymbol;}

        private List<String> rightFuzzyFailureReappearSymbol;

        public List<String> getRightFuzzyFailureReappearSymbol(){return this.rightFuzzyFailureReappearSymbol;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder failureTrackIdBetWeen(Integer failureTrackIdSt,Integer failureTrackIdEd){
            this.failureTrackIdSt = failureTrackIdSt;
            this.failureTrackIdEd = failureTrackIdEd;
            return this;
        }

        public QueryBuilder failureTrackIdGreaterEqThan(Integer failureTrackIdSt){
            this.failureTrackIdSt = failureTrackIdSt;
            return this;
        }
        public QueryBuilder failureTrackIdLessEqThan(Integer failureTrackIdEd){
            this.failureTrackIdEd = failureTrackIdEd;
            return this;
        }


        public QueryBuilder failureTrackId(Integer failureTrackId){
            setFailureTrackId(failureTrackId);
            return this;
        }

        public QueryBuilder failureTrackIdList(Integer ... failureTrackId){
            this.failureTrackIdList = solveNullList(failureTrackId);
            return this;
        }

        public QueryBuilder failureTrackIdList(List<Integer> failureTrackId){
            this.failureTrackIdList = failureTrackId;
            return this;
        }

        public QueryBuilder fetchFailureTrackId(){
            setFetchFields("fetchFields","failureTrackId");
            return this;
        }

        public QueryBuilder excludeFailureTrackId(){
            setFetchFields("excludeFields","failureTrackId");
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

        public QueryBuilder saoIdBetWeen(Integer saoIdSt,Integer saoIdEd){
            this.saoIdSt = saoIdSt;
            this.saoIdEd = saoIdEd;
            return this;
        }

        public QueryBuilder saoIdGreaterEqThan(Integer saoIdSt){
            this.saoIdSt = saoIdSt;
            return this;
        }
        public QueryBuilder saoIdLessEqThan(Integer saoIdEd){
            this.saoIdEd = saoIdEd;
            return this;
        }


        public QueryBuilder saoId(Integer saoId){
            setSaoId(saoId);
            return this;
        }

        public QueryBuilder saoIdList(Integer ... saoId){
            this.saoIdList = solveNullList(saoId);
            return this;
        }

        public QueryBuilder saoIdList(List<Integer> saoId){
            this.saoIdList = saoId;
            return this;
        }

        public QueryBuilder fetchSaoId(){
            setFetchFields("fetchFields","saoId");
            return this;
        }

        public QueryBuilder excludeSaoId(){
            setFetchFields("excludeFields","saoId");
            return this;
        }

        public QueryBuilder trackBeginerIdBetWeen(Integer trackBeginerIdSt,Integer trackBeginerIdEd){
            this.trackBeginerIdSt = trackBeginerIdSt;
            this.trackBeginerIdEd = trackBeginerIdEd;
            return this;
        }

        public QueryBuilder trackBeginerIdGreaterEqThan(Integer trackBeginerIdSt){
            this.trackBeginerIdSt = trackBeginerIdSt;
            return this;
        }
        public QueryBuilder trackBeginerIdLessEqThan(Integer trackBeginerIdEd){
            this.trackBeginerIdEd = trackBeginerIdEd;
            return this;
        }


        public QueryBuilder trackBeginerId(Integer trackBeginerId){
            setTrackBeginerId(trackBeginerId);
            return this;
        }

        public QueryBuilder trackBeginerIdList(Integer ... trackBeginerId){
            this.trackBeginerIdList = solveNullList(trackBeginerId);
            return this;
        }

        public QueryBuilder trackBeginerIdList(List<Integer> trackBeginerId){
            this.trackBeginerIdList = trackBeginerId;
            return this;
        }

        public QueryBuilder fetchTrackBeginerId(){
            setFetchFields("fetchFields","trackBeginerId");
            return this;
        }

        public QueryBuilder excludeTrackBeginerId(){
            setFetchFields("excludeFields","trackBeginerId");
            return this;
        }

        public QueryBuilder fuzzyTrackBeginerNo (List<String> fuzzyTrackBeginerNo){
            this.fuzzyTrackBeginerNo = fuzzyTrackBeginerNo;
            return this;
        }

        public QueryBuilder fuzzyTrackBeginerNo (String ... fuzzyTrackBeginerNo){
            this.fuzzyTrackBeginerNo = solveNullList(fuzzyTrackBeginerNo);
            return this;
        }

        public QueryBuilder rightFuzzyTrackBeginerNo (List<String> rightFuzzyTrackBeginerNo){
            this.rightFuzzyTrackBeginerNo = rightFuzzyTrackBeginerNo;
            return this;
        }

        public QueryBuilder rightFuzzyTrackBeginerNo (String ... rightFuzzyTrackBeginerNo){
            this.rightFuzzyTrackBeginerNo = solveNullList(rightFuzzyTrackBeginerNo);
            return this;
        }

        public QueryBuilder trackBeginerNo(String trackBeginerNo){
            setTrackBeginerNo(trackBeginerNo);
            return this;
        }

        public QueryBuilder trackBeginerNoList(String ... trackBeginerNo){
            this.trackBeginerNoList = solveNullList(trackBeginerNo);
            return this;
        }

        public QueryBuilder trackBeginerNoList(List<String> trackBeginerNo){
            this.trackBeginerNoList = trackBeginerNo;
            return this;
        }

        public QueryBuilder fetchTrackBeginerNo(){
            setFetchFields("fetchFields","trackBeginerNo");
            return this;
        }

        public QueryBuilder excludeTrackBeginerNo(){
            setFetchFields("excludeFields","trackBeginerNo");
            return this;
        }

        public QueryBuilder fuzzyTrackBeginerName (List<String> fuzzyTrackBeginerName){
            this.fuzzyTrackBeginerName = fuzzyTrackBeginerName;
            return this;
        }

        public QueryBuilder fuzzyTrackBeginerName (String ... fuzzyTrackBeginerName){
            this.fuzzyTrackBeginerName = solveNullList(fuzzyTrackBeginerName);
            return this;
        }

        public QueryBuilder rightFuzzyTrackBeginerName (List<String> rightFuzzyTrackBeginerName){
            this.rightFuzzyTrackBeginerName = rightFuzzyTrackBeginerName;
            return this;
        }

        public QueryBuilder rightFuzzyTrackBeginerName (String ... rightFuzzyTrackBeginerName){
            this.rightFuzzyTrackBeginerName = solveNullList(rightFuzzyTrackBeginerName);
            return this;
        }

        public QueryBuilder trackBeginerName(String trackBeginerName){
            setTrackBeginerName(trackBeginerName);
            return this;
        }

        public QueryBuilder trackBeginerNameList(String ... trackBeginerName){
            this.trackBeginerNameList = solveNullList(trackBeginerName);
            return this;
        }

        public QueryBuilder trackBeginerNameList(List<String> trackBeginerName){
            this.trackBeginerNameList = trackBeginerName;
            return this;
        }

        public QueryBuilder fetchTrackBeginerName(){
            setFetchFields("fetchFields","trackBeginerName");
            return this;
        }

        public QueryBuilder excludeTrackBeginerName(){
            setFetchFields("excludeFields","trackBeginerName");
            return this;
        }

        public QueryBuilder fuzzyCarTestSymbol (List<String> fuzzyCarTestSymbol){
            this.fuzzyCarTestSymbol = fuzzyCarTestSymbol;
            return this;
        }

        public QueryBuilder fuzzyCarTestSymbol (String ... fuzzyCarTestSymbol){
            this.fuzzyCarTestSymbol = solveNullList(fuzzyCarTestSymbol);
            return this;
        }

        public QueryBuilder rightFuzzyCarTestSymbol (List<String> rightFuzzyCarTestSymbol){
            this.rightFuzzyCarTestSymbol = rightFuzzyCarTestSymbol;
            return this;
        }

        public QueryBuilder rightFuzzyCarTestSymbol (String ... rightFuzzyCarTestSymbol){
            this.rightFuzzyCarTestSymbol = solveNullList(rightFuzzyCarTestSymbol);
            return this;
        }

        public QueryBuilder carTestSymbol(String carTestSymbol){
            setCarTestSymbol(carTestSymbol);
            return this;
        }

        public QueryBuilder carTestSymbolList(String ... carTestSymbol){
            this.carTestSymbolList = solveNullList(carTestSymbol);
            return this;
        }

        public QueryBuilder carTestSymbolList(List<String> carTestSymbol){
            this.carTestSymbolList = carTestSymbol;
            return this;
        }

        public QueryBuilder fetchCarTestSymbol(){
            setFetchFields("fetchFields","carTestSymbol");
            return this;
        }

        public QueryBuilder excludeCarTestSymbol(){
            setFetchFields("excludeFields","carTestSymbol");
            return this;
        }

        public QueryBuilder failureReappearPersonIdBetWeen(Integer failureReappearPersonIdSt,Integer failureReappearPersonIdEd){
            this.failureReappearPersonIdSt = failureReappearPersonIdSt;
            this.failureReappearPersonIdEd = failureReappearPersonIdEd;
            return this;
        }

        public QueryBuilder failureReappearPersonIdGreaterEqThan(Integer failureReappearPersonIdSt){
            this.failureReappearPersonIdSt = failureReappearPersonIdSt;
            return this;
        }
        public QueryBuilder failureReappearPersonIdLessEqThan(Integer failureReappearPersonIdEd){
            this.failureReappearPersonIdEd = failureReappearPersonIdEd;
            return this;
        }


        public QueryBuilder failureReappearPersonId(Integer failureReappearPersonId){
            setFailureReappearPersonId(failureReappearPersonId);
            return this;
        }

        public QueryBuilder failureReappearPersonIdList(Integer ... failureReappearPersonId){
            this.failureReappearPersonIdList = solveNullList(failureReappearPersonId);
            return this;
        }

        public QueryBuilder failureReappearPersonIdList(List<Integer> failureReappearPersonId){
            this.failureReappearPersonIdList = failureReappearPersonId;
            return this;
        }

        public QueryBuilder fetchFailureReappearPersonId(){
            setFetchFields("fetchFields","failureReappearPersonId");
            return this;
        }

        public QueryBuilder excludeFailureReappearPersonId(){
            setFetchFields("excludeFields","failureReappearPersonId");
            return this;
        }

        public QueryBuilder fuzzyFailureReappearPersonName (List<String> fuzzyFailureReappearPersonName){
            this.fuzzyFailureReappearPersonName = fuzzyFailureReappearPersonName;
            return this;
        }

        public QueryBuilder fuzzyFailureReappearPersonName (String ... fuzzyFailureReappearPersonName){
            this.fuzzyFailureReappearPersonName = solveNullList(fuzzyFailureReappearPersonName);
            return this;
        }

        public QueryBuilder rightFuzzyFailureReappearPersonName (List<String> rightFuzzyFailureReappearPersonName){
            this.rightFuzzyFailureReappearPersonName = rightFuzzyFailureReappearPersonName;
            return this;
        }

        public QueryBuilder rightFuzzyFailureReappearPersonName (String ... rightFuzzyFailureReappearPersonName){
            this.rightFuzzyFailureReappearPersonName = solveNullList(rightFuzzyFailureReappearPersonName);
            return this;
        }

        public QueryBuilder failureReappearPersonName(String failureReappearPersonName){
            setFailureReappearPersonName(failureReappearPersonName);
            return this;
        }

        public QueryBuilder failureReappearPersonNameList(String ... failureReappearPersonName){
            this.failureReappearPersonNameList = solveNullList(failureReappearPersonName);
            return this;
        }

        public QueryBuilder failureReappearPersonNameList(List<String> failureReappearPersonName){
            this.failureReappearPersonNameList = failureReappearPersonName;
            return this;
        }

        public QueryBuilder fetchFailureReappearPersonName(){
            setFetchFields("fetchFields","failureReappearPersonName");
            return this;
        }

        public QueryBuilder excludeFailureReappearPersonName(){
            setFetchFields("excludeFields","failureReappearPersonName");
            return this;
        }

        public QueryBuilder fuzzyFailureReappearSymbol (List<String> fuzzyFailureReappearSymbol){
            this.fuzzyFailureReappearSymbol = fuzzyFailureReappearSymbol;
            return this;
        }

        public QueryBuilder fuzzyFailureReappearSymbol (String ... fuzzyFailureReappearSymbol){
            this.fuzzyFailureReappearSymbol = solveNullList(fuzzyFailureReappearSymbol);
            return this;
        }

        public QueryBuilder rightFuzzyFailureReappearSymbol (List<String> rightFuzzyFailureReappearSymbol){
            this.rightFuzzyFailureReappearSymbol = rightFuzzyFailureReappearSymbol;
            return this;
        }

        public QueryBuilder rightFuzzyFailureReappearSymbol (String ... rightFuzzyFailureReappearSymbol){
            this.rightFuzzyFailureReappearSymbol = solveNullList(rightFuzzyFailureReappearSymbol);
            return this;
        }

        public QueryBuilder failureReappearSymbol(String failureReappearSymbol){
            setFailureReappearSymbol(failureReappearSymbol);
            return this;
        }

        public QueryBuilder failureReappearSymbolList(String ... failureReappearSymbol){
            this.failureReappearSymbolList = solveNullList(failureReappearSymbol);
            return this;
        }

        public QueryBuilder failureReappearSymbolList(List<String> failureReappearSymbol){
            this.failureReappearSymbolList = failureReappearSymbol;
            return this;
        }

        public QueryBuilder fetchFailureReappearSymbol(){
            setFetchFields("fetchFields","failureReappearSymbol");
            return this;
        }

        public QueryBuilder excludeFailureReappearSymbol(){
            setFetchFields("excludeFields","failureReappearSymbol");
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

        public MqmsFailureTrack build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> failureTrackIdList;

        public List<Integer> getFailureTrackIdList(){return this.failureTrackIdList;}

        private Integer failureTrackIdSt;

        private Integer failureTrackIdEd;

        public Integer getFailureTrackIdSt(){return this.failureTrackIdSt;}

        public Integer getFailureTrackIdEd(){return this.failureTrackIdEd;}

        private List<String> voucherCodeList;

        public List<String> getVoucherCodeList(){return this.voucherCodeList;}


        private List<String> fuzzyVoucherCode;

        public List<String> getFuzzyVoucherCode(){return this.fuzzyVoucherCode;}

        private List<String> rightFuzzyVoucherCode;

        public List<String> getRightFuzzyVoucherCode(){return this.rightFuzzyVoucherCode;}
        private List<Integer> saoIdList;

        public List<Integer> getSaoIdList(){return this.saoIdList;}

        private Integer saoIdSt;

        private Integer saoIdEd;

        public Integer getSaoIdSt(){return this.saoIdSt;}

        public Integer getSaoIdEd(){return this.saoIdEd;}

        private List<Integer> trackBeginerIdList;

        public List<Integer> getTrackBeginerIdList(){return this.trackBeginerIdList;}

        private Integer trackBeginerIdSt;

        private Integer trackBeginerIdEd;

        public Integer getTrackBeginerIdSt(){return this.trackBeginerIdSt;}

        public Integer getTrackBeginerIdEd(){return this.trackBeginerIdEd;}

        private List<String> trackBeginerNoList;

        public List<String> getTrackBeginerNoList(){return this.trackBeginerNoList;}


        private List<String> fuzzyTrackBeginerNo;

        public List<String> getFuzzyTrackBeginerNo(){return this.fuzzyTrackBeginerNo;}

        private List<String> rightFuzzyTrackBeginerNo;

        public List<String> getRightFuzzyTrackBeginerNo(){return this.rightFuzzyTrackBeginerNo;}
        private List<String> trackBeginerNameList;

        public List<String> getTrackBeginerNameList(){return this.trackBeginerNameList;}


        private List<String> fuzzyTrackBeginerName;

        public List<String> getFuzzyTrackBeginerName(){return this.fuzzyTrackBeginerName;}

        private List<String> rightFuzzyTrackBeginerName;

        public List<String> getRightFuzzyTrackBeginerName(){return this.rightFuzzyTrackBeginerName;}
        private List<String> carTestSymbolList;

        public List<String> getCarTestSymbolList(){return this.carTestSymbolList;}


        private List<String> fuzzyCarTestSymbol;

        public List<String> getFuzzyCarTestSymbol(){return this.fuzzyCarTestSymbol;}

        private List<String> rightFuzzyCarTestSymbol;

        public List<String> getRightFuzzyCarTestSymbol(){return this.rightFuzzyCarTestSymbol;}
        private List<Integer> failureReappearPersonIdList;

        public List<Integer> getFailureReappearPersonIdList(){return this.failureReappearPersonIdList;}

        private Integer failureReappearPersonIdSt;

        private Integer failureReappearPersonIdEd;

        public Integer getFailureReappearPersonIdSt(){return this.failureReappearPersonIdSt;}

        public Integer getFailureReappearPersonIdEd(){return this.failureReappearPersonIdEd;}

        private List<String> failureReappearPersonNameList;

        public List<String> getFailureReappearPersonNameList(){return this.failureReappearPersonNameList;}


        private List<String> fuzzyFailureReappearPersonName;

        public List<String> getFuzzyFailureReappearPersonName(){return this.fuzzyFailureReappearPersonName;}

        private List<String> rightFuzzyFailureReappearPersonName;

        public List<String> getRightFuzzyFailureReappearPersonName(){return this.rightFuzzyFailureReappearPersonName;}
        private List<String> failureReappearSymbolList;

        public List<String> getFailureReappearSymbolList(){return this.failureReappearSymbolList;}


        private List<String> fuzzyFailureReappearSymbol;

        public List<String> getFuzzyFailureReappearSymbol(){return this.fuzzyFailureReappearSymbol;}

        private List<String> rightFuzzyFailureReappearSymbol;

        public List<String> getRightFuzzyFailureReappearSymbol(){return this.rightFuzzyFailureReappearSymbol;}

        public ConditionBuilder failureTrackIdBetWeen(Integer failureTrackIdSt,Integer failureTrackIdEd){
            this.failureTrackIdSt = failureTrackIdSt;
            this.failureTrackIdEd = failureTrackIdEd;
            return this;
        }

        public ConditionBuilder failureTrackIdGreaterEqThan(Integer failureTrackIdSt){
            this.failureTrackIdSt = failureTrackIdSt;
            return this;
        }
        public ConditionBuilder failureTrackIdLessEqThan(Integer failureTrackIdEd){
            this.failureTrackIdEd = failureTrackIdEd;
            return this;
        }


        public ConditionBuilder failureTrackIdList(Integer ... failureTrackId){
            this.failureTrackIdList = solveNullList(failureTrackId);
            return this;
        }

        public ConditionBuilder failureTrackIdList(List<Integer> failureTrackId){
            this.failureTrackIdList = failureTrackId;
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

        public ConditionBuilder saoIdBetWeen(Integer saoIdSt,Integer saoIdEd){
            this.saoIdSt = saoIdSt;
            this.saoIdEd = saoIdEd;
            return this;
        }

        public ConditionBuilder saoIdGreaterEqThan(Integer saoIdSt){
            this.saoIdSt = saoIdSt;
            return this;
        }
        public ConditionBuilder saoIdLessEqThan(Integer saoIdEd){
            this.saoIdEd = saoIdEd;
            return this;
        }


        public ConditionBuilder saoIdList(Integer ... saoId){
            this.saoIdList = solveNullList(saoId);
            return this;
        }

        public ConditionBuilder saoIdList(List<Integer> saoId){
            this.saoIdList = saoId;
            return this;
        }

        public ConditionBuilder trackBeginerIdBetWeen(Integer trackBeginerIdSt,Integer trackBeginerIdEd){
            this.trackBeginerIdSt = trackBeginerIdSt;
            this.trackBeginerIdEd = trackBeginerIdEd;
            return this;
        }

        public ConditionBuilder trackBeginerIdGreaterEqThan(Integer trackBeginerIdSt){
            this.trackBeginerIdSt = trackBeginerIdSt;
            return this;
        }
        public ConditionBuilder trackBeginerIdLessEqThan(Integer trackBeginerIdEd){
            this.trackBeginerIdEd = trackBeginerIdEd;
            return this;
        }


        public ConditionBuilder trackBeginerIdList(Integer ... trackBeginerId){
            this.trackBeginerIdList = solveNullList(trackBeginerId);
            return this;
        }

        public ConditionBuilder trackBeginerIdList(List<Integer> trackBeginerId){
            this.trackBeginerIdList = trackBeginerId;
            return this;
        }

        public ConditionBuilder fuzzyTrackBeginerNo (List<String> fuzzyTrackBeginerNo){
            this.fuzzyTrackBeginerNo = fuzzyTrackBeginerNo;
            return this;
        }

        public ConditionBuilder fuzzyTrackBeginerNo (String ... fuzzyTrackBeginerNo){
            this.fuzzyTrackBeginerNo = solveNullList(fuzzyTrackBeginerNo);
            return this;
        }

        public ConditionBuilder rightFuzzyTrackBeginerNo (List<String> rightFuzzyTrackBeginerNo){
            this.rightFuzzyTrackBeginerNo = rightFuzzyTrackBeginerNo;
            return this;
        }

        public ConditionBuilder rightFuzzyTrackBeginerNo (String ... rightFuzzyTrackBeginerNo){
            this.rightFuzzyTrackBeginerNo = solveNullList(rightFuzzyTrackBeginerNo);
            return this;
        }

        public ConditionBuilder trackBeginerNoList(String ... trackBeginerNo){
            this.trackBeginerNoList = solveNullList(trackBeginerNo);
            return this;
        }

        public ConditionBuilder trackBeginerNoList(List<String> trackBeginerNo){
            this.trackBeginerNoList = trackBeginerNo;
            return this;
        }

        public ConditionBuilder fuzzyTrackBeginerName (List<String> fuzzyTrackBeginerName){
            this.fuzzyTrackBeginerName = fuzzyTrackBeginerName;
            return this;
        }

        public ConditionBuilder fuzzyTrackBeginerName (String ... fuzzyTrackBeginerName){
            this.fuzzyTrackBeginerName = solveNullList(fuzzyTrackBeginerName);
            return this;
        }

        public ConditionBuilder rightFuzzyTrackBeginerName (List<String> rightFuzzyTrackBeginerName){
            this.rightFuzzyTrackBeginerName = rightFuzzyTrackBeginerName;
            return this;
        }

        public ConditionBuilder rightFuzzyTrackBeginerName (String ... rightFuzzyTrackBeginerName){
            this.rightFuzzyTrackBeginerName = solveNullList(rightFuzzyTrackBeginerName);
            return this;
        }

        public ConditionBuilder trackBeginerNameList(String ... trackBeginerName){
            this.trackBeginerNameList = solveNullList(trackBeginerName);
            return this;
        }

        public ConditionBuilder trackBeginerNameList(List<String> trackBeginerName){
            this.trackBeginerNameList = trackBeginerName;
            return this;
        }

        public ConditionBuilder fuzzyCarTestSymbol (List<String> fuzzyCarTestSymbol){
            this.fuzzyCarTestSymbol = fuzzyCarTestSymbol;
            return this;
        }

        public ConditionBuilder fuzzyCarTestSymbol (String ... fuzzyCarTestSymbol){
            this.fuzzyCarTestSymbol = solveNullList(fuzzyCarTestSymbol);
            return this;
        }

        public ConditionBuilder rightFuzzyCarTestSymbol (List<String> rightFuzzyCarTestSymbol){
            this.rightFuzzyCarTestSymbol = rightFuzzyCarTestSymbol;
            return this;
        }

        public ConditionBuilder rightFuzzyCarTestSymbol (String ... rightFuzzyCarTestSymbol){
            this.rightFuzzyCarTestSymbol = solveNullList(rightFuzzyCarTestSymbol);
            return this;
        }

        public ConditionBuilder carTestSymbolList(String ... carTestSymbol){
            this.carTestSymbolList = solveNullList(carTestSymbol);
            return this;
        }

        public ConditionBuilder carTestSymbolList(List<String> carTestSymbol){
            this.carTestSymbolList = carTestSymbol;
            return this;
        }

        public ConditionBuilder failureReappearPersonIdBetWeen(Integer failureReappearPersonIdSt,Integer failureReappearPersonIdEd){
            this.failureReappearPersonIdSt = failureReappearPersonIdSt;
            this.failureReappearPersonIdEd = failureReappearPersonIdEd;
            return this;
        }

        public ConditionBuilder failureReappearPersonIdGreaterEqThan(Integer failureReappearPersonIdSt){
            this.failureReappearPersonIdSt = failureReappearPersonIdSt;
            return this;
        }
        public ConditionBuilder failureReappearPersonIdLessEqThan(Integer failureReappearPersonIdEd){
            this.failureReappearPersonIdEd = failureReappearPersonIdEd;
            return this;
        }


        public ConditionBuilder failureReappearPersonIdList(Integer ... failureReappearPersonId){
            this.failureReappearPersonIdList = solveNullList(failureReappearPersonId);
            return this;
        }

        public ConditionBuilder failureReappearPersonIdList(List<Integer> failureReappearPersonId){
            this.failureReappearPersonIdList = failureReappearPersonId;
            return this;
        }

        public ConditionBuilder fuzzyFailureReappearPersonName (List<String> fuzzyFailureReappearPersonName){
            this.fuzzyFailureReappearPersonName = fuzzyFailureReappearPersonName;
            return this;
        }

        public ConditionBuilder fuzzyFailureReappearPersonName (String ... fuzzyFailureReappearPersonName){
            this.fuzzyFailureReappearPersonName = solveNullList(fuzzyFailureReappearPersonName);
            return this;
        }

        public ConditionBuilder rightFuzzyFailureReappearPersonName (List<String> rightFuzzyFailureReappearPersonName){
            this.rightFuzzyFailureReappearPersonName = rightFuzzyFailureReappearPersonName;
            return this;
        }

        public ConditionBuilder rightFuzzyFailureReappearPersonName (String ... rightFuzzyFailureReappearPersonName){
            this.rightFuzzyFailureReappearPersonName = solveNullList(rightFuzzyFailureReappearPersonName);
            return this;
        }

        public ConditionBuilder failureReappearPersonNameList(String ... failureReappearPersonName){
            this.failureReappearPersonNameList = solveNullList(failureReappearPersonName);
            return this;
        }

        public ConditionBuilder failureReappearPersonNameList(List<String> failureReappearPersonName){
            this.failureReappearPersonNameList = failureReappearPersonName;
            return this;
        }

        public ConditionBuilder fuzzyFailureReappearSymbol (List<String> fuzzyFailureReappearSymbol){
            this.fuzzyFailureReappearSymbol = fuzzyFailureReappearSymbol;
            return this;
        }

        public ConditionBuilder fuzzyFailureReappearSymbol (String ... fuzzyFailureReappearSymbol){
            this.fuzzyFailureReappearSymbol = solveNullList(fuzzyFailureReappearSymbol);
            return this;
        }

        public ConditionBuilder rightFuzzyFailureReappearSymbol (List<String> rightFuzzyFailureReappearSymbol){
            this.rightFuzzyFailureReappearSymbol = rightFuzzyFailureReappearSymbol;
            return this;
        }

        public ConditionBuilder rightFuzzyFailureReappearSymbol (String ... rightFuzzyFailureReappearSymbol){
            this.rightFuzzyFailureReappearSymbol = solveNullList(rightFuzzyFailureReappearSymbol);
            return this;
        }

        public ConditionBuilder failureReappearSymbolList(String ... failureReappearSymbol){
            this.failureReappearSymbolList = solveNullList(failureReappearSymbol);
            return this;
        }

        public ConditionBuilder failureReappearSymbolList(List<String> failureReappearSymbol){
            this.failureReappearSymbolList = failureReappearSymbol;
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

        private MqmsFailureTrack obj;

        public Builder(){
            this.obj = new MqmsFailureTrack();
        }

        public Builder failureTrackId(Integer failureTrackId){
            this.obj.setFailureTrackId(failureTrackId);
            return this;
        }
        public Builder voucherCode(String voucherCode){
            this.obj.setVoucherCode(voucherCode);
            return this;
        }
        public Builder saoId(Integer saoId){
            this.obj.setSaoId(saoId);
            return this;
        }
        public Builder trackBeginerId(Integer trackBeginerId){
            this.obj.setTrackBeginerId(trackBeginerId);
            return this;
        }
        public Builder trackBeginerNo(String trackBeginerNo){
            this.obj.setTrackBeginerNo(trackBeginerNo);
            return this;
        }
        public Builder trackBeginerName(String trackBeginerName){
            this.obj.setTrackBeginerName(trackBeginerName);
            return this;
        }
        public Builder carTestSymbol(String carTestSymbol){
            this.obj.setCarTestSymbol(carTestSymbol);
            return this;
        }
        public Builder failureReappearPersonId(Integer failureReappearPersonId){
            this.obj.setFailureReappearPersonId(failureReappearPersonId);
            return this;
        }
        public Builder failureReappearPersonName(String failureReappearPersonName){
            this.obj.setFailureReappearPersonName(failureReappearPersonName);
            return this;
        }
        public Builder failureReappearSymbol(String failureReappearSymbol){
            this.obj.setFailureReappearSymbol(failureReappearSymbol);
            return this;
        }
        public MqmsFailureTrack build(){return obj;}
    }

}
