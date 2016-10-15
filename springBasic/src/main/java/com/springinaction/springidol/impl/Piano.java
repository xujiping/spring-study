package com.springinaction.springidol.impl;

import com.springinaction.springidol.Instrument;

public class Piano implements Instrument {

	private Piano() {
		super();
	}

	@Override
	public void play() {
		System.out.println("PLINK PLINK PLINK");
	}

}
