package enums;

public enum StateCity {
    NCR("NSR", new String[]{"Delhi","Gurgaon","Noida"}),
    UTTAR_PRADESH("Uttar Pradesh", new String[]{"Agra","Lucknow","Merrut"}),
    HARYANA("Haryana", new String[]{"Karnal","Panipat"}),
    RAJASTHAN("Rajastan", new String[]{"Jaipur","Jaiselmer"});

    private final String state;
    private final String[] city;

    StateCity(String state, String[] city) {
        this.state = state;
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public String[] getCity() {
        return city;
    }
}
