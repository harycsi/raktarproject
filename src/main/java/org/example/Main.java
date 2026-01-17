package org.example;

import Controller.RaktarController;
import Model.Raktar;
import View.RaktarView;

public class Main {
    public static void main(String[] args) {

        Raktar raktar = new Raktar();
        RaktarView view = new RaktarView();
        RaktarController controller = new RaktarController(raktar, view);

        controller.listaElelmiszer();
        controller.ujElelmiszer();
    }
}