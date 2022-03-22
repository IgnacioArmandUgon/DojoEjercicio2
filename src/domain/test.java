package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> palabras = new ArrayList<>();
        List<Mensaje> mensajes = new ArrayList<>();

        palabras.add("palabra1");
        palabras.add("palabra2");
        palabras.add("palabra3");
        palabras.add("palabra4");
        palabras.add("palabra5");
        palabras.add("palabra6");
        palabras.add("palabra7");
        palabras.add("palabra8");
        palabras.add("palabra9");
        palabras.add("palabra10");

        String mensaje = "";

        while (true) {
            mensaje = scanner.nextLine();
            if (mensaje.equals("!exit")) break;
            mensajes.add(new Mensaje(new Texto(mensaje)));
        }

        mensajes.stream().forEach(e -> {
            List<String> words = List.of(e.getMensaje().getTexto().split(" "));
            List<String> words2 = words.stream().map(word -> {
                if (palabras.contains(word)) return "*****";
                return word;
            }).collect(Collectors.toList());
            e.actualizarTexto(new Texto(String.join(" ", words2)));
            System.out.println(e.getMensaje().getTexto());
        });
    }
    }