package Classes;

public final class Coelho extends Animais {

    public Coelho(String nome, String sexo) {
        super(nome, 4, sexo);
    }
    @Override
    public void andar() {
        super.andar();
        System.out.println("O Coelho deu 4 pulos.\n");
    }   
    @Override
    public float pular(float pulo1, float pulo2) {
        return super.pular(pulo1, pulo2);
    }
    @Override
    public int pular(int pulo1, int pulo2) {
        return super.pular(pulo1, pulo2);
    }
}
