package io.kbdhunters.common.vo;

import lombok.Setter;

import java.util.List;

/**
 * @author Jason, Moon
 * @since 2018-03-31.
 */
@Setter
public class ResponseVO {

    public ResultCode resultCode;
    public List resultList;
    public Object resultObject;
    public int resultCount;

    public static ResponseVO of(ResultCode resultCode) {
        ResponseVO result = new ResponseVO();

        result.setResultCode(resultCode);

        return result;
    }

    public static ResponseVO of(ResultCode resultCode, Object resultObject) {
        ResponseVO result = new ResponseVO();

        result.setResultCode(resultCode);
        result.setResultObject(resultObject);

        return result;
    }

    public static ResponseVO of(ResultCode resultCode, Object resultObject, int resultCount) {
        ResponseVO result = new ResponseVO();

        result.setResultCode(resultCode);
        result.setResultObject(resultObject);
        result.setResultCount(resultCount);

        return result;
    }

    public static ResponseVO of(ResultCode resultCode, List<?> resultList) {
        ResponseVO result = new ResponseVO();

        result.setResultCode(resultCode);
        result.setResultList(resultList);

        return result;
    }

    public static ResponseVO of(ResultCode resultCode, List<?> resultList, int resultCount) {
        ResponseVO result = new ResponseVO();

        result.setResultCode(resultCode);
        result.setResultList(resultList);
        result.setResultCount(resultCount);

        return result;
    }
}
