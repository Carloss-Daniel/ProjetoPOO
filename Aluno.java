package projeto;
public class Aluno {
  private String nome;
  private String matricula;
  private String disciplina;
  private int ch;
  private Nota ab1; // Ab1, Ab1 [lista], RA, PF, MF  
  private Nota ab2;
  private int faltas;
  private String situacao;

  // Métodos Adicionais
  public void status(){
    System.out.println(" ======== BOLETIM =======");
    System.out.println("Nome: " + this.nome);
    System.out.println("Matrícula: " +this.matricula);

    System.out.println("Disciplina: " +this.disciplina);
    System.out.println("Carga Horaria: " +this.ch);
    System.out.println("Nota AB1: " +this.ab1);  
    System.out.println("Nota AB2: " +this.ab2);  
    System.out.println("Média Final: "); //...
    System.out.println("Faltas: " +this.faltas);
    System.out.println("Situaçao: " +this.situacao);

  }

  //Construtor
  public Aluno(){
    
  }
  
  //Getters and Setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getDisciplina() {
    return disciplina;
  }

  public void setDisciplina(String disciplina) {
    this.disciplina = disciplina;
  }

  public int getCh() {
    return ch;
  }

  public void setCh(int ch) {
    this.ch = ch;
  }
  

  public Nota getAb1() {
    return ab1;
  }

  public void setAb1(Nota ab1) {
    this.ab1 = ab1;
  }

  public Nota getAb2() {
    return ab2;
  }

  public void setAb2(Nota ab2) {
    this.ab2 = ab2;
  }

  public int getFaltas() {
    return faltas;
  }

  public void setFaltas(int faltas) {
    this.faltas = faltas;
  }

  public String getSituacao(){
    return situacao;
  }

  public void setSituacao(){
    if ( ( (ab1+ab2)/2 >= 7.0 ) && (this.faltas < 30/100* this.ch) ){ //essa notas tem que vir de algum lugar cadastradas pelo professor da disciplina.....
      this.situacao = "AP";
    }else if (this.faltas >= 30/100*ch){
      System.out.println("RF");
    }else if ( ((ab1+ab2)/ 2) < 7 ){
      this.situacao = "RP";
    } else{
      this.situacao ="REPROVADO";
    }

  }

}
