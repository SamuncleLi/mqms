package com.gamc.efactory.model.dataObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author lizeh
*/
public class MqmsUserDict implements Serializable {

    private static final long serialVersionUID = 1585728059125L;


    /**
    * 
    * isNullAble:1
    */
    private Integer id;

    /**
    * 人员类型
    * isNullAble:1
    */
    private String orgType;

    /**
    * 人员描述
    * isNullAble:1
    */
    private String orgDesc;

    /**
    * 用户id
    * isNullAble:1
    */
    private Integer userId;

    /**
    * 用户姓名
    * isNullAble:1
    */
    private String userName;

    /**
    * 用户工号
    * isNullAble:1
    */
    private String userNo;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setOrgType(String orgType){this.orgType = orgType;}

    public String getOrgType(){return this.orgType;}

    public void setOrgDesc(String orgDesc){this.orgDesc = orgDesc;}

    public String getOrgDesc(){return this.orgDesc;}

    public void setUserId(Integer userId){this.userId = userId;}

    public Integer getUserId(){return this.userId;}

    public void setUserName(String userName){this.userName = userName;}

    public String getUserName(){return this.userName;}

    public void setUserNo(String userNo){this.userNo = userNo;}

    public String getUserNo(){return this.userNo;}
    @Override
    public String toString() {
        return "MqmsUserDict{" +
                "id='" + id + '\'' +
                "orgType='" + orgType + '\'' +
                "orgDesc='" + orgDesc + '\'' +
                "userId='" + userId + '\'' +
                "userName='" + userName + '\'' +
                "userNo='" + userNo + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsUserDict set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsUserDict set){
            this.set = set;
            return this;
        }

