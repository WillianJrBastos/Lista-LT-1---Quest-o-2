public class ControleDeTemperatura {

    public void controlarTemperatura(double temperatura, boolean status) {

        Sensor sensor = new Sensor(temperatura);
        Atuador atuador = new Atuador();

        try {
            sensor.lerTemperatura();

            if (temperatura > 30) {
                atuador.ligarVentilador(status);
            }
            if (temperatura < 10){
                atuador.ligarAquecedor(status);
            }
            if (temperatura >= 10 && temperatura <= 30) {
                System.out.println("Temperatura normal!");
            }

        } catch (LeituraInconsistenteException | FalhaNoAtuarException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("... Finalizado\n");
        }
    }
}
