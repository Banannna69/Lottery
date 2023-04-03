package com.banana69.lottery.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 统一返回对象中，Code码、Info描述
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result implements Serializable {
    private static final long serialVersionUID = -3826891916021780628L;
    private String code;
    private String info;

    public static Result buildResult(String code, String info) {
        return new Result(code, info);
    }

    public static Result buildSuccessResult(String code, String info){
        return new Result(Constants.ResponseCode.SUCCESS.getCode(),Constants.ResponseCode.SUCCESS.getInfo());
    }

    public static Result buildErrorResult(String code, String info){
        return new Result(Constants.ResponseCode.UNKNOWN_ERROR.getCode(),Constants.ResponseCode.UNKNOWN_ERROR.getInfo());
    }




}
