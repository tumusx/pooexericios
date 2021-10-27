package Agregação;

public class Teclado {
    private String idTeclado;
    private String nomeTeclado;

    public  Teclado (String idTeclado){
        this.idTeclado=idTeclado;
    }

    public String getIdTeclado() {
        return idTeclado;
    }

    public void Teclado(String nomeTeclado){
        this.nomeTeclado = nomeTeclado;
    }

    public String getNomeTeclado() {
        return nomeTeclado;
    }
    public String imprimir(){
        return "Teclado [nome="+ nomeTeclado+ "]";
    }

    public String printID(){
        return "IdTeclado [nome="+ idTeclado+ "]";
    }
}
