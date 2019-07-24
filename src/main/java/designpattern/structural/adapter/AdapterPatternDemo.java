package designpattern.structural.adapter;

import designpattern.structural.adapter.composition.HomeSecurity;

// - converte a interface de uma classe em uma outra interface que o cliente está esperando

/*Imagine que você tem uma interface que possui um método capaz de fazer uma validação de segurança, ou seja,
    em qualquer ponto do seu sistema você poderá usar esta interface para acionar a ação de fazer uma validação de segurança,
    instanciando uma classe que implemente tal comportamento, chamaremos de Security*/

public class AdapterPatternDemo {

    public static void main(String[] args) {
        HomeSecurity homeSecurity = new HomeSecurity();
        homeSecurity.validate("biometry");
        homeSecurity.validate("facial");
    }
}
