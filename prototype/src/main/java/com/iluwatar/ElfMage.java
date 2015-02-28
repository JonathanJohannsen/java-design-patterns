package com.iluwatar;

public class ElfMage extends Mage {

	public ElfMage() {
	}

	public ElfMage(ElfMage mage) {
	}

	@Override
	public Mage clone() throws CloneNotSupportedException {
		return new ElfMage();
	}

	@Override
	public String toString() {
		return "Elven mage";
	}

}
