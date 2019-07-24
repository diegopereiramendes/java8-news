package designpattern.structural.adapter.composition;

public class SecurityAdapter implements Security {

    private AdvancedSecurity advancedSecurity;

    public SecurityAdapter(String type) {
        if (type.equals("facial")) {
            advancedSecurity = new FacialReadingSecurity();
        }
    }

    @Override
    public void validate(String type) {
        if (type.equalsIgnoreCase("facial")) {
            advancedSecurity.validateFacialReading();
        }
    }
}
