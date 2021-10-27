package Agregação;

public class WebCam {
    private String idWebcam;
    private String fecharWebcam;

    public WebCam(String idWebcam) {
        this.idWebcam = idWebcam;
    }

    public void WebCam2(String fecharWebcam) {
        this.fecharWebcam = fecharWebcam;
    }

    public String converterString() {
        return "Webcam [id da webcam" + idWebcam + "]";
    }

    public String toString() {
        return "Fechar [id da webcam" + idWebcam + fecharWebcam + "]";
    }
}


