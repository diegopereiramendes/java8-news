package designpattern.structural.adapter.composition;

public class FacialReadingSecurity implements AdvancedSecurity {

    @Override
    public void validateFacialReading() {
        System.out.println("Facial reading...");
    }
}
