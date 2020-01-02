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
public class Auth implements Serializable {

    private static final long serialVersionUID = 1568013702079L;


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
    private String authName;

    /**
    * 
    * isNullAble:1
    */
    private String authLevel;

    /**
    * 
    * isNullAble:1
    */
    private String authUrl;

    /**
    * 
    * isNullAble:1
    */
    private Integer authParentId;

    /**
    * 
    * isNullAble:1
    */
    private String authDescription;

    /**
    * 
    * isNullAble:1
    */
    private String state;

    /**
    * 
    * isNullAble:1
    */
    private String iconCls;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setAuthName(String authName){this.authName = authName;}

    public String getAuthName(){return this.authName;}

    public void setAuthLevel(String authLevel){this.authLevel = authLevel;}

    public String getAuthLevel(){return this.authLevel;}

    public void setAuthUrl(String authUrl){this.authUrl = authUrl;}

    public String getAuthUrl(){return this.authUrl;}

    public void setAuthParentId(Integer authParentId){this.authParentId = authParentId;}

    public Integer getAuthParentId(){return this.authParentId;}

    public void setAuthDescription(String authDescription){this.authDescription = authDescription;}

    public String getAuthDescription(){return this.authDescription;}

    public void setState(String state){this.state = state;}

    public String getState(){return this.state;}

    public void setIconCls(String iconCls){this.iconCls = iconCls;}

