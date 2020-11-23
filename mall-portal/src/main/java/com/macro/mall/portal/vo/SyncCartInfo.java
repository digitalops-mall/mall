package com.macro.mall.portal.vo;

import com.macro.mall.model.OmsCartItem;
import lombok.Data;

import java.util.List;

/**
 * 同步购物车信息bean
 * @author oliver
 */
@Data
public class SyncCartInfo {

    private List<OmsCartItem> toAddEle;
    private List<UpdateProperty> toUpdatePro;
    private List<String> toDelEle;

    @Data
    public static class UpdateProperty {
        private String updateVal;
        private String keyName;
        private String id;
    }
}

