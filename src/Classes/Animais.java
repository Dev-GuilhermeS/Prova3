package Classes;

public abstract class Animais {
    private String nome;
    private int patas;
    private String sexo;

    public Animais (String nome, int patas, String sexo){
        this.nome = nome;
        this.patas = patas;
        this.sexo = sexo;
    }

    public final void doente(){
        System.out.format("O %s está doente.\n",nome);
    }
    
    public void andar(){
        System.out.println("O animal andando\n");
    }

    public float pular(float pulo1, float pulo2){
        System.out.println("Pulou\n");
        return pulo1 * pulo2;
    }
    public int pular(int pulo1 , int pulo2){
        System.out.println("Pulou\n");
        return pulo1 * pulo2;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPatas() {
        return patas;
    }
    public void setPatas(int patas) {
        this.patas = patas;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
