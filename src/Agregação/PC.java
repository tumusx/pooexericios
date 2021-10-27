package Agregação;

public class PC {
    private String donoComputador;
    private String idWebcam;
    private Teclado idTeclado;

    public PC(String donoComputador){
        this.donoComputador=donoComputador;
    }

    public void Teclado(Teclado idTeclado){
        this.idTeclado = idTeclado;
    }

    public boolean addIdComputador(String idWebcam){
        boolean correto = false;
        if(this.idWebcam==null){
            this.idWebcam= idWebcam;
            correto = true;

        }
        return correto;
    }

    public boolean addIdTeclado(Teclado teclado){
        boolean certo = false;
        if(this.idTeclado==null){
            this.idTeclado= idTeclado;
            certo = true;

        }
        return certo;
    }


    public Teclado getIdTeclado() {
        return idTeclado;
    }


    public String getIdWebcam() {
        return idWebcam;
    }
    public String getDonoComputador(){
        return donoComputador;
    }
    public void setDonoComputador(String donoComputador){
         this.donoComputador=donoComputador;
    }
    public String converter(){
        return "ID COMPUTADOR [dono="+donoComputador+", dono=" +idWebcam+"]";
    }

    public String convertos(){
        return "ID do Teclado [idTeclado="+idTeclado+"]";
    }
}
