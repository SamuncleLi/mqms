/**
 * Created by Zeho Lee on 2019/1/16.
 */
function checkUserNo(v) {
    var reg = /[^0-9L\,]/g;
    return v.replace(reg, '')
}