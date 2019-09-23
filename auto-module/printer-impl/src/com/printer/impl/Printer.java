package com.printer.impl;

import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.Color.BLUE;
import static org.fusesource.jansi.Ansi.Color.RED;
import static org.fusesource.jansi.Ansi.ansi;

public class Printer {
    public void print(String message) {
        AnsiConsole.systemInstall();
        System.out.println(ansi().fg(BLUE).a("This is a colored output!"));
        System.out.println(ansi().fg(RED).a(message));
    }
}
