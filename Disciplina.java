package projeto;
public class Disciplina {
  public String nome;
  private int ch;

  //Construtor
  public Disciplina(String nome, int ch) {
    this.nome = nome;
    this.ch = ch;
  }

  // Getters and Setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }


  public int getCh() {
    return ch;
  }

  public void setCh(int ch) {
    this.ch = ch;
  }

  

  
}
