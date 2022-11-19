package projeto;
public class Professor {
  private String nome;
  private Disciplina disciplina;
  private int cargaHoraria;
  //...
  private String matriculaAluno;
  private float ab1;
  private float ab2;
  

  private void adicionarAluno(String matricula){
    this.matriculaAluno = matriculaAluno;
  }
  private void cadastrarNota( float ab1, float ab2){
    this.ab1 = ab1;
    this.ab2 = ab2;
  }
  public void mostrar(){
    System.out.println("Matricula Aluno: " +matriculaAluno);
    System.out.println("Nota AB1: " +ab1);
    System.out.println("Nota AB2: "+ab2);
  }
  
  private void removerAluno(){
      
  }
  
  private void removerNota(){
      
  }
  

  //Construtor
  public Professor(String nome, Disciplina disciplina, int cargaHoraria) {
    this.nome = nome;
    this.disciplina = disciplina;
    this.cargaHoraria = cargaHoraria;
  }
  // Getters and Setters
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public Disciplina getDisciplina() {
    return disciplina;
  }
  public void setDisciplina(Disciplina disciplina) {
    this.disciplina = disciplina;
  }
  public int getCargaHoraria() {
    return cargaHoraria;
  }
  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  
}
