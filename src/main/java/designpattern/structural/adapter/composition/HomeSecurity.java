package designpattern.structural.adapter.composition;

public class HomeSecurity implements Security {

    SecurityAdapter securityAdapter;

    @Override
    public void validate(String type) {

        if (type.equals("biometry")) {
            System.out.println("biometry...");
        } else {
            securityAdapter = new SecurityAdapter(type);
            securityAdapter.validate(type);
        }
    }
}
