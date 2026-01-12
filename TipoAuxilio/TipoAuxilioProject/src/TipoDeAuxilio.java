public class TipoDeAuxilio {
    public static void main(String[] args) {

        int idade = 22;
        double salario = 3500;

        String resultado;
        String tipoDeAuxilio;

        if (idade < 18){
            resultado = "Você não pode participar desse auxilio";
        } else {

            if (salario < 2000){
                tipoDeAuxilio = "Auxilio integral";
            } else if (salario <= 5000) {
                tipoDeAuxilio = "Auxilio Parcial";
            }else {
                tipoDeAuxilio = "Sem auxilio";
            }
            resultado = salario > 5000 ? "Você não tem direito ao auxílio." : "Você tem direito a: " + tipoDeAuxilio;
        }

        System.out.println(resultado);
    }
}
