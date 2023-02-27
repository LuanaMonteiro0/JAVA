package aula1;

import java.time.LocalDate;

public class suitche {
    //não era possível escrever switch, é relativo ao switch case
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        switch (date.getDayOfWeek()){
            case MONDAY: // não é possível quantificar assim: DayOfWeek.MONDAY
                System.out.println("Segunda-feira. =´("); break;
            case TUESDAY:
                System.out.println("Terça-feira. =("); break;
            case WEDNESDAY:
                System.out.println("Quarta-feira. =|"); break;
            case THURSDAY:
                System.out.println("Quinta-feira. =)"); break;
            case FRIDAY:
                System.out.println("Sexta-feira! =D"); break;
            case SATURDAY:
                System.out.println("Sábado! \\o/" ); break;
            case SUNDAY:
                System.out.println("Domingo. <o/"); break;
        }
    }
}
