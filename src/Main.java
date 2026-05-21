public class Main {
    public static void main(String[] args) {

        ControleDeTemperatura controleDeTemperatura = new ControleDeTemperatura();

        controleDeTemperatura.controlarTemperatura(5, true);
        controleDeTemperatura.controlarTemperatura(40, false);
        controleDeTemperatura.controlarTemperatura(-500, false);
        controleDeTemperatura.controlarTemperatura(999, false);
    }
}