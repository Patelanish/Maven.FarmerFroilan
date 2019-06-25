package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Rideable {

    void mount();
    void dismount();
    void ride();
    boolean isMounted = false;
    boolean isDismounted= false;
    boolean isRidden= false;


}
