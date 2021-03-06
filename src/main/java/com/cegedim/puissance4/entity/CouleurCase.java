package com.cegedim.puissance4.entity;

/**
 * Repr�sente tous les �tas possible d'une case
 * 
 * @author Romain F�ret
 *
 */
public enum CouleurCase {
	VIDE(" "), ROUGE("R"), JAUNE("J");

	public final String code;

	private CouleurCase(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}
}
