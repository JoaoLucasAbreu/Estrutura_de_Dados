public class Paciente {

    //Atributos ou propriedades ou variável de instância
    String nome;
    int idade;

    //Metódo para calcular e retornar a frequência cardíaca máxima
    public int max_cardiaco() {
        return 220 - idade;
    }

    //Método para calcular e retornar a frequência cardíaca alvo
    public double[] alvo_cardiaco() {
        double[] alvo = new double[2];
        alvo[0] = max_cardiaco() * 0.5;
        alvo[1] = max_cardiaco() * 0.85;

        return alvo;
    }
}
