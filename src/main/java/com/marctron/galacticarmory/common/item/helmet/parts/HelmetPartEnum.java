package com.marctron.galacticarmory.common.item.helmet.parts;

public enum HelmetPartEnum {
    SUNVISOR(false),
    BASEHELMET(true),
    RANGEFINDER(false),
    FIN(false),
    VISOR(true);

    private final boolean required;

    HelmetPartEnum(boolean required) {
        this.required = required;
    }

    /** Whether the armor assembler refuses to build a helmet without this part. */
    public boolean isRequired() {
        return required;
    }
}
