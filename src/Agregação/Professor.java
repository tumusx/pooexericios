package Agregação;

public class Professor {
    private int professor;
    private String nome;
    private String disciplina;
    private String email;
    private String telefone;
    private String endereco;
    private String cpf;
    private String rg;
    private String dataNascimento;

    public Professor(){
        this.professor = 20;
        this.nome = "Joao";
        this.disciplina = "Matematica";
        this.email = "professor@ifg.edu.br";
        this.telefone = "629955555";
        this.endereco = "Rua Jaimundo Cascavel";
        this.cpf = "46464646";
        this.rg = "564545";
        this.dataNascimento = "11/12/2000";
    }


       public Professor(int professor, String nome, String disciplina, String email, String telefone, String endereco, String cpf, String rg, String dataNascimento){ this.professor = professor;
        this.nome = nome;
        this.disciplina = disciplina;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public Professor(String joão, String s, String s1, String s2, String s3) {


    }

    public int getProfessor() {
        return professor;
    }
    public void setProfessor(int professor) {
        this.professor = professor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void imprimir(){
        System.out.println("Idade do Professor: " + this.professor);
        System.out.println("Nome: " + this.nome);
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Disciplina nome:"+this.nome);

    }
}
