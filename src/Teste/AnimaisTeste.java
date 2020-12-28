package Teste;

import Classes.Cachorro;
import Classes.Coelho;

public class AnimaisTeste {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Nina" ,"Femea");
        cachorro.Latir();
        cachorro.andar();

        Coelho coelho = new Coelho("Bolinha", "macho");
        coelho.doente();

        coelho.pular(1, 2);

        
    }
}