    public String getIconCls(){return this.iconCls;}
    @Override
    public String toString() {
        return "Auth{" +
                "id='" + id + '\'' +
                "authName='" + authName + '\'' +
                "authLevel='" + authLevel + '\'' +
                "authUrl='" + authUrl + '\'' +
                "authParentId='" + authParentId + '\'' +
                "authDescription='" + authDescription + '\'' +
                "state='" + state + '\'' +
                "iconCls='" + iconCls + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Auth set;

        private ConditionBuilder where;

        public UpdateBuilder set(Auth set){
            this.set = set;
            return this;
        }

        public Auth getSet(){
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

    public static class QueryBuilder extends Auth{
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

        private List<String> authNameList;

        public List<String> getAuthNameList(){return this.authNameList;}


        private List<String> fuzzyAuthName;

        public List<String> getFuzzyAuthName(){return this.fuzzyAuthName;}

        private List<String> rightFuzzyAuthName;

        public List<String> getRightFuzzyAuthName(){return this.rightFuzzyAuthName;}
        private List<String> authLevelList;

        public List<String> getAuthLevelList(){return this.authLevelList;}


        private List<String> fuzzyAuthLevel;

        public List<String> getFuzzyAuthLevel(){return this.fuzzyAuthLevel;}

        private List<String> rightFuzzyAuthLevel;

        public List<String> getRightFuzzyAuthLevel(){return this.rightFuzzyAuthLevel;}
        private List<String> authUrlList;

        public List<String> getAuthUrlList(){return this.authUrlList;}


        private List<String> fuzzyAuthUrl;

        public List<String> getFuzzyAuthUrl(){return this.fuzzyAuthUrl;}

        private List<String> rightFuzzyAuthUrl;

        public List<String> getRightFuzzyAuthUrl(){return this.rightFuzzyAuthUrl;}
        private List<Integer> authParentIdList;

        public List<Integer> getAuthParentIdList(){return this.authParentIdList;}

        private Integer authParentIdSt;

        private Integer authParentIdEd;

        public Integer getAuthParentIdSt(){return this.authParentIdSt;}

        public Integer getAuthParentIdEd(){return this.authParentIdEd;}

        private List<String> authDescriptionList;

        public List<String> getAuthDescriptionList(){return this.authDescriptionList;}


        private List<String> fuzzyAuthDescription;

        public List<String> getFuzzyAuthDescription(){return this.fuzzyAuthDescription;}

        private List<String> rightFuzzyAuthDescription;

        public List<String> getRightFuzzyAuthDescription(){return this.rightFuzzyAuthDescription;}
        private List<String> stateList;

        public List<String> getStateList(){return this.stateList;}


        private List<String> fuzzyState;

        public List<String> getFuzzyState(){return this.fuzzyState;}

        private List<String> rightFuzzyState;

        public List<String> getRightFuzzyState(){return this.rightFuzzyState;}
        private List<String> iconClsList;

        public List<String> getIconClsList(){return this.iconClsList;}


        private List<String> fuzzyIconCls;

        public List<String> getFuzzyIconCls(){return this.fuzzyIconCls;}

        private List<String> rightFuzzyIconCls;

        public List<String> getRightFuzzyIconCls(){return this.rightFuzzyIconCls;}
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

        public QueryBuilder fuzzyAuthName (List<String> fuzzyAuthName){
            this.fuzzyAuthName = fuzzyAuthName;
            return this;
        }

        public QueryBuilder fuzzyAuthName (String ... fuzzyAuthName){
            this.fuzzyAuthName = solveNullList(fuzzyAuthName);
            return this;
        }

        public QueryBuilder rightFuzzyAuthName (List<String> rightFuzzyAuthName){
            this.rightFuzzyAuthName = rightFuzzyAuthName;
            return this;
        }

        public QueryBuilder rightFuzzyAuthName (String ... rightFuzzyAuthName){
            this.rightFuzzyAuthName = solveNullList(rightFuzzyAuthName);
            return this;
        }

        public QueryBuilder authName(String authName){
            setAuthName(authName);
            return this;
        }

        public QueryBuilder authNameList(String ... authName){
            this.authNameList = solveNullList(authName);
            return this;
        }

        public QueryBuilder authNameList(List<String> authName){
            this.authNameList = authName;
            return this;
        }

        public QueryBuilder fetchAuthName(){
            setFetchFields("fetchFields","authName");
            return this;
        }

        public QueryBuilder excludeAuthName(){
            setFetchFields("excludeFields","authName");
            return this;
        }

        public QueryBuilder fuzzyAuthLevel (List<String> fuzzyAuthLevel){
            this.fuzzyAuthLevel = fuzzyAuthLevel;
            return this;
        }

        public QueryBuilder fuzzyAuthLevel (String ... fuzzyAuthLevel){
            this.fuzzyAuthLevel = solveNullList(fuzzyAuthLevel);
            return this;
        }

        public QueryBuilder rightFuzzyAuthLevel (List<String> rightFuzzyAuthLevel){
            this.rightFuzzyAuthLevel = rightFuzzyAuthLevel;
            return this;
        }

        public QueryBuilder rightFuzzyAuthLevel (String ... rightFuzzyAuthLevel){
            this.rightFuzzyAuthLevel = solveNullList(rightFuzzyAuthLevel);
            return this;
        }

        public QueryBuilder authLevel(String authLevel){
            setAuthLevel(authLevel);
            return this;
        }

        public QueryBuilder authLevelList(String ... authLevel){
            this.authLevelList = solveNullList(authLevel);
            return this;
        }

        public QueryBuilder authLevelList(List<String> authLevel){
            this.authLevelList = authLevel;
            return this;
        }

        public QueryBuilder fetchAuthLevel(){
            setFetchFields("fetchFields","authLevel");
            return this;
        }

        public QueryBuilder excludeAuthLevel(){
            setFetchFields("excludeFields","authLevel");
            return this;
        }

        public QueryBuilder fuzzyAuthUrl (List<String> fuzzyAuthUrl){
            this.fuzzyAuthUrl = fuzzyAuthUrl;
            return this;
        }

        public QueryBuilder fuzzyAuthUrl (String ... fuzzyAuthUrl){
            this.fuzzyAuthUrl = solveNullList(fuzzyAuthUrl);
            return this;
        }

        public QueryBuilder rightFuzzyAuthUrl (List<String> rightFuzzyAuthUrl){
            this.rightFuzzyAuthUrl = rightFuzzyAuthUrl;
            return this;
        }

        public QueryBuilder rightFuzzyAuthUrl (String ... rightFuzzyAuthUrl){
            this.rightFuzzyAuthUrl = solveNullList(rightFuzzyAuthUrl);
            return this;
        }

        public QueryBuilder authUrl(String authUrl){
            setAuthUrl(authUrl);
            return this;
        }

        public QueryBuilder authUrlList(String ... authUrl){
            this.authUrlList = solveNullList(authUrl);
            return this;
        }

        public QueryBuilder authUrlList(List<String> authUrl){
            this.authUrlList = authUrl;
            return this;
        }

        public QueryBuilder fetchAuthUrl(){
            setFetchFields("fetchFields","authUrl");
            return this;
        }

        public QueryBuilder excludeAuthUrl(){
            setFetchFields("excludeFields","authUrl");
            return this;
        }

        public QueryBuilder authParentIdBetWeen(Integer authParentIdSt,Integer authParentIdEd){
            this.authParentIdSt = authParentIdSt;
            this.authParentIdEd = authParentIdEd;
            return this;
        }

        public QueryBuilder authParentIdGreaterEqThan(Integer authParentIdSt){
            this.authParentIdSt = authParentIdSt;
            return this;
        }
        public QueryBuilder authParentIdLessEqThan(Integer authParentIdEd){
            this.authParentIdEd = authParentIdEd;
            return this;
        }


        public QueryBuilder authParentId(Integer authParentId){
            setAuthParentId(authParentId);
            return this;
        }

        public QueryBuilder authParentIdList(Integer ... authParentId){
            this.authParentIdList = solveNullList(authParentId);
            return this;
        }

        public QueryBuilder authParentIdList(List<Integer> authParentId){
            this.authParentIdList = authParentId;
            return this;
        }

        public QueryBuilder fetchAuthParentId(){
            setFetchFields("fetchFields","authParentId");
            return this;
        }

        public QueryBuilder excludeAuthParentId(){
            setFetchFields("excludeFields","authParentId");
            return this;
        }

        public QueryBuilder fuzzyAuthDescription (List<String> fuzzyAuthDescription){
            this.fuzzyAuthDescription = fuzzyAuthDescription;
            return this;
        }

        public QueryBuilder fuzzyAuthDescription (String ... fuzzyAuthDescription){
            this.fuzzyAuthDescription = solveNullList(fuzzyAuthDescription);
            return this;
        }

        public QueryBuilder rightFuzzyAuthDescription (List<String> rightFuzzyAuthDescription){
            this.rightFuzzyAuthDescription = rightFuzzyAuthDescription;
            return this;
        }

        public QueryBuilder rightFuzzyAuthDescription (String ... rightFuzzyAuthDescription){
            this.rightFuzzyAuthDescription = solveNullList(rightFuzzyAuthDescription);
            return this;
        }

        public QueryBuilder authDescription(String authDescription){
            setAuthDescription(authDescription);
            return this;
        }

        public QueryBuilder authDescriptionList(String ... authDescription){
            this.authDescriptionList = solveNullList(authDescription);
            return this;
        }

        public QueryBuilder authDescriptionList(List<String> authDescription){
            this.authDescriptionList = authDescription;
            return this;
        }

        public QueryBuilder fetchAuthDescription(){
            setFetchFields("fetchFields","authDescription");
            return this;
        }

        public QueryBuilder excludeAuthDescription(){
            setFetchFields("excludeFields","authDescription");
            return this;
        }

        public QueryBuilder fuzzyState (List<String> fuzzyState){
            this.fuzzyState = fuzzyState;
            return this;
        }

        public QueryBuilder fuzzyState (String ... fuzzyState){
            this.fuzzyState = solveNullList(fuzzyState);
            return this;
        }

        public QueryBuilder rightFuzzyState (List<String> rightFuzzyState){
            this.rightFuzzyState = rightFuzzyState;
            return this;
        }

        public QueryBuilder rightFuzzyState (String ... rightFuzzyState){
            this.rightFuzzyState = solveNullList(rightFuzzyState);
            return this;
        }

        public QueryBuilder state(String state){
            setState(state);
            return this;
        }

        public QueryBuilder stateList(String ... state){
            this.stateList = solveNullList(state);
            return this;
        }

        public QueryBuilder stateList(List<String> state){
            this.stateList = state;
            return this;
        }

        public QueryBuilder fetchState(){
            setFetchFields("fetchFields","state");
            return this;
        }

        public QueryBuilder excludeState(){
            setFetchFields("excludeFields","state");
            return this;
        }

        public QueryBuilder fuzzyIconCls (List<String> fuzzyIconCls){
            this.fuzzyIconCls = fuzzyIconCls;
            return this;
        }

        public QueryBuilder fuzzyIconCls (String ... fuzzyIconCls){
            this.fuzzyIconCls = solveNullList(fuzzyIconCls);
            return this;
        }

        public QueryBuilder rightFuzzyIconCls (List<String> rightFuzzyIconCls){
            this.rightFuzzyIconCls = rightFuzzyIconCls;
            return this;
        }

        public QueryBuilder rightFuzzyIconCls (String ... rightFuzzyIconCls){
            this.rightFuzzyIconCls = solveNullList(rightFuzzyIconCls);
            return this;
        }

        public QueryBuilder iconCls(String iconCls){
            setIconCls(iconCls);
            return this;
        }

        public QueryBuilder iconClsList(String ... iconCls){
            this.iconClsList = solveNullList(iconCls);
            return this;
        }

        public QueryBuilder iconClsList(List<String> iconCls){
            this.iconClsList = iconCls;
            return this;
        }

        public QueryBuilder fetchIconCls(){
            setFetchFields("fetchFields","iconCls");
            return this;
        }

        public QueryBuilder excludeIconCls(){
            setFetchFields("excludeFields","iconCls");
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

        public Auth build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> authNameList;

        public List<String> getAuthNameList(){return this.authNameList;}


        private List<String> fuzzyAuthName;

        public List<String> getFuzzyAuthName(){return this.fuzzyAuthName;}

        private List<String> rightFuzzyAuthName;

        public List<String> getRightFuzzyAuthName(){return this.rightFuzzyAuthName;}
        private List<String> authLevelList;

        public List<String> getAuthLevelList(){return this.authLevelList;}


        private List<String> fuzzyAuthLevel;

        public List<String> getFuzzyAuthLevel(){return this.fuzzyAuthLevel;}

        private List<String> rightFuzzyAuthLevel;

        public List<String> getRightFuzzyAuthLevel(){return this.rightFuzzyAuthLevel;}
        private List<String> authUrlList;

        public List<String> getAuthUrlList(){return this.authUrlList;}


        private List<String> fuzzyAuthUrl;

        public List<String> getFuzzyAuthUrl(){return this.fuzzyAuthUrl;}

        private List<String> rightFuzzyAuthUrl;

        public List<String> getRightFuzzyAuthUrl(){return this.rightFuzzyAuthUrl;}
        private List<Integer> authParentIdList;

        public List<Integer> getAuthParentIdList(){return this.authParentIdList;}

        private Integer authParentIdSt;

        private Integer authParentIdEd;

        public Integer getAuthParentIdSt(){return this.authParentIdSt;}

        public Integer getAuthParentIdEd(){return this.authParentIdEd;}

        private List<String> authDescriptionList;

        public List<String> getAuthDescriptionList(){return this.authDescriptionList;}


        private List<String> fuzzyAuthDescription;

        public List<String> getFuzzyAuthDescription(){return this.fuzzyAuthDescription;}

        private List<String> rightFuzzyAuthDescription;

        public List<String> getRightFuzzyAuthDescription(){return this.rightFuzzyAuthDescription;}
        private List<String> stateList;

        public List<String> getStateList(){return this.stateList;}


        private List<String> fuzzyState;

        public List<String> getFuzzyState(){return this.fuzzyState;}

        private List<String> rightFuzzyState;

        public List<String> getRightFuzzyState(){return this.rightFuzzyState;}
        private List<String> iconClsList;

        public List<String> getIconClsList(){return this.iconClsList;}


        private List<String> fuzzyIconCls;

        public List<String> getFuzzyIconCls(){return this.fuzzyIconCls;}

        private List<String> rightFuzzyIconCls;

        public List<String> getRightFuzzyIconCls(){return this.rightFuzzyIconCls;}

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

        public ConditionBuilder fuzzyAuthName (List<String> fuzzyAuthName){
            this.fuzzyAuthName = fuzzyAuthName;
            return this;
        }

        public ConditionBuilder fuzzyAuthName (String ... fuzzyAuthName){
            this.fuzzyAuthName = solveNullList(fuzzyAuthName);
            return this;
        }

        public ConditionBuilder rightFuzzyAuthName (List<String> rightFuzzyAuthName){
            this.rightFuzzyAuthName = rightFuzzyAuthName;
            return this;
        }

        public ConditionBuilder rightFuzzyAuthName (String ... rightFuzzyAuthName){
            this.rightFuzzyAuthName = solveNullList(rightFuzzyAuthName);
            return this;
        }

        public ConditionBuilder authNameList(String ... authName){
            this.authNameList = solveNullList(authName);
            return this;
        }

        public ConditionBuilder authNameList(List<String> authName){
            this.authNameList = authName;
            return this;
        }

        public ConditionBuilder fuzzyAuthLevel (List<String> fuzzyAuthLevel){
            this.fuzzyAuthLevel = fuzzyAuthLevel;
            return this;
        }

        public ConditionBuilder fuzzyAuthLevel (String ... fuzzyAuthLevel){
            this.fuzzyAuthLevel = solveNullList(fuzzyAuthLevel);
            return this;
        }

        public ConditionBuilder rightFuzzyAuthLevel (List<String> rightFuzzyAuthLevel){
            this.rightFuzzyAuthLevel = rightFuzzyAuthLevel;
            return this;
        }

        public ConditionBuilder rightFuzzyAuthLevel (String ... rightFuzzyAuthLevel){
            this.rightFuzzyAuthLevel = solveNullList(rightFuzzyAuthLevel);
            return this;
        }

        public ConditionBuilder authLevelList(String ... authLevel){
            this.authLevelList = solveNullList(authLevel);
            return this;
        }

        public ConditionBuilder authLevelList(List<String> authLevel){
            this.authLevelList = authLevel;
            return this;
        }

        public ConditionBuilder fuzzyAuthUrl (List<String> fuzzyAuthUrl){
            this.fuzzyAuthUrl = fuzzyAuthUrl;
            return this;
        }

        public ConditionBuilder fuzzyAuthUrl (String ... fuzzyAuthUrl){
            this.fuzzyAuthUrl = solveNullList(fuzzyAuthUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyAuthUrl (List<String> rightFuzzyAuthUrl){
            this.rightFuzzyAuthUrl = rightFuzzyAuthUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyAuthUrl (String ... rightFuzzyAuthUrl){
            this.rightFuzzyAuthUrl = solveNullList(rightFuzzyAuthUrl);
            return this;
        }

        public ConditionBuilder authUrlList(String ... authUrl){
            this.authUrlList = solveNullList(authUrl);
            return this;
        }

        public ConditionBuilder authUrlList(List<String> authUrl){
            this.authUrlList = authUrl;
            return this;
        }

        public ConditionBuilder authParentIdBetWeen(Integer authParentIdSt,Integer authParentIdEd){
            this.authParentIdSt = authParentIdSt;
            this.authParentIdEd = authParentIdEd;
            return this;
        }

        public ConditionBuilder authParentIdGreaterEqThan(Integer authParentIdSt){
            this.authParentIdSt = authParentIdSt;
            return this;
        }
        public ConditionBuilder authParentIdLessEqThan(Integer authParentIdEd){
            this.authParentIdEd = authParentIdEd;
            return this;
        }


        public ConditionBuilder authParentIdList(Integer ... authParentId){
            this.authParentIdList = solveNullList(authParentId);
            return this;
        }

        public ConditionBuilder authParentIdList(List<Integer> authParentId){
            this.authParentIdList = authParentId;
            return this;
        }

        public ConditionBuilder fuzzyAuthDescription (List<String> fuzzyAuthDescription){
            this.fuzzyAuthDescription = fuzzyAuthDescription;
            return this;
        }

        public ConditionBuilder fuzzyAuthDescription (String ... fuzzyAuthDescription){
            this.fuzzyAuthDescription = solveNullList(fuzzyAuthDescription);
            return this;
        }

        public ConditionBuilder rightFuzzyAuthDescription (List<String> rightFuzzyAuthDescription){
            this.rightFuzzyAuthDescription = rightFuzzyAuthDescription;
            return this;
        }

        public ConditionBuilder rightFuzzyAuthDescription (String ... rightFuzzyAuthDescription){
            this.rightFuzzyAuthDescription = solveNullList(rightFuzzyAuthDescription);
            return this;
        }

        public ConditionBuilder authDescriptionList(String ... authDescription){
            this.authDescriptionList = solveNullList(authDescription);
            return this;
        }

        public ConditionBuilder authDescriptionList(List<String> authDescription){
            this.authDescriptionList = authDescription;
            return this;
        }

        public ConditionBuilder fuzzyState (List<String> fuzzyState){
            this.fuzzyState = fuzzyState;
            return this;
        }

        public ConditionBuilder fuzzyState (String ... fuzzyState){
            this.fuzzyState = solveNullList(fuzzyState);
            return this;
        }

        public ConditionBuilder rightFuzzyState (List<String> rightFuzzyState){
            this.rightFuzzyState = rightFuzzyState;
            return this;
        }

        public ConditionBuilder rightFuzzyState (String ... rightFuzzyState){
            this.rightFuzzyState = solveNullList(rightFuzzyState);
            return this;
        }

        public ConditionBuilder stateList(String ... state){
            this.stateList = solveNullList(state);
            return this;
        }

        public ConditionBuilder stateList(List<String> state){
            this.stateList = state;
            return this;
        }

        public ConditionBuilder fuzzyIconCls (List<String> fuzzyIconCls){
            this.fuzzyIconCls = fuzzyIconCls;
            return this;
        }

        public ConditionBuilder fuzzyIconCls (String ... fuzzyIconCls){
            this.fuzzyIconCls = solveNullList(fuzzyIconCls);
            return this;
        }

        public ConditionBuilder rightFuzzyIconCls (List<String> rightFuzzyIconCls){
            this.rightFuzzyIconCls = rightFuzzyIconCls;
            return this;
        }

        public ConditionBuilder rightFuzzyIconCls (String ... rightFuzzyIconCls){
            this.rightFuzzyIconCls = solveNullList(rightFuzzyIconCls);
            return this;
        }

        public ConditionBuilder iconClsList(String ... iconCls){
            this.iconClsList = solveNullList(iconCls);
            return this;
        }

        public ConditionBuilder iconClsList(List<String> iconCls){
            this.iconClsList = iconCls;
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

        private Auth obj;

        public Builder(){
            this.obj = new Auth();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder authName(String authName){
            this.obj.setAuthName(authName);
            return this;
        }
        public Builder authLevel(String authLevel){
            this.obj.setAuthLevel(authLevel);
            return this;
        }
        public Builder authUrl(String authUrl){
            this.obj.setAuthUrl(authUrl);
            return this;
        }
        public Builder authParentId(Integer authParentId){
            this.obj.setAuthParentId(authParentId);
            return this;
        }
        public Builder authDescription(String authDescription){
            this.obj.setAuthDescription(authDescription);
            return this;
        }
        public Builder state(String state){
            this.obj.setState(state);
            return this;
        }
        public Builder iconCls(String iconCls){
            this.obj.setIconCls(iconCls);
            return this;
        }
        public Auth build(){return obj;}
    }

}
