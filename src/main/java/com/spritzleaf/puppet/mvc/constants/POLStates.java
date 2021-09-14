package com.spritzleaf.puppet.mvc.constants;

import java.util.Arrays;
import java.util.List;

public enum POLStates {
    APPROVATO, NON_APPROVATO, ACCETTATO, IN_ATTESA;

    public static List<POLStates> getValues() {
        return Arrays.asList(values());
    }
}
