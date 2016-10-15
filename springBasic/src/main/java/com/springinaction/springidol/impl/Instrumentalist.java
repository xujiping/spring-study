package com.springinaction.springidol.impl;

import com.springinaction.springidol.Instrument;
import com.springinaction.springidol.Performer;
import com.springinaction.springidol.common.PerformanceException;

public class Instrumentalist implements Performer {

	private String song;
	private Instrument instrument;

	private Instrumentalist() {
		super();
	}

	public String getSong() {
		return song;
	}

	public String screamSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void perform() throws PerformanceException {
		System.out.println("Playing " + song + " : ");
		instrument.play();
	}

}
