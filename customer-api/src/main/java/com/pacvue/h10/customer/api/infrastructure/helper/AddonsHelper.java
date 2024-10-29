package com.pacvue.h10.customer.api.infrastructure.helper;

import com.pacvue.h10.customer.api.domain.customer.service.AccountService;
import com.pacvue.h10.customer.api.infrastructure.enums.AddonStateEnum;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AddonsHelper {

    @Resource
    private AccountService accountService;
    @Resource
    private MT360PlansHelper mt360PlansHelper;

    /**
     * @param tool
     * @return string|null
     * @throws Throwable
     */
    public AddonStateEnum checkAddonState(String tool) {

        Boolean hasAccess = accountService.hasToolAccess(tool);
        Boolean includedInPlan = accountService.isToolIncludedInCurrentPlan(tool);

        if (hasAccess && includedInPlan) {
            return AddonStateEnum.INCLUDED;
        }

        Boolean isMt360Tool = tool.toLowerCase().contains("mt360");

        if (isMt360Tool && mt360PlansHelper.isAddonBoughtInAccount("")) {
            return AddonStateEnum.ADDED;
        }
        List<String> toolsIdsOfBoughtAddOns = new ArrayList<>();
        if (isAddOnQuantitativeByTool(tool)) {
//            toolsIdsOfBoughtAddOns = array_column(
//                    Yii::$container->get(CurrentSubscriptionService:: class)->getAddOns(),
//                    'toolId'
//            );

            return toolsIdsOfBoughtAddOns.contains(tool) ? AddonStateEnum.ADDED : null;
        }

        return hasAccess ? AddonStateEnum.ADDED : null;
    }

    public boolean isAddOnQuantitativeByTool(String tool) {
        return false;
    }
}
