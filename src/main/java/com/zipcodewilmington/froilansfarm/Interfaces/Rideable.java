package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Rideable {

    boolean isMounted();
    boolean isDismounted();
    boolean isRidden();
    void setIsRidden(Boolean bool);
    void setIsMounted(Boolean bool);
}
