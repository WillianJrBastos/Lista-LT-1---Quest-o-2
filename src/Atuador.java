public class Atuador {

    boolean ventilador = false;
    boolean aquecedor = false;

    public void ligarVentilador(boolean status) throws FalhaNoAtuarException{
        if (!status) {
            throw new FalhaNoAtuarException("O vetilador falhou!");
        }

        ventilador = true;
        System.out.println("Ventilador ligado!");
    }

    public void ligarAquecedor(boolean status) throws FalhaNoAtuarException{
        if (!status) {
            throw new FalhaNoAtuarException("O aquecedor falhou!");
        }

        aquecedor = true;
        System.out.println("Aquecedor ligado!");
    }
}
