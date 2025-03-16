package com.matheusknaul.GameEngine;

import com.matheusknaul.GameEngine.entities.Player;

public class TesteEntity {
	
	public static void main(String[] args) {
		Player teste = new Player(1, "Matheus");
		System.out.println(teste.getHp().getLife());
		teste.setHp(10, 5);
		System.out.println(teste.getHp().geTotaltLife());
	}
	
}
