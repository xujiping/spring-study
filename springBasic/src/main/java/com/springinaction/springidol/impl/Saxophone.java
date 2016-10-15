package com.springinaction.springidol.impl;

import com.springinaction.springidol.Instrument;

public class Saxophone implements Instrument {

	private Saxophone() {
		super();
	}

	@Override
	public void play() {
		System.out.println("TOOT TOOT TOOT");

	}

}
