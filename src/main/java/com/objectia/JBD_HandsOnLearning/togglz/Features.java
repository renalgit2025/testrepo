//package com.objectia.JBD_HandsOnLearning.togglz;
//
//import org.togglz.core.Feature;
//import org.togglz.core.annotation.EnabledByDefault;
//import org.togglz.core.annotation.Label;
//import org.togglz.core.context.FeatureContext;
//
//public enum Features implements Feature {
//    @Label("CreateCard")
//    @EnabledByDefault
//    CREATE_CARD;
//    public boolean isActive() {
//        return FeatureContext.getFeatureManager().isActive(this);
//
//    }
//}
