public class Sensor {

    private double temperatura;

    public Sensor (double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void lerTemperatura() throws LeituraInconsistenteException{
        if(temperatura > 50 || temperatura < -20) {
            throw new LeituraInconsistenteException("Leitura inconsistente! \nTemperatura: " + temperatura + "°C");
        }

        System.out.println("Temperatura: " + temperatura + "°C");
    }
}
