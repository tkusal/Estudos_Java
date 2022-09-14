import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class helloWorld {
    public static void main(String[] args) throws Exception {
        String nome = "Mundo";
        String diaSemana;
        String saudacao;

        //ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale Brasil = new Locale("pt", "BR");
        diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Brasil);
        LocalDateTime hora = LocalDateTime.now();

        if (hora.getHour() >= 0 && hora.getHour() < 12) {
            saudacao = "Bom dia!";
        } else if (hora.getHour() >= 12 && hora.getHour() < 18) {
            saudacao = "Boa tarde!";
        } else {
            saudacao = "Boa noite!";
        }
        
        System.out.printf("Olá, %s! Hoje é %s. %n%s", nome, diaSemana, saudacao);

    }
}