        public MqmsUserDict getSet(){
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

    public static class QueryBuilder extends MqmsUserDict{
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

        private List<String> orgTypeList;

        public List<String> getOrgTypeList(){return this.orgTypeList;}


        private List<String> fuzzyOrgType;

        public List<String> getFuzzyOrgType(){return this.fuzzyOrgType;}

        private List<String> rightFuzzyOrgType;

        public List<String> getRightFuzzyOrgType(){return this.rightFuzzyOrgType;}
        private List<String> orgDescList;

        public List<String> getOrgDescList(){return this.orgDescList;}


        private List<String> fuzzyOrgDesc;

        public List<String> getFuzzyOrgDesc(){return this.fuzzyOrgDesc;}

        private List<String> rightFuzzyOrgDesc;

        public List<String> getRightFuzzyOrgDesc(){return this.rightFuzzyOrgDesc;}
        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<String> userNameList;

        public List<String> getUserNameList(){return this.userNameList;}


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName(){return this.fuzzyUserName;}

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName(){return this.rightFuzzyUserName;}
        private List<String> userNoList;

        public List<String> getUserNoList(){return this.userNoList;}


        private List<String> fuzzyUserNo;

        public List<String> getFuzzyUserNo(){return this.fuzzyUserNo;}

        private List<String> rightFuzzyUserNo;

        public List<String> getRightFuzzyUserNo(){return this.rightFuzzyUserNo;}
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

        public QueryBuilder fuzzyOrgType (List<String> fuzzyOrgType){
            this.fuzzyOrgType = fuzzyOrgType;
            return this;
        }

        public QueryBuilder fuzzyOrgType (String ... fuzzyOrgType){
            this.fuzzyOrgType = solveNullList(fuzzyOrgType);
            return this;
        }

        public QueryBuilder rightFuzzyOrgType (List<String> rightFuzzyOrgType){
            this.rightFuzzyOrgType = rightFuzzyOrgType;
            return this;
        }

        public QueryBuilder rightFuzzyOrgType (String ... rightFuzzyOrgType){
            this.rightFuzzyOrgType = solveNullList(rightFuzzyOrgType);
            return this;
        }

        public QueryBuilder orgType(String orgType){
            setOrgType(orgType);
            return this;
        }

        public QueryBuilder orgTypeList(String ... orgType){
            this.orgTypeList = solveNullList(orgType);
            return this;
        }

        public QueryBuilder orgTypeList(List<String> orgType){
            this.orgTypeList = orgType;
            return this;
        }

        public QueryBuilder fetchOrgType(){
            setFetchFields("fetchFields","orgType");
            return this;
        }

        public QueryBuilder excludeOrgType(){
            setFetchFields("excludeFields","orgType");
            return this;
        }

        public QueryBuilder fuzzyOrgDesc (List<String> fuzzyOrgDesc){
            this.fuzzyOrgDesc = fuzzyOrgDesc;
            return this;
        }

        public QueryBuilder fuzzyOrgDesc (String ... fuzzyOrgDesc){
            this.fuzzyOrgDesc = solveNullList(fuzzyOrgDesc);
            return this;
        }

        public QueryBuilder rightFuzzyOrgDesc (List<String> rightFuzzyOrgDesc){
            this.rightFuzzyOrgDesc = rightFuzzyOrgDesc;
            return this;
        }

        public QueryBuilder rightFuzzyOrgDesc (String ... rightFuzzyOrgDesc){
            this.rightFuzzyOrgDesc = solveNullList(rightFuzzyOrgDesc);
            return this;
        }

        public QueryBuilder orgDesc(String orgDesc){
            setOrgDesc(orgDesc);
            return this;
        }

        public QueryBuilder orgDescList(String ... orgDesc){
            this.orgDescList = solveNullList(orgDesc);
            return this;
        }

        public QueryBuilder orgDescList(List<String> orgDesc){
            this.orgDescList = orgDesc;
            return this;
        }

        public QueryBuilder fetchOrgDesc(){
            setFetchFields("fetchFields","orgDesc");
            return this;
        }

        public QueryBuilder excludeOrgDesc(){
            setFetchFields("excludeFields","orgDesc");
            return this;
        }

        public QueryBuilder userIdBetWeen(Integer userIdSt,Integer userIdEd){
            this.userIdSt = userIdSt;
            this.userIdEd = userIdEd;
            return this;
        }

        public QueryBuilder userIdGreaterEqThan(Integer userIdSt){
            this.userIdSt = userIdSt;
            return this;
        }
        public QueryBuilder userIdLessEqThan(Integer userIdEd){
            this.userIdEd = userIdEd;
            return this;
        }


        public QueryBuilder userId(Integer userId){
            setUserId(userId);
            return this;
        }

        public QueryBuilder userIdList(Integer ... userId){
            this.userIdList = solveNullList(userId);
            return this;
        }

        public QueryBuilder userIdList(List<Integer> userId){
            this.userIdList = userId;
            return this;
        }

        public QueryBuilder fetchUserId(){
            setFetchFields("fetchFields","userId");
            return this;
        }

        public QueryBuilder excludeUserId(){
            setFetchFields("excludeFields","userId");
            return this;
        }

        public QueryBuilder fuzzyUserName (List<String> fuzzyUserName){
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public QueryBuilder fuzzyUserName (String ... fuzzyUserName){
            this.fuzzyUserName = solveNullList(fuzzyUserName);
            return this;
        }

        public QueryBuilder rightFuzzyUserName (List<String> rightFuzzyUserName){
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public QueryBuilder rightFuzzyUserName (String ... rightFuzzyUserName){
            this.rightFuzzyUserName = solveNullList(rightFuzzyUserName);
            return this;
        }

        public QueryBuilder userName(String userName){
            setUserName(userName);
            return this;
        }

        public QueryBuilder userNameList(String ... userName){
            this.userNameList = solveNullList(userName);
            return this;
        }

        public QueryBuilder userNameList(List<String> userName){
            this.userNameList = userName;
            return this;
        }

        public QueryBuilder fetchUserName(){
            setFetchFields("fetchFields","userName");
            return this;
        }

        public QueryBuilder excludeUserName(){
            setFetchFields("excludeFields","userName");
            return this;
        }

        public QueryBuilder fuzzyUserNo (List<String> fuzzyUserNo){
            this.fuzzyUserNo = fuzzyUserNo;
            return this;
        }

        public QueryBuilder fuzzyUserNo (String ... fuzzyUserNo){
            this.fuzzyUserNo = solveNullList(fuzzyUserNo);
            return this;
        }

        public QueryBuilder rightFuzzyUserNo (List<String> rightFuzzyUserNo){
            this.rightFuzzyUserNo = rightFuzzyUserNo;
            return this;
        }

        public QueryBuilder rightFuzzyUserNo (String ... rightFuzzyUserNo){
            this.rightFuzzyUserNo = solveNullList(rightFuzzyUserNo);
            return this;
        }

        public QueryBuilder userNo(String userNo){
            setUserNo(userNo);
            return this;
        }

        public QueryBuilder userNoList(String ... userNo){
            this.userNoList = solveNullList(userNo);
            return this;
        }

        public QueryBuilder userNoList(List<String> userNo){
            this.userNoList = userNo;
            return this;
        }

        public QueryBuilder fetchUserNo(){
            setFetchFields("fetchFields","userNo");
            return this;
        }

        public QueryBuilder excludeUserNo(){
            setFetchFields("excludeFields","userNo");
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

        public MqmsUserDict build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> orgTypeList;

        public List<String> getOrgTypeList(){return this.orgTypeList;}


        private List<String> fuzzyOrgType;

        public List<String> getFuzzyOrgType(){return this.fuzzyOrgType;}

        private List<String> rightFuzzyOrgType;

        public List<String> getRightFuzzyOrgType(){return this.rightFuzzyOrgType;}
        private List<String> orgDescList;

        public List<String> getOrgDescList(){return this.orgDescList;}


        private List<String> fuzzyOrgDesc;

        public List<String> getFuzzyOrgDesc(){return this.fuzzyOrgDesc;}

        private List<String> rightFuzzyOrgDesc;

        public List<String> getRightFuzzyOrgDesc(){return this.rightFuzzyOrgDesc;}
        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<String> userNameList;

        public List<String> getUserNameList(){return this.userNameList;}


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName(){return this.fuzzyUserName;}

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName(){return this.rightFuzzyUserName;}
        private List<String> userNoList;

        public List<String> getUserNoList(){return this.userNoList;}


        private List<String> fuzzyUserNo;

        public List<String> getFuzzyUserNo(){return this.fuzzyUserNo;}

        private List<String> rightFuzzyUserNo;

        public List<String> getRightFuzzyUserNo(){return this.rightFuzzyUserNo;}

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

        public ConditionBuilder fuzzyOrgType (List<String> fuzzyOrgType){
            this.fuzzyOrgType = fuzzyOrgType;
            return this;
        }

        public ConditionBuilder fuzzyOrgType (String ... fuzzyOrgType){
            this.fuzzyOrgType = solveNullList(fuzzyOrgType);
            return this;
        }

        public ConditionBuilder rightFuzzyOrgType (List<String> rightFuzzyOrgType){
            this.rightFuzzyOrgType = rightFuzzyOrgType;
            return this;
        }

        public ConditionBuilder rightFuzzyOrgType (String ... rightFuzzyOrgType){
            this.rightFuzzyOrgType = solveNullList(rightFuzzyOrgType);
            return this;
        }

        public ConditionBuilder orgTypeList(String ... orgType){
            this.orgTypeList = solveNullList(orgType);
            return this;
        }

        public ConditionBuilder orgTypeList(List<String> orgType){
            this.orgTypeList = orgType;
            return this;
        }

        public ConditionBuilder fuzzyOrgDesc (List<String> fuzzyOrgDesc){
            this.fuzzyOrgDesc = fuzzyOrgDesc;
            return this;
        }

        public ConditionBuilder fuzzyOrgDesc (String ... fuzzyOrgDesc){
            this.fuzzyOrgDesc = solveNullList(fuzzyOrgDesc);
            return this;
        }

        public ConditionBuilder rightFuzzyOrgDesc (List<String> rightFuzzyOrgDesc){
            this.rightFuzzyOrgDesc = rightFuzzyOrgDesc;
            return this;
        }

        public ConditionBuilder rightFuzzyOrgDesc (String ... rightFuzzyOrgDesc){
            this.rightFuzzyOrgDesc = solveNullList(rightFuzzyOrgDesc);
            return this;
        }

        public ConditionBuilder orgDescList(String ... orgDesc){
            this.orgDescList = solveNullList(orgDesc);
            return this;
        }

        public ConditionBuilder orgDescList(List<String> orgDesc){
            this.orgDescList = orgDesc;
            return this;
        }

        public ConditionBuilder userIdBetWeen(Integer userIdSt,Integer userIdEd){
            this.userIdSt = userIdSt;
            this.userIdEd = userIdEd;
            return this;
        }

        public ConditionBuilder userIdGreaterEqThan(Integer userIdSt){
            this.userIdSt = userIdSt;
            return this;
        }
        public ConditionBuilder userIdLessEqThan(Integer userIdEd){
            this.userIdEd = userIdEd;
            return this;
        }


        public ConditionBuilder userIdList(Integer ... userId){
            this.userIdList = solveNullList(userId);
            return this;
        }

        public ConditionBuilder userIdList(List<Integer> userId){
            this.userIdList = userId;
            return this;
        }

        public ConditionBuilder fuzzyUserName (List<String> fuzzyUserName){
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public ConditionBuilder fuzzyUserName (String ... fuzzyUserName){
            this.fuzzyUserName = solveNullList(fuzzyUserName);
            return this;
        }

        public ConditionBuilder rightFuzzyUserName (List<String> rightFuzzyUserName){
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public ConditionBuilder rightFuzzyUserName (String ... rightFuzzyUserName){
            this.rightFuzzyUserName = solveNullList(rightFuzzyUserName);
            return this;
        }

        public ConditionBuilder userNameList(String ... userName){
            this.userNameList = solveNullList(userName);
            return this;
        }

        public ConditionBuilder userNameList(List<String> userName){
            this.userNameList = userName;
            return this;
        }

        public ConditionBuilder fuzzyUserNo (List<String> fuzzyUserNo){
            this.fuzzyUserNo = fuzzyUserNo;
            return this;
        }

        public ConditionBuilder fuzzyUserNo (String ... fuzzyUserNo){
            this.fuzzyUserNo = solveNullList(fuzzyUserNo);
            return this;
        }

        public ConditionBuilder rightFuzzyUserNo (List<String> rightFuzzyUserNo){
            this.rightFuzzyUserNo = rightFuzzyUserNo;
            return this;
        }

        public ConditionBuilder rightFuzzyUserNo (String ... rightFuzzyUserNo){
            this.rightFuzzyUserNo = solveNullList(rightFuzzyUserNo);
            return this;
        }

        public ConditionBuilder userNoList(String ... userNo){
            this.userNoList = solveNullList(userNo);
            return this;
        }

        public ConditionBuilder userNoList(List<String> userNo){
            this.userNoList = userNo;
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

        private MqmsUserDict obj;

        public Builder(){
            this.obj = new MqmsUserDict();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder orgType(String orgType){
            this.obj.setOrgType(orgType);
            return this;
        }
        public Builder orgDesc(String orgDesc){
            this.obj.setOrgDesc(orgDesc);
            return this;
        }
        public Builder userId(Integer userId){
            this.obj.setUserId(userId);
            return this;
        }
        public Builder userName(String userName){
            this.obj.setUserName(userName);
            return this;
        }
        public Builder userNo(String userNo){
            this.obj.setUserNo(userNo);
            return this;
        }
        public MqmsUserDict build(){return obj;}
    }

}
