package com.macro.mall.portal.dao;

import com.macro.mall.model.OmsCartItem;
import com.macro.mall.portal.domain.CartProduct;
import com.macro.mall.portal.domain.PromotionProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 前台系统自定义会员信息Dao
 * Created by oliver on 2018/8/2.
 *
 */
public interface PortalMemberDao {

   /**
    * 重置会员地址默认状态信息
    * @param memberId
    * @return
    */
   boolean resetMemberAddressDefaultStatus(@Param("memberId")Long memberId);

}
