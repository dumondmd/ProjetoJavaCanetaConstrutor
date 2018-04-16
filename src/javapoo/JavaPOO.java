package javapoo;

public class JavaPOO {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic cristal";
        c1.cor = "azul";
        //c1.ponta = (float) 0.5;
        c1.carga = 80;
        //c1.tampada = false;
        c1.destampar();
        c1.rabiscar();
        c1.status();
    }
}
