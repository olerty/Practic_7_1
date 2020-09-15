package com.company;

public class Main {

    public static void main(String[] args) {
	    Plate plate = new Plate(0.5f, "круга", "красный", "фарфора");
	    Cup cup = new Cup(0.2f, "тора", "оттенок лица Лобачевского при виде меня", "бублика");
		FryingPan fryingPan = new FryingPan(1.5f, "сковородки", "черный", "чугуна");

	    plate.tell();
	    cup.tell();
	    fryingPan.tell();

    }
}
