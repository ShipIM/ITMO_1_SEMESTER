package Enums;

public enum Place {
    CORRIDOR("corridor"),
    CABIN("cabin"),
    GAS_COMPARTMENT("gas compartment");

    public String name;

    Place(String name) {
        this.name = name;
    }
}

