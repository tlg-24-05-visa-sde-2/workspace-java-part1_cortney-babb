enum VolumeLevel {
    OFF(0),
    SOFT(25),
    MEDIUM(50),
    LOUD(75),
    MAX(100);

    private int volLevel;

    VolumeLevel(int volLevel) {
        this.volLevel = volLevel;
    }

    public int getVolLevel() {
        return volLevel;
    }

    public String toString() {
        return String.valueOf(volLevel);
    }
}

