package Classes;

public class Cachorro extends Animais {

    public Cachorro(String nome, String sexo) {
        super(nome, 4, sexo);
    }

    public void Latir(){
        System.out.format("%s esta latindo.\n",getNome());
        System.out.println("AU AU");
    }
    
    @Override
    public void andar() {
        System.out.println("O Cachorro deu 2 passos.");

    }
}
