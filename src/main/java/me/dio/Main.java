package me.dio;


import me.dio.desafio.dominio.Bootcamp;
import me.dio.desafio.dominio.Curso;
import me.dio.desafio.dominio.Dev;
import me.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descriçao da mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println(devLucas.getConteudosInscritos());
        System.out.println(devLucas.getConteudosConcluidos());
        System.out.println("---");
        devLucas.progredir();
        System.out.println(devLucas.getConteudosInscritos());
        System.out.println(devLucas.getConteudosConcluidos());
        System.out.println("---");
        System.out.println(devLucas.calcularTotalXp());

        System.out.println("============");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println(devJoao.getConteudosInscritos());
        System.out.println(devJoao.getConteudosConcluidos());
        System.out.println("---");
        devJoao.progredir();
        devJoao.progredir();
        System.out.println(devJoao.getConteudosInscritos());
        System.out.println(devJoao.getConteudosConcluidos());
        System.out.println(devJoao.calcularTotalXp());
    }
}