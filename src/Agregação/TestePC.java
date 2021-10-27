package Agregação;

public class TestePC {
    public static void main(String[] args){
        PC imprimir = new PC("Joao");
        WebCam imprimirWebcam = new WebCam("124.2544.62");
        System.out.println(imprimir);
        imprimir.addIdComputador("554.5258");
        Teclado imprimirTeclado = new Teclado("Joao raimundo");
        imprimir.addIdTeclado(imprimirTeclado);

    }
}
