package com.banana69.lottery.rpc.res;

import java.io.Serializable;
import com.banana69.lottery.common.Result;
import com.banana69.lottery.rpc.dto.ActivityDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivityRes implements Serializable {

    private Result result;
    private ActivityDto activity;

}
