import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== BOOTCAMP JAVA DEVELOPER =====\n");

        Curso curso1 = new Curso.Builder()
                .titulo("Curso Java")
                .descricao("Descrição curso Java")
                .cargaHoraria(8)
                .build();

        Curso curso2 = new Curso.Builder()
                .titulo("Curso JS")
                .descricao("Descrição curso JS")
                .cargaHoraria(4)
                .build();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        // DEV JOÃO
        System.out.println("===== DEV JOÃO =====");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("\nConteúdos inscritos:");
        System.out.println(devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("\nConteúdos restantes:");
        System.out.println(devJoao.getConteudosInscritos());

        System.out.println("\nConteúdos concluídos:");
        System.out.println(devJoao.getConteudosConcluidos());

        System.out.println("\nXP total: " + devJoao.calcularTotalXp());
        System.out.println("Nível: " + devJoao.getNivel());

        System.out.println("\n-----------------------------\n");

        // DEV MARIANA
        System.out.println("===== DEV MARIANA =====");

        Dev devMariana = new Dev();
        devMariana.setNome("Mariana");
        devMariana.inscreverBootcamp(bootcamp);

        System.out.println("\nConteúdos inscritos:");
        System.out.println(devMariana.getConteudosInscritos());

        devMariana.progredir();

        System.out.println("\nConteúdos restantes:");
        System.out.println(devMariana.getConteudosInscritos());

        System.out.println("\nConteúdos concluídos:");
        System.out.println(devMariana.getConteudosConcluidos());

        System.out.println("\nXP total: " + devMariana.calcularTotalXp());
        System.out.println("Nível: " + devMariana.getNivel());

        System.out.println("\n=============================\n");

        bootcamp.mostrarRankingDevs();
    }
}