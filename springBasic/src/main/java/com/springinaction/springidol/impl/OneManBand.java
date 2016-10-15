package com.springinaction.springidol.impl;

import java.util.Collection;

import com.springinaction.springidol.Instrument;
import com.springinaction.springidol.Performer;
import com.springinaction.springidol.common.PerformanceException;

/**
 * 一人乐队
 * 
 * @author xjp
 *
 */
public class OneManBand implements Performer {

	private Collection<Instrument> instruments;

	private OneManBand() {
		super();
	}

	public Collection<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}

	@Override
	public void perform() throws PerformanceException {
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}

}
